package switchCase;

import java.util.Scanner;

public class ClassificacaodeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        
        // Verifica a faixa etária e classifica
        String classificacao;

        switch (idade / 10) {
            case 0:
            case 1:
                classificacao = (idade >= 0 && idade <= 12) ? "Criança" : "Idade inválida";
                break;
            case 2:
                classificacao = (idade >= 13 && idade <= 17) ? "Adolescente" : "Adulto";
                break;
            case 3:
            case 4:
            case 5:
                classificacao = "Adulto";
                break;
            default:
                classificacao = (idade >= 60) ? "Idoso" : "Idade inválida";
        }

        System.out.println("Classificação etária: " + classificacao);
        scanner.close();
    }
}
