import java.util.Scanner;

public class TanqueBaldes {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entradas
    System.out.print("Taque (litros): ");
    int tanqueLitros = teclado.nextInt();
    System.out.print("Balde (litros): ");
    int baldeLitros = teclado.nextInt();

    // Processo
    int divInteira = tanqueLitros / baldeLitros; // 100 / 3 = 33 // 100 / 2 = 50
    double resto = tanqueLitros % baldeLitros; // 100 % 3 = 0.33 // 100 % 2 = 0

    // if (resto == 0) {
    //   System.out.println("Qtd Baldes: " + divInteira);
    // } else {
    //   divInteira = divInteira + 1;
    //   System.out.println("Qtd Baldes: " + divInteira);
    // }

    if (resto != 0) {
      divInteira = divInteira + 1;
    }
    System.out.println("Qtd Baldes: " + divInteira);

    teclado.close();
  }
}
