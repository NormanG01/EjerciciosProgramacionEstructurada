import java.util.Scanner;

public class CuentasBancarias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de cuenta: ");
        int numeroCuenta = scanner.nextInt();

        System.out.print("Tipo de cuenta (s para ahorros, c para cheques): ");
        char tipoCuenta = scanner.next().charAt(0);

        System.out.print("Saldo mínimo requerido: ");
        double saldoMinimo = scanner.nextDouble();

        System.out.print("Saldo actual: ");
        double saldoActual = scanner.nextDouble();

        double saldoNuevo = saldoActual;

        if (tipoCuenta == 's' || tipoCuenta == 'S') {
            if (saldoActual < saldoMinimo) {
                saldoNuevo -= 10;
            } else {
                saldoNuevo *= 1.04; // 4% de interés
            }
        } else if (tipoCuenta == 'c' || tipoCuenta == 'C') {
            if (saldoActual < saldoMinimo) {
                saldoNuevo -= 25;
            } else if (saldoActual <= (saldoMinimo + 5000)) {
                saldoNuevo *= 1.03; // 3% de interés
            } else {
                saldoNuevo *= 1.05; // 5% de interés
            }
        } else {
            System.out.println("Tipo de cuenta no válido.");
            scanner.close();
            return;
        }

        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo actual: U$" + saldoActual);
        System.out.println("Saldo nuevo: U$" + saldoNuevo);

        scanner.close();
    }
}