import java.util.Scanner;

public class AdmisionDisco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese su género (M para masculino, F para femenino): ");
        String genero = scanner.next().toLowerCase(); // Convertir a minúsculas

        if (edad < 18) {
            System.out.println("Lo siento, no puede entrar.");
        } else {
            if (genero.equals("f") && edad >= 18) {
                if (edad >= 20) {
                    System.out.println("Bienvenida. Puede consumir bebidas alcohólicas.");
                } else {
                    System.out.println("Bienvenida. No puede consumir bebidas alcohólicas.");
                }
            } else if (genero.equals("m")) {
                System.out.print("¿Porta armas? (S para sí, N para no): ");
                String portaArmas = scanner.next().toLowerCase(); // Convertir a minúsculas
                if (portaArmas.equals("n")) {
                    if (edad >= 20) {
                        System.out.println("Bienvenido. Puede consumir bebidas alcohólicas.");
                    } else {
                        System.out.println("Bienvenido. No puede consumir bebidas alcohólicas.");
                    }
                } else {
                    System.out.println("Lo siento, no puede entrar.");
                }
            } else {
                System.out.println("Lo siento, no puede entrar.");
            }
        }

        scanner.close();
    }
}
