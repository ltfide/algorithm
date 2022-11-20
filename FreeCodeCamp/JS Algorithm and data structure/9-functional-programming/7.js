function test() {
   let a = 1;
   let b = 2;
   console.log("a awal = ", a);
   console.log("b awal = ", b);

   [a, b] = [b, a];

   console.log("a final = ", a);
   console.log("b final = ", b);
}

test();
