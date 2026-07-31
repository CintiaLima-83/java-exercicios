import java.util.Scanner;

public class ExercicioNomeNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();


        System.out.println("Digite um número positivo: ");
        int numero = scanner.nextInt();

        // Contagem crescente
       for (int n1 = 0; n1 <= numero; n1++){
           System.out.println(n1);
        }

        System.out.println();

        // Contagem decrescente
        for (int n1 = numero; n1 >= 0; n1--){
            System.out.println(n1);
        }

        System.out.println();

        // Verifica o tamanho do nome
        if (nome.length() > 6){

            // Exibe o nome n vezes
            for(int n1 = 0; n1 < numero; n1 ++) {
                System.out.println(nome);
            }

        } else {

            // Exibe o nome apenas uma vez
            System.out.println(nome);
        }
        scanner.close();
    }
}
