function chunkArrayInGroups(arr, size) {
    let newArr = [];

    for (let i = arr.length / size; i >= 1; i--) {
        newArr.push(arr.splice(0, size));
    }

    if (arr.length > 0) {
        newArr.push(arr);
    }

    return newArr;
}

console.log(chunkArrayInGroups(["a", "b", "c", "d", "e", "f", "g", "h", "i"], 3));
