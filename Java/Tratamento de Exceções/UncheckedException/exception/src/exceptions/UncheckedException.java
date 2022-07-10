package exceptions;

import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
    public static void main(String[] args) {

        Boolean continueLooping = true; // para aparecer a caixa novamente apos o erro

        do { // para aparecer a caixa novamente apos o erro
            String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try { 
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);   
            continueLooping = false;         
        } catch (NumberFormatException e) { // para tratar a exceção
            // e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Entrada Inválida, Informe um número Inteiro!" + e.getMessage());
        } catch (ArithmeticException e) { // para tratar a exceção
            // e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Impossivel dividir o número por 0!");
        } finally { // apenas pra mostrar que o codigo chegou até aqui
            System.out.println("Chegou no finaly!");
        }

        } while(continueLooping); // para aparecer a caixa novamente apos o erro
        

        System.out.println("O código continua...");
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}