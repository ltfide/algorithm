// console.log("titanic".match(/t[a-z]*?i/));

let text = "<h1>Winter is coming</h1>";
let myRegex = /<.*?>/; // Change this line
let result = text.match(myRegex);

console.log(result);

console.log(/a$/.test("kua a"));
