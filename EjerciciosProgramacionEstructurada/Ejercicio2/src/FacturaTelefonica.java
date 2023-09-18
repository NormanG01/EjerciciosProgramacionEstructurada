import java.util.Scanner;

public class FacturaTelefonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();

        System.out.print("Ingrese el código de servicio (R para regular, P para Premium): ");
        char codigoServicio = scanner.next().charAt(0);

        double cargoBase = 0;
        double cargoPorMinuto = 0;
        int minutosDia = 0;
        int minutosNoche = 0;

        if (codigoServicio == 'r' || codigoServicio == 'R') {
            cargoBase = 10;
            System.out.print("Ingrese el número de minutos utilizados: ");
            int minutosUsados = scanner.nextInt();
            if (minutosUsados > 50) {
                cargoPorMinuto = (minutosUsados - 50) * 0.20;
            }
        } else if (codigoServicio == 'p' || codigoServicio == 'P') {
            cargoBase = 25;
            System.out.print("Ingrese el número de minutos utilizados durante el día: ");
            minutosDia = scanner.nextInt();
            System.out.print("Ingrese el número de minutos utilizados durante la noche: ");
            minutosNoche = scanner.nextInt();

            if (minutosDia > 75) {
                cargoPorMinuto += (minutosDia - 75) * 0.10;
            }

            if (minutosNoche > 100) {
                cargoPorMinuto += (minutosNoche - 100) * 0.05;
            }
        } else {
            System.out.println("Código de servicio no válido.");
            scanner.close();
            return;
        }

        double totalCargo = cargoBase + cargoPorMinuto;

        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println(
                "Tipo de servicio: " + (codigoServicio == 'r' || codigoServicio == 'R' ? "Regular" : "Premium"));
        System.out.println("Minutos utilizados: " + (codigoServicio == 'r' || codigoServicio == 'R' ? "N/A"
                : "Día: " + minutosDia + ", Noche: " + minutosNoche));
        System.out.println("Cargo base: U$" + cargoBase);
        System.out.println("Cargo por minutos adicionales: U$" + cargoPorMinuto);
        System.out.println("Total a pagar: U$" + totalCargo);

        scanner.close();
    }
}
