package resol.NizS;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento (aaaa-mm-dd): ");
        LocalDate nacimiento = LocalDate.parse(sc.nextLine());
        LocalDate hoy = LocalDate.now();

        int dias = 0;
        LocalDate temp = nacimiento;

        while (temp.isBefore(hoy)) {
            temp = temp.plusDays(1);
            dias++;
        }

        System.out.println("Han pasado " + dias + " días desde tu nacimiento.");
    }
}
