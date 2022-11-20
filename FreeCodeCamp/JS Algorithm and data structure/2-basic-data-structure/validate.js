// function validate() {
//   var n1 = document.getElementById("num1");
//   var n2 = document.getElementById("num2");
//   if (n1.value != "" && n2.value != "") {
//     if (n1.value == n2.value) {
//       return true;
//     }
//   }
//   alert("The values should be equal and not blank");
//   return false;
// }

// console.log(validate());

// const contoh = document.querySelectorAll(".container div");

// contoh.forEach((m, i) =>
//   m.addEventListener("click", function (e) {
//     console.log(contoh);
//     const a = document.querySelectorAll(".container div");
//     for (const x of a) {
//       x.classList.remove("active");
//     }
//     if (m) {
//       m.classList.add("active");
//     }
//   })
// );

const contoh = document.querySelectorAll(".container div");

contoh.forEach((m, i) =>
  m.addEventListener("click", function (e) {
    for (const x of contoh) {
      x.classList.remove("active");
    }
    m.classList.add("active");
  })
);

// const a = (document.body.style.backgroundColor = "red");
// console.log(this);

// contoh.forEach((a) =>
//   a.addEventListener("click", function (e) {
//     if (e.target === a) {
//       // console.log(e.target.nextElementSibling);
//       console.log(contoh[1]);
//       e.target.classList.add("active");
//     }
//   })
// );

// for (let i = 0; i <  i++) {
//   console.log(i);
// }
