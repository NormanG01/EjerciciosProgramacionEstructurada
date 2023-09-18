import java.util.Scanner;

public class OperacionesNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero (menor): ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero (mayor): ");
        int num2 = scanner.nextInt();

        int sumaPares = 0;
        int sumaCuadradosImpares = 0;

        System.out.println("Numeros impares entre " + num1 + " y " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sumaCuadradosImpares += i * i;
            } else {
                sumaPares += i;
            }
        }
        System.out.println("\nSuma de numeros pares: " + sumaPares);
        System.out.println("Cuadrados de numeros impares: " + sumaCuadradosImpares);

        System.out.println("Numeros perfectos entre " + num1 + " y " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            if (esNumeroPerfecto(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNumeros primos entre " + num1 + " y " + num2 + ":");
        for (int i = num1; i <= num2; i++) {
            if (esNumeroPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Función para verificar si un número es perfecto
    public static boolean esNumeroPerfecto(int num) {
        int sumaDivisores = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == num;
    }

    // Función para verificar si un número es primo
    public static boolean esNumeroPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
