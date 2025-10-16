import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] somaPesos = new double[4];
        int[] cont = new int[4];

        for (int i = 1; i <= 15; i++) {
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Peso (kg): ");
            double peso = input.nextDouble();

            if (idade <= 10) { somaPesos[0] += peso; cont[0]++; }
            else if (idade <= 20) { somaPesos[1] += peso; cont[1]++; }
            else if (idade <= 30) { somaPesos[2] += peso; cont[2]++; }
            else { somaPesos[3] += peso; cont[3]++; }
        }

        System.out.println("\nMédia de peso por faixa etária:");
        String[] faixas = {"1–10", "11–20", "21–30", "Acima de 31"};
        for (int i = 0; i < 4; i++) {
            double media = cont[i] > 0 ? somaPesos[i] / cont[i] : 0;
            System.out.printf("%s anos: %.2f kg%n", faixas[i], media);
        }

        input.close();
    }
}