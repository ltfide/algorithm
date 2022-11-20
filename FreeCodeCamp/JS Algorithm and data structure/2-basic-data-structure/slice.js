// let kondisiCuaca = ["rain", "snow", "sleet", "hail", "clear"];

// let cuacaToday = kondisiCuaca.slice(1, 5);
// console.log(cuacaToday);

function foreCast(arr) {
  console.log(arr.slice(2, 4));
  return arr;
}

console.log(foreCast(["cold", "rainy", "warm", "sunny", "cool", "thunderstorms"]));
