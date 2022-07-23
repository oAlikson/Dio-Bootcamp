/*Guilherme adora brincar com pipas, pipas de várias cores, formas e tamanhos. 
  Ele tem percebido que para as pipas possuírem maior estabilidade, e dessa forma voarem mais alto, elas
  devem possuir um barbante bem esticado ligando todos os pares de pontas não vizinhas.
  Apesar de ser uma criança bastante criativa e astuta, Guilherme não sabe como determinar a quantidade
  de barbantes que ele terá que utilizar para tornar uma pipa de n lados, estável. Você pode ajudá-lo?.*/
// A função gets() é implementada dentro do sistema para ler as entradas(inputs) dos dados e a função print() para imprimir a saída (output) de dados e já pula uma linha ("\n")
let lines = gets().split("\n");

let N = parseInt(lines.shift());
//TODO: Complete os espaços em branco com uma possível solução para o desafio
let resposta = ((N -3)*  N ) / 2; 
print(   resposta     );


