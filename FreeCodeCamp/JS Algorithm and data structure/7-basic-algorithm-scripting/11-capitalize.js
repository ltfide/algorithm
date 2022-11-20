function titleCase(str) {
  // const textArr = str.split(" ");

  // for (let i = 0; i < textArr.length; i++) {
  //   textArr[i] = textArr[i].charAt(0).toUpperCase() + textArr[i].slice(1).toLowerCase();
  // }

  // return textArr.toString().replace(/,/g, " ");

  // #2
  return str.toLowerCase().replace(/(^|\s)\S/g, (L) => L.toUpperCase());
}

console.log(titleCase("sHoRt AnD sToUt"));

const text = "I'm a little tea pot";

console.log(text.split(" "));
