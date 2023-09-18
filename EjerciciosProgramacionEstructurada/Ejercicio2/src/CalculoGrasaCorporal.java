import java.util.Scanner;

public class CalculoGrasaCorporal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Es usted hombre o mujer? (H para hombre, M para mujer): ");
        char genero = scanner.next().toUpperCase().charAt(0);

        double pesoCorporal, medidaMuñeca, medidaCintura, medidaCadera, medidaAntebrazo;
        double grasaCorporal, porcentajeGrasa;

        if (genero == 'H') {
            System.out.print("Ingrese su peso corporal en libras: ");
            pesoCorporal = scanner.nextDouble();
            System.out.print("Ingrese su medida de cintura en pulgadas: ");
            medidaCintura = scanner.nextDouble();

            double a1 = (pesoCorporal * 1.082) + 94.42;
            double a2 = medidaCintura * 4.15;
            double b = a1 - a2;
            grasaCorporal = pesoCorporal - b;
            porcentajeGrasa = (grasaCorporal * 100) / pesoCorporal;
        } else if (genero == 'M') {
            System.out.print("Ingrese su peso corporal en libras: ");
            pesoCorporal = scanner.nextDouble();
            System.out.print("Ingrese su medida de muñeca en pulgadas: ");
            medidaMuñeca = scanner.nextDouble();
            System.out.print("Ingrese su medida de cintura en pulgadas: ");
            medidaCintura = scanner.nextDouble();
            System.out.print("Ingrese su medida de cadera en pulgadas: ");
            medidaCadera = scanner.nextDouble();
            System.out.print("Ingrese su medida de antebrazo en pulgadas: ");
            medidaAntebrazo = scanner.nextDouble();

            double a1 = (pesoCorporal * 0.732) + 8.987;
            double a2 = medidaMuñeca / 3.140;
            double a3 = medidaCintura * 0.157;
            double a4 = medidaCadera * 0.249;
            double a5 = medidaAntebrazo * 0.434;
            double b = a1 + a2 - a3 - a4 + a5;
            grasaCorporal = pesoCorporal - b;
            porcentajeGrasa = (grasaCorporal * 100) / pesoCorporal;
        } else {
            System.out.println("Género no válido.");
            scanner.close();
            return;
        }

        System.out.println("Grasa corporal: " + grasaCorporal + " libras");
        System.out.println("Porcentaje de grasa corporal: " + porcentajeGrasa + "%");

        scanner.close();
    }
}
