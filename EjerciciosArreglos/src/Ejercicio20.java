import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados = scanner.nextInt();
        
        String[] nombres = new String[numEmpleados];
        double[] sueldos = new double[numEmpleados];
        
        for (int i = 0; i < numEmpleados; i++) {
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombres[i] = scanner.next();
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
        }
        
        double maxSueldo = sueldos[0];
        int indiceMaxSueldo = 0;
        for (int i = 1; i < numEmpleados; i++) {
            if (sueldos[i] > maxSueldo) {
                maxSueldo = sueldos[i];
                indiceMaxSueldo = i;
            }
        }
        
        System.out.println("\nEmpleado con mayor sueldo:");
        System.out.println("Nombre: " + nombres[indiceMaxSueldo]);
        System.out.println("Sueldo: " + sueldos[indiceMaxSueldo]);
        
        scanner.close();
    }
}
