import java.util.Scanner;

public class Uni6Exe01 {
  private Uni6Exe01() {
    Scanner teclado = new Scanner(System.in);
    
    // criei o vetor
    final int valorTamanho = 3;
    int valor[] = new int[valorTamanho];

    // ler vetor
    for (int i = 0; i < valorTamanho; i++) {
      System.out.print("Valor[" + i + "]: ");
      valor[i] = teclado.nextInt();
    }
    System.out.println("----");
    // escrever vetor
    for (int i = valorTamanho-1; i >= 0; i--) {
      System.out.println("Valor[" + i + "]: " + valor[i]);
    }

    teclado.close();
  }


  public static void main(String[] args) {
    new Uni6Exe01();
  }
}
