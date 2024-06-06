import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[20];

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Consultar dato en una posición");
            System.out.println("2. Asignar dato en una posición");
            System.out.println("3. Modificar dato en una posición");
            System.out.println("4. Eliminar dato en una posición");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    consultarDato(vector);
                    break;
                case 2:
                    asignarDato(vector);
                    break;
                case 3:
                    modificarDato(vector);
                    break;
                case 4:
                    eliminarDato(vector);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void consultarDato(int[] vector) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición del vector a consultar: ");
        int posicion = scanner.nextInt();
        if (posicion >= 0 && posicion < vector.length) {
            System.out.println("Dato en la posición " + posicion + ": " + vector[posicion]);
        } else {
            System.out.println("Posición fuera de rango.");
        }
        scanner.close();
    }

    public static void asignarDato(int[] vector) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición del vector a asignar: ");
        int posicion = scanner.nextInt();
        if (posicion >= 0 && posicion < vector.length) {
            System.out.print("Ingrese el dato a asignar: ");
            int dato = scanner.nextInt();
            vector[posicion] = dato;
            System.out.println("Dato asignado correctamente.");
        } else {
            System.out.println("Posición fuera de rango.");
        }
        scanner.close();
    }

    public static void modificarDato(int[] vector) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición del vector a modificar: ");
        int posicion = scanner.nextInt();
        if (posicion >= 0 && posicion < vector.length) {
            System.out.print("Ingrese el nuevo dato: ");
            int dato = scanner.nextInt();
            vector[posicion] = dato;
            System.out.println("Dato modificado correctamente.");
        } else {
            System.out.println("Posición fuera de rango.");
        }
        scanner.close();
    }

    public static void eliminarDato(int[] vector) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición del vector a eliminar: ");
        int posicion = scanner.nextInt();
        if (posicion >= 0 && posicion < vector.length) {
            vector[posicion] = 0;
            System.out.println("Dato eliminado correctamente.");
        } else {
            System.out.println("Posición fuera de rango.");
        }
        scanner.close();
    }

}
