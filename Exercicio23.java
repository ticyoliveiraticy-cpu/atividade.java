import java.util.Scanner;
import java.util.Locale;

public class  Exercicio23 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int opcao;

        do {
            
            System.out.println("\n--- MENU DE CÁLCULOS TRABALHISTAS ---");
            System.out.println("1. Calcular Novo Salário");
            System.out.println("2. Calcular Férias (Valor Bruto)");
            System.out.println("3. Calcular Décimo Terceiro (Proporcional)");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    System.out.print("\nDigite o salário atual: R$ ");
                    double salarioAtual = scanner.nextDouble();
                    double novoSalario;

                   
                    if (salarioAtual <= 1500.00) {
                        novoSalario = salarioAtual * 1.20; // 20% de aumento
                    } else if (salarioAtual <= 3000.00) {
                        novoSalario = salarioAtual * 1.15; // 15% de aumento
                    } else {
                        novoSalario = salarioAtual * 1.10; // 10% de aumento
                    }
                    System.out.printf("O novo salário será de: R$ %.2f\n", novoSalario);
                    break;

                case 2: 
                    System.out.print("\nDigite o salário bruto: R$ ");
                    double salarioFerias = scanner.nextDouble();
                    double valorFerias = salarioFerias + (salarioFerias / 3.0);
                    System.out.printf("O valor bruto das férias é: R$ %.2f\n", valorFerias);
                    break;

                case 3:
                    -
                    System.out.print("\nDigite o salário bruto: R$ ");
                    double salarioDecimo = scanner.nextDouble();
                    System.out.print("Digite o número de meses trabalhados no ano (1-12): ");
                    int mesesTrabalhados = scanner.nextInt();

                    if (mesesTrabalhados >= 1 && mesesTrabalhados <= 12) {
                        double valorDecimoTerceiro = (salarioDecimo / 12.0) * mesesTrabalhados;
                        System.out.printf("O valor do décimo terceiro proporcional é: R$ %.2f\n", valorDecimoTerceiro);
                    } else {
                        System.out.println("Número de meses inválido. Deve ser entre 1 e 12.");
                    }
                    break;

                case 4:
                   
                    System.out.println("\nPrograma finalizado.");
                    break;

                default:
                    
                    System.out.println("\nOpção inválida! Por favor, tente novamente.");
                    break;
            }

        } while (opcao != 4); 

        scanner.close();
    }
}