let chewieQuote = "Aaaaaaaaaaaaaaaarrrgh!";
let chewieQuote2 = "He made a fair move. Screaming about it can't help you.";
let chewieRegex = /Aa*/;
let result = chewieQuote.match(chewieRegex);
let result2 = chewieQuote2.replace(/[.]+/gi, "");

console.log(result2);
console.log(result);

console.log("2345678".match(/\D*\d{3}$/));
