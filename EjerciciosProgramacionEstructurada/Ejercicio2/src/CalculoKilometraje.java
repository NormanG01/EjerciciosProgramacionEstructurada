import java.util.Scanner;

public class CalculoKilometraje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalKilometros = 0;
        int totalLitros = 0;

        System.out.println("Ingrese los kilómetros conducidos y los litros usados (0 para salir):");

        while (true) {
            System.out.print("Kilómetros: ");
            int kilometros = scanner.nextInt();
            if (kilometros == 0) {
                break;
            }

            System.out.print("Litros: ");
            int litros = scanner.nextInt();

            double kilometrosPorLitro = (double) kilometros / litros;
            System.out.println("Kilómetros por litro: " + kilometrosPorLitro);

            totalKilometros += kilometros;
            totalLitros += litros;
        }

        if (totalLitros > 0) {
            double kilometrosPorLitroTotal = (double) totalKilometros / totalLitros;
            System.out.println("Kilómetros por litro promedio: " + kilometrosPorLitroTotal);
        } else {
            System.out.println("No se ingresaron datos válidos.");
        }

        scanner.close();
    }
}
