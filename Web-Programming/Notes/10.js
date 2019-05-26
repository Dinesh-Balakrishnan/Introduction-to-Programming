//importingCode(); (Uses require(), a NodeJS method)

function importingCode() {
  //All code can be imported into a file by using require(). (NodeJS)

  //Receiving all imports:
  const obj = require('./9.js');

  //Receiving specific, named imports:
  let {ExampleClass, exampleVar} = require('/9.js');
}

//      ----------------------- IMPORT KEYWORD -----------------------

//The import statement provides an alternative way to import multiple features.
//NOTE: the import statement must be top-level, meaning it can't be within a function.

//Importing the default export from a file:
import anyNameWorks from './9.js';

//Importing named exports from a file:
import {constVar as changedName, exampleVar} from './9.js';

//Can be imported together:
//import default, {namedExport1, namedExport2} from 'fileName';

//Importing all as an object:
import * as obj from './9.js';

//Importing all as an object, except the default value:
//import default, * as obj from 'fileName';

//While not necessarily an import, it is possible to run code from another file.
import './8.js';
