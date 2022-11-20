let sample = "Whitespace is important in separating words";
let sample2 = "whitespace      ok";
let countNonWhiteSpace = /\S/g; // Change this line
let result = sample2.match(countNonWhiteSpace).length;

console.log(result);
