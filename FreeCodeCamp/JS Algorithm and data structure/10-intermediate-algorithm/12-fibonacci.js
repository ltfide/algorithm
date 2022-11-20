function fibonacci(num) {
   //    const fibonacciNumber = [];
   //    let n1 = 1,
   //       n2 = 1,
   //       nextTerm;

   //    for (let i = 1; i <= num; i++) {
   //       fibonacciNumber.push(n1);
   //       nextTerm = n1 + n2;
   //       n1 = n2;
   //       n2 = nextTerm;
   //    }

   //    const b = fibonacciNumber.filter(function (n) {
   //       return n < 1000;
   //    });

   //    console.log(b);

   let prevNumber = 0;
   let currNumber = 1;
   let result = 0;
   while (currNumber <= num) {
      if (currNumber % 2 !== 0) {
         result += currNumber;
      }
      currNumber += prevNumber;
      prevNumber = currNumber - prevNumber;
   }

   return result;
}

console.log(fibonacci(7));

// program to generate fibonacci series up to n terms

// take input from the user
// let n1 = 0,
//    n2 = 1,
//    nextTerm;

// console.log("Fibonacci Series:");

// for (let i = 1; i <= 6; i++) {
//    console.log(n1);
//    nextTerm = n1 + n2;
//    n1 = n2;
//    n2 = nextTerm;
// }
