regularExpressions();
regexModifiers();
regexMetacharacters();
regexMethods();

function regularExpressions() {
  let str = 'Hello, my name is: NAME #100 GOES HERE.';
  //Regular expressions (Regex), are objects that help match, locate, and manage text.
  //NOTE: Don't use spaces in a regex unless needed. It messes up the regex.

  //To match (find) a literal string: /string/
  let regex = /Hello/;

  //To match multiple strings: /string1|string2|string3...../
  regex = /name|NAME/;
  regex = /my (name|NAME) is:/;

  //To match a single, unkown character: /./
  regex = /HER./;

  //To match a single character from a set of characters: /[chr1chr2chr3]/
  regex = /H[aeiou]llo/;

  //To match a single character from a range of characters: /[A-Z]|[a-z]|[0-9]/
  regex = /H[a-u]llo/;
  regex = /1[0-4][0-4]/;

  //To match a single character NOT from a range/set of characters: /[^chr1chr2]/
  regex = /m[^a-x]/;

  //To match character(s) appearing 1+ times in a row: /chr+|[chrSet]+/
  regex = /Hel+o/;

  //To match character(s) appearing 0+ times in a row: /chr*|[chrSet]*/
  regex = /[A-Z]*E/;

  //To match character(s)appearing 0 or 1 times in a row: /chr?|[chrSet]?/
  regex = /[A-Z]?E/;

  /*The '*' performs a greedy match, which means it consumes the longest string possible.
    Alternatively, the '*?' performs a lazy match by consuming the shortest string possible.
    Regardless, the first match found is counted.*/
  regex = /H[A-Z]*?E/; //Would only find the 'HE' in 'HERE.'

  //To see whether the front of a string matches a pattern: /^chrPattern/
  regex = /^Hello/;

  //To see whether the end of a string matches a pattern: /chrPattern$/
  regex = /ERE.$/;

  //To see whether the entire string matches a pattern: /^chrPattern$/
  regex = /^Hello, my name is: NAME #100 GOES HERE.$/;

  //To specify an exact number of matches for a character: /chr{numMatches}/
  regex = /10{2}/;

  //To specify a lower limit of matches for a character: /chr{lowerLimit,}/
  regex = /Hel{2,}o/;

  //To specify a lower and upper limit of matches: /chr{lowerLimit,upperLimit}/
  regex = /n[a-z]{2,5}/;

  /*Positive and negative lookaheads match strings, but don't consume the
    characters. This means the position during matching remains the same. */
  /*Positive lookahead (Matches if str is present): /(?=str) */
  regex = /Hello, my name is: (?=NAME)/;

  /*Negative lookahead (Matches if str isn't present): /(?!str) */
  regex = /^[A-Za-z, ]+(?!is)/;
}

function regexModifiers() {
  let str = 'Title Goes Here\n Date Goes Here';

  //To ignore the difference between upper and lower case: //i
  let regex = /[a-z]*/i //Equals /[a-zA-z]*/

  //To match all possibilities in a string: //g
  regex = /[a-z]/g;

  //To enable multi-line mode: (^ and $) search before and after every newline: //m
  regex = /^Date$/m;
}

function regexMetacharacters() {
  let str =
    'User: #10034\nPassword:    dk38A94jG\nUser: #10034\nPassword:    dk38A94jG\n';

  // [a-zA-Z0-9_] Metacharacter: /\w/, [^a-zA-Z0-9_] Metacharacter: /\W/
  let regex = /\W/g;

  // [0-9] Metacharacter: /\d/, [^0-9] Metacharacter: /\D/
  regex = /User: #\d+/;

  // Whitespace Metacharacter: /\s/, Non-Whitespace Metacharacter /\S/
  regex = /Password:\s+\w+/;

  //To match for a sequence at the beginning/end of each word: /\bsequence|sequence\b/
  //To match for a sequence NOT at the beginning/end of each word: /\Bsequence|sequence\B/
  //NOTE: \b represents a boundary, the position between a word and a space.
  regex = /d\b/;

  //Capture groups find repeat substrings in regex expressions: /(pttrn1)(pattrn2)..\1\2../
  //NOTE: The pattern captured in the string becomes the exact pattern being matched.
  regex = /(User:\s*#\d+\s)(Password:\s*\w+\s)\1\2/;

  //To prevent the use of parentheses from becoming a capture group: /(?:pttrn)/
  regex = /\n(?:User:|Password:)/;
}

function regexMethods() {
  let str = 'Hello, my name is: NAME #100 GOES HERE.';
  let regex = /([a-z])/ig;

  //The regex expression has its own test method to see whether a match exists:
  console.log(regex.test(str));

  //str.search(regex) returns the position of a match.
  console.log(str.search(regex));
  //Despite the global modifier 'g', only the first match index is returned.

  /*str.match(regex) returns all matched substrings in str if the global modifier is
    present. Else, an array containing details about the single match is returned. */
  console.log(str.match(regex));

  /*str.replace(regex, newStr) replaces the first matched instance (All instances
    if the global modifier is used) with the newStr. (Non-Mutative)*/
  console.log(str.replace(regex, 'i $1'));
  //Capture groups can be used in replace() with $captureGroupNum

  /*str.replace(globalRegex, function) passes in each match to the function.
    The value returned from the function is the replace value. */
  str.replace(/[A-Z]/g, L => String.fromCharCode((L.charCodeAt(0) % 26) + 65) //ROT13 Decoder

  //NOTE: Almost all string methods can be passed a regex instead of a substring.
}
