let raceNumber = Math.floor(Math.random() * 1000);
let registered = true;
let runnerAge = 17;

if (registered && runnerAge >= 18){
   raceNumber += 1000;
  console.log(raceNumber + " will race at 9:30 am.");
} else if (runnerAge >= 18){
  console.log(raceNumber + " will race at 11:00 am.");
} else if (runnerAge < 18){
  console.log(raceNumber + " will race at 12:30 pm.");
} else {
  console.log("Please see the registration desk.");
}
