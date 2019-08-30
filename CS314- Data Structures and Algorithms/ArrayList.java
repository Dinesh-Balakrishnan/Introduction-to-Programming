import java.util.Collection;
import java.util.List;

import java.util.Iterator;
import java.util.ListIterator;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import java.util.ConcurrentModificationException;

/**
 * A dynamic (expandable/shrinkable) data structure providing extra functionality to default Java arrays.
 * 
 * @author Dinesh Balakrishnan
 * @param <T> Storage data type.
 */
public class ArrayList<T> implements List<T>{

	private Object[] storage;
	private int size;

	private static int DEFAULT_STARTING_SIZE = 10;

	public ArrayList(int capacity) {
		storage = new Object[capacity];
	}

	public ArrayList() {
		this(DEFAULT_STARTING_SIZE);
	}

	public ArrayList(Collection<? extends T> list) {
		if (list == null)
			throw new NullPointerException("Null 'ArrayList' passed into ArrayList(T[]).");

		storage = list.toArray();
		size = storage.length;
	}

	//SIZE/CAPACITY METHODS

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void trimToSize() {
		storage = newArray(new Object[size], size);
	}

	public void ensureCapacity(int capacity) {
		if(storage.length < capacity)
			storage = newArray(new Object[capacity], size);
	}
	
	public void clear() {
		for (int index = 0; index < size; index++)
			storage[index] = null;

		size = 0;
	}

	//MANAGEMENT METHODS

	public Object clone() {
		ArrayList<T> copy = new ArrayList<T>();
		copy.storage = storage;
		copy.size = size;

		return copy;
	}

	public Object[] toArray() {
		return newArray(new Object[size], size);
	}

	@SuppressWarnings("unchecked")
	public <N> N[] toArray(N[] array) {
		N[] modified = (N[]) newArray(array, Math.min(array.length, size));

		if (array.length > size)
			modified[size] = null;

		return modified;
	}
	
	@SuppressWarnings("unchecked")
	public void replaceAll(UnaryOperator<T> modifier) {
		if (modifier == null)
			throw new NullPointerException("A null Operator was passed into replaceAll(UnaryOperator<T>).");
		
		for (int index = 0; index < size; index++)
			storage[index] = modifier.apply((T) storage[index]);
	}

	//RETRIVAL METHODS

	@SuppressWarnings("unchecked")
	public T get(int position) {
		if (position < 0 || position > size)
			throw new ArrayIndexOutOfBoundsException("Illegal position passed into get(int)");

		return (T) storage[position];
	}

	@SuppressWarnings("unchecked")
	public List<T> subList(int starting, int ending) {
		if (starting < 0 || starting > size - 1 || ending < 0 || ending > size - 1)
			throw new ArrayIndexOutOfBoundsException("Illegal position passed into removeRange(int, int).");
		if (starting > ending)
			throw new IllegalArgumentException("Starting value, " + starting + ", > ending value ," + ending + ".");

		List<T> sublist = new ArrayList<T>();

		for (int index = starting; index < ending; index++)
			sublist.add((T) storage[index]);

		return sublist;
	}

	public int indexOf(Object value) {
		final int NOT_FOUND = -1;

		for (int index = 0; index < size; index++)
			if (value == storage || value != null & value.equals(storage[index]))
				return index;

		return NOT_FOUND;
	}

	public int lastIndexOf(Object value) {
		final int NOT_FOUND = -1;

		for (int index = size - 1; index >= 0; index--)
			if (value == storage || value != null & value.equals(storage[index]))
				return index;

		return NOT_FOUND;
	}

	public boolean contains(Object value) {
		return indexOf(value) != -1;
	}

	//ADD METHODS

	public void add(int position, T value) {
		if (position < 0 || position > size)
			throw new ArrayIndexOutOfBoundsException("Illegal position passed into add(int, E)");

		if (size == storage.length)
			storage = newArray(new Object[storage.length * 2], size);

		for (int index = size; index > position; index--)
			storage[index] = storage[index - 1];

		storage[position] = value;
		size++;		
	}

	public boolean add(T value) {
		if (size == storage.length)
			storage = newArray(new Object[storage.length * 2], size);

		storage[size] = value;
		size++;	
		return true;
	}

	public boolean addAll(int position, Collection<? extends T> list) {
		if (position < 0 || position > size)
			throw new ArrayIndexOutOfBoundsException("Illegal position passed into addAll(int, ArrayList<T>).");
		if (list == null)
			throw new NullPointerException("Null 'ArrayList' passed into addAll(int, ArrayList<T>).");

		Object[] data = list.toArray();
		int length = data.length;

		if (size + length >= storage.length)
			storage = newArray(new Object[(storage.length * 2) + length], size);

		for (int index = size - 1; index >= position; index--)
			storage[index + length] = storage[index];  

		for (int index = 0; index < length; index++)
			storage[index + position] = data[index]; 

		size += length;
		return (length != 0);
	}

