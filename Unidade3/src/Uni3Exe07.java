import java.util.Scanner;

public class Uni3Exe07 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Olá, escolha a sua quantidade!");
    final double lata350ML = 350 / 1000;
    final double garrafa600ML = 600 / 1000;
    final double garrafa2l = 2;

    System.out.print("Lata(s): ");
    double numeroLatas = teclado.nextDouble();
    System.out.print("Garrafa(s) ML: ");
    double numeroGarrafasML = teclado.nextDouble();
    System.out.print("Garrafa(s) L: ");
    double numeroGarrafasL = teclado.nextDouble();
    double latas350Total = numeroLatas * lata350ML;
    double garrafas600MLTotal = numeroGarrafasML * garrafa600ML;
    double garrafas2LTotal = numeroGarrafasL * garrafa2l;
    double total = latas350Total + garrafas600MLTotal + garrafas2LTotal;
    System.out.println("Total de litros: " + total);

    teclado.close();
  }
}