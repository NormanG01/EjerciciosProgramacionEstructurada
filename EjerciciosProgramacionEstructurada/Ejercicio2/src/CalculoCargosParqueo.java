import java.util.Scanner;

public class CalculoCargosParqueo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCargos = 0.0;

        while (true) {
            System.out.print("Ingrese las horas de estacionamiento (o -1 para salir): ");
            int horasEstacionamiento = scanner.nextInt();

            if (horasEstacionamiento == -1) {
                break;
            }

            double cargo = calcularCargo(horasEstacionamiento);
            System.out.println("Cargo por estacionamiento: C$" + cargo);

            totalCargos += cargo;
        }

        System.out.println("Total de cargos: C$" + totalCargos);

        scanner.close();
    }

    public static double calcularCargo(int horas) {
        double cargoMinimo = 2.0;
        double cargoPorHora = 0.5;
        double cargoMaximo = 10.0;

        if (horas <= 3) {
            return cargoMinimo;
        } else {
            double cargo = cargoMinimo + (horas - 3) * cargoPorHora;
            return Math.min(cargo, cargoMaximo);
        }
    }
}
