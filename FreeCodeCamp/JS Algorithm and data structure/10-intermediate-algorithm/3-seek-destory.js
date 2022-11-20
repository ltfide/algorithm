const a = [1, 2, 1, 2];

// delete a[a.indexOf(2)];
// delete a[a.indexOf(2)];
// a.splice(0, 1);
// console.log(a);

function destroyer(arr) {
   let valsToRemove = Object.values(arguments).slice(1);

   // 1
   // return arr.filter((m) => !valsToRemove.includes(m));

   for (let i = 0; i < arr.length; i++) {
      for (let j = 0; j < valsToRemove.length; j++) {
         if (arr[i] === valsToRemove[j]) {
            delete arr[i];
         }
      }
   }

   return arr.filter((n) => n != null);
}

console.log(destroyer([1, 2, 3, 1, 2, 3], 2, 3));