	public boolean addAll(Collection<? extends T> list) {
		return addAll(size, list);
	}

	@SuppressWarnings("unchecked")
	public T set(int position, T replacement) {
		if (position < 0 || position > size)
			throw new ArrayIndexOutOfBoundsException("Illegal position passed into set(int, T).");

		T replaced = (T) storage[position];
		storage[position] = replacement;

		return replaced;
	}

	//REMOVAL METHODS

	@SuppressWarnings("unchecked")
	public T remove(int position) {
		if (position < 0 || position > size - 1)
			throw new ArrayIndexOutOfBoundsException("Illegal position passed into remove(int).");

		T removed = (T) storage[position];
		size--;

		for (int index = 0; index < size; index++)
			storage[index] = storage[index + 1];

		storage[size] = null;
		return removed;
	}

	public boolean remove(Object value) {
		final int NOT_FOUND = -1;

		int position = indexOf(value);
		if (position == NOT_FOUND) 
			return false;

		remove(position);
		return true;
	}

	public boolean removeAll(Collection<?> list) {
		if (list == null)
			throw new NullPointerException("Null 'Collection' passed into removeAll(Collection<?>).");

		int oldSize = size;

		for (int index = size - 1; index >= 0; index--)
			if (!list.contains(storage[index]))
				remove(index);

		return oldSize == size;
	}

	@SuppressWarnings("unchecked")
	public boolean removeIf(Predicate<? super T> filter) {
		if (filter == null)
			throw new NullPointerException("Null 'Predicate' passed into removeIf(Predicate<? super T>");

		int oldSize = size;

		for(int index = size - 1; index >= 0; index--)
			if(filter.test((T) storage[index]))
				remove(index);

		return oldSize == size;	
	}

	public boolean retainAll(Collection<?> list) {
		if (list == null)
			throw new NullPointerException("Null 'Collection' passed into retainAll(Collection<?>).");

		int oldSize = size;

		for (int index = size - 1; index >= 0; index--)
			if (!list.contains(storage[index]))
				remove(index);

		return oldSize == size;
    }
    
    //ITERATION METHODS

    public Iterator<T> iterator() {
        return new ArrayIterator();
    }

    public ListIterator<T> listIterator() {
        return new ArrayListIterator();
    }

    @SuppressWarnings("unchecked")
    private class ArrayIterator implements Iterator<T> {

        protected int index;
        protected int expectedSize;
        protected boolean exists;

        public ArrayIterator() {
            index = -1;
            expectedSize = size;
        }

        public boolean hasNext() {
            modificationCheck();
            return index == size;
        }

        public T next() {
            modificationCheck();
            if (!hasNext())
                throw new IllegalStateException("All elements have been iterated through.");

            index++;
            exists = true;
            return (T) storage[index];
        }

        public void remove() {
            modificationCheck();
            if (!exists)
                throw new IllegalStateException("The current element doesn't exist.");

            ArrayList.this.remove(index);
            expectedSize--;
        }

        public void forEachRemaining(Consumer<? super T> consumer) {
            modificationCheck();
            if (consumer == null) 
                throw new NullPointerException("The Consumer object is nullified.");

            for (int index = this.index + 1; index < size; index++)
                consumer.accept((T) storage[index]);
        }

        private void modificationCheck() {
            if (expectedSize != size)
                throw new ConcurrentModificationException("The number of elements in the list has been modified.");
        }

    }

    private class ArrayListIterator extends ArrayIterator implements ListIterator<T> {

        public ArrayListIterator() {
            super();


        }

        public boolean hasPrevious() {
            super.modificationCheck();

            return super.index
        }
    }

	//HELPER METHODS

	protected void removeRange(int starting, int ending) {
		if (starting < 0 || starting > size - 1 || ending < 0 || ending > size - 1)
			throw new ArrayIndexOutOfBoundsException("Illegal position passed into removeRange(int, int).");
		if (starting > ending)
			throw new IllegalArgumentException("Starting value, " + starting + ", > ending value ," + ending + ".");

		int removeSize = ending - starting;
		int oldSize = size;
		size -= removeSize;

		for (int index = starting; index < size; index++)
			storage[index] = storage[index + removeSize];

		for (int index = size; index < oldSize; index++)
			storage[index] = null;
	}

	@Override
	public String toString() {
		final String EMPTY_ARRAY = "[]";

		if (size == 0)
			return EMPTY_ARRAY;

		StringBuilder builder = new StringBuilder();
		
		builder.append('[');
		builder.append(storage[0]);

		for (int index = 1; index < size; index++) {
			builder.append(", ");
			builder.append(storage[index]);
		}

		builder.append(']');
		return builder.toString();
	}
	
	private Object[] newArray(Object[] newArray, int copySize) {
		for (int index = 0; index < copySize; index++)
			newArray[index] = storage[index];

		return newArray;
	}
}
