package estruturacondicional;

import java.util.Scanner;

public class EstruturaCondicionalSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7.");
        int dia = scanner.nextInt();

        // Usando if-else

        if (dia < 1 || dia > 7) {
            System.out.println("Número inválido. Digite de 1 a 7.");
        } else {
            System.out.println("Com if-else: ");
            if(dia == 1) {
                System.out.println("Domingo");
            } else if (dia == 2) {
                System.out.println("Segunda-feira");
            } else if (dia == 3) {
                System.out.println("Terceira-feira");
            } else if (dia == 4) {
                System.out.println("Quarta-feira");
            } else if (dia == 5) {
                System.out.println("Quinta-feira");
            } else if (dia == 6) {
                System.out.println("Sexta-feira");
            } else {
                System.out.println("Sábado");
            }
        }

        // Usando switch-case
        System.out.print("Com switch-case: ");
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número invalido. Digite de 1 a 7.");
        }

        scanner.close();
    }
}

