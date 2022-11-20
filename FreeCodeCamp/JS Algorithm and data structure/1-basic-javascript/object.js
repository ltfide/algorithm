let myDog = {
  name: 'Snowee',
  legs: 4,
  tails: 1,
  friends: ['snowaa', 'sparta']
}


nameValue = myDog.name;
legsValue = myDog['legs'];
delete myDog.legs;
console.log(nameValue, legsValue)