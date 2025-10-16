public class LucroTeatro {
    public static void main(String[] args) {
        double preco = 5.0;
        double despesa = 200.0;

        System.out.println("Preço | Ingressos | Lucro");
        double lucroMaximo = 0, melhorPreco = 0;
        int melhorQtd = 0;

        for (double p = preco; p >= 1.0; p -= 0.5) {
            int ingressos = 120 + (int) ((5.0 - p) / 0.5) * 26;
            double lucro = (p * ingressos) - despesa;

            System.out.printf("R$ %.2f | %d | R$ %.2f%n", p, ingressos, lucro);

            if (lucro > lucroMaximo) {
                lucroMaximo = lucro;
                melhorPreco = p;
                melhorQtd = ingressos;
            }
        }

        System.out.printf("%nLucro máximo: R$ %.2f (Preço: R$ %.2f, Ingressos: %d)%n",
                lucroMaximo, melhorPreco, melhorQtd);
    }
}
