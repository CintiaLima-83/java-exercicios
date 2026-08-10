import java.util.Scanner;

public class EstruturaWhile {

    public  static void main(String[] args) {
        // Testar acertar a senha, até acabar o número de tentativas(3)


        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "java@54321";
        String senhaDigitada;
        int tentativasRestantes = 3;


    while (tentativasRestantes > 0) {
        System.out.println("Digite a senha: ");
        senhaDigitada = scanner.nextLine();

        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha correta, acesso liberado!");
            break;
        } else {
            tentativasRestantes--;
            System.out.println("Senha incorreta! Tentativas restantes: " + tentativasRestantes);

            }
        }

    if (tentativasRestantes == 0) {
        System.out.println("Conta bloqueada!");
    }

    }

    }

