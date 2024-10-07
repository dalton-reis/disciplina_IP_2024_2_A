import java.util.Scanner;

public class Uni5Exe01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    for (int i = 1; i <= 3; i++) {
      System.out.print("Valor[" + i + "]: ");
      int valor = teclado.nextInt();
      if ((valor % 2) == 0) {
        System.out.println("Número é par");
      } else {
        System.out.println("Número é impar");
      }
    }

    teclado.close();
  }

}
