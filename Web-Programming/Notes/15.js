settingPrototypes();
prototypeInheritance();
mixin();

//NOTE: JavaScript doesn't support method overloading and method overriding.

/*A function is an object. As a result, a constructor function is used to create
  an object instance of itself. (Use CamelCase for the constructor's name.)*/
function Constructor(val1, val2) {
  /*Public, own properties are created by using 'this'. Own properties are properties
    that are directly defined in the instance object and not available to other instances.*/
  this.val1 = val1;
  this.val2 = () => val2; //val2 is private. (Ex of a closure)

  /*Other private properties can be defined with the 'let' or 'var' keywords. */
  let privateVar = 10;
  this.publicVar = () => this.privateVar;
}

//To make a subtype:
function Descendent(val1, val2) {
  //.call() allows a function belonging to one object to be called for a different object.
  Constructor.call(this, val1, val2);

  //.apply() is the exact same thing, except with an array argument:
  Constructor.apply(this, [val1, val2]);
}

function settingPrototypes() {
  /*Constant properties can be placed in a prototype. When objects are created, they
    contain a reference to the prototype through '__proto__', a.k.a. dunder proto. */
  Constructor.prototype.val3 = 20;

  //Instead of changing each prototype value, a new prototype object is created.
  Constructor.prototype = {
    //The .constructor property has to be redefined in the new prototype object.
    //It's importat because it defines the target of the 'this' keyword.
    constructor: Constructor,

    val3: 20,
    val4: function() {return 50}
  };

  /*'Descendent' also needs to inherit 'Constructor's prototype, which is done
    by adding a dunder proto value to the prototype itself, creating a prototype chain.
  (The 'Constructor' class prototype automatically inherits from the Object prototype.) */
  Descendent.prototype = Object.create(Constructor.prototype);
  Descendent.prototype.constructor = Descendent;

  /*Using 'new' is also possible, but this is bad design as instance properties
    are also inherited */
  //Descendent.prototype = new Construtor(1, 2);
  //The above code would give Descendent's dunder proto val1 and val2.
}

function prototypeInheritance() {
  //The syntax to create and use an object is same as with JS classes.
  let obj = new Constructor(1, 2);
  console.log(obj.val1);

  //Prototype properties are also called as normal:
  console.log(obj.val3);

  /*When searching for a property in a an object, the object's own properties are
    checked before checking the prototype. Changing the value of a property
    for a specific object doesn't change the prototype, but creates the property
    within the object itself. */
  obj.val3 = 4;
  let otherObj = new Constructor(1, 2);
  console.log(otherObj.val3); //Logs 20

  //.hasOwnProperty() returns false if a value is located in the dunder proto.
  console.log(obj.hasOwnProperty('val3')); //Logs true
  console.log(otherObj.hasOwnProperty('val3')); //Logs false

  /*While instanceof checks whether the prototype property of a constructor appears
    anywhere in the prototype chain of an object, a specific constructor can be checked:*/
  console.log(obj.constructor === Constructor); //Logs 'true'

  //It is also possible to see whether an object exists in another object's prototype chain.
  console.log(Constructor.prototype.isPrototypeOf(obj));
  //Same as:
  console.log(Constructor.prototype === obj.__proto__);

  //The descendent inherits from the constructor, so .isPrototypeOf returns true.
  console.log(Constructor.prototype.isPrototypeOf(Descendent.prototype));
}

/*A mixin is used to add the same property to objects that are unrelated. This
  is a better solution than using inheritance. */
function mixin(obj) {
  obj.val5 = 'Hello Word!';
}
