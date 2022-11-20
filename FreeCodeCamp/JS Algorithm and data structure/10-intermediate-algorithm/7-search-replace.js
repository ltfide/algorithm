function myReplace(str, before, after) {
   if (before[0] == before[0].toUpperCase()) {
      let a = after.replace(after[0], after[0].toUpperCase());
      return str.replace(before, a);
   }

   return str.replace(before, after.toLowerCase());
}

console.log(myReplace("He is Sleeping on the couch", "Sleeping", "sitting"));
console.log(myReplace("Let us go to the store", "store", "mall"));

const abc = "Sleeping";
const bc = "sitting";
// const myRegex = abc.match(/[^a-z]/)[0].toLowerCase();

// if (abc[0] == abc[0].toUpperCase()) {
//    let a = bc.replace(bc[0], bc[0].toUpperCase());
// }

// console.log(x);

// console.log(myRegex);
