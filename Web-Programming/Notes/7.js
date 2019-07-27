selectingElements();
elementModification();
eventHandlers();

function selectingElements() {
  /*Thanks to the DOM tree structure, an HTML document is accessed by JS as an object.
    As a result, it follows the same syntax as other objects. */

  //To access the body of an HTML element:
  let body = document.body;

  //The query selector allows to access element by using CSS selectors:
  let p = document.querySelector('p'); //Only the first p element is returned.
  let class = document.querySelector('.exampleClass'); //Again, only the first element.

  //The all query selector fixes the problem of getting one element by returning an array.
  let classArray = document.querySelectorAll('.exampleClass');

  //Tags, classes and ID attributes have their own selectors:
  let tagArray = document.getElementsByTagName('p'); //Array
  classArray = document.getElementsByClassName('exampleClass'); //Array
  let id = document.getElementById('exampleID');

  //Elements can also be selected by using the relationship between parent and children nodes.
  let child = document.body.firstChild;
  let childArray = document.body.children;
  let parent = document.body.parentNode;

  /*For a (VERY) comprehensive list of DOM properties:
  https://developer.mozilla.org/en-US/docs/Web/API/Document */
}

function elementModification() {
  //It is possible to access and set the contents of an element with the .innerHTML property.
  let text = document.querySelector('p').innerHTML;

  //It is possible to log the data to the console.
  console.log(text);
  /*When calling the variable 'text' like this, the program doesn't have a stored value. Instead,
    it acesses the document value at the time of calling. */

  //The inner HTML can be changed just like properties of an object:
  text = "Now it has a new value, me. The old value is replaced.";

  //It is also possible to change the CSS styles of an element in JS.
  document.querySelector('p').style.height = '70px';
  //NOTE: Value should be in quotes, property should be in camelCase instead of kebab-case.

  //Many values can be changed with the cssText property:
  document.querySelector('p').style.cssText = "background-color:pink; font-size:55px;"

  //The hidden value has its own object property.
  document.querySelector('div').hidden = true; //Hides the element.

  //An element can be created, but not placed into HTML, with the .createElement method.
  let list = document.createElement('li');

  //The element can then be placed by using .appendChild();
  document.body.appendChild(list); //Added as the last child element to the body element.

  //The syntax to remove an element using .removeChild() is as follows:
  let earth = document.querySelector("#universe");
  document.querySelector("#more-destinations").removeChild(earth);
}

function eventHandlers() {
  /*Events on the web are user interactions and browser manipulations that are
    programmable to trigger functionality. They can be almost any action happening
    to a webpage, such as the files loading in the browser or the user clicking on a button. */

  /*After a specific event 'fires' on a specific element, an event handler can be created
    to run as a response, such as the onclick function that fires when clicking on an element. */
  let button = document.querySelector('button');
  button.onclick = () => button.hidden = true; //The onclick property uses a callback function. */
  /*There are many event handlers such as mouseover, mouseout, mousedown, mouseup, keypress,
  keyup, and keydown. For a full list of events:
  https://developer.mozilla.org/en-US/docs/Web/Events */

  //Same example as above, with the addEventListener property:
  let button = document.querySelector('button');
  let buttonHide = function() {button.hidden = true;}
  button.addEventListener('click', buttonHide);

  //It is also possible to remove event listeners with the removeEventListener property:
  button.removeEventListener('click', buttonHide);

  //Information can be gathered on the details of an event that occured:
  let button.onclick = event => {
    console.log(event.target); //Accesses the element that triggered the event.
    console.log(event.type); //Accesses the name of the event.
    console.log(event.timeStamp); /*Accesses how long it took for the event to be triggered
                                    after the document was loaded. (in milliseconds). */
  }

}
