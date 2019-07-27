falsyValues();
uniqueOperators();

function falsyValues() {
  if (false ||
      null ||
      undefined ||
      0 ||
      NaN ||
      '' ||
      "" ||
      ``)
  {console.log("Won't print.");}
}

function uniqueOperators() {
  //The == sign converts data types in order to compare two statements/variables:
  console.log('1' == 1); //Logs true - Automatically functions like parseInt('1')

  //Alternatively, the === doesn't convert data types when comparing:
  console.log('1' === 1); //Logs false

  /*Because of the falsy values in JS, the || can be used in variable assignment
    to prevent unwanted values: */
  let username;
  const defaultName = username || 'Stranger';
  console.log(defaultName); //Logs Stranger

  //The ternary operator in JS doesn't need to return a value:
  username ? console.log("The username exists!") : console.log("The username doesn't exist.");

  //The switch operator is an alternative syntax to using else if when checking for a value.
  const groceryItem = 'papaya';
  switch (groceryItem) {
    case 'tomato':
      console.log('Tomatoes are $0.49');
      break;
    case 'lime':
    case 'lemon': //Multiple cases can be lead to the same result.
      console.log('Limes are $1.49');
      break;
    case 'papaya':
      console.log('Papayas are $1.29');
      break; //If the break keyword isn't specified, the next case will be checked no matter what.
    default:
      console.log('Invalid item');
      break;
  } // Prints 'Papayas are $1.29'
}
