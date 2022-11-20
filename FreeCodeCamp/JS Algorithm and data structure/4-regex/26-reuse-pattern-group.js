let repeatNum = "42 42 42";
// let reRegex = /^(\d+)\s\1\s\1$/;
let reRegex = /(\d+)\s/;
let result = reRegex.test(repeatNum);
let result2 = repeatNum.match(reRegex);

console.log(result2);
