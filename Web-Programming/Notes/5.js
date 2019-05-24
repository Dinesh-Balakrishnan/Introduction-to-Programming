loops();
iterators();

function loops() {
  //For loop:
  for (let count = 0; count <= 10; count++) {
    console.log(count);
  }
  
  let values = [];
  values[5] = '5th value.'
  //For-In loop (Similar to Java's For-Each Loop)
  for (value in values) {
    console.log(value); //Logs out only '5th value.' and not the undefined index values for 0, 1, 2, and 3.
  }

  let num = 30583483434099;
  //While loop:
  while (num > 0) {
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

  /*The .some() iterator returns true at least a single element in an array satisfies
    the necessary boolean requirement. Else, it returns false. */
  console.log(fruits.some(fruit => fruit[0] == 'p')); //Logs true

  /*Alternatively, the .every() iterator returns true if every single element in an
  array satisfies the necessary boolean requirement. Else, it returns false. */
  console.log(fruits.every(fruit => fruit[0] == 'p')); //Logs false
}
