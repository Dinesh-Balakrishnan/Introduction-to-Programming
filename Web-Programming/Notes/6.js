let example = objectSyntax();
objectProperties(example, 'number');
objectFunctionality(example);

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

  //Keys can also be created using bracket notation:
  const arrToObj = ([key, value]) => ({ [key]: value });

  //Setting object states is similar to setting the value of array elements:
  example.number = 10; //Objects work like arrays, as in the elements are permanently changed.

  //A new attribute can be created through its declaration and initialization:
  example['!!!!'] = 'Exclamation Marks';
  console.log(example['!!!!']); //Logs Exclamation Marks

  //The object attribute can be deleted using the 'delete' keyword:
  delete example['!!!!'];

  //It is possible to see whether the object has a property with .hasOwnProperty()
  //NOTE: Multiple values can be passed in.
  let hasProp = example.hasOwnProperty('!!!!'); //Returns false.
}

function objectFunctionality(obj) {
  //All enumerated, non - Symbol properties can be looped through by using 'for...in'
  for(let key in obj) {
    console.log(key); //Prints the key name.
    console.log(obj[key]); //Prints the value of the key
    //NOTE: Syntax really matters here because functions won't work.
  }

  //An array of keys can simply be generated with the Object.keys() function:
  Object.keys(obj);
  //NOTE: Both the for-in loop and Object.keys() store the keys in sorted order.

  //Getter methods are used to get data. The syntax is of a variable.
  console.log("Result of getter: ")
  console.log(obj.privateVariable);

  //Setter methods are used to set data. The syntax is similar to reinitialization.
  obj.privateVariable = "New Value";

  /*Destructuring is JavaScript syntax that allows groups of values to be
    assigned to individual variables. */
  let {color : col /*Renamed as col*/, number} = obj;
  //Two variables called color and number have been created.
  console.log(col); //Logs silver
  console.log(number); //Logs 10

  //To access nested objects through destructuring:
  let {nestedObj : {color}} = obj;
  console.log(color);

  //Even if an object is set to constant, it's data can still be modified.
  /*By using Object.freeze(objectName), properties cannot be added to, updated,
  or deleted in the object. */
  Object.freeze(obj);
}
