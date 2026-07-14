package sistemadecadastrodeusuario;

import java.util.Scanner;

public class CadastroInteligente {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== SISTEMA DE CADASTRO =====");

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        nomeCompleto = nomeCompleto.toUpperCase();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 13) {
            System.out.println("É uma criança!");

        } else if (idade >= 13 && idade <= 17 ) {
            System.out.println("É um adolescente!");

        }
        else if (idade >= 18 && idade <= 59) {
            System.out.println("É um adulto");

        } else if (idade >= 60) {
            System.out.println("É um idoso!");

        }

         if ( idade >= 18) {
            System.out.println("Pode tirar CNH.");

        } else {
            System.out.println("Ainda não pode tirar CNH.");

        }

         if ( nomeCompleto.length() > 20) {
             System.out.println("Seu nome é bem grande!");
         } else {
             System.out.println("Seu nome é bem curto!");
         }

         System.out.println("Você aceita os termos? (true/false)");
         boolean resposta = scanner.nextBoolean();

        if (resposta) {
            System.out.println("Cadastro finalizado!");
        } else {
            System.out.println("Cadastro cancelado!");
        }

        scanner.nextLine();

        System.out.println("Digite sua cidade: ");
        String cidade = scanner.nextLine();
        nomeCompleto = nomeCompleto.toUpperCase();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();



        System.out.println("\n Olá, " + nomeCompleto + ", Seja bem-vindo(a)! ");
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Idade: " + idade);
        System.out.println("Quantas letras tem seu nome: " + nomeCompleto.length());
        System.out.println("Cidade: " + cidade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Seu cadastro foi realizado com sucesso!");

        scanner.close();

    }
}
