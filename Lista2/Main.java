import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Aprovação do Aluno");
            System.out.println("2. Classificação de Caracteres");
            System.out.println("3. Verificação de Ano Bissexto");
            System.out.println("4. Validação de Senha");
            System.out.println("5. Tabuada de 1 a 9");
            System.out.println("6. Cálculo do Número de Euler");
            System.out.println("7. Cálculo do Fatorial");
            System.out.println("8. Divisores de um Número Natural Inteiro Par");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    AprovacaoAluno.verificar_aprovacao();
                    break;
                case 2:
                    ClassificacaoCaractere.classificar_caractere();
                    break;
                case 3:
                    AnoBissexto.verificar_ano_bissexto();
                    break;
                case 4:
                    ValidarSenha.validar_senha();
                    break;
                case 5:
                    Tabuada.imprimirTabuada();
                    break;
                case 6:
                    CalculoEuler.calcularEuler();
                    break;
                case 7:
                    Fatorial.calcularFatorial();
                    break;
                case 8:
                    Divisores.calcularDivisores();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}
