import java.util.Scanner;

public class CalculoFacturaCable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de cuenta del cliente: ");
        int numeroCuenta = scanner.nextInt();

        System.out.print("Ingrese el código del cliente (R para residencial, N para negocios): ");
        char codigoCliente = scanner.next().toUpperCase().charAt(0);

        double cargoProcesamientoFactura;
        double cargoServicioBasico;
        double cargoCanalesPremium = 0.0;

        if (codigoCliente == 'R') {
            cargoProcesamientoFactura = 4.50;
            cargoServicioBasico = 20.50;

            System.out.print("Ingrese el número de canales Premium: ");
            int numCanalesPremium = scanner.nextInt();
            cargoCanalesPremium = numCanalesPremium * 7.50;
        } else if (codigoCliente == 'N') {
            cargoProcesamientoFactura = 15.00;

            System.out.print("Ingrese el número de conexiones de servicio básico: ");
            int numConexiones = scanner.nextInt();
            if (numConexiones <= 10) {
                cargoServicioBasico = 75.00;
            } else {
                cargoServicioBasico = 75.00 + (numConexiones - 10) * 5.00;
            }

            System.out.print("Ingrese el número de canales Premium: ");
            int numCanalesPremium = scanner.nextInt();
            cargoCanalesPremium = numCanalesPremium * 50.00;
        } else {
            System.out.println("Código de cliente no válido.");
            scanner.close();
            return;
        }

        double importeFacturacion = cargoProcesamientoFactura + cargoServicioBasico + cargoCanalesPremium;

        System.out.println("Número de cuenta del cliente: " + numeroCuenta);
        System.out.println("Importe de facturación: C$" + importeFacturacion);

        scanner.close();
    }
}
