import java.util.Scanner;

public class Teorica_03 {
  private Teorica_03() {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Tamanho da mochila: ");
    final int mochilaTamanho = teclado.nextInt();
    int mochilaPeso[] = new int[mochilaTamanho];
    String mochilaDescricao[] = new String[mochilaTamanho];
    System.out.print("Capacidade máxima da mochila (kg): ");
    final int mochilaCapacidade = teclado.nextInt();
    int mochilaPosicao = 0;

    int opcao;
    do {
      System.out.print("Opção: ");
      opcao = teclado.nextInt();
      switch (opcao) {
        case 1:
          mochilaPosicao = mochilaInserir(mochilaPeso, mochilaDescricao, mochilaPosicao, mochilaCapacidade, teclado);
          break;
        case 2:
          mochilaImprimir(mochilaDescricao, mochilaPosicao);
          break;
        case 3:
          int itemMaisPesado = mochilaValorItemMaisPesado(mochilaPeso, mochilaPosicao);
          System.out.println("ItemMaisPesado: " + itemMaisPesado);
          break;
        case 4:
          mochilaPosicao = mochilaExcluirItem(mochilaPeso, mochilaDescricao, mochilaPosicao, teclado);
          break;
        case 5:
          System.out.println(" -- FIM --");
          break;
        default:
          System.out.println("Opção ERRADA!");
          break;
      }

    } while (opcao != 5);
    teclado.close();
  }

  private int mochilaInserir(int mochilaPeso[], String mochilaDescricao[], int mochilaPosicao,
      int mochilaCapacidade, Scanner teclado) {
    System.out.println("__mochilaInserir");
    if (mochilaPosicao < mochilaPeso.length) {
      int mochilaPesoTotal = 0;
      for (int i = 0; i < mochilaPosicao; i++) {
        mochilaPesoTotal += mochilaPeso[i];
      }
      System.out.print("Item-peso: ");
      int itemPeso = teclado.nextInt();
      mochilaPesoTotal += itemPeso;
      if (mochilaPesoTotal <= mochilaCapacidade) {
        mochilaPeso[mochilaPosicao] = itemPeso;
        System.out.print("Item-descrição: ");
        mochilaDescricao[mochilaPosicao] = teclado.next();
        mochilaPosicao++;
      } else {
        System.out.println("Atingiu o peso máximo!");
      }
    } else {
      System.out.println("Mochila cheia!");
    }
    return mochilaPosicao;
  }

  private void mochilaImprimir(String mochilaDescricao[], int mochilaPosicao) {
    System.out.println("__mochilaImprimir");
    if (mochilaPosicao > 0) {
      for (int i = mochilaPosicao - 1; i >= 0; i--) {
        System.out.println("mochila[" + i + "]: " + mochilaDescricao[i]);
      }
    } else {
      System.out.println("Mochila vazia!");
    }
  }

  private int mochilaValorItemMaisPesado(int mochilaPeso[], int mochilaPosicao) {
    System.out.println("__mochilaValorItemMaisPesado");
    int itemMaisPesado = 0;
    if (mochilaPosicao > 0) {
      itemMaisPesado = mochilaPeso[0];
      for (int i = 1; i < mochilaPosicao; i++) {
        if (mochilaPeso[i] > itemMaisPesado) {
          itemMaisPesado = mochilaPeso[i];
        }
      }
    } else {
      System.out.println("Mochila vazia!");
    }
    return itemMaisPesado; // TODO: se mochila vazia retorrna itemMaisPesado = 0;
  }

  private int mochilaExcluirItem(int mochilaPeso[], String mochilaDescricao[],
      int mochilaPosicao, Scanner teclado) {
    System.out.println("__mochilaExcluirItem");
    if (mochilaPosicao > 0) {
      System.out.print("Descrição do item a ser excluído: ");
      String itemExcluir = teclado.next();
      for (int i = 0; i < mochilaPosicao; i++) {
        if (mochilaDescricao[i].equals(itemExcluir)) {
          for (int j = i; j < mochilaPosicao-1; j++) {
            mochilaPeso[j] = mochilaPeso[j + 1];
            mochilaDescricao[j] = mochilaDescricao[j + 1];
          }
          mochilaPosicao--;
          return mochilaPosicao;
        }
      }
      System.out.println("Item não existe!");
    } else {
      System.out.println("Mochila vazia!");
    }
    return mochilaPosicao;
  }

  public static void main(String[] args) {
    new Teorica_03();
  }
}
