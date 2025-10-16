import java.util.Locale;
import java.util.Scanner;

public class AnaliseDemografica {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Para ler decimais com ponto (ex: 1.75)
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_PESSOAS = 6;

        // Variáveis para os cálculos
        int qtdIdade50Peso60 = 0;
        int somaIdadeAltura150 = 0, contAltura150 = 0;
        int qtdOlhosAzuis = 0;
        int qtdRuivasNaoAzuis = 0;

        for (int i = 1; i <= TOTAL_PESSOAS; i++) {
            System.out.println("--- Pessoa " + i + " ---");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();

            System.out.print("Cor dos olhos (A-azul, P-preto, V-verde, C-castanho): ");
            char corOlhos = scanner.next().toUpperCase().charAt(0);

            System.out.print("Cor dos cabelos (P-preto, C-castanho, L-loiro, R-ruivo): ");
            char corCabelos = scanner.next().toUpperCase().charAt(0);

            // ✓ Condição 1: Idade > 50 anos e peso < 60 kg
            if (idade > 50 && peso < 60) {
                qtdIdade50Peso60++;
            }

            // ✓ Condição 2: Média de idade para altura < 1,50 m
            if (altura < 1.50) {
                somaIdadeAltura150 += idade;
                contAltura150++;
            }

            // ✓ Condição 3: Porcentagem de olhos azuis
            if (corOlhos == 'A') {
                qtdOlhosAzuis++;
            }

            // ✓ Condição 4: Ruivas sem olhos azuis
            if (corCabelos == 'R' && corOlhos != 'A') {
                qtdRuivasNaoAzuis++;
            }
        }

        // --- Cálculos e Exibição dos Resultados ---
        double mediaIdades = (contAltura150 > 0) ? (double) somaIdadeAltura150 / contAltura150 : 0;
        double pOlhosAzuis = (double) qtdOlhosAzuis / TOTAL_PESSOAS * 100;

        System.out.println("\n========= RESULTADO DA ANÁLISE =========");
        System.out.println("Pessoas com mais de 50 anos e menos de 60kg: " + qtdIdade50Peso60);
        System.out.printf("Média de idade (altura < 1.50m): %.1f anos\n", mediaIdades);
        System.out.printf("Porcentagem de pessoas com olhos azuis: %.1f%%\n", pOlhosAzuis);
        System.out.println("Pessoas ruivas sem olhos azuis: " + qtdRuivasNaoAzuis);
        System.out.println("==========================================");

        scanner.close();
    }
}