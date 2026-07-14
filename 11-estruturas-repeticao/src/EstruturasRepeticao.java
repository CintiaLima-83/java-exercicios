public class EstruturasRepeticao {

    public static void main(String[] args) {

        for(int n1 = 0; n1 < 100; n1++) {

            if (n1 % 2 == 0) { //se o número for par
                System.out.println("O número " + n1 + " é par.");
            } else {
                System.out.println("O número " + n1 + " é impar");
            }
        }

        System.out.println(); // Pula linha

        for(int n1 = 100; n1 >= 0; n1 --) {
            if(n1 % 2 == 0) {
                System.out.println("O número " + n1 + " é par.");
            } else {
                System.out.println("O número " + n1 + " é impar.");
            }
        }
    }

}
