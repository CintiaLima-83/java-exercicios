import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        String[][] produtos = new String[3][3];
        produtos[0][0] = "110";//Linha [0] = [110][TV][5.300]
        produtos[0][1] = "TV";
        produtos[0][2] = "5.300";

        produtos[1][0] = "335";//Linha [1] = [335][Computador][3.150]
        produtos[1][1] = "Computador";
        produtos[1][2] = "3.150";

        produtos[2][0] = "545";//Linha [2] = [545][Camiseta][75.89]
        produtos[2][1] = "Camiseta";
        produtos[2][2] = "75.89";

        for (String[] produto : produtos) {
             for (String dadoDoProduto : produto) {
                 System.out.print(dadoDoProduto + " ");
             }
             System.out.println();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto que você deseja buscar: ");
        String codigoDoProduto = scanner.nextLine();

        boolean produtoEncontrado = false;

        for (String[] produto : produtos){
            if (produto[0].equals(codigoDoProduto)) {
                System.out.println("Produto encotrado!!!");
                System.out.println("Código: " + produto[0] + " Nome: " + produto[1] + "Preço: " + produto[2]);
                produtoEncontrado = true;
                break;
            }
        }
        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado!!!");
        }
        }
    }

