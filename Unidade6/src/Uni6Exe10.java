import java.util.Scanner;

public class Uni6Exe10 {
  private Uni6Exe10() {
    Scanner teclado = new Scanner(System.in);
    int vet[] = new int[5]; /// [FIXME:] CUIDADO é 50
    int posFinal = 0;

    int opcao;
    do {
      System.out.print("Opção: ");
      opcao = teclado.nextInt();
      // Menu
      switch (opcao) {
        case 1: // 1 Incluir
          posFinal = vetIncluir_1(vet, teclado, posFinal);
          break;
        case 2: // 2 Pesquisa
          if (vetPesquisa_2(vet, teclado))
            System.out.println("achou");
          else
            System.out.println("não achou");
          break;
        case 3: // 3 Alterar
          break;
        case 4: // 4 Excluir
          break;
        case 5: // 5 Mostrar
          vetMostrar_5(vet, posFinal);
          break;
        case 6: // 6 Ordenar
          break;
        case 7: // 7 Inverter
          break;
        case 8: // 8 Sair
          System.out.println("Sair do sistema!");
          break;
        default:
          System.out.println("Opçao ERRADA!!");
          break;
      }

    } while (opcao != 8); // Fim

    teclado.close();
  }

  private int vetIncluir_1(int vet[], Scanner teclado, int posFinal) {
    if (posFinal < vet.length) {
      System.out.print("Ler valor: ");
      int valor = teclado.nextInt();
      vet[posFinal] = valor;
      posFinal += 1;
    } else
      System.out.println("Vetor cheio!!");
    return posFinal;
  }

  private boolean vetPesquisa_2(int vet[], Scanner teclado) {
    System.out.print("Valor pesquisa: ");
    int pesquisa = teclado.nextInt();
    for (int i = 0; i < vet.length; i++) {
      if (pesquisa == vet[i]) {
        return true;
      }
    }
    return false;
  }

  private void vetAlterar_3() {
  }

  private void vetExcluir_4() {
  }

  private void vetMostrar_5(int vet[], int posFinal) {
    for (int i = 0; i < posFinal; i++) {
      System.out.println("vetor[" + i + "]: " + vet[i]);
    }
  }

  private void vetOrdenar_6() {
  }

  private void vetInverter_7() {
  }

  public static void main(String[] args) {
    new Uni6Exe10();
  }
}
