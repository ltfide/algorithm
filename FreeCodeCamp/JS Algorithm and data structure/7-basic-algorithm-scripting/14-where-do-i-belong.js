function getIndexToIns(arr, num) {
    arr.sort((a, b) => a - b);

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] >= num) {
            return i;
        }

        // if (Math.max(...arr) < num) {
        //   return arr.lastIndexOf(Math.max(...arr)) + 1;
        // }
    }

    return arr.length;
}

// console.log(getIndexToIns([40, 60, 45], 40));
// console.log(getIndexToIns([10, 20, 30, 40, 50], 35));
// console.log(getIndexToIns([5, 3, 20, 3], 5));
console.log(getIndexToIns([2, 5, 10], 15));
console.log(getIndexToIns([], 1));
