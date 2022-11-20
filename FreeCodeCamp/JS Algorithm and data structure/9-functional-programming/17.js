function alphabeticalOrder(arr) {
   // Only change code below this line

   return arr.sort((a, b) => {
      return a === b ? 0 : a > b ? 1 : -1;
   });
   // Only change code above this line
}

function ascendingOrder(arr) {
   return arr.sort(function (a, b) {
      console.log(a);
      return b - a;
   });
}

console.log(alphabeticalOrder(["a", "d", "c", "a", "z", "g"]));
console.log(ascendingOrder([1, 5, 2, 3, 4]));
