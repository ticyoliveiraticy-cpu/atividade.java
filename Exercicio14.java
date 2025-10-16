import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int somaIdadeOtimo = 0, contOtimo = 0, contRegular = 0, contBom = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Idade: ");
            int idade = input.nextInt();
            System.out.print("Opinião (3-ótimo, 2-bom, 1-regular): ");
            int opiniao = input.nextInt();

            if (opiniao == 3) {
                somaIdadeOtimo += idade;
                contOtimo++;
            } else if (opiniao == 2) {
                contBom++;
            } else if (opiniao == 1) {
                contRegular++;
            }
        }

        double mediaOtimo = contOtimo > 0 ? somaIdadeOtimo / (double) contOtimo : 0;
        System.out.printf("Média das idades (ótimo): %.2f%n", mediaOtimo);
        System.out.println("Quantidade de respostas 'regular': " + contRegular);
        System.out.printf("Porcentagem de 'bom': %.2f%%%n", (contBom * 100.0 / 15));

        input.close();
    }
}