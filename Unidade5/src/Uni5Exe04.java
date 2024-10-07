import java.util.Scanner;

public class Uni5Exe04 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double soma = 0, numerador = 3, denominador = 2;
    double inc = 2;

    for (int i = 1; i <= 20; i++) { 
      // soma = soma + (numerador / denominador);
      soma += numerador / denominador;
      numerador += 2;
      inc += 2;
      denominador += inc;
    }
    System.out.println("Soma: " + soma);

    teclado.close();
  }
}
