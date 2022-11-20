function popShift(arr) {
  let popped = arr.pop();
  console.log(popped);
  let shifted = arr.shift();
  console.log(shifted);
  return [popped, shifted];
}

console.log(popShift(["challange", "is", "not", "complete"]));
