function filteredArray(arr, elem) {
  let newArr = [];
  // console.log(arr[0][1]);

  for (let i = 0; i < arr.length; i++) {
    if (arr[i].indexOf(elem) === -1) {
      newArr.push(arr[i]);
    }
  }

  return newArr;
}

console.log(
  filteredArray(
    [
      [3, 2, 3],
      [1, 6, 3],
      [3, 13, 26],
      [19, 1, 9],
    ],
    3
  )
);
console.log(
  filteredArray(
    [
      [10, 8, 3],
      [14, 6, 3],
      [3, 18, 6],
    ],
    18
  )
);

// function greaterThanTen(arr) {
//   let newArr = [];
//   for (let i = 0; i < arr.length; i++) {
//     if (arr[i] > 2) {
//       newArr.push(arr[i]);
//     }
//   }
//   return newArr;
// }

// console.log(greaterThanTen([2, 12, 8, 14, 80, 0, 1]));
