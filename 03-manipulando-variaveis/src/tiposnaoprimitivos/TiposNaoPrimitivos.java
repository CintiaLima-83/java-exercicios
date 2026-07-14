package tiposnaoprimitivos;

public class TiposNaoPrimitivos {

    public static void main(String[] args) {

        //Tipos primitivos int, double, float, char, boolean...

        int meuPrimeiroNumero = 18;
        int meuSegundoNumero = meuPrimeiroNumero;

        System.out.println(meuPrimeiroNumero);
        System.out.println(meuSegundoNumero);

        meuSegundoNumero = 20;

        System.out.println(meuSegundoNumero);

        //Tipos não primitivos: Integer(Wrapper int), Double(Wrapper double), Float, Character(wrapper char), Boolean... String

        Integer primeiroNumero = 30;

        System.out.println(primeiroNumero);
        System.out.println(primeiroNumero.compareTo(21));

    }
}
