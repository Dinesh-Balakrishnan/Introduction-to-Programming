thisAndBinding();
instantiationLeaks();
let obj = factoryFunction('red');

function thisAndBinding() {
  //The 'this' keyword refers to the current object it is located in.
  let obj = {
    value: 12,
    talk(){ return this.value; }
  };
  let problemObj = {};
  problemObj.talk = obj.talk;

  //The obj.talk() returns the correct value, being 12.
  console.log(obj.talk());
  /*problemObj.talk() returns undefined because this.value refers to problemObj,
    which doesn't have a 'value' property. */
  console.log(problemObj.talk());

  /*A quick solution to this is using bind(), which takes a function and changes
    the 'this' value to refer to a specified object. */
  console.log(problemObj.talk.bind(obj)());
}

function instantiationLeaks() {
  //Details of instantiation get leaked to the calling API through subclasses:
  function Red(){}
  function Blue(){}
  let color = 'blue';

  /*In this example, the code has to know about Color, but also about its
    subclasses Red and Blue as well as any possible parameters. */
  let obj = new Red();
  if (color === 'blue')
    obj = new Blue();
}

function factoryFunction(color) {
  /*Factory functions have a lot of potential because they can return different
    values based on the parameter, from objects to functions. */
  return color !== undefined ?
   {
    shape: 'square',
    sides: 4,
    truthy: true,
    color
  }:
  function(shape) {
    return {truthy: true, shape};
  }

  /*In addition, one doesn't have to mess with the 'new' keyword, while many
    confusions created by the 'this' keyword are also avoided. */
}
