function confirmEnding(str, target) {
  let result = null;
  for (let i = 1; i <= target.length; i++) {
    if (str.substr(-i) == target.substr(-i)) {
      if (i == target.length) {
        result = true;
      } else {
        result = false;
      }
    } else {
      result = false;
    }
  }

  return result;
}

console.log(confirmEnding("Connor", "n"));
