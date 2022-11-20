function whatIsAName(collection, source) {
   const sourceKeys = Object.keys(source);

   return collection.filter((item) => {
      for (let i = 0; i < sourceKeys.length; i++) {
         if (!item.hasOwnProperty(sourceKeys[i]) || item[sourceKeys[i]] !== source[sourceKeys[i]]) {
            return false;
         }
      }

      return true;
   });
}

console.log(
   whatIsAName(
      [
         { first: "Romeo", last: "Montague" },
         { first: "Mercutio", last: null },
         { first: "Tybalt", last: "Capulet" },
      ],
      { last: "Capulet" }
   )
);

const arr = [1, 2, 3, 4];
const obj = [{ first: "Lutfi", last: "Dendiansyah" }, { first: "Lisa" }];

console.log(obj.filter((item) => !item.hasOwnProperty("first")));
