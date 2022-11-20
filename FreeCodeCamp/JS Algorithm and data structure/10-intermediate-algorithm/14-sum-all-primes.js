function sumPrimes(max) {
   var store = [],
      i,
      j,
      primes = [];
   for (i = 2; i <= max; ++i) {
      if (!store[i]) {
         primes.push(i);
         for (j = i < 1; j <= max; j += i) {
            store[j] = true;
         }
      }
   }
   return primes;
}

console.log(sumPrimes(100)); // 2 3 5 7 11 13 17 19
