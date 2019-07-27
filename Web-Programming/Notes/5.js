loops();
iterators();

function loops() {
  //For loop:
  for (let count = 0; count <= 10; count++) {
    console.log(count);
  }

  let values = [];
  values[5] = '5th value.'
  //For-In loop
  for (let value in values) {
    console.log(value); //Logs out 5, because only the 5th index contains a value.
  }

  let num = 30583483434099;
  //While loop:
  while (num > 1) {
    console.log(num);
    num /= 10;
  }

  let sugarNeeded = 44;
  //Do..While loop:
  do {
    console.log(`${sugarNeeded} cups of sugar left to go.`);
    sugarNeeded--;
  } while (sugarNeeded < 0);

  //The break keyword also functions like Java's.
}

function iterators() {
  //Iterators are methods that are called on arrays to manipulate their elements and return values.
  const fruits = ['mango', 'papaya', 'pineapple', 'apple'];

  //The .forEach() iterator will simply pass each element as a parameter into a callback function.
  fruits.forEach(fruit => console.log(`I want to eat a ${fruit}`));
  //Note that the console.log() statement doesn't require its own semi-colon.

  /*The .map() iterator will function just like the .forEach() iterator, but will return a new
  array with values returned by the callback function. */
  let plural = fruits.map(fruit => `${fruit}s`);
  console.log(plural); //Logs [ 'mangos', 'papayas', 'pineapples', 'apples' ]

  /*The .filter() iterator also returns a new array. If the callback function for an element
    returns true, the element will be added to the new array. */
  let pFruits = fruits.filter(fruit => fruit[0] == 'p');
  console.log(pFruits); //Logs [ 'papayas', 'pineapples' ];

  /*The .findIndex() iterator returns the index of the first element to satisfy the boolean
    condition stated within the callback function. */
  console.log(fruits.findIndex(fruit => fruit.indexOf('apple') != -1)); //Logs 2

  //The .reduce() iterator takes an entire array and returns a single value using an accumulator value.
  console.log(fruits.reduce((accumulator, fruit) => accumulator + fruit));
  //Logs mangopapayapineappleapple

  /*The accumulator value has a default value equaling the first element in
    the array. To change this, pass in a parameter. */
  console.log(fruits.reduce((accumulator, fruit) => accumulator + fruit, fruits[1]));
  //Logs papayamangopapayapineappleapple ('papaya' added in front.)

  /*The .some() iterator returns true at least a single element in an array satisfies
    the necessary boolean requirement. Else, it returns false. */
  console.log(fruits.some(fruit => fruit[0] == 'p')); //Logs true

  /*Alternatively, the .every() iterator returns true if every single element in an
  array satisfies the necessary boolean requirement. Else, it returns false. */
  console.log(fruits.every(fruit => fruit[0] == 'p')); //Logs false

  /*The .sort() iterator sorts the array like Java's compareTo(), except booleans
    are also allowed. */
  fruits.sort((frt1, frt2) => frt1 > frt2);
  console.log(fruits); //Logs ['apple', 'mango', 'papaya', 'pineapple']

  //NOTE: The iterators can accept two extra parameters.
  //The first of the two equals the current index, the second being the calling array.
  fruits.forEach((fruit, index, array) => console.log(array[index]));
}
