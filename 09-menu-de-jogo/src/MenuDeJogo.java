import java.util.Scanner;

public class MenuDeJogo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===================");
        System.out.println("   MENU DO JOGO");
        System.out.println("===================");
        System.out.println("1 - \uD83C\uDFAE Novo Jogo");
        System.out.println("2 - ▶ Continuar");
        System.out.println("3 - ⚙ Configurações");
        System.out.println("4 - \uD83D\uDC68\u200D\uD83D\uDCBB Créditos");
        System.out.println("5 - ❌ Sair");
        System.out.println("\nDigite uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("\uD83C\uDFAE Iniciando um novo jogo...");
                break;
            case 2:
                System.out.println("Continuar");
                break;
            case 3:
                System.out.println("⚙ Abrindo configurações...");
                break;
            case 4:
                System.out.println("\uD83D\uDC68\u200D\uD83D\uDCBB Desenvolvido por...");
                break;
            case 5:
                System.out.println("Até logo!");
                break;
            default:
                System.out.println("Opção invalida. Digite de 1 a 5.");
        }

        scanner.close();
    }
}
