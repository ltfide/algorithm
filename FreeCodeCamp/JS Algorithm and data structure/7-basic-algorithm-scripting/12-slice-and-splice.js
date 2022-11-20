function frankenSplice(arr1, arr2, n) {
  let firstArr = [...arr1];
  let secondArr = [...arr2];
  let newArr = [];
  secondArr.slice(0, n).forEach((element) => {
    newArr.push(element);
  });
  firstArr.slice(0, n).forEach((element) => {
    newArr.push(element);
  });
  firstArr.splice(n).forEach((element) => {
    newArr.push(element);
  });
  secondArr.splice(n).forEach((element) => {
    newArr.push(element);
  });
  return arr1;

  // #2
  // let localArr = arr2.slice();
  // localArr.splice(n, 0, ...arr1);
  // return localArr;
}

console.log(frankenSplice([1, 2, 3], [4, 5, 6], 1));
console.log(frankenSplice([1, 2], ["a", "b"], 1));
console.log(frankenSplice(["claw", "tentacle"], ["head", "shoulders", "knees", "toes"], 2));
console.log(frankenSplice([], [1, 2, 3], 0));
