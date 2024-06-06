import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] arregloOriginal = new int[5];
        for (int i = 0; i < arregloOriginal.length; i++) {
            arregloOriginal[i] = i + 1;
        }

        int[] copiaArreglo = new int[arregloOriginal.length];
        for (int i = 0; i < arregloOriginal.length; i++) {
            copiaArreglo[i] = arregloOriginal[i];
        }

        System.out.println("Arreglo original:");
        for (int i = 0; i < arregloOriginal.length; i++) {
            System.out.println("Índice " + i + ": " + arregloOriginal[i]);
        }

        System.out.println("Copia del arreglo:");
        for (int i = 0; i < copiaArreglo.length; i++) {
            System.out.println("Índice " + i + ": " + copiaArreglo[i]);
        }

        s.close();
    }
}
