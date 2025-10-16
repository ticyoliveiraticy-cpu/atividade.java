import java.util.Arrays;
import java.util.Scanner;

public class OrdenaçãoValores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int grupo = 1; grupo <= 5; grupo++) {
            int[] valores = new int[4];
            System.out.println("Grupo " + grupo + ":");
            for (int i = 0; i < 4; i++) {
                System.out.print("Digite o valor " + (i + 1) + ": ");
                valores[i] = input.nextInt();
            }

            System.out.println("Ordem lida: " + Arrays.toString(valores));

            int[] crescente = valores.clone();
            Arrays.sort(crescente);
            System.out.println("Ordem crescente: " + Arrays.toString(crescente));

            int[] decrescente = crescente.clone();
            for (int i = 0; i < decrescente.length / 2; i++) {
                int temp = decrescente[i];
                decrescente[i] = decrescente[decrescente.length - 1 - i];
                decrescente[decrescente.length - 1 - i] = temp;
            }
            System.out.println("Ordem decrescente: " + Arrays.toString(decrescente));
            System.out.println();
        }

        input.close();
    }
}

