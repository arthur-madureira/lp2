import java.util.Scanner;

public class Main {
    // Códigos ANSI para cores
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Exibe um menu colorido
            System.out.println(ANSI_BLUE + "Selecione o número do problema que deseja executar:" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "1 - Cálculo da Área e Perímetro de um Retângulo" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "2 - Cálculo da Área e Perímetro de um Quadrado" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "3 - Cálculo da Área e Perímetro de uma Circunferência" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "4 - Cálculo do Perímetro de um Triângulo" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "5 - Cálculo do Quociente e Resto de Dois Números Inteiros" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "6 - Cálculo da Idade em Anos, Meses e Dias" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "7 - Conversão de Temperatura de Fahrenheit para Celsius" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "8 - Cálculo do Volume de uma Lata de Óleo" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "9 - Conversão de Número Inteiro para Binário" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "10 - Cálculo da Nota Semestral de um Aluno" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "11 - Conversão de Velocidade de m/s para km/h" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "12 - Cálculo da Resistência Equivalente em um Circuito Elétrico" + ANSI_RESET);
            System.out.println(ANSI_GREEN + "13 - Cálculo do Consumo de Combustível em uma Viagem" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "Digite 0 para sair." + ANSI_RESET);
            System.out.print(ANSI_CYAN + "Digite o número do problema (1-13): " + ANSI_RESET);
            
            int escolha = scanner.nextInt();
            if (escolha == 0) {
                break;
            }
            
