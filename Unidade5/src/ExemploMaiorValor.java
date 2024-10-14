
/*
Faça um algoritmo que leia 3 valores e 
imprima qual é o maior valor lido.

Usando FOR
    int inteiroMaior = Integer.MAX_VALUE;
    int inteiroMenor = Integer.MIN_VALUE;
    double doubleMaior = Double.MAX_VALUE;

*/
import java.util.Scanner;

public class ExemploMaiorValor {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int menorValor = Integer.MAX_VALUE; // busco pelo menor
    int valor;

    for (int i = 1; i <= 3; i++) {
      System.out.print("Valor[" + i + "]: "); 
      valor = teclado.nextInt();
      if (valor < menorValor) {
        menorValor = valor;
      }
    }
//--
    System.out.print("Valor[1]: ");
    menorValor = teclado.nextInt();
    for (int i = 2; i <= 3; i++) {
      System.out.print("Valor[" + i + "]: "); int valor = teclado.nextInt();
      if (valor < menorValor) {
        menorValor = valor;
      }
    }



    System.out.println("Menor valor: " + menorValor);
    teclado.close();
  }
}
