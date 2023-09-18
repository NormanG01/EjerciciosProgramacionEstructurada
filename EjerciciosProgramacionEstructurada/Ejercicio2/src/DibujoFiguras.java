import java.util.Scanner;

public class DibujoFiguras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la figura que desea dibujar:");
        System.out.println("1. Triángulo rectángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la altura del triángulo rectángulo: ");
                int altura = scanner.nextInt();
                for (int i = 1; i <= altura; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.print("Ingrese el lado del cuadrado: ");
                int lado = scanner.nextInt();
                for (int i = 1; i <= lado; i++) {
                    for (int j = 1; j <= lado; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("Ingrese el radio del círculo: ");
                int radio = scanner.nextInt();
                for (int i = -radio; i <= radio; i++) {
                    for (int j = -radio; j <= radio; j++) {
                        if (i * i + j * j <= radio * radio) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
