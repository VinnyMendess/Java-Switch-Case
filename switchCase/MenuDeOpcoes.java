package switchCase;

import java.util.Scanner;

public class MenuDeOpcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu de Opções:");
            System.out.println("1. Exibir 'Olá, Mundo!'");
            System.out.println("2. Exibir 'Bem-vindo ao C#'");
            System.out.println("3. Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Olá, Mundo!");
                    break;
                case 2:
                    System.out.println("Bem-vindo ao C#!");
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
