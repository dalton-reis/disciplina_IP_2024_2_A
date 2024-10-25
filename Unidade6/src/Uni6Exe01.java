import java.util.Scanner;

public class Uni6Exe01 {
  private Uni6Exe01() {
    Scanner teclado = new Scanner(System.in);
    
    // criei o vetor
    final int valorTamanho = 10;
    int valor[] = new int[valorTamanho];

    // ler vetor
    valorLer(valorTamanho, valor, teclado);
 
    // escrever vetor
    valorEscrever(valorTamanho, valor);
    
    teclado.close();
  }

  private void valorLer(int valorTamanho, int valor[], Scanner teclado) {
    for (int i = 0; i < valorTamanho; i++) {
      System.out.print("Valor[" + i + "]: ");
      valor[i] = teclado.nextInt();
    }
  }

  private void valorEscrever(int valorTamanho, int valor[]) {
    for (int i = valorTamanho-1; i >= 0; i--) {
      System.out.println("Valor[" + i + "]: " + valor[i]);
    }
  }

  public static void main(String[] args) {
    new Uni6Exe01();
  }
}
