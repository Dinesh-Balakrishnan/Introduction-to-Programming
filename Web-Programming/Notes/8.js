/*JavaScript classes are syntactic sugar used to create many object instances,
similar to factory functions.*/

class ExampleClass {
  //Because method overloading isn't supported, only one constructor can be created.
  //This constructor is simply a constructor function.
  constructor(val1, val2) {
    //Instance variables (properties) don't need to be declared outside of the constructor.
    this._val1 = val1;
    this._val2 = val2;

    /*By wraping a variable within a function, it's value is now private. The problem
      here is that all functions that use the private variable's value need to
      exist within the constructor. */
    this.example = function() {return val2};

    /*In a constructor, properties can't access each other. */
    //this.inConstructor = function() {return this.example + 1} (Doesn't work!)
  }

  //No commas are needed to separate values.
  //All methods defined outside the constructor exist in the prototype.
  get val() {
    return this._val1 + this._val2;
  }

  /*The main problem with using classes is using the 'this' keyword. When
    another object unrelated to ExampleClass calls increment(), the 'this'
    keyword will look for increment() within the unrelated object. */
  increment() {
    this._val1++;
    this._val2 *= 2;
  }

  //Static methods are created with 'static'.
  static staticMethod() {
    return 'I must be called using the class name, not object name.'
  }

  //Private methods have to be accessed from outside the class:
  publicMethod() {
    privateMethod();
  }
}

//Subclasses are created through the extends variable.
//They automatically inherit the superclass's prototype.
class ExampleSubclass extends ExampleClass {
  constructor(val1, val2) {
    //Super constructor calls the parent constructor and must be used on the first line.
    //'this' then refers to the current object.
    super(val1, val2);
    this._val1++;
  }

  //NOTE: All getters, setters, and methods are inherited by the subclass.
  //increment isn't overloaded due to having a different parameter; it is instead replaced.
  increment(amount) {
    this._val1 += amount;

    //Super method accesses the parent increment method and doesn't need to be called first.
    super.increment();
  }
}

//Objects are created by instantiating the class.
const obj = new ExampleClass(1, 1);

//The object then works just like any defaultly created object.
obj.increment();
console.log(obj.val);

//The properties set within the object constructor can be called normally.
console.log(obj.example());

//Despite not being located in ExampleSubClass, the getter method still exists through inheritence.
const subclassObj = new ExampleSubclass(4, 4);
console.log(subclassObj.val);

//Due to being replaced, the original instance method without parameters won't work.
subclassObj.increment();
//The console will log NaN because instance(amount) is called, with amount equaling null.
console.log(subclassObj.val);

//The type of an object can be checked with instanceof:
console.log(subclassObj instanceof ExampleClass); //Logs true (Inheritence)

//Static methods are called using the class name.
console.log(ExampleClass.staticMethod());

//Static variables can only be created after a class is defined: (A class is an object!)
ExampleClass.staticVar = 'Static Variable';

//Private methods also have exist outside a class declaration:
function privateMethod() {
  console.log('My code can\'t be reached');
}

//The toString() will log: [Function: publicMethod]
console.log(obj.publicMethod);
