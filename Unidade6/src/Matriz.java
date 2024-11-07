// Pesquisar o maior valor em uma matriz de duas dimensões

public class Matriz {

  private Matriz() {
    int mat[][] = { { 34, 21 }, { 3, 8 }, { 55, 6 } };

    int maiorValor = mat[0][0];
    for (int lin = 0; lin < 3; lin++) {
      for (int col = 0; col < 2; col++) {
        if (mat[lin][col] > maiorValor) {
          maiorValor = mat[lin][col];
        }
      }
    }
    System.out.println(maiorValor);
  }

  public static void main(String[] args) {
    new Matriz();
  }
}
