let quoteSample = "3 blind mice.";
let myRegex = /[^aiueo|0-9]/gi; // Change this line
let result = quoteSample.match(myRegex); // Change this line

console.log(result);

console.log("12k".match(/[^a-z]/));
