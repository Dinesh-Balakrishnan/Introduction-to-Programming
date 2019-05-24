//Because of hoisting, normalFunction is able to be called before it is declared in a file.
normalFunction("Dinesh");

//Because a function expression is set to a variable, variable hoisting will simply set to undefined.
// functionExpression(); (SYNTAX ERROR)

//NOTE: Function parameters don't require a type declaration
//NOTE: Function parameters can be set to a default value in case enough parameters aren't passed in.
//NOTE: Extra function parameters can be stored with '...'
function normalFunction(name = "Stranger", age = "a number of", ...extraParams) {
  console.log("Just a normal function");
  console.log(`Created by ${name}, who is ${age} years old.`);
  
  for (val in extraParams)
    console.log(`${val} is an extra parameter to normalFunction.`);
}

const functionExpression = function() {
  console.log("I'm set to a variable!");
}

//ES6 has introduced a different way to create funcionExpression by using 'arrow function syntax'.
const arrowFunction = (name = "Stranger", age = "a number of") => {
  console.log(`Created by ${name}, who is ${age} years old.`);
}

//When only a single variable is needed and doesn't require a default value:
const noParentheses = name => console.log(`Created by ${name}.`);
//Notice that the brackets can be removed when a single-line function is created.

//When a single-line function needs to return a value:
const noReturnStatement = () => true; //Returns true

/*
Main Differences: Function Declarations and Function Expressions

  - Function declarations can be called upon before they are declared.
  - Function expressions can only be called after they are declared and follow scoping rules.

  - Function declarations are loaded before code is executed.
  - Function expressions are loaded only after they are reached during code execution.

  - Function expressions are VERY helpful when serving as callback functions because
    they don't require the use of parentheses.
  - Function declarations cannot be used because they require parentheses to be called upon.
    As a result, they immediately are executed.
*/
