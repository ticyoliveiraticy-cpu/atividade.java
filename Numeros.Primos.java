import java.util.Scanner;

public class NumerosPrimos{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contPrimos = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int n = input.nextInt();
            if (ehPrimo(n)) contPrimos++;
        }

        System.out.println("Quantidade de números primos: " + contPrimos);
        input.close();
    }

    static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}