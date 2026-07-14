import java.util.Scanner;

public class CadastroCompleto {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de cadastro!");

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        nomeCompleto = nomeCompleto.toUpperCase();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite sua cidade: ");
        String cidade = scanner.nextLine();
        cidade = cidade.toLowerCase();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();



        System.out.println("\n Olá, " + nomeCompleto + "!");
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Idade: " + idade);
        System.out.println("Quantos anos você terá daqui a 10 anos: " + (idade + 10));
        System.out.println("Quantas letras tem seu nome: " + nomeCompleto.length());
        System.out.println("Cidade " + cidade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Seu cadastro foi realizado com sucesso!");

        scanner.close();

    }
}
