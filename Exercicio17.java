import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int canal;
        int[] canais = {4, 5, 7, 12};
        int[] audiencia = new int[4];
        int totalPessoas = 0;

        do {
            System.out.print("Digite o canal (4,5,7,12 ou 0 para encerrar): ");
            canal = input.nextInt();
            if (canal == 0) break;

            System.out.print("Número de pessoas assistindo: ");
            int pessoas = input.nextInt();
            totalPessoas += pessoas;

            for (int i = 0; i < canais.length; i++) {
                if (canal == canais[i]) audiencia[i] += pessoas;
            }
        } while (canal != 0);

        System.out.println("\nPorcentagem de audiência:");
        for (int i = 0; i < canais.length; i++) {
            double perc = totalPessoas > 0 ? audiencia[i] * 100.0 / totalPessoas : 0;
            System.out.printf("Canal %d: %.2f%%%n", canais[i], perc);
        }

        input.close();
    }
}