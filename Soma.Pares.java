import java.util.Scanner;

public class SomaPares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int somaPares = 0, somaPrimos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int n = input.nextInt();

            if (n % 2 == 0) somaPares += n;

            if (ehPrimo(n)) somaPrimos += n;
        }

        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos primos: " + somaPrimos);

        input.close();
    }

    static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}