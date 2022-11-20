// Only change code below this line
class Thermostat {
  constructor(fahrenheit) {
    this._celcius = (5 / 9) * (fahrenheit - 32);
  }

  get temperature() {
    // return (5 / 9) * (this._fahrenheit - 32);
    return this._celcius;
  }

  set temperature(temp) {
    this._celcius = temp;
  }
}
// Only change code above this line

const thermos = new Thermostat(76); // Setting in Fahrenheit scale
// let temp = thermos.temperature; // 24.44 in Celsius
console.log(thermos.temperature);
thermos.temperature = 26;
// temp = thermos.temperature; // 26 in Celsius
console.log(thermos.temperature);
