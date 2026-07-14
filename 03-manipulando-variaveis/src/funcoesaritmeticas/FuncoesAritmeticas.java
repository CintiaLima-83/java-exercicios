package funcoesaritmeticas;

public class FuncoesAritmeticas {

    public static void main(String[] args) {
        //+ (soma), -(subtração), * (multiplicação) e / (divisão)


        int primeiroNumero = 10;
        int segundoNumero = 2;

        System.out.println(primeiroNumero + segundoNumero); // soma
        System.out.println(primeiroNumero - segundoNumero); // subtração
        System.out.println(primeiroNumero * segundoNumero); // multiplicação
        System.out.println(primeiroNumero / segundoNumero); // divisão

        int resultadoDaSoma = primeiroNumero + 40;

        System.out.println(resultadoDaSoma); // resultado da soma (10 + 40)

        // Operador "módulo"

        int restoDaDivisao = 10 % 3; // 1(3), 2(3), 3(3) = 3 + 3 + 3 = 9 -> sobrou 1

        System.out.println(restoDaDivisao);

        restoDaDivisao = 10 % 2; // 1(5), 2(5) = 5 + 5 = 10 -> 0

        System.out.println(restoDaDivisao);

        // Class Main

        double resultadoPow = Math.pow(5.0, 3.0);

        System.out.println(resultadoPow);

        double resultadoSqrt = Math.sqrt(81.0);

        System.out.println(resultadoSqrt);


    }
}
