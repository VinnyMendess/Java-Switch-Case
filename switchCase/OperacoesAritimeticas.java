package switchCase;

import java.util.Scanner;

public class OperacoesAritimeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leitura dos números
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        
        // Leitura do operador
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);
        
        // Variável para armazenar o resultado
        double resultado;
        
        // Estrutura de decisão
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                }
                break;
            default:
                System.out.println("Erro: Operador inválido!");
        }
        
        scanner.close();
    }
}
