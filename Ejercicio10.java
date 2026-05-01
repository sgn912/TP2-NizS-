package resol.NizS;

import java.util.Scanner;

public class Ejercicio10 {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        final int TAM = 10;
        String[] alumnos = new String[TAM];
        double[] notas = new double[TAM];
        String[] resultados = new String[TAM];

        for (int i = 0; i < TAM; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.nextLine();
        }

        for (int i = 0; i < TAM; i++) {
            double nota;
            do {
                System.out.print("Ingrese la nota de " + alumnos[i] + " (0 a 10): ");
                nota = scanner.nextDouble();
            } while (nota < 0 || nota > 10);
            notas[i] = nota;
        }

        for (int i = 0; i < TAM; i++) {
            resultados[i] = calificar(notas[i]);
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < TAM; i++) {
            System.out.printf("%s - Nota: %.2f - Resultado: %s\n", alumnos[i], notas[i], resultados[i]);
        }
    }

    public static String calificar(double nota) {
        if (nota < 5) return "Suspenso";
        if (nota < 7) return "Bien";
        if (nota < 9) return "Notable";
        return "Sobresaliente";
    }
}
