import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos carros deseja cadastrar?");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        if (quantidade > 50){
            System.out.println("Digite uma quantidade entre 1 e 50 carros.");
            scanner.close();
            return;
        }

        Carro[] carros = new Carro[quantidade];

        for (int i = 0; i < quantidade; i++) {

            Carro carro = new Carro();

            System.out.println("Nome do carro:");
            carro.nome = scanner.nextLine();

            System.out.println("Modelo do carro:");
            carro.modelo = scanner.nextLine();

            System.out.println("Marca do carro");
            carro.marca = scanner.nextLine();

            System.out.println("Ano do carro:");
            carro.ano = scanner.nextInt();

            System.out.println("Preço do carro:");
            carro.preco = scanner.nextDouble();
            scanner.nextLine();

            carros[i] = carro;
        }

        double somaPrecos = 0;

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Carro: " + carros[i].nome);
            somaPrecos += carros[i].preco;
        }

        System.out.println("Quantidade de carros: " + quantidade);
        System.out.println("Soma dos preços: R$ " + somaPrecos);

        scanner.close();
    }
}
