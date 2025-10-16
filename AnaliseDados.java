import java.util.Locale;
import java.util.Scanner;

public class AnaliseDadosPessoais {

    public static void main(String[] args) {
        // Define o padrão para entrada de decimais com ponto
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        final int TOTAL_DE_PESSOAS = 5;

        // Variáveis para os cálculos
        int qtdPessoasMais50 = 0;
        double somaAltura10a20 = 0;
        int contPessoas10a20 = 0;
        int qtdPesoMenor40kg = 0;

        // Loop para coletar os dados das 5 pessoas
        for (int i = 1; i <= TOTAL_DE_PESSOAS; i++) {
            System.out.println("--- Dados da Pessoa " + i + " ---");

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite a altura (ex: 1.75): ");
            double altura = scanner.nextDouble();

            System.out.print("Digite o peso (ex: 68.5): ");
            double peso = scanner.nextDouble();

            // ✓ Verifica se a idade é superior a 50 anos
            if (idade > 50) {
                qtdPessoasMais50++;
            }

            // ✓ Verifica se a idade está entre 10 e 20 anos para a média de altura
            if (idade >= 10 && idade <= 20) {
                somaAltura10a20 += altura;
                contPessoas10a20++;
            }

            // ✓ Verifica se o peso é inferior a 40 kg
            if (peso < 40) {
                qtdPesoMenor40kg++;
            }
        }

        // --- Cálculos Finais ---

        // ✓ Calcula a média de altura (evitando divisão por zero)
        double mediaAltura = 0;
        if (contPessoas10a20 > 0) {
            mediaAltura = somaAltura10a20 / contPessoas10a20;
        }

        // ✓ Calcula a porcentagem de pessoas com peso inferior a 40kg
        double porcentagemPesoMenor40kg = ((double) qtdPesoMenor40kg / TOTAL_DE_PESSOAS) * 100;

        // --- Exibição dos Resultados ---
        System.out.println("\n========= Análise Final =========");
        System.out.println("Pessoas com mais de 50 anos: " + qtdPessoasMais50);
        System.out.printf("Média de altura (idade 10-20 anos): %.2f m\n", mediaAltura);
        System.out.printf("Porcentagem de pessoas com menos de 40 kg: %.1f%%\n", porcentagemPesoMenor40kg);
        System.out.println("=================================");

        scanner.close();
    }
}