// let sample = "aaaaaaah";
// let sample2 = "aah";
let sample3 = "Ohhh no";
// let multiple = /a{2,5}h/;
let multiple2 = /Oh{3,7}\sno/;
// let result = sample.match(multiple);
// let result2 = sample2.match(multiple);
let result3 = sample3.match(multiple2);

// console.log(result);
// console.log(result2);
console.log(result3);

let ohStr = "Oh no";
let ohRegex = /Oh{1} no/; // Change this line
// let result = ohRegex.test(ohStr);
let result = ohStr.match(ohRegex);

console.log(result);
