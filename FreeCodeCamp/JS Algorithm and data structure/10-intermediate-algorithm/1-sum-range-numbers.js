function sumAll(arr) {
    // #1

    let firstNum = 0;
    let secondNum = 0;
    let result = 0;
    if (arr[0] > arr[1]) {
        firstNum = arr[0];
        secondNum = arr[1];
    } else {
        firstNum = arr[1];
        secondNum = arr[0];
    }
    for (let i = secondNum; i <= firstNum; i++) {
        result += i;
    }
    return result;

    // #2
}

console.log(sumAll([1, 4]));
console.log(sumAll([4, 1]));
console.log(sumAll([5, 10]));
console.log(sumAll([10, 5]));
