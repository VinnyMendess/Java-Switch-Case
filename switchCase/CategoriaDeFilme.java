package switchCase;

import java.util.Scanner;

public class CategoriaDeFilme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a classificação etária do filme:");
        System.out.println("G - Livre");
        System.out.println("PG - Maior de 10 anos");
        System.out.println("PG-13 - Maior de 13 anos");
        System.out.println("R - Maior de 18 anos");
        System.out.print("Digite a classificação: ");
        String classificacao = scanner.nextLine().toUpperCase(); // Lê e transforma para maiúsculas

        String faixaEtaria;

        switch (classificacao) {
            case "G":
                faixaEtaria = "Livre";
                break;
            case "PG":
                faixaEtaria = "Maior de 10 anos";
                break;
            case "PG-13":
                faixaEtaria = "Maior de 13 anos";
                break;
            case "R":
                faixaEtaria = "Maior de 18 anos";
                break;
            default:
                faixaEtaria = "Classificação inválida!";
        }

        System.out.println("Faixa etária permitida: " + faixaEtaria);
        scanner.close();
    }
}
