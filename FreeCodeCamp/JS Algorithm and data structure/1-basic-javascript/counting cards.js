let count = 0;

function cc(card) {

  switch(card) {
    case 2:
    case 3:
    case 4:
    case 5: 
    case 6:
      count++;
      break;
    case 7:
    case 8: 
    case 9:
      break;
    case 10:
    case 'J':
    case 'Q':
    case 'K':
    case 'A':
      count--;
  } if (count > 0) {
    return count + ' Bet'
  } 

  return count + ' Hold';
}

cc(2); cc(3); cc(4); cc(5); console.log(cc(6))