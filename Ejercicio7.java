package resol.NizS;

import java.util.Scanner;

public class Ejercicio7 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número para el triángulo: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
