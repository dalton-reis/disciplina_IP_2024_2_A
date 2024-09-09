import java.util.Scanner;

public class CaixaAreia {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("ValorA: "); int valorA = teclado.nextInt();
		System.out.print("ValorB: "); int valorB = teclado.nextInt();
		System.out.print("ValorC: "); int valorC = teclado.nextInt();

		// variáveis internas
		int valorMenor = 0;
		int valorMedio = 0;
		int valorMaior = 0;

		// Testar se o valorA é menor ...
		if (valorA < valorB && valorA < valorC) { // A B C
			valorMenor = valorA;
			if (valorB < valorC) { // B C (medio maior)
				valorMedio = valorB;
				valorMaior = valorC;
			}
			else {
				valorMedio = valorC;
				valorMaior = valorB;
			}	
		}
		if (valorB < valorA && valorB < valorC) { // B A C
			valorMenor = valorB;
			if (valorA < valorC) { // A C (medio maior)
				valorMedio = valorA;
				valorMaior = valorC;
			}
			else {
				valorMedio = valorC;
				valorMaior = valorA;
			}	
		}
		if (valorC < valorA && valorC < valorB) { // C A B 
			valorMenor = valorC;
			if (valorA < valorB) { // A B (medio maior)
				valorMedio = valorA;
				valorMaior = valorB;
			}
			else {
				valorMedio = valorB;
				valorMaior = valorA;
			}	
		}
		System.out.println("Menor: " + valorMenor + " - Medior: " + valorMedio+ " - Maior: " + valorMaior);

		teclado.close();
	}
}
