package conversoesentretipos;

public class ConversoesEntreTipos {

    public static void main(String[] args) {

        int numeroInt = 5;
        double numeroDouble = numeroInt;

        System.out.println(numeroInt);
        System.out.println(numeroDouble);

        int outroNumeroInt = (int) numeroDouble;

        System.out.println(outroNumeroInt);

        int terceiroNumeroInt = (int) 5.93;

        System.out.println(terceiroNumeroInt);


    }


}
