import java.util.Scanner;

public class DigitosYSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = scanner.nextInt();

        int numeroAbsoluto = Math.abs(numero);
        int sumaDigitos = 0;

        while (numeroAbsoluto > 0) {
            int digito = numeroAbsoluto % 10;
            System.out.print(digito + " ");
            sumaDigitos += digito;
            numeroAbsoluto /= 10;
        }

        System.out.println("\nLa suma de los dígitos es: " + sumaDigitos);

        scanner.close();
    }
}
