function copyMachine(arr, num) {
  let newArr = [];
  while (num >= 1) {
    newArr.push([...arr]);
    num--;
  }
  return newArr;
}

console.log(copyMachine([true, false, true], 3));

// let thisArray = [true, true, undefined, false, null];
// let thatArray = [...thisArray]; // spread operator untuk mencopy array
// thisArray[0] = "lutfi";
// console.log(thatArray);
