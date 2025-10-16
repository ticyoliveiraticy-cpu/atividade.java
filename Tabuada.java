import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();


        System.out.println("\n--- Tabuada do " + numero + " ---");

        for (int i = 0; i <= 10; i++) {
            
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Fecha o scanner para liberar o recurso
        scanner.close();
    }
}