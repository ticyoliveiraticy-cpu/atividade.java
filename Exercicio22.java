import java.util.Scanner;

public class UrnaEletronica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para contar os votos de cada categoria
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int votosNulos = 0;
        int votosBrancos = 0;
        int totalDeVotos = 0;
        int voto;

        System.out.println("--- INICIAR VOTAÇÃO ---");
        System.out.println("Digite o código do seu voto:");
        System.out.println("1 - Candidato 1");
        System.out.println("2 - Candidato 2");
        System.out.println("3 - Candidato 3");
        System.out.println("4 - Candidato 4");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("0 - Finalizar Votação");

        // Loop para coletar os votos
        while (true) {
            System.out.print("\nDigite seu voto: ");
            voto = scanner.nextInt();

            if (voto == 0) {
                break; // Encerra o loop se o voto for 0
            }

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    candidato4++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosBrancos++;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue; // Pula para a próxima iteração sem contar o voto
            }
            totalDeVotos++; // Incrementa o total de votos válidos
        }

        // Exibição dos resultados
        System.out.println("\n--- RESULTADO DA VOTAÇÃO ---");
        System.out.println("Total de votos para o Candidato 1: " + candidato1);
        System.out.println("Total de votos para o Candidato 2: " + candidato2);
        System.out.println("Total de votos para o Candidato 3: " + candidato3);
        System.out.println("Total de votos para o Candidato 4: " + candidato4);
        System.out.println("Total de votos Nulos: " + votosNulos);
        System.out.println("Total de votos em Branco: " + votosBrancos);
        System.out.println("--------------------------------");
        System.out.println("Total de votos apurados: " + totalDeVotos);

        // Cálculo e exibição das porcentagens
        if (totalDeVotos > 0) {
            double percentualNulos = (double) votosNulos / totalDeVotos * 100;
            double percentualBrancos = (double) votosBrancos / totalDeVotos * 100;
            System.out.printf("Porcentagem de votos Nulos: %.2f%%\n", percentualNulos);
            System.out.printf("Porcentagem de votos em Branco: %.2f%%\n", percentualBrancos);
        } else {
            System.out.println("Nenhum voto foi computado.");
        }

        scanner.close(); // Fecha o scanner para liberar recursos
    }
}