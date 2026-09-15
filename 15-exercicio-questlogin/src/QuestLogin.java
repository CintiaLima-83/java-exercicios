
import java.util.Scanner;

public class QuestLogin {
    public static void main(String[] args) {

        System.out.println("===== JAVA QUEST =====\n");

        Scanner scanner = new Scanner(System.in);
        String usuarioCorreto = "Cintia";
        String usuarioDigitado;
         String senhaCorreta = "2468";
         String senhaDigitada;
         int tentativasRestantes = 3;

         while (tentativasRestantes > 0) {
             System.out.println("Digite o usuário: ");
             usuarioDigitado = scanner.nextLine();
             System.out.println("Digite sua senha: ");
             senhaDigitada = scanner.nextLine();

             if (usuarioDigitado.equals(usuarioCorreto) && senhaDigitada.equals(senhaCorreta)){
                 System.out.println("Login realizado!\n Bem-vinda ao Java Quest!");
                 break;
             } else {
                 tentativasRestantes--;
                 System.out.println("Usuário ou senha incorretos!\n tentativas restantes: " + tentativasRestantes);
             }
         }

         if (tentativasRestantes == 0){
             System.out.println("Conta bloqueada!");
         }
    }
}
