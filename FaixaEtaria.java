import java.util.Scanner;
import java.util.InputMismatchException;

public class FaixaEtaria {

    public static void main(String[] args) {


        int faixa1_ate_15 = 0;
        int faixa2_16_a_30 = 0;
        int faixa3_31_a_45 = 0;
        int faixa4_46_a_60 = 0;
        int faixa5_acima_60 = 0;

        final int TOTAL_DE_PESSOAS = 8; 

        
        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor, digite a idade de " + TOTAL_DE_PESSOAS + " pessoas.");

        for (int i = 0; i < TOTAL_DE_PESSOAS; i++) {
            int idade = 0;
            boolean entradaValida = false;

           
            while (!entradaValida) {
                System.out.print("Digite a idade da " + (i + 1) + "ª pessoa: ");
                try {
                    idade = scanner.nextInt();
                    if (idade >= 0) {
                        entradaValida = true; // Entrada é um número inteiro e não negativo
                    } else {
                        System.out.println("Erro: Por favor, digite uma idade positiva.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
                    scanner.next();
                }
            }

           
            if (idade <= 15) {
                faixa1_ate_15++;
            } else if (idade <= 30) {
                faixa2_16_a_30++;
            } else if (idade <= 45) {
                faixa3_31_a_45++;
            } else if (idade <= 60) {
                faixa4_46_a_60++;
            } else {
                faixa5_acima_60++;
            }
        }

       
        scanner.close();

        // 4. Cálculo das porcentagens
        // É necessário converter um dos números para double para evitar a divisão de inteiros
        double porcentagem_faixa1 = ((double) faixa1_ate_15 / TOTAL_DE_PESSOAS) * 100.0;
        double porcentagem_faixa5 = ((double) faixa5_acima_60 / TOTAL_DE_PESSOAS) * 100.0;

        // 5. Exibição dos resultados
        System.out.println("\n=========================");
        System.out.println("      RESULTADOS");
        System.out.println("=========================\n");


        System.out.println("✓ Quantidade de pessoas por faixa etária:");
        System.out.println("  - Até 15 anos (1ª faixa):      " + faixa1_ate_15 + " pessoa(s)");
        System.out.println("  - De 16 a 30 anos (2ª faixa):  " + faixa2_16_a_30 + " pessoa(s)");
        System.out.println("  - De 31 a 45 anos (3ª faixa):  " + faixa3_31_a_45 + " pessoa(s)");
        System.out.println("  - De 46 a 60 anos (4ª faixa):  " + faixa4_46_a_60 + " pessoa(s)");
        System.out.println("  - Acima de 60 anos (5ª faixa): " + faixa5_acima_60 + " pessoa(s)");
        System.out.println("-------------------------");


        System.out.println("✓ Porcentagens sobre o total:");
        
        System.out.printf("  - Primeira faixa (até 15 anos): %.2f%%\n", porcentagem_faixa1);
        System.out.printf("  - Última faixa (acima de 60 anos): %.2f%%\n", porcentagem_faixa5);
        System.out.println("\n=========================");
    }
}