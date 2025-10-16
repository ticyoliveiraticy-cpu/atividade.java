import java.util.Scanner;

public class FinanciCarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do carro: R$ ");
        double preco = input.nextDouble();

        System.out.printf("À vista (20%% de desconto): R$ %.2f%n", preco * 0.8);
        System.out.println("Parcelado:");
        int parcelas = 6;
        for (int i = 1; i <= 10; i++) {
            double percentual = 3 * i;
            double valorFinal = preco + (preco * percentual / 100);
            double valorParcela = valorFinal / parcelas;
            System.out.printf("%d parcelas - Acréscimo %.0f%% - Total: R$ %.2f - Parcela: R$ %.2f%n",
                    parcelas, percentual, valorFinal, valorParcela);
            parcelas += 6;
        }

        input.close();
    }
}