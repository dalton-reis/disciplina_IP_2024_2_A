import java.util.Scanner;

public class Uni6Exe03a {
  private Uni6Exe03a() {
    Scanner teclado = new Scanner(System.in);

    double vetValores[] = new double[12]; // vetor c/ 12 valores reais
    vetorLer(vetValores, teclado);
    vetorAjustar(vetValores);
    vetorEscrever(vetValores);

    teclado.close();
  }

  private void vetorLer(double vetValores[], Scanner teclado) {
    for (int i = 0; i < vetValores.length; i++) {
      System.out.print("vetor[" + i + "]: ");
      vetValores[i] = teclado.nextInt();
    }
  }

  private void vetorAjustar(double vetValores[]) {
    for (int i = 0; i < vetValores.length; i++) {
      if ((i % 2) == 0) {   // par 2%
        vetValores[i] *= 0.02;
      } else { // ímpares 5%
        vetValores[i] *= 0.05;
      }
    }
  }

  private void vetorEscrever(double vetValores[]) {
    for (int i = 0; i < vetValores.length; i++) {
      System.out.println("vetor[" + i + "]: " + vetValores[i]);
    }
  }

  public static void main(String[] args) {
    new Uni6Exe03a();

  }
}
