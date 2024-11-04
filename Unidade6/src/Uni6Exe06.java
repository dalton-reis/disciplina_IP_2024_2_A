// Faça um método para ler o vetor e outro, que retorne 
// verdadeiro ou falso, para encontrar o valor.

import java.util.Scanner;

public class Uni6Exe06 {
  private Uni6Exe06() {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Tamanho vertor: ");
    double vetor[] = new double[teclado.nextInt()];

    // Ler vetor
    vetorLer(vetor, teclado);
    
    // Valor pesquisa
    System.out.print("Valor pesquisa: ");
    double valorPesquisa = teclado.nextDouble();

    // Pesquisa vertor
    boolean valorEncontrado = vetorPesquisa(vetor, valorPesquisa);

    if (valorEncontrado) {
      System.out.println("Valor encontrado!!");
    } else {
      System.out.println("Valor NÃO encontrado!!");
    }

    teclado.close();
  }

  // Vetor ler
  private void vetorLer(double vetor[],Scanner teclado) {
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Vetor[" + i + "]: ");
      vetor[i] = teclado.nextDouble();
    }
  }

  // Vetor pesquisa
  private boolean vetorPesquisa(double vetor[],double valorPesquisa) {
    boolean valorEncontrado = false;
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == valorPesquisa) {
        valorEncontrado = true;
      }
    }
    return valorEncontrado;
  }

  public static void main(String[] args) {
    new Uni6Exe06();
  }
}
