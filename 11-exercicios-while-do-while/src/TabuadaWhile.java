import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args){

        System.out.println("Tabuada While");

        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        int contador = 1;

        while (contador <= 10) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;

        }

        sc.close();
    }
}

