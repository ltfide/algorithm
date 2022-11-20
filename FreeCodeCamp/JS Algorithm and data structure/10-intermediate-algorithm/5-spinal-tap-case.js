function spinalCase(str) {
   //    return str.toLowerCase().replace(/\s/g, "-");
   const textLower = str.toLowerCase();
}

console.log(spinalCase("This Is Spinal Tap"));

let s = "exampleStringTwoThe-smallThing";
let t = "The_Andy_Griffith_Show";
let u = "thisIsSpinalTap";
let v = "Teletubbies say Eh-oh";

// let r = v.replace(/([A-Z][a-z\-]*)/g, " $1");
let r = t
   .replace(/( |_)+/g, "-")
   .replace(/([a-z])(?=[A-Z])/g, "$1-")
   .toLowerCase();
console.log(r);

let x = r.replace(/[\s]$/g, "-").toLowerCase();

console.log(x);
