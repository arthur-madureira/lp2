import java.util.Scanner;

public class ClassificacaoCaractere {
    public static void classificar_caractere() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        if (Character.isDigit(caractere)) {
            System.out.println(caractere + " é um número.");
        } else if ("aeiouAEIOU".indexOf(caractere) != -1) {
            System.out.println(caractere + " é uma vogal.");
        } else if (Character.isLetter(caractere)) {
            System.out.println(caractere + " é uma consoante.");
        } else {
            System.out.println(caractere + " é um símbolo.");
        }
    }
}
