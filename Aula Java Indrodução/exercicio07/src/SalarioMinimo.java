import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        float salarioMinimo = 1320.0f; // Note o "f" no final para indicar que é um float
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Salários Mínimos");
        System.out.print("Digite seu salário: ");
        System.out.println();
        float salarioDaPessoa = scanner.nextFloat();
        float quantidadeSalarioMinimo = salarioDaPessoa / salarioMinimo;
        System.out.println();
        System.out.printf("Você ganha %.2f salários mínimos.", quantidadeSalarioMinimo);
    }
}


