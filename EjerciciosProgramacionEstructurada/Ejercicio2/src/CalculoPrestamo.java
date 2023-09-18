import java.util.Scanner;

public class CalculoPrestamo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto del préstamo: ");
        double montoPrestamo = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (%): ");
        double tasaAnual = scanner.nextDouble() / 100.0;

        System.out.print("Ingrese el pago mensual: ");
        double pagoMensual = scanner.nextDouble();

        double tasaMensual = tasaAnual / 12.0;
        int meses = 0;

        while (montoPrestamo > 0) {
            double interesMensual = montoPrestamo * tasaMensual;
            double pagoPrincipal = pagoMensual - interesMensual;
            montoPrestamo -= pagoPrincipal;
            meses++;

            if (pagoMensual <= interesMensual) {
                System.out.println("El pago mensual es insuficiente para pagar el préstamo.");
                break;
            }
        }

        System.out.println("Número de meses para pagar el préstamo: " + meses);

        scanner.close();
    }
}
