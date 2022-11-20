// function checkObj(obj, checkProp) {
//   if (obj.hasOwnProperty(checkProp)) {
//     return obj[checkProp];
//   }
//   return "Not Found";
// }

// console.log(checkObj(checkProp));

// function trueOrFalse(val) {
//   // if (wasThatTrue) {
//   //   return "Yes, That was true";
//   // } else {
//   //   return "No, That was true";
//   // }

//   return val == 10 ? "Equal" : "Not Equal";
// }

// console.log(trueOrFalse(10));

// const yourArray = ["iniString", true, 12, { tile: "Madilog" }, "aku"];

// console.log(yourArray[3].tile);

// function nextInline(arr, item) {
//   arr.push(item);
//   console.log(arr);
//   let b = arr.shift();
//   return b;
// }

// let a = [1, 2, 3, 4, 5];
// // console.log(nextInline(a, 0));
// console.log(nextInline(a, 10));

// const myArr = [1, 2, 3, 4, 5];
// myArr.unshift(6, 7, 8);
// let b = myArr.shift();
// console.log(myArr);
// console.log(b);

// const a = 3;
// const b = 4;

// console.log(a != b);
// console.log(a == b);

const recordCollection = {
  1998: {
    nama: "Lutfi",
    umur: 23,
    hobi: ["coding", "game"],
  },
  2003: {
    nama: "Lisa",
    hobi: [],
  },
  1988: {
    nama: "Jack",
  },
};

// recordCollection[2003].umur = "19";

function updateRecords(records, id, prop, value) {
  if (prop !== "hobi" && value !== "") {
    records[id][prop] = value;
  } else if (prop === "hobi" && records[id].hasOwnProperty("hobi") === false) {
    records[id][prop] = [value];
  } else if (prop === "hobi" && value !== "") {
    records[id][prop].push(value);
  } else if (value === "") {
    delete records[id][prop];
  }

  return records;
}

console.log(updateRecords(recordCollection, 1988, "umur", 33));
updateRecords(recordCollection, 2003, "umur", 18);

const cetak = recordCollection[2003].hasOwnProperty("umur");
console.log(cetak);

// console.log(recordCollection[2003]["umur"]);
