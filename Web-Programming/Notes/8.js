/*JavaScript classes are syntactic sugar used to create many object instances,
similar to factory functions.*/
class ExampleClass {
  //Because method overloading isn't supported, only one constructor can be created.
  constructor(val1, val2) {
    //Instance variables don't need to be declared outside of the constructor.
    this._val1 = val1;
    this._val2 = val2;
  }

  //No commas are needed to separate values.
  get val() {
    return this._val1 + this._val2;
  }

  increment() {
    this._val1++;
    this._val2 *= 2;
  }

  //Static methods are created with 'static'.
  static staticMethod() {
    return 'I must be called using the class name, not object name.'
  }
}

//Subclasses are created through the extends variable.
class ExampleSubclass extends ExampleClass {
  constructor(val1, val2) {
    //Super constructor calls the parent constructor and must be used on the first line.
    super(val1, val2);
    this._val1++;
  }

  //NOTE: All getters, setters, and methods are inherited by the subclass.
  //increment isn't overloaded due to having a different parameter; it is instead replaced.
  increment(amount) {
    this._val1 += amount;

    //Super method accesses the parent increment method and doesn't need to be called first.
    super.increment();
  }
}

//Objects are created by instantiating the class.
const obj = new ExampleClass(1, 1);

//The object then works just like any defaultly created object.
obj.increment();
console.log(obj.val);

//Despite not being located in ExampleSubClass, the getter method still exists through inheritence.
const subclassObj = new ExampleSubclass(4, 4);
console.log(subclassObj.val);

//Due to being replaced, the original instance method with no parameter won't work.
subclassObj.increment();
//The console will log NaN because instance(amount) is called, with amount equaling null.
console.log(subclassObj.val);

//Static methods are called using the class name.
console.log(ExampleClass.staticMethod());
