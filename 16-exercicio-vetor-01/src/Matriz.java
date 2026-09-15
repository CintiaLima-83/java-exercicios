
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da sua matriz: ");
        int linhas = scanner.nextInt();

        System.out.print("Digite a quantidade de colunas da sua matriz: ");
        int colunas = scanner.nextInt();

        int[][] numeros = new int[linhas][colunas];

        System.out.printf("Digite os valores da matriz: %d x %d ", linhas, colunas);

        for (int i = 0; i < numeros.length; i++) {
            for (int j= 0; j < numeros[i].length; j++){
                System.out.print("Digite o valor da posição [" + i +"]["+ j +"], da matriz: ");
                numeros[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < numeros.length; i ++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "");
            }
            System.out.println();
        }

        for (int[] linha : numeros) {
            double somaTotal = 0;

            for (int valorColuna : linha) {
                //somaTotalLinha = somaTotalLinha + Coluna;
                somaTotal += valorColuna;
            }
            //somaTotalLinha = somaTotalLinha / colunas;
            somaTotal /= colunas;

            System.out.println("Media da soma da linha = " + somaTotal);
        }

    }
}
