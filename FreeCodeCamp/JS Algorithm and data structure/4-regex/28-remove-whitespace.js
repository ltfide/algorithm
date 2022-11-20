let hello = "   Hello, World!  ";
let wsRegex = /^\s+|\s+$/g; // Change this line
let result = hello.replace(wsRegex, ""); // Change this line
let match = hello.match(wsRegex);
console.log(result);
// console.log(match);

const testRegex = "13.432312312";
// let regex = /\D*\d{[.]4}/;

// console.log(testRegex.match(regex)[0]);

console.log("0.52421313123asdsadas1".substring(0, 3));
console.log("10.52421313123asdsadas1".substring(0, 4));

const x = parseFloat(10.3213141);
console.log(x);
