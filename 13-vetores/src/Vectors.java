import java.util.Scanner;

public class Vectors {
    public static void main(String[] args) {

        System.out.println("Digite o tamanho do vetor:");
        Scanner sc = new Scanner(System.in);

        int tamanhoDoVetor = sc.nextInt();
        String[] vetorDoUsuario = new String[tamanhoDoVetor];

        sc.nextLine();
        for (int i = 0; i < tamanhoDoVetor; i++) {
            System.out.println("Digite o valor da posição " + i + "do seu vetor: ");
            vetorDoUsuario[i] = sc.nextLine();
        }

        //exibir os valores do vetor
        exibeVetor(vetorDoUsuario);

        System.out.println("/nVeja os valores do vetor criado por você com a palavra que você escolheu para ser acrescida em cada posição:");
        for (int i=0; i < tamanhoDoVetor; i++){
          if (i > 0){
              String aux = vetorDoUsuario[i - 1];
              vetorDoUsuario[i - 1] = vetorDoUsuario[i];
              vetorDoUsuario[i] = aux;
          }
        }

        //exibir os valores do vetor
        exibeVetor(vetorDoUsuario);

        sc.close();

    }

    private static void exibeVetor(String[] vetorDoUsuario){
        for(int i=0; i < vetorDoUsuario.length; i++){
            System.out.println(vetorDoUsuario[i]);
        }
    }
}
