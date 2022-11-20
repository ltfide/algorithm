function findLongestWordLength(str) {
    // let longWord = [];
    let arr = str.split(" ");
    let maxWord = 0;

    for (let i = 0; i < arr.length; i++) {
        if (arr[i].length > maxWord) {
            maxWord = arr[i].length;
        }
    }

    return maxWord;

    // return Math.max(...longWord);
}

console.log(findLongestWordLength("abcd ac a asdasdasdas"));
