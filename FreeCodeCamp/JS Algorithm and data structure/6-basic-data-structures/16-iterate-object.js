const users = {
  Alan: {
    online: false,
  },
  Jeff: {
    online: true,
  },
  Sarah: {
    online: true,
  },
};

function countOnline(usersObj) {
  // Only change code below this line
  let active = 0;
  for (const user in usersObj) {
    if (usersObj[user].online) {
      active++;
    }
  }
  return active;
  // Only change code above this line
}

console.log(countOnline(users));
