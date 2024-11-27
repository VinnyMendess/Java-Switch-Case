package switchCase;

import java.util.Scanner;

public class CalculadoraDeFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // A variável fatorial será usada para armazenar o resultado
        long fatorial = 1;

        // Usando switch case para verificar se o número é maior ou igual a 0
        switch (numero) {
            case 0:
                fatorial = 1; // O fatorial de 0 é 1
                break;
            case 1:
                fatorial = 1; // O fatorial de 1 é 1
                break;
            default:
                // Para números maiores que 1, calculamos o fatorial
                if (numero > 1) {
                    for (int i = 2; i <= numero; i++) {
                        fatorial *= i; // Multiplica o número atual pelo fatorial anterior
                    }
                } else {
                    System.out.println("Número inválido! O fatorial é definido apenas para números inteiros não negativos.");
                    scanner.close();
                    return;
                }
                break;
        }

        System.out.printf("Fatorial de %d é %d%n", numero, fatorial);
        scanner.close();
    }
}
