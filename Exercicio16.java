import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, soma = 0, cont = 0;

        do {
            System.out.print("Digite uma idade (0 para encerrar): ");
            idade = input.nextInt();
            if (idade > 0) {
                soma += idade;
                cont++;
            }
        } while (idade != 0);

        if (cont > 0)
            System.out.printf("Média das idades: %.2f%n", (soma / (double) cont));
        else
            System.out.println("Nenhuma idade informada.");

        input.close();
    }
}