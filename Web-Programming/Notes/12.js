/*
DEFINTIONS:

  - Singlethreading: Executing statements in a single sequence,
    one statement at a time.

  - Multithreading: Executing statements in different sequences at the same time
    to make optimal use of available resources, especially when having multiple CPUs.

  - Synchronous: Executing statements in order.

  - Asynchronous: Being able to execute statements out of order to prevent wait
    time on another process.
    - EX: Code is processed while waiting for information from an API.

  - NOTE: JavaScript is an asynchronous, single threaded scripting language.

*/

asynchronity();
promises();
setTimeout(asynchronousFunction, 2000);

//Demonstration of JavaScript's asynchronity.
function asynchronity() {
  //setTimeout is used, which is an asynchronous function.
  let result = new Promise((resolve, reject) => {
    setTimeout(() => resolve('I am complete!'), 1000);
  });

  /*Because of setTimeout, result isn't evaluated yet. Because of JavaScript's
    asynchronity, result is still logged. */
  console.log(result); //Logs Promise { <pending> }

  /*JavaScript contains many asynchronous functions, such as setInterval,
    requestAnimationFrame, XMLHttpRequest, WebSocket, Worker, some APIs, and more. */
}

function promises() {
  /*Promises are objects that represent the outcome of an asynchronous operation.
    They can be used with synchronous code, but it's unecessary abstraction.
    (Examples in this method are synchronous.) */

  //To create a Promise:
  let coinFlip = new Promise(executorFunction);

  //Handling the results of a promise:
  coinFlip.then( //Pending State
    resolved => console.log(`1st Round: I won! ${resolved}!`), //Fulfilled State
    rejected => console.log(`1st Round: I lost! ${rejected}!`) //Rejected State
  );

  //Or.....
  coinFlip.then(
    resolved => console.log(`1st Round: I won! ${resolved}!`)
  ).catch (
    rejected => console.log(`1st Round: I lost! ${rejected}!`)
  );

  //Promises can be infinitely chained: (For dependent asynchronous operations)
  new Promise(executorFunction).then(
    resolved => new Promise(executorFunction)
  ).then (
    resolved => console.log(`2nd Round: I won! ${resolved}!`)
  ).catch (
    rejected => console.log(`2nd Round: I lost! ${rejected}!`)
  );

  //To handle multiple, unrelated asynchronous operations:
  Promise.all([new Promise(executorFunction), new Promise(executorFunction)])
    //'then' contains all the resolved values of each executor function.
    .then(
      resolvedValues => console.log('3rd Round: I won!')
    )
    //'catch' contains the rejection value of the first promise to reject.
    .catch(
      rejected => console.log('3rd Round: I lost!')
    )
  /*Promise.all is more efficient than the chained promise in this scenario
    because all promises are executed at the same time in Promise.all. The 3rd
    round's results will be executed before the 2nd round's results */
}

//To declare an asynchronous function or function expression, use the async keyword.
async function asynchronousFunction() {
  //The try-catch statement is an alternative to using .catch()
  try {
    //The await keyword waits for a function to complete before continuing.
    let result = await new Promise(executorFunction);
    console.log('Prints after the executorFunction is done executing.');
    console.log(`I got ${result}!`);
  } catch (error) {
    console.log('The coin flipped tails!');
  }

  /*The await keyword can be used later, when the results of the executor function
    is needed. */
    try {
      //The await keyword waits for a function to complete before continuing.
      let result = new Promise(executorFunction);
      console.log('Prints BEFORE the executorFunction is done executing.');
      console.log('Waiting...')
      console.log(`I got ${await result}!`);
    } catch (error) {
      console.log('The coin flipped tails!');
    }
}

/*The Promise object is passed in an executor function, which runs code and
  executes the resolve() or reject() method based on whether it was able
  to run successfully or not. (NOTE: Must have two parameters.) */
function executorFunction(resolve, reject) {
  /*The setTimeout function takes in a function and the time in milliseconds.
    After the specified time, the function evaluates. */
  setTimeout(() => {
    Math.random() < 0.5 ? resolve('heads') : reject('tails');
  }, 1000);
}
