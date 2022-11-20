function summation(num) {
  let a = 0;
  for (let i = 1; i <= num; i++) {
    a += i;
  }

  return a;
}

console.log(summation(8));
console.log("ok");
