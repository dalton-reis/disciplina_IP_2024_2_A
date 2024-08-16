import java.util.Scanner;

public class Uni3Exe05 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    // Dados
    final double precoChip = 4.00;
    final double precoAnel = 3.50;
    int qdtFrangos;
    double custoFrango;
    double custoTotal;

    // Entrada
    System.out.print("Qdt.frangos: ");
    qdtFrangos = teclado.nextInt();

    // Processo
    custoFrango = precoChip + (2 * precoAnel);
    custoTotal = qdtFrangos * custoFrango;

    // Saída
    System.out.println("Custo total: " + custoTotal);

    teclado.close();
  }
}
