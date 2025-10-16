import java.util.Locale;
import java.util.Scanner;

public class TransacoesLoja {

    public static void main(String[] args) {
        // Define o padrão de localidade para usar o ponto como separador decimal
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double totalVista = 0;
        double totalPrazo = 0;

        // Loop para ler as 15 transações
        for (int i = 1; i <= 15; i++) {
            System.out.println("--- Transação " + i + " ---");
            System.out.print("Digite o código (V - à vista, P - a prazo): ");
            char codigo = scanner.next().toUpperCase().charAt(0); // Lê o 1º caractere em maiúsculo

            System.out.print("Digite o valor: R$ ");
            double valor = scanner.nextDouble();

            // Separa os valores de acordo com o código
            if (codigo == 'V') {
                totalVista += valor;
            } else if (codigo == 'P') {
                totalPrazo += valor;
            } else {
                System.out.println("Código inválido, transação ignorada.");
            }
        }

        // Calcula os totais e a prestação
        double totalGeral = totalVista + totalPrazo;
        double primeiraPrestacao = totalPrazo / 3;

        // Mostra os resultados
        System.out.println("\n--- Resumo Final ---");
        System.out.printf("✓ Total de compras à vista: R$ %.2f\n", totalVista);
        System.out.printf("✓ Total de compras a prazo: R$ %.2f\n", totalPrazo);
        System.out.printf("✓ Valor total das compras: R$ %.2f\n", totalGeral);
        System.out.printf("✓ 1ª prestação das compras a prazo (3x): R$ %.2f\n", primeiraPrestacao);

        scanner.close();
    }
}