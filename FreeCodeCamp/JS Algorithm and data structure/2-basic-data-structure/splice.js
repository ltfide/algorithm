// 1
// const arr = [2, 4, 5, 1, 7, 5, 2, 1];
// const number = [10, 11, 12, 12, 15];

// console.log(number.splice(3, 1, 13, 14)); // ini untuk remove dan menambahkan
// console.log(number);

// // let arrSplice = arr.splice(1, 2);
// console.log(arr.splice(1, 3)); // ini 2 param buat remove

// console.log(arr);

// 2
function htmlColorNames(arr) {
  arr.splice(0, 2, "DarkSalmon", "BlancedAlmond");
  console.log(arr);
  return arr;
}

console.log(htmlColorNames(["darkGoldenRod", "WhiteSmoke", "LavenderBlush", "PaleTurquoise", "FireBrick"]));
