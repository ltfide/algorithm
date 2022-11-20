function sumFibs(num) {
   // Solution 1
   // let prevNumber = 0;
   // let currNumber = 1;
   // let fibonacci = 1;
   // let result = 1;
   // for (let index = 2; index > 1; index++) {
   //    fibonacci = prevNumber + currNumber; // 0 + 1
   //    if (fibonacci % 2 === 1) {
   //       // 1, 1, 3, 5
   //       if (fibonacci <= num) {
   //          result += fibonacci;
   //       } else {
   //          break;
   //       }
   //    }
   //    prevNumber = currNumber; // 1
   //    currNumber = fibonacci; // 1
   // }
   // return result;

   // Solution 2
   let prevNumber = 0;
   let currNumber = 1;
   let result = 0;
   while (currNumber <= num) {
      if (currNumber % 2 === 1) {
         result += currNumber;
      }
      console.log(prevNumber);
      currNumber += prevNumber; // 1 + 0 // 1 + 1 // 2 + 1 // 3 + 2
      prevNumber = currNumber - prevNumber; // 1 - 0 // 2 - 1 // 3 - 1 // 5 - 2
   }
   return result;
}

console.log(sumFibs(10));
// console.log(sumFibs(75025));
