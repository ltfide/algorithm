// const Person = {
//   constructor() {
//     (this.name = "Lutfi"), (this.color = "White"), (this.numLegs = 2);
//   },
// };

function Dog(name, color, numLegs = 4) {
  (this.name = name), (this.color = color), (this.numLegs = numLegs);
}

const terrier = new Dog();
