import java.util.Scanner;

public class Exerciciosvetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você deseja inserir?");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length - 1; i++) {

            for (int j = 0; j < numeros.length - 1 - i; j++) {

                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;

                }
            }
        }

        System.out.println("Vetor ordenado:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        scanner.nextLine();

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        char[] caracteres = nome.toCharArray();

        int quantidadeVogais = 0;

        for (int i = 0; i < caracteres.length; i++) {

            if (caracteres[i] == 'a' ||
                    caracteres[i] == 'e' ||
                    caracteres[i] == 'i' ||
                    caracteres[i] == 'o' ||
                    caracteres[i] == 'u') {

                quantidadeVogais++;

            }
        }

        System.out.println("Quantidade de vogais: " + quantidadeVogais);
    }
}