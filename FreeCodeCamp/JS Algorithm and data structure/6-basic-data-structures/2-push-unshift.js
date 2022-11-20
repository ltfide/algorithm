function mixedNumbers(arr) {
  // Only change code below this line
  arr.unshift("I", 2, "three"); // di tambah di awal
  arr.push(7, "VIII", 9); // di tambah di akhir
  // Only change code above this line
  return arr;
}

console.log(mixedNumbers(["IV", 5, "six"]));
