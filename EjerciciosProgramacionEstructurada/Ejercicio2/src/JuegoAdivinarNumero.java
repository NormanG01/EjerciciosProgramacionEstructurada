import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 50;
        int numeroAdivinar = random.nextInt(max - min + 1) + min;
        int intentos = 3;

        System.out.println("Adivine un número entre 1 y 50.");

        while (intentos > 0) {
            System.out.print("Intento " + (4 - intentos) + ": ");
            int intento = scanner.nextInt();

            if (intento == numeroAdivinar) {
                System.out.println("Felicidades. ¡Adivinó el número!");
                break;
            } else if (intento < numeroAdivinar) {
                System.out.println("Demasiado bajo. Intente de nuevo.");
            } else {
                System.out.println("Demasiado alto. Intente de nuevo.");
            }

            intentos--;
        }

        if (intentos == 0) {
            System.out.println("Se agotaron los intentos. El número era: " + numeroAdivinar);
        }

        System.out.print("¿Desea jugar otra vez? (s/n): ");
        String respuesta = scanner.next();

        if (respuesta.equalsIgnoreCase("s")) {
            main(null);
        } else {
            System.out.println("Gracias por jugar.");
        }

        scanner.close();
    }
}
