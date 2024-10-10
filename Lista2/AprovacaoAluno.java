import java.util.Scanner;

public class AprovacaoAluno {
    public static void verificar_aprovacao() {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, media;

        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota:");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6.0) {
            System.out.println("Aprovado com média: " + media);
        } else {
            System.out.println("Reprovado com média: " + media);
        }
    }
}
