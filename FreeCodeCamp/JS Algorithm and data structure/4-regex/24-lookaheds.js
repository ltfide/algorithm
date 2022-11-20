let quit = "qsasa";
let noquit = "qt";
let quRegex = /q(?=...)/;
let qRegex = /q(?!...)/;
let result = quit.match(quRegex);
let result2 = noquit.match(qRegex);

console.log(result);
console.log(result2);

// password check

// let password = "abc123";
let password2 = "banan231";
let checkPass = /(?=\w{6})(?=\D*\d{2})/;
let result3 = password2.match(checkPass);

console.log(result3);
