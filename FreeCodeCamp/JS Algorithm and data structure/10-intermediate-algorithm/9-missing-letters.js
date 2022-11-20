function fearNotLetter(str) {
   //    const chars = "abcdefghijklmnopqrstuvwxyz";
   //    const firstLetter = chars.indexOf(str.charAt(0)); // a = 0
   //    const lastLetter = chars.indexOf(str[str.length - 1]); // f = 5
   //    for (let i = firstLetter; i < lastLetter; i++) {
   //       if (str.indexOf(chars[i]) == -1) {
   //          return chars[i];
   //       }
   //    }

   //    return undefined;

   // #2
   for (var i = 0; i < str.length; i++) {
      /* code of current character */
      var code = str.charCodeAt(i);
      console.log(str.charCodeAt(0) + i);

      /* if code of current character is not equal to first character + no of iteration
        hence character has been escaped */
      if (code !== str.charCodeAt(0) + i) {
         /* if current character has escaped one character find previous char and return */
         return String.fromCharCode(code - 1);
      }
   }
   return undefined;
}

console.log(fearNotLetter("vwyz"));

const missing = [],
   i = 0;
const chars = "abcdefghijklmnopqrstuvwxyz";
const a = "def";

// console.log(chars.indexOf(a[a.length - 1]));
