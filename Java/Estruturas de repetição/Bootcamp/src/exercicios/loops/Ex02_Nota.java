package exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex02_Nota {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota;

        System.out.println("Digite a Nota: ");
        nota = teclado.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite uma nota de 0 a 10");
            nota = teclado.nextInt();
            teclado.close();
        }
    }
}