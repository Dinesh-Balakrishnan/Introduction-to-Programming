errorSyntax();
errorTypes();


function errorSyntax() {
  /*Errors can be printed to the console. Printing it doesn't mean an error is
    thrown, so the code continues to run. */
  console.log(Error('Prints, but code continues.'));

  /*While the file name and line number default to the file in which the error
    is executed, they can be changed. */
  let error = new Error('message', 'fileName', 21 /*Line Number*/);

  //If an error is thrown, the script stops executing.
  if (false)
    throw Error('Stops the code from running.');

  /*By using the try-catch, try-finally, or try-catch-finally statements,
  code can continue to run even if an error is thrown. */
  try {
    throw Error('I\'m throwing an error, but it\'s being caught by the try statement.');
  }

  /*If an error is thrown while executing code in the try statement, the error
    is instead passed into the catch statement */
  catch (error) {
    console.log(error);
  }

  /*The code within the finally statement is executed regardless of whether
    an error was found or not. */
  finally {
    console.log('I will always run! No error will stop me!');
  }
}

function errorTypes() {
  //Runtime Error:
  InternalError();

  //Out of Bounds Error:
  RangeError();

  //Null/Nonexistant Data Error: (NOTE: Deferencing === Obtaining)
  ReferenceError();

  //Syntax Error:
  SyntaxError();

  //Wrong Type Error:
  TypeError();

  //eval() Function Error:
  EvalError();

  //encodeURI(), decodeURI() Parameter Error:
  URIError();
}
