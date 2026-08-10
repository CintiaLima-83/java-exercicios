import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu DoWhile");

        int opcao;

        do {
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                scanner.nextLine();

                System.out.println("Digite uma palavra ou uma frase: ");
                String frase = scanner.nextLine();

                System.out.println(frase);


            } else if (opcao == 2) {
                System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");

            }
        } while (opcao != 2);
    }
}
