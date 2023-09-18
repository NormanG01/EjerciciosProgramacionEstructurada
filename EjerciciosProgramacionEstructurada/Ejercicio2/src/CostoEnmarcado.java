import java.util.Scanner;

public class CostoEnmarcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud de la fotografía en pulgadas: ");
        double longitud = scanner.nextDouble();

        System.out.print("Ingrese el ancho de la fotografía en pulgadas: ");
        double ancho = scanner.nextDouble();

        System.out.print("Tipo de marco (regular o lujoso): ");
        String tipoMarco = scanner.next().toLowerCase();

        System.out.print("Color del marco: ");
        String colorMarco = scanner.next();

        System.out.print("¿Desea agregar coronas? (Sí o No): ");
        String agregarCoronas = scanner.next().toLowerCase();

        double costoMarco;
        if (tipoMarco.equals("regular")) {
            costoMarco = 0.15;
        } else if (tipoMarco.equals("lujoso")) {
            costoMarco = 0.25;
        } else {
            System.out.println("Tipo de marco no válido.");
            scanner.close();
            return;
        }

        double costoPintura = (longitud + ancho) * 0.10;
        double costoCarton = longitud * ancho * 0.02;
        double costoVidrio = longitud * ancho * 0.07;
        double costoCoronas = agregarCoronas.equals("sí") ? 0.35 : 0;

        double costoTotal = costoMarco + costoPintura + costoCarton + costoVidrio + costoCoronas;

        System.out.println("Costo de enmarcar la fotografía: U$" + costoTotal);

        scanner.close();
    }
}
