function mutation(arr) {
  for (let i = 0; i < arr[1].length; i++) {
    const first = arr[0].toLowerCase();
    const second = arr[1].toLowerCase();
    if (!first.includes(second[i])) {
      return false;
    }
  }

  return true;
  // return arr[0].includes(arr[1]);
}

console.log(mutation(["hello", "hey"]));
console.log(mutation(["Mary", "ARMdY"]));

// const str = "Hello";

// const a = "hello";

// const regex = new RegExp(a, "i");
// console.log(regex.test(str));

// console.log(/^[aiueo]$/.test("aHello"));
