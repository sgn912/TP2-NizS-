package resol.NizS;

import java.util.Scanner;

public class Ejercicio8 {
    
    public static double kilometrosNormales(double litros) {
        return (litros / 8.0) * 100;
    }

    public static double kilometrosDesiguales(double litros) {
        double consumoAumentado = 8 * 1.15;
        return (litros / consumoAumentado) * 100;
    }

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de litros de combustible: ");
        double litros = scanner.nextDouble();

        double kmNormales = kilometrosNormales(litros);
        double kmDesiguales = kilometrosDesiguales(litros);

        System.out.printf("Puede recorrer %.2f km en carreteras normales.\n", kmNormales);
        System.out.printf("Puede recorrer %.2f km en carreteras desiguales.\n", kmDesiguales);
    }
}
