import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] arreglo1 = new int[10];
        
        System.out.println("Ingrese los 10 números enteros para llenar el arreglo:");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            arreglo1[i] = s.nextInt();
        }
        
        int[] arreglo2 = new int[5];
        
        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i] = arreglo1[5 + i];
        }
        
        System.out.println("\nArreglo resultante de la copia de los últimos 5 valores:");
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("Índice " + i + ": " + arreglo2[i]);
        }
        
        s.close();
    }
}
