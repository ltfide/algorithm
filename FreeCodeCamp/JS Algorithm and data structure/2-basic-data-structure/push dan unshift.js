function mixedNumbers(arr) {
  arr.unshift("satu", 2);
  arr.push("enam", 7, "VIII");
  return arr;
}

console.log(mixedNumbers(["tiga", 4, "V"]));
// console.log(mixedNumbers([1]));
