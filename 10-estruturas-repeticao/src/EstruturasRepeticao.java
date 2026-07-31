import java.util.Scanner;

public class EstruturasRepeticao {

    public static void main(String[] args) {



    }

    public  static void menuIMC(){
        int decisaoDoUsuario = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Você deseja calcula o IMC?\n1: SIM\n2: ou NÃO");

            decisaoDoUsuario = sc.nextInt();

            if (decisaoDoUsuario == 1){
                calculoIMC();
            }
            else if (decisaoDoUsuario != 2){
                decisaoDoUsuario = 1;
                System.out.println("Você digitou uma opção inválida.\n\n");
                continue;
            }
        } while (decisaoDoUsuario == 1);
        sc.close();
    }

    public static void calculoIMC(){
        System.out.println("Bem-vindo(a) ao cálculo do IMC.");
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("A qualquer momento digite 0 ou um número negativo para sair.\n\nDigite seu peso:");
            double peso = sc.nextDouble();

            if (peso <=0){
                break;
            }

            System.out.println("Digite sua altura:");
            double altura = sc.nextDouble();

            if (peso <=0){
                break;
            }

            double imc = peso / (altura * altura);
            System.out.println("Seu IMC é: " + imc);

        }
       // sc.close();
        System.out.println("Você saiu.");
    }

    public static void forCrescente() {

        System.out.println("Digite o número máximo para ser contado do zero até ele - 1.");
        Scanner sc = new Scanner(System.in);
        int numeroMaximo = sc.nextInt();

        sc.close(); // Fecha scanner

        if (numeroMaximo > 0) {

            System.out.println("FOR CRESCENTE:\n");
            for (int n1 = 0; n1 < numeroMaximo; n1++) {
                System.out.println("O contador está em: " + n1);
            }

            System.out.println(); // Pula linha
        }
        else {
            System.out.println("Você digitou um número menor do que 1. Não pode.");
        }
    }

    public static void forDecrescente() {

        System.out.println("Digite o número inicial para ser contado até um.");
        Scanner sc = new Scanner(System.in);
        int numeroInicial = sc.nextInt();

        sc.close();

        if (numeroInicial > 0) {
            System.out.println("FOR DECRESCENTE:\n");
            for (int n1 = numeroInicial; n1 >= 0; n1--){
                System.out.println("O contador está: " + n1);
            }

            System.out.println();
        }
        else {
            System.out.println("Você digitou um número menor do que 1. Não pode.");
        }
    }
}