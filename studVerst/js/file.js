var curPosX = 0;
var curPosY = 0;
var interval;
var n = 10; // На сколько двигать за раз
var width = document.documentElement.clientWidth; // Ширина экрана
var height = document.documentElement.clientHeight; // Высота экрана
var imgWidth = 100; // Ширина картинки
var imgHeight = 100; // Высота картинки
var img1 = document.getElementById("pic");

// function move() {
//   img1.style.left = (curPosX += n) + "px";
//   img1.style.top = (curPosY += n) + "px";
//   if ((curPosX == (width - imgWidth)) || (curPosY == (height - imgHeight))) {
//     clearInterval(interval);
//   }
// }
// interval = setInterval(move, 100);

// img.addEventListener("mouseover", function () {
//   anime({
//     targets: ".pic", // селектор твоего элемента
//     translateX: function () {
//       return anime.random(0, 50); // аnime.js сам сгенерит случайное число от 0 до 50
//     },
//     translateY: function () {
//       return anime.random(0, 50); // аnime.js сам сгенерит случайное число от 0 до 50
//     },
//   });
// });
