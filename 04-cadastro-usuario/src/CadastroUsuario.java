import java.util.Scanner;

public class CadastroUsuario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao sistema de cadastro!");

        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scanner.nextLine();

        System.out.println("Digite seu CPF:");
        String cpf = scanner.nextLine();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite o seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Digite a sua altura:");
        double altura = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Digite seu estado civil:");
        String estadoCivil = scanner.nextLine();

        System.out.println("\nOlá, " + nomeCompleto + "!");
        System.out.println("Nome : " + nomeCompleto);
        System.out.println("CPF :" + cpf );
        System.out.println("Idade :" + idade);
        System.out.println("Peso :" + peso);
        System.out.println("Altura :" + altura);
        System.out.println("Estado Civil :" + estadoCivil);
        System.out.println("Seu cadastro foi realizado com sucesso.");


        scanner.close();
    }
}
