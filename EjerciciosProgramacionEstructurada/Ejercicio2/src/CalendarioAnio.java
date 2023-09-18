public class CalendarioAnio {
    public static void main(String[] args) {
        int year = 1994;

        while (year <= 1999) {
            System.out.println("Calendario para el año " + year);
            for (int month = 1; month <= 12; month++) {
                System.out.println("Mes " + month);
                System.out.println("Lun Mar Mie Jue Vie Sab Dom");
                // Lógica para mostrar los días de la semana en el calendario
                // Aquí deberías agregar la lógica para los días de cada mes
                System.out.println();
            }
            System.out.println();
            year++;
        }
    }
}
