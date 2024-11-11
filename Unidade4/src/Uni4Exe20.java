import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a nota da Prova 1: ");
        double notaProva1 = teclado.nextDouble();

        System.out.print("Digite a nota da Prova 2: ");
        double notaProva2 = teclado.nextDouble();

        System.out.print("Digite a nota da Prova 3: ");
        double notaProva3 = teclado.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = teclado.nextDouble();

        double mediaAproveitamento = (notaProva1 + (notaProva2 * 2) + (notaProva3 * 3) + mediaExercicios) / 7;
            
        System.out.printf("A média de aproveitamento foi: %.2f\n", mediaAproveitamento);

        double conceito = teclado.nextDouble();

        if (mediaAproveitamento >= 9.0) {
            System.out.println("Conceito A.");
        } else if (mediaAproveitamento >= 7.5) {
            System.out.println("Conceito B.");
        } else if (mediaAproveitamento >= 6.0) {
            System.out.println("Conceito C.");
        } else if (mediaAproveitamento >= 4.0) {
            System.out.println("Conceito D.");
        } else {
            System.out.println("Conceito E.");
        }

        System.out.println("Conceito: " + conceito);

        double situacao = teclado.nextDouble();

         if (mediaAproveitamento <= 4.0) {
            System.out.println("reprovado");
        } else {
            System.out.println("aprovado");
        }

        System.out.println(" " + situacao);

        teclado.close();
    }
}
/*Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, 
descreva um algoritmo que calcule a média de aproveitamento e o conceito do aluno, usando a fórmula:
media=(notaProva1+notaProva2*2+notaProva3*3+notaExercicios)/7

A atribuição dos conceitos obedece à tabela abaixo:

media	conceito
>= 9.0	A
>= 7.5 e < 9.0	B
>= 6.0 e < 7.5	C
>= 4.0 e < 6.0	D
< 4.0	E
O algoritmo deve escrever a média de aproveitamento, 
o conceito correspondente e a mensagem "aprovado" caso o conceito seja A, B ou C, 
e "reprovado" caso o conceito seja D ou E. */