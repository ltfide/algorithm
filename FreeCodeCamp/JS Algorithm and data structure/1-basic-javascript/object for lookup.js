function phoneticLookup(val) {
  var result = "";

  var lookup = {
    alpa: "adams",
    bravo: "boston",
  };
  result = lookup[val];

  return result;
}

console.log(phoneticLookup("alpa"));
