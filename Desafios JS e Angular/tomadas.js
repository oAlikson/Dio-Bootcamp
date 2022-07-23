/*Finalmente, o time da Universidade conseguiu a classificação para a Final Nacional da Maratona de
 Programação da SBC. Os três membros do time e o técnico estão ansiosos para bem representar a 
 Universidade, e além de treinar muito, preparam com todos os detalhes a sua viagem a São Paulo,
  onde será realizada a Final Nacional...

 */

let lines = gets().split("\n");
let t = 5;
let todas = 0;
let line = lines.shift().split(' ');
for(let i = 1; i < t; i++){
  todas = todas + parseInt(line.slice(-i));
}
todas = todas - 3;

console.log(todas)