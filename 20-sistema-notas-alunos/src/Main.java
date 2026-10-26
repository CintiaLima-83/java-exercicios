import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quantidadeAlunos;

        do {
            System.out.println("Quantos alunos serão cadastrados?");
            quantidadeAlunos = scanner.nextInt();

            if (quantidadeAlunos <= 0) {
                System.out.println("Digite uma quantidade maior que 0.");
            }

        } while (quantidadeAlunos <= 0);

        scanner.nextLine();

        Aluno[] alunos = new Aluno[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {

            System.out.println("Digite o nome do aluno:");
            String nome = scanner.nextLine();

            int quantidadeNotas;

            do {
                System.out.println("Quantas notas esse aluno terá?");
                quantidadeNotas = scanner.nextInt();

                if (quantidadeNotas <= 0) {
                    System.out.println("Digite uma quantidade de notas maior que 0.");
                }

            } while (quantidadeNotas <= 0);

            double[] notas = new double[quantidadeNotas];

            for (int j = 0; j < quantidadeNotas; j++) {

                double nota;

                do {
                    System.out.println("Digite a nota " + (j + 1) + ":");

                    String entrada = scanner.next();
                    entrada = entrada.replace(",", ".");
                    nota = Double.parseDouble(entrada);

                    if (nota < 0 || nota > 10) {
                        System.out.println("Nota inválida! Digite entre 0 e 10.");
                    }

                } while (nota < 0 || nota > 10);

                notas[j] = nota;
            }

            alunos[i] = new Aluno(nome, notas);

            scanner.nextLine();
        }

        System.out.println("\n===== RESULTADO =====");

        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.printf("Média: %.2f%n", aluno.calcularMedia());
            System.out.println("----------------------");
        }

        scanner.close();
    }
}