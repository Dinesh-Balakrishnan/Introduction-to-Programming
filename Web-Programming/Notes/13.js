/*
DEFINTIONS:

  - API (Application Program Interface): Code that allows two software programs
        to communicate with each other.

  - XML (Extensible Markup Language): A metalanguage that allows users to define
         their own customized markup languages.

  - AJAX (Asynchronous Javascript and XML): A set of web development techniques,
         using web technology on the client side, that allow web requests to be
         made even after an initial page load.
      - It was initially made for XML formatted data, but now many other formats
        are also accecpted. (Ex: JSON)

  - XHR (XML HTTP Request):  An API in the form of an object that transfers data
      between a web browser and web server.
      - Valid Data Formats: XML, JSON, HTML, Plain Text

  - readyState Values:
    - 0: Request isn't initialized.
    - 1: Server isn't connected.
    - 2: Request is received.
    - 3: Request is being processed.
    - 4: Request finished, response ready.

  - HTTP Request Methods:
    - GET: Receives metadata and content data from server.
    - HEAD: Receives metadata from server. (Used to check for necessary conditions)
    - POST: Submit data to server.
    - PUT: Submit data to server at the specified location. (Indempotent)
    - DELETE: Deletes data contained by server.
    - OPTIONS: Finds what request methods can be performed.
    - CONNECT: Starts a two-way communication tunnel with the server.
    - TRACE: Performs a message loop-back test for debugging purposes.
    - PATCH: Applies partial modifications to a source.

*/

makingRequests();
usingFetch();

function makingRequests() {
  //To create an XML Http Request object:
  const xhr = new XMLHttpRequest();

  //The location of the data and the data format are required to perform a request.
  const url = 'Uniform Resource Locator';
  xhr.responseType = 'json';

  /*The onreadystatechange property function is called when the readyState property
    of the xhr function changes. The function is used to specify what happens with
    the data received by an API. */
  xhr.onreadystatechange = () => {
    /*The readyState property keeps track of a number coressponding to to the status
    of the XMLHttpRequest. XMLHttpRequest.DONE === 4. */
    if (xhr.readyState === XMLHttpRequest.DONE) {
      /*xhr.response is the response sent by the server. The code inside this for
        loop determines what to do with the response. */
      return xhr.response;
    }
  }

  //The open method initializes a request. It can take up to 5 parameters:
  //HTTP Request Method, URL, Perform Asynchronously?, Username, Password
  xhr.open('HTTP REQUEST METHOD', url);

  //OPTIONAL: Add data to the header of the request. Method can be called many times.
  //xhr.setRequestHeader('key', value);

  /*The send method then sends the request to the server. Data can be passed into
    the request to send data to the server in an accepted format. (Ex: JSON) */
  xhr.send();
}

/*To use the fetch statement multiple times without rewriting code, it should be
  wrapped within a function. */
function usingFetch() {
  //the 'fetch' keyword automatically calls the specified url server.
  fetch('url', { //'fetch' accepts another parameter, an init options object.
    method: 'HTTP REQUEST METHOD', //Default method is GET
    headers: {'key': 'value', 'key': 'value'},
    body: JSON.stringify({'data': 'data'}),
    mode: 'cors' //Also available: 'no-cors', 'same-origin'
  }).then(
    resonse => {
      //The response to the server may not be successful. This is checked with .ok
      if (response.ok) {
        return response.json();
      }

      //If the request is a failure, an exception is thrown.
      throw Error('Request failed!');
    },

    //The network itself may have problems while making the request.
    networkError => {
      //To view the problem:
      console.log(networkError.message);
    }
  )
  //Another .then can be chained to handle a successful request.
  .then(jsonResponse => console.log(jsonResponse));
}
