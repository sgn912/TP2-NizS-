package resol.NizS;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Ejercicio1 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera fecha y hora (aaaa-mm-ddTHH:MM): ");
        LocalDateTime fecha1 = LocalDateTime.parse(sc.nextLine());

        System.out.println("Ingrese la segunda fecha y hora (aaaa-mm-ddTHH:MM): ");
        LocalDateTime fecha2 = LocalDateTime.parse(sc.nextLine());

        if (fecha1.isAfter(fecha2)) {
            System.out.println("La primera fecha es mayor.");
        } else if (fecha1.isBefore(fecha2)) {
            System.out.println("La segunda fecha es mayor.");
        } else {
            System.out.println("Ambas fechas son iguales.");
        }
    }
}
