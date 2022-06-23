package aula01;

public class Main {

    public static void main(String[] args) {
        //Calculadora
        System.out.println("-----------------------------");
        System.out.println("Exercicio calculadora");
        System.out.println("-----------------------------");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("-----------------------------");
        System.out.println("Exercicio Mensagem");
        System.out.println("-----------------------------");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);


        //Empréstimo
        System.out.println("-----------------------------");
        System.out.println("Exercicio Empréstimo");
        System.out.println("-----------------------------");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
    
}