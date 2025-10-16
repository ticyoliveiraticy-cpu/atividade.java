public class MultiplasTabuadas {

    public static void main(String[] args) {
        // Laço externo para iterar através dos números de 1 a 10 (as tabuadas)
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");

            // Laço interno para calcular e mostrar cada linha da tabuada
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            // Adiciona uma linha em branco para separar as tabuadas
            System.out.println();
        }
    }
}