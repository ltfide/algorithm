// The global variable
const s = [23, 65, 98, 5];

Array.prototype.myMap = function (callback) {
   const newArray = [];
   // Only change code below this line
   // for (let index = 0; index < this.length; index++) {
   //    newArray.push(callback(this[index]));
   // }
   this.forEach((x) => newArray.push(callback(x)));
   // Only change code above this line
   return newArray;
};

const new_s = s.myMap(function (item) {
   return item * 2;
});

console.log(new_s);
