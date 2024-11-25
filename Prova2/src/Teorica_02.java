public class Teorica_02 {

  private Teorica_02() {
    int vetor[] = { 10, 5, 3, 8, 9 };
    int numero = vetor.length;
    teste(vetor, numero);
    System.out.println("Valor variável número: " + numero);
  }

  private void teste(int vetor[], int numero) {
    int aux = 0;
    for (int i = 0; i < vetor.length; i++) {
      for (int j = 0; j < i; j++) {
        aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
      }
      numero++;
    }
    System.out.println("Valor variável número: " + numero);
  }

  public static void main(String[] args) {
    new Teorica_02();
  }

}
