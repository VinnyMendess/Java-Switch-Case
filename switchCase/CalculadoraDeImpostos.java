package switchCase;

import java.util.Scanner;

public class CalculadoraDeImpostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário: R$ ");
        double salario = scanner.nextDouble();

        double imposto;
        String faixa;

        // Determinação da faixa e cálculo do imposto
        if (salario <= 1500) {
            faixa = "5%";
            imposto = salario * 0.05;
        } else if (salario <= 3000) {
            faixa = "10%";
            imposto = salario * 0.10;
        } else {
            faixa = "15%";
            imposto = salario * 0.15;
        }

        System.out.printf("Faixa de imposto: %s%n", faixa);
        System.out.printf("Imposto calculado: R$ %.2f%n", imposto);
        scanner.close();
    }
}
