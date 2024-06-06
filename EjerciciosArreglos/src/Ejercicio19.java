import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = s.nextInt();
        
        double[] notas = new double[numAlumnos];
        
        System.out.println("Ingrese las notas de los " + numAlumnos + " alumnos:");
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = s.nextDouble();
        }
        
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double promedio = suma / numAlumnos;
        
        System.out.println("\nAlumnos con notas por encima del promedio (" + promedio + "):");
        for (int i = 0; i < numAlumnos; i++) {
            if (notas[i] > promedio) {
                System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
            }
        }
        
        s.close();
    }
}
