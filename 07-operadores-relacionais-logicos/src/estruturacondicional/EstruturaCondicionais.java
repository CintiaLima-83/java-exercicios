package estruturacondicional;

import java.util.Scanner;

public class EstruturaCondicionais {
    public static void main(String[] args){

        // if(se), else if(se não), else(outra, outro)

        Scanner escanner = new Scanner(System.in);

        System.out.println("Digite sua idade!");

        int idade = escanner.nextInt();

        if (idade < 13) {
            System.out.println("É uma criança!");

        } else if (idade >= 13 && idade < 18 ) {
            System.out.println("É um adolescente!");

        }
        else if (idade >= 18) {
            System.out.println("É maior de idade!");
        }


        System.out.println("Fim do código!");

        escanner.close();


    }
}
