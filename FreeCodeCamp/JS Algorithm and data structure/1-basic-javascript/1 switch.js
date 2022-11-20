function tes(val) {
  let answer = '';

  switch(val) {
    case 'Bob':
      answer = "Marley";
      break;
    case 42:
      answer = "The Answer";
      break;
    case 1:
      answer = "There is no #1";
      break;
    case 99:
      answer = "Missed me by this much!";
      break;
    case 7:
      answer = "Ate Nine";
      break;
    default: 
      answer = "ini default"
  } return answer;
}

console.log(tes('Bob'));