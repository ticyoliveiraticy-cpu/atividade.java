import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Média Aritmética");
            System.out.println("2. Média Ponderada");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a 1ª nota: ");
                    double n1 = input.nextDouble();
                    System.out.print("Digite a 2ª nota: ");
                    double n2 = input.nextDouble();
                    System.out.printf("Média aritmética: %.2f%n", (n1 + n2) / 2);
                    break;

                case 2:
                    System.out.print("Digite a 1ª nota: ");
                    n1 = input.nextDouble();
                    System.out.print("Digite o peso 1: ");
                    int p1 = input.nextInt();

                    System.out.print("Digite a 2ª nota: ");
                    double n3 = input.nextDouble();
                    System.out.print("Digite o peso 2: ");
                    int p2 = input.nextInt();

                    System.out.print("Digite a 3ª nota: ");
                    double n4 = input.nextDouble();
                    System.out.print("Digite o peso 3: ");
                    int p3 = input.nextInt();

                    double mediaP = (n1 * p1 + n3 * p2 + n4 * p3) / (p1 + p2 + p3);
                    System.out.printf("Média ponderada: %.2f%n", mediaP);
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        input.close();
    }
}