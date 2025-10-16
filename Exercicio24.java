import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um valor positivo (0 para encerrar): ");
            num = input.nextInt();

            if (num == 0) break;
            if (num < 0) continue;

            if (num > maior) maior = num;
            if (num < menor) menor = num;
        }

        if (maior != Integer.MIN_VALUE)
            System.out.printf("Maior: %d | Menor: %d%n", maior, menor);
        else
            System.out.println("Nenhum valor válido informado.");

        input.close();
    }
}