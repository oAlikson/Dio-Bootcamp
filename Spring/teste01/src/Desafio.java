import java.io.IOException;
import java.util.Scanner;

public class  Desafio {
public static void main(String[] args) throws IOException {
      Scanner leitor = new Scanner(System.in);
      int cont = 0;
      double n = 1;
      double soma = 0;
      while (n >= 1) {
      n = leitor.nextDouble();
      if (n > 0) {
      soma += n;
      cont++;
      }
    }
      double media = soma / cont;
      System.out.println(String.format("%.2f", media));
      leitor.close();
    }
}