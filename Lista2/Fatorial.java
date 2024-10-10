import java.util.Scanner;

public class Fatorial {
    public static void calcularFatorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int n = scanner.nextInt();
        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        System.out.println("O fatorial de " + n + " é: " + resultado);
    }
}
