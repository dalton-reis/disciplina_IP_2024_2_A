public class VetorExcluir {
  private VetorExcluir() {
    int vetor[] = new int[5];
    vetor[0] = 10; 
    vetor[1] = 20; 
    vetor[2] = 30; 
    vetor[3] = 40;
    vetor[4] = 50;
    int vetPos = 4;
    
    vetorImprimir(vetor,vetPos);
    
    int vetPosExc = 4;
    vetPos = vetorExcluir(vetor,vetPos,vetPosExc);
    
    vetorImprimir(vetor,vetPos);
  }

  
  private int vetorExcluir(int vetor[], int vetPos, int vetPosExc) {
    if (vetPosExc == vetPos) {
      vetPos--;
    } else {
      for (int i = vetPosExc; i <= vetPos; i++) {
        vetor[i] = vetor[i+1];
      }      
      vetPos--;
    }
    return vetPos;
  }

  private void vetorImprimir(int vetor[], int vetPos) {
    for (int i = 0; i <= vetPos; i++) {
      System.out.println("Vetor[" + i + "]: " + vetor[i]);
      
    }

  }

  public static void main(String[] args) {
    new VetorExcluir();
  }
}
