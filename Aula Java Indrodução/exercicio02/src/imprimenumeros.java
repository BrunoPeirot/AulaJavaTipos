import java.util.Scanner;

public class imprimenumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        System.out.println();
        String numero1 = scanner.nextLine();
        System.out.println();
        System.out.print("Digite o segundo número: ");
        String numero2 = scanner.nextLine();
        System.out.println("Os números digitados foram:");
        System.out.println();
        System.out.println("Número Digitado é: " + numero1);
        System.out.println("Número Digitado é: " + numero2);
    }
}
