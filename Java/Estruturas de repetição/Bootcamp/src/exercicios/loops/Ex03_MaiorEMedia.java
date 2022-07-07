package exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex03_MaiorEMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do{
            System.out.println("Digite um Número: ");
            numero = teclado.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while (count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma / 5);
        teclado.close();
    }
}