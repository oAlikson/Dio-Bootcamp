//DESAFIO 1: Como podemos rodar isso em um arquivo .ts sem causar erros?
var employee = {
  code: 10,
  name: "John",
};
//DESAFIO 2: Como podemos melhorar o esse código usando TS?
var Trabalho;
(function (Trabalho) {
  Trabalho[(Trabalho["Atriz"] = 0)] = "Atriz";
  Trabalho[(Trabalho["Padeiro"] = 1)] = "Padeiro";
})(Trabalho || (Trabalho = {}));
var pessoa1 = {
  nome: "Maria",
  idade: 29,
  profissao: Trabalho.Atriz,
};
var pessoa2 = {
  nome: "Roberto",
  idade: 19,
  profissao: Trabalho.Padeiro,
};
var pessoa3 = {
  nome: "laura",
  idade: 32,
  profissao: Trabalho.Atriz,
};
var pessoa4 = {
  nome: "carlos",
  idade: 19,
  profissao: Trabalho.Padeiro,
};
//DESAFIO 3: O código abaixo tem alguns erros e não funciona como deveria. Você pode identificar quais são e corrigi-los em um arquivo TS?
var botaoAtualizar = document.getElementById("atualizar-saldo");
var botaoLimpar = document.getElementById("limpar-saldo");
var soma = document.getElementById("soma");
var campoSaldo = document.getElementById("campo-saldo");
var saldoTotal = 0;
limparSaldo();
function somarAoSaldo(soma) {
  if (campoSaldo) {
    saldoTotal += soma;
    campoSaldo.innerHTML = saldoTotal.toString();
    limparCampoSoma();
  }
}
function limparCampoSoma() {
  soma.value = "";
}
function limparSaldo() {
  if (campoSaldo) {
    saldoTotal = 0;
    campoSaldo.innerHTML = saldoTotal.toString();
  }
}
if (botaoAtualizar) {
  botaoAtualizar.addEventListener("click", function () {
    somarAoSaldo(Number(soma.value));
  });
}
botaoLimpar.addEventListener("click", function () {
  limparSaldo();
});
