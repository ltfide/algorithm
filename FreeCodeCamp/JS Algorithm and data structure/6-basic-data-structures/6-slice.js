let weatherConditions = ["rain", "snow", "sleet", "hail", "clear"];

// let todaysWeather = weatherConditions.slice(2, 3);
let todaysWeather = weatherConditions.splice(2);

console.log(todaysWeather);

function forecast(arr) {
  // Only change code below this line
  arr = arr.slice(2, 4);
  return arr;
}

// Only change code above this line
console.log(forecast(["cold", "rainy", "warm", "sunny", "cool", "thunderstorms"]));