            switch (escolha) {
                case 1:
                    calcularRetangulo(scanner);
                    break;
                case 2:
                    calcularQuadrado(scanner);
                    break;
                case 3:
                    calcularCircunferencia(scanner);
                    break;
                case 4:
                    calcularPerimetroTriangulo(scanner);
                    break;
                case 5:
                    calcularQuocienteEResto(scanner);
                    break;
                case 6:
                    calcularIdade(scanner);
                    break;
                case 7:
                    converterFahrenheitParaCelsius(scanner);
                    break;
                case 8:
                    calcularVolumeLataOleo(scanner);
                    break;
                case 9:
                    converterParaBinario(scanner);
                    break;
                case 10:
                    calcularNotaSemestral(scanner);
                    break;
                case 11:
                    converterVelocidade(scanner);
                    break;
                case 12:
                    calcularResistenciaEquivalente(scanner);
                    break;
                case 13:
                    calcularConsumoCombustivel(scanner);
                    break;
                default:
                    System.out.println(ANSI_RED + "Opção inválida! Tente novamente." + ANSI_RESET);
            }
        }
        scanner.close();
    }

    // 1. Cálculo da Área e Perímetro de um Retângulo
    private static void calcularRetangulo(Scanner scanner) {
        System.out.print("Digite a base do retângulo (em cm): ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retângulo (em cm): ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        double perimetro = 2 * (base + altura);
        System.out.println("Área do retângulo: " + area + " cm²");
        System.out.println("Perímetro do retângulo: " + perimetro + " cm");
    }

    // 2. Cálculo da Área e Perímetro de um Quadrado
    private static void calcularQuadrado(Scanner scanner) {
        System.out.print("Digite o lado do quadrado (em cm): ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        double perimetro = 4 * lado;
        System.out.println("Área do quadrado: " + area + " cm²");
        System.out.println("Perímetro do quadrado: " + perimetro + " cm");
    }

    // 3. Cálculo da Área e Perímetro de uma Circunferência
    private static void calcularCircunferencia(Scanner scanner) {
        System.out.print("Digite o raio da circunferência (em cm): ");
        double raio = scanner.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;
        System.out.println("Área da circunferência: " + area + " cm²");
        System.out.println("Perímetro da circunferência: " + perimetro + " cm");
    }

    // 4. Cálculo do Perímetro de um Triângulo
    private static void calcularPerimetroTriangulo(Scanner scanner) {
        System.out.print("Digite o lado 1 do triângulo (em cm): ");
        double lado1 = scanner.nextDouble();
        System.out.print("Digite o lado 2 do triângulo (em cm): ");
        double lado2 = scanner.nextDouble();
        System.out.print("Digite o lado 3 do triângulo (em cm): ");
        double lado3 = scanner.nextDouble();
        double perimetro = lado1 + lado2 + lado3;
        System.out.println("Perímetro do triângulo: " + perimetro + " cm");
    }

    // 5. Cálculo do Quociente e Resto de Dois Números Inteiros
    private static void calcularQuocienteEResto(Scanner scanner) {
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        int quociente = num1 / num2;
        int resto = num1 % num2;
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }

    // 6. Cálculo da Idade em Anos, Meses e Dias
    private static void calcularIdade(Scanner scanner) {
        System.out.print("Digite sua idade em dias: ");
        int dias = scanner.nextInt();
        int anos = dias / 365;
        dias = dias % 365;
        int meses = dias / 30;
        dias = dias % 30;
        System.out.println("Idade: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
    }

    // 7. Conversão de Temperatura de Fahrenheit para Celsius
    private static void converterFahrenheitParaCelsius(Scanner scanner) {
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (5.0 / 9.0) * (fahrenheit - 32);
        System.out.println("Temperatura em Celsius: " + celsius);
    }

    // 8. Cálculo do Volume de uma Lata de Óleo
    private static void calcularVolumeLataOleo(Scanner scanner) {
        System.out.print("Digite o raio da lata (em cm): ");
        double raio = scanner.nextDouble();
        System.out.print("Digite a altura da lata (em cm): ");
        double altura = scanner.nextDouble();
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("Volume da lata de óleo: " + volume + " cm³");
    }

    // 9. Conversão de Número Inteiro para Binário
    private static void converterParaBinario(Scanner scanner) {
        System.out.print("Digite um número inteiro menor que 32: ");
        int numero = scanner.nextInt();
        if (numero < 0 || numero >= 32) {
            System.out.println(ANSI_RED + "Número inválido! Deve ser menor que 32." + ANSI_RESET);
            return;
        }
        StringBuilder binario = new StringBuilder();
        for (int i = 4; i >= 0; i--) {
            binario.append((numero >> i) & 1);
        }
        System.out.println("Número binário: " + binario);
    }

    // 10. Cálculo da Nota Semestral de um Aluno
    private static void calcularNotaSemestral(Scanner scanner) {
        System.out.print("Digite a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();
        double notaFinal = (nota1 + nota2) / 2;
        System.out.println("Nota semestral: " + notaFinal);
        System.out.println(notaFinal >= 7 ? "Aprovado!" : "Reprovado!");
    }

    // 11. Conversão de Velocidade de m/s para km/h
    private static void converterVelocidade(Scanner scanner) {
        System.out.print("Digite a velocidade em m/s: ");
        double mps = scanner.nextDouble();
        double kmh = mps * 3.6;
        System.out.println("Velocidade em km/h: " + kmh);
    }

    // 12. Cálculo da Resistência Equivalente em um Circuito Elétrico
    private static void calcularResistenciaEquivalente(Scanner scanner) {
        System.out.print("Digite a resistência R1 (em ohms): ");
        double r1 = scanner.nextDouble();
        System.out.print("Digite a resistência R2 (em ohms): ");
        double r2 = scanner.nextDouble();
        System.out.print("Digite a resistência R3 (em ohms): ");
        double r3 = scanner.nextDouble();
        double resistenciaEquivalente = 1 / (1 / r1 + 1 / r2 + 1 / r3);
        System.out.println("Resistência equivalente: " + resistenciaEquivalente + " ohms");
    }

    // 13. Cálculo do Consumo de Combustível em uma Viagem
    private static void calcularConsumoCombustivel(Scanner scanner) {
        System.out.print("Digite a distância da viagem (em km): ");
        double distancia = scanner.nextDouble();
        System.out.print("Digite o consumo do carro (em km/l): ");
        double consumo = scanner.nextDouble();
        double combustivelNecessario = distancia / consumo;
        System.out.println("Combustível necessário: " + combustivelNecessario + " litros");
    }
}
