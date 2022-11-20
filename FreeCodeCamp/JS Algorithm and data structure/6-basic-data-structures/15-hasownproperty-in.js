let users = {
  Alan: {
    age: 27,
    online: true,
  },
  Jeff: {
    age: 32,
    online: true,
  },
  Sarah: {
    age: 48,
    online: true,
  },
  Ryan: {
    age: 19,
    online: true,
  },
};

// console.log(users.hasOwnProperty("Jeff"));
// console.log("Jeff" in users);

function isEveryoneHere(userObj) {
  // Only change code below this line
  if ("d" in userObj && "Jeff" in userObj && "Sarah" in userObj && "Ryan" in userObj) {
    return true;
  } else {
    return false;
  }
  // Only change code above this line
}

console.log(isEveryoneHere(users));
