package resol.NizS;

import java.util.Scanner;

public class Ejercicio9 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto total: ");
        int monto = scanner.nextInt();

        int[] billetes = {20000, 10000, 1000, 500, 200, 100, 50, 20, 10};
        int[] cantidad = new int[billetes.length];

        for (int i = 0; i < billetes.length; i++) {
            cantidad[i] = monto / billetes[i];
            monto %= billetes[i];
        }

        System.out.println("Cantidad de billetes necesarios:");
        for (int i = 0; i < billetes.length; i++) {
            if (cantidad[i] > 0) {
                System.out.println("$" + billetes[i] + ": " + cantidad[i]);
            }
        }
    }
}
