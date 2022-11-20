let shortHand = /\W/;
let numbers = "42%";
let sentence = "Coding!";
let val = "32320";
console.log(numbers.match(shortHand));
console.log(sentence.match(shortHand));
console.log(val.match(shortHand));

// \W = [^A-Za-z0-9_]
