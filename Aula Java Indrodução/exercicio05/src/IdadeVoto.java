import java.util.Scanner;

public class IdadeVoto {
    public static void main(String[] args) {
        // Criando um Scanner para ler a idade do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual sua Idade? ");
        String idadeStr = scanner.nextLine();
        idadeStr = idadeStr.trim();
        if (idadeStr.isEmpty()) {
            System.out.println();
        } else {
            int pIdade = Integer.parseInt(idadeStr);
            if (pIdade < 16) {
                System.out.println("Você não tem o direito de votar");
            } else if (pIdade <= 17 || pIdade > 65) {
                System.out.println("O voto é opcional.");
            } else {
                System.out.println("O voto é obrigatório.");
            }
        }
    }
}
