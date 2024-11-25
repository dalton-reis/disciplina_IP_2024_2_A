public class Teorica_01 {

  private Teorica_01() {
    int vetor[] = { 1, 2, 3, 4, 5 };

    if (vetorPesquisa(vetor, 5, 4))
      System.out.println("achou!!");
  }

  private boolean vetorPesquisa(int vetor[], int valor, int vetorPos) {
    for (int i = 0; i < vetorPos; i++) {
      if (valor == vetor[i]) {
        return true;
      }
    }
    System.out.println("Fim do método");
    return false;
  }

  public static void main(String[] args) {
    new Teorica_01();
  }

}
