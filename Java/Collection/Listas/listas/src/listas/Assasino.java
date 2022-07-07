package listas;
import java.util.Scanner;

public class Assasino {
    public static void main(String[] args) throws Exception {
        try (Scanner teclado = new Scanner(System.in)) {

            System.out.println("------Interrogatório do assasinato-----");
            System.out.println("Responda com S para SIM e N para Não!");

            System.out.print("Mora perto da vítima? ");
            String resp1 = teclado.next();

            System.out.print("Já trabalhou com a vítima? ");
            String resp2 = teclado.next();

            System.out.print("Telefonou para a vítima? ");
            String resp3 = teclado.next();

            System.out.print("Esteve no local do crime? ");
            String resp4 = teclado.next();

            System.out.print("Devia para a vítima? ");
            String resp5 = teclado.next();

            int cont = 0;

            if (resp1.equalsIgnoreCase("S")) {
                cont++;
            }

            if (resp2.equalsIgnoreCase("S")) {
                cont++;
            }

            if (resp3.equalsIgnoreCase("S")) {
                cont++;
            }

            if (resp4.equalsIgnoreCase("S")) {
                cont++;
            }

            if (resp5.equalsIgnoreCase("S")) {
                cont++;
            }

            if (cont == 2) {
                System.out.println("Suspeita!");
            } else if (cont == 3 || cont == 4) {
                System.out.println("Cúmplice!");
            } else if (cont == 1) {
                System.out.println("Nada a declarar!");
            } else if (cont == 5) {
                System.out.println("Assassino!");
            } else {
                System.out.println("Nada a declarar!");
            }
            System.out.println("---------------------");
        }
    }
}