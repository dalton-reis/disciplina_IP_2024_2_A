/*
__ Enunciado: 
Uma imobiliária vende apenas . 
Faça um programa para ler as dimensões de um terreno e 
depois exibir a área do terreno. 


__ Análise: 

__ Gordura: 

//__ Entradas: 
altura
comprimento

//__ Processos: 
terrenos retangulares

//__ Saídas: 
área

*/

import java.util.Scanner;

public class Uni3Exe01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Calcula a área retagular");

    // Leitura
    System.out.print("Altura: ");
    double altura = teclado.nextDouble();
    System.out.print("Comprimento: ");
    double comprimento = teclado.nextDouble();

    // Processo
    double area = altura * comprimento;

    // Saída
    System.out.println("Área: " + area);

    teclado.close();
  }
}
