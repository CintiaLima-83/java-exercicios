import java.util.Scanner;

public class ExerciciosVetores03 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String palavra = scanner.nextLine();

        char[] vetor = new char[palavra.length()];

        int j = 0;

        for (int i = palavra.length() - 1; i >= 0; i--){
            vetor[j] = palavra.charAt(i);
            j++;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
        }

        scanner.close();

    }
}
