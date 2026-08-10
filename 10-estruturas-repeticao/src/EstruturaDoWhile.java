import java.util.Scanner;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        //Cálculo de potência sem Math.pow

        Scanner scanner = new Scanner(System.in);

        System.out.println(Math.pow(5.0, 3.0));

        int base, expoente, resultado;

        do {
            System.out.println("Informe a base, ela tem que ser maior que 0: ");
            base = scanner.nextInt();
        } while (base <= 0);

        do {
            System.out.println("Informe o expoente, tem que ser maior ou igual a 0: ");
            expoente = scanner.nextInt();
        } while (expoente < 0);

        resultado = 1;

      while (expoente >= 1) {
          resultado = base * resultado;
          expoente--;
      }

      System.out.println("Resultado: " + resultado);

      scanner.close();
    }
}
