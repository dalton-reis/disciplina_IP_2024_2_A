import java.util.Scanner;

public class CaixaAreia {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    char continua = 's';
    while (continua == 's') {
      System.out.print("Valor1: ");
      double valor1 = teclado.nextInt();
      System.out.print("Operador: ");
      char operador = teclado.next().charAt(0);
      System.out.print("Valor2: ");
      double valor2 = teclado.nextInt();
      double resultado = 0;

      switch (operador) {
        case '+':
          resultado = valor1 + valor2;
          break;
        case '-':
          resultado = valor1 - valor2;
          break;
        default:
          System.out.println("Operação não válida!!");
          break;
      }
      System.out.println("Resultado: " + resultado);
      System.out.println("Deseja continuar (s/n): ");
      continua = teclado.next().charAt(0);
    }

    teclado.close();
  }
}
