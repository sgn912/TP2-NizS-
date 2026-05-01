package resol.NizS;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ejercicio6 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (aaaa-mm-dd): ");
        LocalDate nacimiento = LocalDate.parse(sc.nextLine());
        LocalDate hoy = LocalDate.now();

        LocalDate proximoCumple = nacimiento.withYear(hoy.getYear());
        if (proximoCumple.isBefore(hoy) || proximoCumple.equals(hoy)) {
            proximoCumple = proximoCumple.plusYears(1);
        }

        Period periodo = Period.between(hoy, proximoCumple);
        System.out.println("Faltan " + periodo.getMonths() + " meses y " + periodo.getDays() + " días para tu próximo cumpleaños.");
    }
}
