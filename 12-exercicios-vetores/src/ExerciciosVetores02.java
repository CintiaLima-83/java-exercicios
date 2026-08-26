import java.util.Scanner;

public class ExerciciosVetores02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você deseja inserir?");
        int n = scanner.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número:");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] %2 == 0) {
                numeros[i] *= 2;

            }else{
                numeros[i] *= numeros[i];
            }
        }

        System.out.println("Vetor modificado: ");
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
