/*
Construa um programa para ler um número inteiro (assuma até 3 dígitos) e 
imprima a saída da seguinte forma:
*/

import java.util.Scanner;

public class Uni3Exe15 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    // Dados
    int centenas = 0;
    int dezenas = 0;
    int unidades = 0;

    // Entrada
    System.out.print("Número: ");
    int numero = teclado.nextInt();

    // Processo
    centenas = numero / 100;
    numero = numero - (centenas * 100);
    dezenas = numero / 10;
    unidades = numero - (dezenas * 10);

    // Saída
    System.out.println(centenas + " centena(s) - " + dezenas + " dezena(s) - " + unidades + " unidade(s)");

    teclado.close();
  }
}
