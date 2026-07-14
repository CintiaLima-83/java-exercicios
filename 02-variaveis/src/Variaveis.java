import java.util.Scanner;

public class Variaveis {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Agora digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Agora digite a sua altura:");
        double altura = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Qual é a sua cidade?");
        String cidade = scanner.nextLine();

        System.out.println("Você está estudando Java? (true/false)");
        boolean estudandoJava = scanner.nextBoolean();

        scanner.close();

        System.out.println("O seu nome é " + nome +
                ", a sua idade é " + idade +
                " e a sua altura é " + altura);

        System.out.println("Estudando Java: " + estudandoJava);
    }
}