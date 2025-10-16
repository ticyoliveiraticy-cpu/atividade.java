import java.util.Scanner;
import java.util.Locale;

public class Exercicio21 {

    public static void main(String[] args) {
        // Define o Locale para US para garantir que o ponto seja o separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int opcao;

        do {
            // 1. Exibe o menu de opções
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1. Calcular Média Aritmética (2 notas)");
            System.out.println("2. Calcular Média Ponderada (3 notas)");
            System.out.println("3. Sair");
            System.out.print("Digite a sua opção: ");

            opcao = scanner.nextInt();

            // 2. Processa a escolha do usuário
            switch (opcao) {
                case 1:
                    System.out.println("\n-- Média Aritmética --");
                    System.out.print("Digite a primeira nota: ");
                    double nota1 = scanner.nextDouble();
                    System.out.print("Digite a segunda nota: ");
                    double nota2 = scanner.nextDouble();
                    double mediaAritmetica = (nota1 + nota2) / 2;
                    System.out.printf("A média aritmética é: %.2f\n", mediaAritmetica);
                    break;

                case 2:
                    System.out.println("\n-- Média Ponderada --");
                    System.out.print("Digite a nota 1: ");
                    double n1 = scanner.nextDouble();
                    System.out.print("Digite o peso da nota 1: ");
                    double p1 = scanner.nextDouble();

                    System.out.print("Digite a nota 2: ");
                    double n2 = scanner.nextDouble();
                    System.out.print("Digite o peso da nota 2: ");
                    double p2 = scanner.nextDouble();

                    System.out.print("Digite a nota 3: ");
                    double n3 = scanner.nextDouble();
                    System.out.print("Digite o peso da nota 3: ");
                    double p3 = scanner.nextDouble();

                    double mediaPonderada = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
                    System.out.printf("A média ponderada é: %.2f\n", mediaPonderada);
                    break;

                                }
        } while (opcao != 3); // O loop continua enquanto a opção não for 3

        scanner.close(); // Fecha o recurso Scanner
    }
}
