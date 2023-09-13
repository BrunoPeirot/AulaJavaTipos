import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        String salarioMinimo = "1320";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu salário.");
        String salarioUsuario = scanner.nextLine();
        salarioUsuario = salarioUsuario.replaceAll("[R$,.]", "");
        String quantidadeSalariosMinimos = String.valueOf(
                Long.parseLong(salarioUsuario) / Long.parseLong(salarioMinimo)
        );
        System.out.println("Você ganha " + quantidadeSalariosMinimos + " salários mínimos.");
    }
}

