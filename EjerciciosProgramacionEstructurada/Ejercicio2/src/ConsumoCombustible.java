import java.util.Scanner;

public class ConsumoCombustible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalKilometros = 0;
        int totalLitros = 0;
        int viaje = 1;

        while (true) {
            System.out.print("Ingrese los kilómetros conducidos en el viaje " + viaje + " (o -1 para terminar): ");
            int kilometros = scanner.nextInt();

            if (kilometros == -1) {
                break;
            }

            System.out.print("Ingrese los litros usados en el viaje " + viaje + ": ");
            int litros = scanner.nextInt();

            double consumo = (double) kilometros / litros;
            System.out.println("Consumo en el viaje " + viaje + ": " + consumo + " km/l");

            totalKilometros += kilometros;
            totalLitros += litros;

            viaje++;
        }

        if (totalLitros > 0) {
            double consumoPromedio = (double) totalKilometros / totalLitros;
            System.out.println("Consumo promedio total: " + consumoPromedio + " km/l");
        } else {
            System.out.println("No se registraron viajes.");
        }

        scanner.close();
    }
}
