/*
__ Enunciado: 
Uma loja de calçados está concedendo
12% de desconto nos produtos. Escreva um programa
para calcular e exibir o valor de desconto a ser
dado num par de sapatos e quanto deve custar o
produto com o desconto.  


__ Análise: 
12% de desconto


//__ Entradas: 
O preço do par de sapatos deve ser informado pelo usuário.

//__ Processos: 

//__ Saídas: 
O valor do desconto é de R$ xxx 
O preço do par de sapatos com desconto é R$ xxx

*/

import java.util.Scanner;

public class Uni3Exe02 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.print("Preço do par de sapatos: ");
    double sapatoPreco = teclado.nextDouble();

    // Processo
    double sapatoDesconto = sapatoPreco * 0.12;
    double sapatoPrecoFinal = sapatoPreco - sapatoDesconto;

    // Saída
    System.out.println("O valor do desconto é de R$ " + sapatoDesconto);
    System.out.println("O preço do par de sapatos com desconto é R$ " + sapatoPrecoFinal);
    
    teclado.close();
  }
}
