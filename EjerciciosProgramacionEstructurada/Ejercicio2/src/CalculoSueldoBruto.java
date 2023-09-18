import java.util.Scanner;

public class CalculoSueldoBruto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroEmpleados = 3;
        double tarifaNormal = 0.0;
        double tarifaExtra = 0.0;

        // Solicitar las tarifas normales y extra
        System.out.print("Ingrese la tarifa por horas normales: ");
        tarifaNormal = scanner.nextDouble();

        System.out.print("Ingrese la tarifa por horas extra: ");
        tarifaExtra = scanner.nextDouble();

        for (int i = 1; i <= numeroEmpleados; i++) {
            System.out.println("Empleado #" + i);
            System.out.print("Ingrese el número de horas trabajadas: ");
            int horasTrabajadas = scanner.nextInt();

            double sueldoBruto = calcularSueldoBruto(horasTrabajadas, tarifaNormal, tarifaExtra);

            System.out.println("Sueldo bruto del empleado #" + i + ": C$" + sueldoBruto);
        }

        scanner.close();
    }

    // Función para calcular el sueldo bruto
    public static double calcularSueldoBruto(int horasTrabajadas, double tarifaNormal, double tarifaExtra) {
        int horasNormales = Math.min(horasTrabajadas, 40);
        int horasExtras = Math.max(horasTrabajadas - 40, 0);

        double sueldoBruto = (horasNormales * tarifaNormal) + (horasExtras * tarifaExtra);

        return sueldoBruto;
    }
}
