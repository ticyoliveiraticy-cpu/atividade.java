import java.util.Scanner;

public class PesquisaMer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_ESPECTADORES = 15;

        // Variáveis para os cálculos
        int somaIdadeOtimo = 0;
        int contOtimo = 0;
        int contRegular = 0;
        int contBom = 0;

        // Loop para coletar os dados dos 15 espectadores
        for (int i = 1; i <= TOTAL_ESPECTADORES; i++) {
            System.out.println("--- Espectador " + i + " ---");
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite a opinião (3-ótimo, 2-bom, 1-regular): ");
            int opiniao = scanner.nextInt();

            // Separa os dados de acordo com a opinião
            switch (opiniao) {
                case 3: // Ótimo
                    somaIdadeOtimo += idade;
                    contOtimo++;
                    break;
                case 2: // Bom
                    contBom++;
                    break;
                case 1: // Regular
                    contRegular++;
                    break;
            }
        }

        // --- Cálculos Finais ---

        // ✓ Média de idade das pessoas que responderam "ótimo"
        double mediaIdadeOtimo = (contOtimo > 0) ? (double) somaIdadeOtimo / contOtimo : 0;

        // ✓ Porcentagem de pessoas que responderam "bom"
        double pBom = (double) contBom / TOTAL_ESPECTADORES * 100;

        // --- Exibição dos Resultados ---
        System.out.println("\n========= RESULTADO DA PESQUISA =========");
        System.out.printf("Média de idade (ótimo): %.1f anos\n", mediaIdadeOtimo);
        System.out.println("Quantidade de pessoas (regular): " + contRegular);
        System.out.printf("Porcentagem de pessoas (bom): %.1f%%\n", pBom);
        System.out.println("=========================================");

        scanner.close();
    }
}