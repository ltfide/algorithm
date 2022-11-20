function diffArray(arr1, arr2) {
    // #1

    return arr1.concat(arr2).filter((item) => !arr1.includes(item) || !arr2.includes(item));

    // let result = [];

    // for (let index = 0; index < arr2.length; index++) {
    //     if (!arr1.includes(arr2[index])) {
    //         result.push(arr2[index]);
    //     }
    // }

    // for (let index = 0; index < arr1.length; index++) {
    //     if (!arr2.includes(arr1[index])) {
    //         result.push(arr1[index]);
    //     }
    // }

    // return result;
}

console.log(diffArray([1, 2, 7, 5], [1, 2, 3, 4, 5])); // 34
console.log(diffArray([1, "calf", 3, "piglet"], [1, "calf", 3, 4]));
console.log(diffArray([1, 2, 3, 4, 5], [1, 2, 3, 4, 6])); // 56
console.log(diffArray(["diorite", "andesite", "grass", "dirt", "pink wool", "dead shrub"], ["diorite", "andesite", "grass", "dirt", "dead shrub"]));
console.log(diffArray(["andesite", "grass", "dirt", "pink wool", "dead shrub", "Coba"], ["diorite", "andesite", "grass", "dirt", "dead shrub"]));

const arr = [1, 2, 3, 4, 5];

// console.log(arr.includes(21));
