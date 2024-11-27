package switchCase;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        double temperatura, resultado;

        switch (opcao) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                temperatura = scanner.nextDouble();
                resultado = (temperatura * 9 / 5) + 32; // Fórmula de conversão
                System.out.printf("Temperatura em Fahrenheit: %.2f°F%n", resultado);
                break;
            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                temperatura = scanner.nextDouble();
                resultado = (temperatura - 32) * 5 / 9; // Fórmula de conversão
                System.out.printf("Temperatura em Celsius: %.2f°C%n", resultado);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
