import java.util.Scanner;

public class CalculoEuler {
    public static void calcularEuler() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de termos da série: ");
        int n = scanner.nextInt();
        double euler = 0;

        for (int i = 0; i < n; i++) {
            euler += 1.0 / fatorial(i);
        }

        System.out.println("O valor de euler para " + n + " termos é: " + euler);
    }

    private static int fatorial(int num) {
        if (num == 0) return 1;
        int fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
