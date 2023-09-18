import java.util.Scanner;

public class EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el coeficiente de x^2 (a): ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el coeficiente de x (b): ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el termino constante (c): ");
        double c = scanner.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuacion tiene una sola raiz real (repetida): " + raiz);
        } else if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La ecuacion tiene dos raices reales: " + raiz1 + " y " + raiz2);
        } else {
            double parteReal = -b / (2 * a);
            double parteImaginaria = Math.sqrt(-discriminante) / (2 * a);
            System.out.println("La ecuacion tiene dos raices complejas: " + parteReal + " + " + parteImaginaria + "i y "
                    + parteReal + " - " + parteImaginaria + "i");
        }

        scanner.close();
    }
}
