import java.util.Scanner;

public class Uni6Exe03b {
  private Uni6Exe03b() {
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
    for (int i = 0; i < vetValores.length; i += 2) {
      vetValores[i] *= 0.02; // par 2%
    }
    for (int i = 1; i < vetValores.length; i += 2) {
      vetValores[i] *= 0.05; // ímpares 5%
    }
  }

  private void vetorEscrever(double vetValores[]) {
    for (int i = 0; i < vetValores.length; i++) {
      System.out.println("vetor[" + i + "]: " + vetValores[i]);
    }
  }

  public static void main(String[] args) {
    new Uni6Exe03b();

  }
}
