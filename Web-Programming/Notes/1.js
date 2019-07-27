strings();
creatingVariables();
primitiveDataTypes();

function strings() {
  /*I am a..
    multi-line comment!*/

  //I am a single line comment!

  //To print data to the console:
  console.log("I am printed to the console.");

  //To print a string's length: (Parentheses aren't needed)
  console.log("I am printed to the console.".length); //Logs 28

  const myName = "Dinesh";
  const myCity = "Los Angeles";
  //String interpolation is a cleaner method to perform string concatentation:
  console.log(`My name is ${myName}. My favorite city is ${myCity}.`);

  //String methods in JS worth noting: (Also has all non-mutative array methods.)
  console.log(' Hello '.trim()); //Logs 'Hello'
  console.log('Hello'.endsWith('o') && 'Hello'.startsWith('h')); //Logs 'false'
  console.log('A'.charCodeAt(0)); //Returns 65 (Unicode Value)
  console.log(String.fromCharCode(65)); //Returns 'A'
}

function creatingVariables() {
  //The let keyword is used to make normal variables that are naturally block scoped.
  let blockScoped = true;

  //The var keyword is used to make variables that are function scoped.
  if (true)
    var functionScoped = 4;
  //The following line works because functionScoped can be accessed anywhere in the function.
  console.log(functionScoped); //Logs 4

  //The const keyword is used to make variables that are blocked scoped and CANNOT CHANGE.
  const noChange = 'Forever trapped...';  //Syntax Error if declared without initialization.

  //To find what a variable's type is, use the typeof operator:
  console.log(typeof functionScoped); //Logs 'number'

  //Multiple values can be created at the same time by using arrays:
  let [value1, value2] = [4, 5]; //value1 = 4, value2 = 5.

  [value1] = [6, 7]; //Values can be ignored. In this case, the 7 is ignored.
  [value1, , value2] = [8, 9, 10]; //In this case, the 9 is ignored.

  //Remaining elements that aren't initialized can be stored in a sub-array:
  let [value3, ...arr] = [8, 9]; //arr === [9]
}

function primitiveDataTypes() {
  let num = 4.56 //NUMBER TYPE (Includes decimal numbers)
  //NOTE: JS often messes up decimal math due to value inaccuracies.

  let str = 'example'//STRING TYPE (Can be enclosed in ' ' or " ")

  let bool = true; //BOOLEAN TYPE

  let nullification = null; //NULL TYPE

  let uninitialized; //UNDEFINED TYPE

  let symbol = Symbol(); //SYMBOL TYPE
  //NOTE: The symbol type is used to avoid name clashes between object properties.
}
