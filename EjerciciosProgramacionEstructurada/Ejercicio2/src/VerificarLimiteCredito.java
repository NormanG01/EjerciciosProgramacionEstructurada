import java.util.Scanner;

public class VerificarLimiteCredito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de cuenta: ");
        int numeroCuenta = scanner.nextInt();

        System.out.print("Ingrese el saldo al inicio del mes: C$");
        int saldoInicial = scanner.nextInt();

        System.out.print("Ingrese el total de artículos cargados: C$");
        int cargos = scanner.nextInt();

        System.out.print("Ingrese el total de créditos aplicados: C$");
        int creditos = scanner.nextInt();

        System.out.print("Ingrese el límite de crédito permitido: C$");
        int limiteCredito = scanner.nextInt();

        int nuevoSaldo = saldoInicial + cargos - creditos;

        System.out.println("Nuevo saldo: C$" + nuevoSaldo);

        if (nuevoSaldo > limiteCredito) {
            System.out.println("Se excedió el límite de crédito.");
        }

        scanner.close();
    }
}
