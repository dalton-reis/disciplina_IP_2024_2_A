import java.util.Scanner;

public class CalculadoraDiferenca {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Assumindo que valor \"inicial\" é sempre menor que \"final\"");

    System.out.print("Hora inicial: "); int horaInicial = teclado.nextInt();
    System.out.print("Minuto inicial: "); int minutoInicial = teclado.nextInt();
    System.out.print("Hora final: "); int horaFinal = teclado.nextInt();
    System.out.print("Minuto final: "); int minutoFinal = teclado.nextInt();

    int minutoResultado = 0;
    int horasResultado = 0;

    // Validação
    if (horaInicial   < 0 && horaInicial   > 24  &&
        horaFinal     < 0 && horaFinal     > 24  &&
        minutoInicial < 0 && minutoInicial > 60  &&
        minutoFinal   < 0 && minutoFinal   > 60) 
    {
      System.out.println("Valores de horas e minutos errados !!");
    }
    else {
      // _ tudo em minutos
      minutoInicial = minutoInicial + (horaInicial * 60);
      minutoFinal   = minutoFinal + (horaFinal * 60);

      minutoResultado = minutoFinal - minutoInicial;

      // _ agora volta para horas e minutos
      horasResultado = minutoResultado / 60;
      minutoResultado = minutoResultado % 60;

      System.out.println("Horas: " + horasResultado);
      System.out.println("Minutos: " + minutoResultado);

    }

    teclado.close();
  }
}
