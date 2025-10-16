import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigo;
        double totalInvestido = 0, totalJuros = 0;

        do {
            System.out.print("Código do cliente (<=0 para sair): ");
            codigo = input.nextInt();
            if (codigo <= 0) break;

            System.out.println("Tipo de investimento:");
            System.out.println("1 - Poupança (1,5%)");
            System.out.println("2 - Plus (2%)");
            System.out.println("3 - Renda Fixa (4%)");
            System.out.print("Escolha: ");
            int tipo = input.nextInt();

            System.out.print("Valor investido: R$ ");
            double valor = input.nextDouble();

            double rendimento = 0;
            switch (tipo) {
                case 1 -> rendimento = valor * 0.015;
                case 2 -> rendimento = valor * 0.02;
                case 3 -> rendimento = valor * 0.04;
                default -> System.out.println("Tipo inválido!");
            }

            System.out.printf("Rendimento mensal: R$ %.2f%n", rendimento);

            totalInvestido += valor;
            totalJuros += rendimento;

        } while (codigo > 0);

        System.out.printf("%nTotal investido: R$ %.2f%n", totalInvestido);
        System.out.printf("Total de juros pagos: R$ %.2f%n", totalJuros);

        input.close();
    }
}