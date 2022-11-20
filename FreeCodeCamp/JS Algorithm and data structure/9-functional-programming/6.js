// The global variable
const bookList = ["The Hound of the Baskervilles", "On The Electrodynamics of Moving Bodies", "Philosophiæ Naturalis Principia Mathematica", "Disquisitiones Arithmeticae"];

// Change code below this line
function add(booklist, bookName) {
   const newBookList = [...booklist];
   newBookList.push(bookName);
   return newBookList;
   // Change code above this line
}

// console.log(add(bookList, "Madilog"));
// console.log(bookList);

// Change code below this line
function remove(booklist, bookName) {
   const newBookList = [...booklist];
   const book_index = newBookList.indexOf(bookName);
   if (book_index >= 0) {
      newBookList.splice(book_index, 1);
      return newBookList;
      // Change code above this line
   }
}

// console.log(remove(bookList, "On The Electrodynamics of Moving Bodies"));
console.log(remove(add(bookList, "Madilog"), "On The Electrodynamics of Moving Bodies"));
console.log(bookList);
