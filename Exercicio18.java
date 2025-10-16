import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, cont = 0, mulheres200 = 0;
        double somaSalarios = 0, menorSalario = Double.MAX_VALUE;
        int maiorIdade = 0, menorIdade = Integer.MAX_VALUE;
        String pessoaMenorSalario = "";

        while (true) {
            System.out.print("Idade (negativa para sair): ");
            idade = input.nextInt();
            if (idade < 0) break;

            System.out.print("Sexo (M/F): ");
            char sexo = input.next().toUpperCase().charAt(0);
            System.out.print("Salário: R$ ");
            double salario = input.nextDouble();

            somaSalarios += salario;
            cont++;
            if (idade > maiorIdade) maiorIdade = idade;
            if (idade < menorIdade) menorIdade = idade;
            if (sexo == 'F' && salario <= 200) mulheres200++;
            if (salario < menorSalario) {
                menorSalario = salario;
                pessoaMenorSalario = "Sexo: " + sexo + ", Idade: " + idade + ", Salário: R$" + salario;
            }
        }

        if (cont > 0) {
            System.out.printf("Média de salários: R$ %.2f%n", somaSalarios / cont);
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Mulheres com salário até R$200: " + mulheres200);
            System.out.println("Pessoa com menor salário: " + pessoaMenorSalario);
        } else {
            System.out.println("Nenhum dado informado.");
        }

        input.close();
    }
}