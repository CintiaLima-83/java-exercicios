import java.util.Scanner;

public class MaiorNumero {
 public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

            //Solicita os dois números
            System.out.println("Digite o primeiro número inteiro: ");
            int num1 = scanner.nextInt();

            System.out.println("Digite o segundo número inteiro: ");
            int num2 = scanner.nextInt();

            // Verifica qual é o maior
            if (num1 > num2) {
                System.out.println("O maior número é: " + num1 + ".");
            } else if (num2 > num1) {
                System.out.println("O maior número é: " + num2 + ".");
            } else {
                System.out.println("Os números são iguais!");
            }

            scanner.close();
    }

}
