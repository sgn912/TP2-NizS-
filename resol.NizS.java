package resolNizS;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== TP2 ===");
        System.out.println("1 - Mayor fecha");
        System.out.println("2 - Dias desde tu nacimiento");
        System.out.println("3 - Actividad");
        System.out.println("4 - Dia de nacimiento");
        System.out.println("5 - Parcial");
        System.out.println("6 - ¿Cuando es tu cumple?");
        System.out.println("7 - Triangulo de asteriscos");
        System.out.println("8 - Combustible");
        System.out.println("9 - Cuenta billetes");
        System.out.println("10 - Array calificaciones");
        System.out.print("Elija una opcion: ");

        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        switch (opcion) {
            case 1 -> Ejercicio1.ejecutar(args);
            case 2 -> Ejercicio2.ejecutar(args);
            case 3 -> Ejercicio3.ejecutar();
            case 4 -> Ejercicio4.ejecutar();
            case 5 -> Ejercicio5.ejecutar();
            case 6 -> Ejercicio6.ejecutar();
            case 7 -> Ejercicio7.ejecutar();
            case 8 -> Ejercicio8.ejecutar();
            case 9 -> Ejercicio9.ejecutar();
            case 10 -> Ejercicio10.ejecutar();
            default -> System.out.println("Opción inválida");
        }
    }
}
