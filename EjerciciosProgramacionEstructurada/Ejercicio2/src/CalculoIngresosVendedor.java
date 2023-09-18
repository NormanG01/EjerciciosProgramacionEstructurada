import java.util.Scanner;

public class CalculoIngresosVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de artículos vendidos: ");
        int numeroArticulos = scanner.nextInt();

        double totalVentas = 0.0;

        for (int i = 1; i <= numeroArticulos; i++) {
            System.out.print("Ingrese el valor del artículo #" + i + " (C$): ");
            double valorArticulo = scanner.nextDouble();
            totalVentas += valorArticulo;
        }

        double comision = 0.09 * totalVentas;
        double ingresos = 200.0 + comision;

        System.out.println("Ingresos del vendedor: C$" + ingresos);

        scanner.close();
    }
}
