function translatePigLatin(str) {
   let consonantRegex = /^[^aeiuo]+/;
   let myConsonants = str.match(consonantRegex);

   return myConsonants !== null ? str.replace(consonantRegex, "").concat(myConsonants).concat("ay") : str.concat("way");

   // #2
   //    if (str.match(/^[aeiou]/)) return str + "way";

   //    const consonantCluster = str.match(/^[^aeiou]+/)[0];
   //    return str.substring(consonantCluster.length) + consonantCluster + "ay";
}

console.log(translatePigLatin("consonant"));
console.log(translatePigLatin("glove"));
console.log(translatePigLatin("algorithm"));

const str = "consonant";
const regex = /^[^aeiuo]+/;

let myCon = str.match(regex);

console.log(str.replace(myCon, "").concat(myCon).concat("ay"));
