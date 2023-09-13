import java.util.Scanner;

public class ConsorcioAutomovel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual sua idade:");
        String idadeStr = scanner.nextLine();
        System.out.print("Digite sua renda mensal R$");
        String salarioStr = scanner.nextLine();
        idadeStr = idadeStr.trim();
        salarioStr = salarioStr.trim();
        if (idadeStr.isEmpty() || salarioStr.isEmpty()) {
            System.out.println();
        } else {
            int idade = Integer.parseInt(idadeStr);
            int salario = Integer.parseInt(salarioStr);

            if (idade >= 18 && salario > 2000) {
                System.out.println("Você pode financiar um automovel.");
            } else {
                System.out.println("Você não financiar um automóvel.");
            }
        }
    }
}

