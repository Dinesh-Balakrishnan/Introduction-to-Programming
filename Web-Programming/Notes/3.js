//Because of hoisting, normalFunction is able to be called before it is declared in a file.
normalFunction("Dinesh");

//Because a function expression is set to a variable, variable hoisting will simply set to undefined.
// functionExpression(); (SYNTAX ERROR)

/*ES6 introduces the spread operator which allows an array to be unpacked into individual values
  when passed as arguments into a function or array literal. */
const values = ["Name", 10, true, "Hello"];
normalFunction(...values);

/*NOTE: Function parameters don't require a type declaration. They can be set to a default value
in case enough parameters aren't passed in. Extra function parameters can be stored with the spread operator */
function normalFunction(name = "Stranger", age = "a number of", ...extraParams) {
  console.log("Just a normal function");
  console.log(`Created by ${name}, who is ${age} years old.`);

  for (let val in extraParams)
    console.log(`${extraParams[val]} is an extra parameter passed into normalFunction.`);
}

const functionExpression = function() {
  console.log("I'm set to a variable!");
}

//ES6 has introduced a different way to create functionExpression by using 'arrow function syntax'.
const arrowFunction = (name = "Stranger", age = "a number of") => {
  console.log(`Created by ${name}, who is ${age} years old.`);
}

//When only a single variable is needed and doesn't require a default value:
const noParentheses = name => console.log(`Created by ${name}.`);
//Notice that the brackets can be removed when a single-line function is created.

//When a single-line function doesn't need a return value:
//(An object needs to be wrapped in '()')
const noReturnStatement = () => true; //Returns true

/* Main differences beteween function declarations and function expressions is that
  function declarations can be called before they are declared due to hoisting,
  while function expressions are only loaded after they are reached during code
  execution. */

let value1 = 1;
let value2 = 2;

/*An IIFE, Immediately Invoked Function Expression, is a function invoked as soon
  as it is loaded in. It is anonymous, so it can't be called upon again.*/
(function(v1, v2) {
  //One benefit is quickly shortening variable names.

  /*Another is that variables can be used within a private scope and can't be
    accessed anywhere else. */
  let scopedVariable = 10;

  /*Lastly, memory usage is shortened. */
}(value1, value2));

//IIFEs can be used to create modules with privacy restrictions:
let module = (function() {
  let variable = 10; //Variable cannot be accessed.
  return {
    increment: () => variable++, //Through properties set in the module,
    decrement: () => variable--, //it can be modified or used.
    value: () => variable
  }
}());

/*A curried function is one that is able to take parameters at intervals
  This ties well with asynchronous programming as the function can process
  certain parameters while waiting for others*/
function curriedFunction(a, b) {
  y = a + b;
  return c => y + c;
}

//Calling the function:
let firstPart = curriedFunction(1, 1);
let finished = firstPart(1);
//Or....
finished = curriedFunction(1, 1)(1);
