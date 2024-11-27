package switchCase;

import java.util.Scanner;

public class NotaDoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota de 0 a 10: ");
        int nota = scanner.nextInt();

        String classificacao;

        switch (nota) {
            case 9:
            case 10:
                classificacao = "A";
                break;
            case 7:
            case 8:
                classificacao = "B";
                break;
            case 5:
            case 6:
                classificacao = "C";
                break;
            case 3:
            case 4:
                classificacao = "D";
                break;
            case 0:
            case 1:
            case 2:
                classificacao = "F";
                break;
            default:
                classificacao = "Nota inválida!";
        }

        System.out.println("Classificação: " + classificacao);
        scanner.close();
    }
}
