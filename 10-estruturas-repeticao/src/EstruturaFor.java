import java.util.Scanner;

public class EstruturaFor {

    public static void main(String[] args){
        //Cédulas: 100, 50, 20, 10, 5, 2

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor que deseja sacar, de R$2 a R$1.000: ");
        int valorDoSaque = scanner.nextInt();

        if (valorDoSaque < 2 || valorDoSaque > 1000) {
            System.out.println("Valor do saque invalido!");
            return;
        }

        int nota = 100;

        System.out.println("Quantidade de notas entregues: ");

        //sacar = 105 -> 50 + 50 + 5 = 105; 100 + 5 = 105 (2 notas)
        for (int i = 1; i < 6; i++){

       int quantidadeDeCedulas = valorDoSaque / nota;
       if (quantidadeDeCedulas > 0) {
           System.out.println(quantidadeDeCedulas + " nota(s) de R$" + nota);
           valorDoSaque = valorDoSaque % nota;
       }

       if (nota == 100) {
           nota = 50;
       } else if (nota == 50) {
           nota = 20;
       } else if (nota == 20) {
           nota = 10;
       } else if (nota == 10) {
           nota = 5;
       } else if (nota == 5) {
           nota = 2;
       } else if (nota == 2) {
           
       }

        }

        }

        }

