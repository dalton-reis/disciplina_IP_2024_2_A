import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println(" __ Super Calculadora __");

    // Entrada __
    System.out.print("Valor 1: ");
    double valor1 = teclado.nextDouble();
    System.out.print("Operador: ");
    char operador = teclado.next().charAt(0);
    System.out.print("Valor 2: ");
    double valor2 = teclado.nextDouble();

    double resultado = 0;

    // // Processo A
    // if (operador == '+') {
    //   resultado = valor1 + valor2; // soma
    // } else {
    //   if (operador == '-') {
    //     resultado = valor1 - valor2; // subtração
    //   } else {
    //     if (operador == '*') {
    //       resultado = valor1 * valor2; // multiplicação
    //     } else {
    //       if (operador == '/') {
    //         resultado = valor1 / valor2; // divisão
    //       } else {
    //         System.out.println("Operador errado!");
    //       }
    //     }
    //   }
    // }

    // // Processo B
    // if (operador == '+')
    // resultado = valor1 + valor2; // soma
    // else if (operador == '-')
    // resultado = valor1 - valor2; // subtração
    // else if (operador == '*')
    // resultado = valor1 * valor2; // multiplicação
    // else if (operador == '/')
    // resultado = valor1 / valor2; // divisão
    // else
    // System.out.println("Operador errado!");

    // Processo C
    switch (operador) {
      case '+':
        resultado = valor1 + valor2; // soma
        break;
      case '-':
        resultado = valor1 - valor2; // subtração
        break;
      case '*':
        resultado = valor1 * valor2; // multiplicação
        break;
      case '/':
        if (valor2 != 0) {
          resultado = valor1 / valor2; // divisão
        } else {
          System.out.println("Divisão por Zero!!");
        }
        break;
      default:
        System.out.println("Operador errado!");
        break;
    }
    if (valor2 != 0) {
      System.out.println("Resultado: " + resultado);
    }

    // Saída

    teclado.close();
  }
}
