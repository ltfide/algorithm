function bouncer(arr) {
    // let result = [];
    // arr.forEach((element, i) => {
    //   if (!Boolean(element)) {
    //     result.push(element);
    //     console.log(i);
    //   }
    // });

    // return result;
    return arr.filter(Boolean);
}

console.log(bouncer([7, "ate", "", false, 9]));

const a = [1, 2, 3, 4];
