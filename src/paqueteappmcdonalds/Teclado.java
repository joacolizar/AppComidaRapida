package paqueteappmcdonalds;

import java.util.Scanner;

public class Teclado {

    private static final Scanner in = new Scanner(System.in);

    public static String leerTexto(String mensaje) {
        System.out.println(mensaje);
        return in.nextLine();
    }

    public static int leerEntero(String mensaje) {
        while (true) {
            System.out.println(mensaje);
            try {
                return Integer.parseInt(in.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido");
            }
        }

    }
    public static int leerOpcion(String mensaje, int min, int max) {
        int opcion;
        do {
            opcion = leerEntero(mensaje);
            if (opcion < min || opcion > max)
                System.out.println("Opción inválida. Debe estar entre " + min + " y " + max + ".");
        } while (opcion < min || opcion > max);
        return opcion;
    }
}
