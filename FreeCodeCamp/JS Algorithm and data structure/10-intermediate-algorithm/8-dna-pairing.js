function pairElement(str) {
   // #1
   const DNA = str.split("");
   //    let result = [];
   //    for (let i = 0; i < DNA.length; i++) {
   //       if (DNA[i] == "A") {
   //          result.push([DNA[i], "T"]);
   //       } else if (DNA[i] == "T") {
   //          result.push([DNA[i], "A"]);
   //       } else if (DNA[i] == "C") {
   //          result.push([DNA[i], "G"]);
   //       } else if (DNA[i] == "G") {
   //          result.push([DNA[i], "C"]);
   //       }
   //    }
   //    return result;
   //    #2

   let pairs = {
      A: "T",
      T: "A",
      C: "G",
      G: "C",
   };

   let arr = str.split("");

   return arr.map((x) => [x, pairs[x]]);
}

console.log(pairElement("ATCGA"));
