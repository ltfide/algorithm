let dog = {
  name: "Spot",
  numLegs: 2,
  sayLegs: function () {
    return `This dog has ${this.numLegs} legs.`;
  },
};

console.log(dog.sayLegs());
