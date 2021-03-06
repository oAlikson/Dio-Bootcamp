package exercicios.arrays;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class Ex03_numeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random(); //classe para gerar números aleatórios

        int[] numerosAleatorios = new int[20]; //array com 20 posições

         //para: variável i = numero, até i menor que o tamanho do array, acrescentamos 1 ao valor de i a cada loop.
         for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100); //pegando um número aleatório entre 0 e 100.
            numerosAleatorios[i] = numero; //atribuindo esse valor ao elemento na respectiva posição do array numeros.
         }
         System.out.println("Números Aleatórios: ");

         for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");    
         }

         System.out.println("\nSucessores dos Números Aleatórios: ");
         
         for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");    
         }

    }
}