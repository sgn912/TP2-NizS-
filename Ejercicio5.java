package resol.NizS;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Ejercicio5 {
    public static void ejecutar() {
        LocalDateTime ahora = LocalDateTime.now();
        LocalDateTime examen = LocalDateTime.of(2026, 6, 26, 19, 20);
        
        Duration duracion = Duration.between(ahora, examen);
        long dias = ChronoUnit.DAYS.between(ahora.toLocalDate(), examen.toLocalDate());
        long horas = duracion.toHours() % 24;
        long minutos = duracion.toMinutes() % 60;

        System.out.println("Faltan " + dias + " días, " + horas + " horas y " + minutos + " minutos para el examen.");

        // Asumiendo clases lunes y jueves
        long clases = 0;
        LocalDate fecha = ahora.toLocalDate();
        while (!fecha.isAfter(examen.toLocalDate())) {
            DayOfWeek dia = fecha.getDayOfWeek();
            if (dia == DayOfWeek.MONDAY || dia == DayOfWeek.THURSDAY) {
                clases++;
            }
            fecha = fecha.plusDays(1);
        }

        System.out.println("Tendremos " + clases + " clases hasta el examen.");
    }
}
