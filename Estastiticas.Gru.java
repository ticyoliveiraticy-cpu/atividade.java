import java.util.Locale;
import java.util.Scanner;

public class EstatisticasDeGrupo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Para ler decimais com ponto (ex: 1.75)
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_PESSOAS = 10;

        // Variáveis para os cálculos
        int somaIdades = 0;
        int qtdPeso90Altura150 = 0;
        int contPessoasMais190 = 0;
        int contIdade10a30emMais190 = 0;

        for (int i = 1; i <= TOTAL_PESSOAS; i++) {
            System.out.println("--- Dados da Pessoa " + i + " ---");

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite o peso (kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Digite a altura (m): ");
            double altura = scanner.nextDouble();

            // ✓ Acumula a soma para a média de idades
            somaIdades += idade;

            // ✓ Verifica a quantidade de pessoas com peso > 90kg e altura < 1.50m
            if (peso > 90 && altura < 1.50) {
                qtdPeso90Altura150++;
            }
            
            // ✓ Verifica a porcentagem de pessoas com idade entre 10 e 30 anos
            //    entre as que medem mais de 1.90m
            if (altura > 1.90) {
                contPessoasMais190++; // Conta o total de pessoas com mais de 1.90m
                if (idade >= 10 && idade <= 30) {
                    contIdade10a30emMais190++; // Dentro do grupo anterior, conta quem tem entre 10 e 30 anos
                }
            }
        }

        // --- Cálculos Finais ---
        double mediaIdades = (double) somaIdades / TOTAL_PESSOAS;
        
        // Evita divisão por zero se ninguém tiver mais de 1.90m
        double porcentagem = (contPessoasMais190 > 0) ? 
                             ((double) contIdade10a30emMais190 / contPessoasMais190) * 100 : 0;
        
        // --- Exibição dos Resultados ---
        System.out.println("\n========= ESTATÍSTICAS FINAIS =========");
        System.out.printf("✓ Média de idade do grupo: %.1f anos\n", mediaIdades);
        System.out.println("✓ Pessoas com mais de 90kg e altura menor que 1.50m: " + qtdPeso90Altura150);
        System.out.printf("✓ Porcentagem de pessoas com 10 a 30 anos (entre as com mais de 1.90m): %.1f%%\n", porcentagem);
        System.out.println("=========================================");

        scanner.close();
    }
}