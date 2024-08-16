import java.util.Scanner;

public class Uni3Exe03 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.print("Preço gas: ");
    double precoGasolina = teclado.nextDouble();
    System.out.print("Valor pago: ");
    double valorPago = teclado.nextDouble();

    // Processo
    double litrosTanque = valorPago / precoGasolina;

    // Saída
    System.out.println("Qtd. litro tanque: " + litrosTanque);

    teclado.close();
  }
}
