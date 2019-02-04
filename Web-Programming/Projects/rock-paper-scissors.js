const allowedInputs = ['rock','paper','scissors'];

playGame("Rock");

function playGame(choice) {
  let userChoice = getUserChoice(choice);
  let computerChoice = getComputerChoice();

  console.log("The User Choice: " + userChoice);
  console.log("The Computer Choice: " + computerChoice);
  console.log(determineWinner(userChoice, computerChoice));
}

function getUserChoice(userInput) {
  userInput = userInput.toLowerCase();
  if(allowedInputs.some(input => input == userInput)) {
    return userInput;
  }
  throw 'Error: The input wasn\'t correct. Please retry.';
};

function getComputerChoice() {
  choice = Math.floor(Math.random() * 3);
  return allowedInputs[choice];
};

function determineWinner(userChoice, computerChoice) {
  if (userChoice === computerChoice){
    return "Nobody won. The game resulted in a tie.";
  } else if (userChoice === undefined){
    return "The user choice is invalid. The computer automatically wins."
  }else if ((userChoice === 'rock' && computerChoice === 'paper') ||
            (userChoice === 'paper' && computerChoice === 'scissors') ||
            (userChoice === 'scissors' && computerChoice === 'rock')) {
    return "The computer won... what a shame...";
  } else {
    return "Good job! You won the game!";
  }
}
