package Input;
import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public int obtenerEntero() {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Ingrese un número entero:");
            scanner.nextLine();
        }
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }

    public String obtenerTexto() {
        return scanner.nextLine();
    }
}
