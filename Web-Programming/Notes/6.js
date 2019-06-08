let example = objectSyntax();
objectProperties(example, 'number');
objectFunctionality();
let quickObj = factoryFunction('indigo', 4, 10, 'square');

function objectSyntax() {
  let example = {
    color: 'silver',
    number: 10,
    'Two Words': true,

    func() {
      //Use this to refer to the methods and attributes within the same object.
      console.log(this.color);
    },

    anonymousFunc: () => {
      /*Anonymous functions cannot use 'this'. This is because it ties itself to the
        function it is being used in rather than the object it is located in. */
      example.func();
    },

    nestedObj: {
      color: 'blue'
    },

    _privateVariable: 'Naming convention implies it should be kept private. Not actually private.',
    get privateVariable() { //No parameters are allowed
      return this._privateVariable;
    },

    set privateVariable(value) { //One parameter allowed. No less, no more.
      this._privateVariable = value;
    }
  };
  return example;
}

function objectProperties(objValue, keyValue) {
  //To access an object's attribute value:
  console.log(example.color); //Logs silver
  console.log(example.nestedObj.color); //Logs blue

  //Accessing a function is the same as a variable, but with parentheses and potential parameters.
  example.func();
  example.anonymousFunc();

  //Accessing properties that don't exist will return a value of undefined:
  console.log(example.shape); //Logs undefined

  /*When accessing keys that have numbers, spaces, or special characters in
    them, bracket notation must be used. */
  if(example['Two Words'])
    console.log("There are two words.");
  //Bracket notation must also be used when calling a key through a variable.
  console.log(objValue[keyValue]);
  //NOTE: The key value must still be stored as a string due to bracket notation.

  //Setting object states is similar to setting the value of array elements:
  example.number = 10; //Objects work like arrays, as in the elements are permanently changed.

  //A new attribute can be created through its declaration and initialization:
  example['!!!!'] = 'Exclamation Marks';
  console.log(example['!!!!']); //Logs Exclamation Marks

  //The object attribute can be deleted using the 'delete' keyword:
  delete example['!!!!'];
  
  //It is possible to see whether the object has a property with .hasOwnProperty()
  let hasProp = example.hasOwnProperty('!!!!'); //Returns false.
}

function objectFunctionality() {
  //All enumerated, non - Symbol properties can be looped through by using 'for...in'
  for(key in example) {
    console.log(key); //Prints the key name.
    console.log(example[key]); //Prints the value of the key
    //NOTE: Syntax really matters here because functions won't work.
  }

  //Getter methods are used to get data. The syntax is of a variable.
  console.log("Result of getter: ")
  console.log(example.privateVariable);

  //Setter methods are used to set data. The syntax is similar to reinitialization.
  example.privateVariable = "New Value";

  /*Destructuring is JavaScript syntax that allows groups of values to be
    assigned to individual variables. */
  let {color, number} = example; //Two variables called color and number have been created.
  console.log(color); //Logs silver
  console.log(number); //Logs 10
  
  //Even if an object is set to constant, it's data can still be modified.
  //By using Object.freeze(obj), properties cannot be added to, updated, or deleted in the object.
  Object.freeze(example);
}

//A factory function is used to quickly create an object with desired behaviors and states.
function factoryFunction(color, number, month, shape) {
  return {
    //Thanks to ES6 destructuring, color doesn't needed to be stated as 'color: color'.
    color,
    number,
    month,
    shape
  }
}
