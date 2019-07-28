//exportingCode();
//NOTE: If module.exports already contains a value, the export keyword is ignored.

function exportingCode() {
  //Everything in a JavaScript file can be exported using module.exports

  //Primitive Values:
  let exampleVar = 3;
  module.exports = exampleVar;

  //Functions:
  function exampleFunc() {
    console.log('I am an example function');
  }
  module.exports = exampleFunc;

  //Objects:
  let exampleObj = {color: 'blue', number: 4};
  module.exports = exampleObj;

  //Classes:
  class ExampleClass {
    constructor() {
      this.exampleVal = 4;
    }
  }
  module.exports = ExampleClass;

  //Individual values can be exported by wrapping them all in an object.
  module.exports = {exampleVar, exampleObj, ExampleClass};
}

//      ----------------------- EXPORT KEYWORD -----------------------

//The export statement provides an alternative way to export multiple features.
//NOTE: the export statement must be top-level, meaning it can't be within a function.

//Primitive Value:
export let exampleVar = 3;

//Class:
export class ExampleClass {
  constructor() {
    this.exampleVal = 4;
  }
}

const constVar = 4;
//Many values can be imported using the object format.
//The as keyword can be used to rename a feature while exporting it.
export {constVar, ExampleClass as ChangedClass};

/*Each file is also allowed one default export. This feature can be imported
 by another file with any name declaration. Named exports that aren't
 default must be imported using the same exported name. */
export default 'I can be assigned any var name wanted!';
