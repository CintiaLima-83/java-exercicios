public class ClimbStairs {

    public static void main(String[] args) {

        // Testa o número de maneiras de subir cada escada

        System.out.println(contarFormas(2));
        System.out.println(contarFormas(3));
        System.out.println(contarFormas(4));
        System.out.println(contarFormas(5));
        System.out.println(contarFormas(6));

    }

    public  static int contarFormas(int n) {

        // Caso base: existe 1 maneira de subir 1 degrau

        if (n == 1){
            return 1;
        }

        // Caso base: existem 2 maneiras de subir 2 degraus

        if (n == 2){
            return 2;
        }

        // Chamada recursiva:
        // Soma as possibilidades de chegar ao topo
        // vindo de 1 ou 2 degraus anteriores
        return contarFormas(n - 1) + contarFormas(n - 2);

    }
}
