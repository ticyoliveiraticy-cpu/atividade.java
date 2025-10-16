import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char tipo;
        double totalLucro = 0, totalCompra = 0;
        int lucroMaior1000 = 0, lucroMenor200 = 0;

        while (true) {
            System.out.print("Tipo da ação (ou 'F' para finalizar): ");
            tipo = input.next().toUpperCase().charAt(0);
            if (tipo == 'F') break;

            System.out.print("Preço de compra: R$ ");
            double compra = input.nextDouble();
            System.out.print("Preço de venda: R$ ");
            double venda = input.nextDouble();

            double lucro = venda - compra;
            totalLucro += lucro;
            totalCompra += compra;

            System.out.printf("Lucro da ação: R$ %.2f%n", lucro);
            if (lucro > 1000) lucroMaior1000++;
            if (lucro < 200) lucroMenor200++;
        }

        System.out.printf("%nAções com lucro > R$1000: %d%n", lucroMaior1000);
        System.out.printf("Ações com lucro < R$200: %d%n", lucroMenor200);
        System.out.printf("Lucro total: R$ %.2f%n", totalLucro);
        System.out.printf("Total investido: R$ %.2f%n", totalCompra);

        input.close();
    }
}