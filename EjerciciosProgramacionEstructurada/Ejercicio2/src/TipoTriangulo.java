import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer lado del triángulo: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo lado del triángulo: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del tercer lado del triángulo: ");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("Es un triángulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Es un triángulo isósceles.");
            } else {
                System.out.println("Es un triángulo escaleno.");
            }
        } else {
            System.out.println("No es un triángulo válido.");
        }

        scanner.close();
    }
}
