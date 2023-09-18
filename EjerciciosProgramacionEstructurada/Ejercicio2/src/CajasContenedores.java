import java.util.Scanner;

public class CajasContenedores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número total de rosquillas: ");
        int numRosquillas = scanner.nextInt();

        int rosquillasPorCaja = 24;
        int cajasPorContenedor = 75;

        int cajasNecesarias = numRosquillas / rosquillasPorCaja;
        int rosquillasSobrantes = numRosquillas % rosquillasPorCaja;
        int contenedoresNecesarios = cajasNecesarias / cajasPorContenedor;
        int cajasSobrantes = cajasNecesarias % cajasPorContenedor;

        System.out.println("Número de rosquillas: " + numRosquillas);
        System.out.println("Número de cajas necesarias: " + cajasNecesarias);
        System.out.println("Número de contenedores necesarios: " + contenedoresNecesarios);
        System.out.println("Rosquillas sobrantes: " + rosquillasSobrantes);
        System.out.println("Cajas sobrantes: " + cajasSobrantes);

        scanner.close();
    }
}
