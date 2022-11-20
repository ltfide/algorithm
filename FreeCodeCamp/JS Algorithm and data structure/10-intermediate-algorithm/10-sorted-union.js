function uniteUnique(...arr) {
   let sortedArr = [];
   for (let i = 0; i < arr.length; i++) {
      arr[i].forEach((element) => {
         if (!sortedArr.includes(element)) {
            sortedArr.push(element);
         }
      });
   }

   return sortedArr;
}

console.log(uniteUnique([1, 3, 2], [5, 2, 1, 4], [2, 1]));
console.log(uniteUnique([1, 2, 3], [5, 2, 1]));
console.log(uniteUnique([1, 3, 2], [5, 2, 1, 4], [2, 1]));
