//DESAFIO 1: Como podemos rodar isso em um arquivo .ts sem causar erros?
const employee: { code: number; name: string } = {
  code: 10,
  name: "John",
};

//DESAFIO 2: Como podemos melhorar o esse código usando TS?

enum Trabalho {
  Atriz,
  Padeiro,
}

type Pessoa = {
  nome: string;
  idade: number;
  profissao: Trabalho;
};

let pessoa1: Pessoa = {
  nome: "Maria",
  idade: 29,
  profissao: Trabalho.Atriz,
};

let pessoa2: Pessoa = {
  nome: "Roberto",
  idade: 19,
  profissao: Trabalho.Padeiro,
};

let pessoa3: Pessoa = {
  nome: "laura",
  idade: 32,
  profissao: Trabalho.Atriz,
};

let pessoa4: Pessoa = {
  nome: "carlos",
  idade: 19,
  profissao: Trabalho.Padeiro,
};

//DESAFIO 3: O código abaixo tem alguns erros e não funciona como deveria. Você pode identificar quais são e corrigi-los em um arquivo TS?

let botaoAtualizar = document.getElementById("atualizar-saldo");
let botaoLimpar = document.getElementById("limpar-saldo")!;
let soma = document.getElementById("soma")! as HTMLInputElement;
let campoSaldo = document.getElementById("campo-saldo");
let saldoTotal = 0;

limparSaldo();

function somarAoSaldo(soma: number) {
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
  botaoAtualizar.addEventListener("click", () => {
    somarAoSaldo(Number(soma.value));
  });
}
botaoLimpar.addEventListener("click", () => {
  limparSaldo();
});
