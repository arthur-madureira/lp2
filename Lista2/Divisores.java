import java.util.Scanner;

public class Divisores {
    public static void calcularDivisores() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número natural inteiro par: ");
        int n = scanner.nextInt();

        if (n % 2 != 0) {
            System.out.println("Por favor, digite um número par.");
            return;
        }

        System.out.println("Os divisores de " + n + " são:");
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
