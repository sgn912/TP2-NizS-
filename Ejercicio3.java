package resol.NizS;

import java.time.LocalTime;
import java.time.Duration;

public class Ejercicio3 {
    public static void ejecutar() {
        LocalTime inicio = LocalTime.of(7, 0);
        LocalTime fin = LocalTime.of(15, 0);

        Duration duracion = Duration.between(inicio, fin);
        System.out.println("La jornada dura " + duracion.toMinutes() + " minutos.");
    }
}
