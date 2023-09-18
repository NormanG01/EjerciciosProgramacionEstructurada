import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoCordobas = 0.0;
        double saldoDolares = 0.0;

        boolean continuar = true;

        while (continuar) {
            System.out.println("Saldo actual - Córdobas: " + saldoCordobas + " / Dólares: " + saldoDolares);
            System.out.print("¿Qué desea hacer? (D para depositar, R para retirar, S para salir): ");
            char opcion = scanner.next().toUpperCase().charAt(0);

            switch (opcion) {
                case 'D':
                    System.out.print("¿En qué cuenta desea depositar? (C para córdobas, D para dólares): ");
                    char cuentaDeposito = scanner.next().toUpperCase().charAt(0);
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();

                    if (cuentaDeposito == 'C') {
                        saldoCordobas += montoDeposito;
                    } else if (cuentaDeposito == 'D') {
                        saldoDolares += montoDeposito;
                    } else {
                        System.out.println("Cuenta no válida.");
                    }
                    break;
                case 'R':
                    System.out.print("¿De qué cuenta desea retirar? (C para córdobas, D para dólares): ");
                    char cuentaRetiro = scanner.next().toUpperCase().charAt(0);
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();

                    if (cuentaRetiro == 'C') {
                        if (saldoCordobas >= montoRetiro) {
                            saldoCordobas -= montoRetiro;
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    } else if (cuentaRetiro == 'D') {
                        if (saldoDolares >= montoRetiro) {
                            saldoDolares -= montoRetiro;
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    } else {
                        System.out.println("Cuenta no válida.");
                    }
                    break;
                case 'S':
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            if (continuar) {
                System.out.print("¿Desea realizar otra transacción? (S para sí, cualquier tecla para salir): ");
                char otraTransaccion = scanner.next().toUpperCase().charAt(0);
                if (otraTransaccion != 'S') {
                    continuar = false;
                }
            }
        }

        System.out.println("Gracias por utilizar el ATM.");
        System.out.println("Saldo final - Córdobas: " + saldoCordobas + " / Dólares: " + saldoDolares);

        scanner.close();
    }
}
