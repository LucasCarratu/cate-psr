import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese la dimensión del vector: ");
        int dimension = s.nextInt();

        int[] vector = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            System.out.print("Ingrese el número para la posición " + i + ": ");
            vector[i] = s.nextInt();
        }

        Arrays.sort(vector);

        System.out.println("Vector ordenado:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Índice " + i + ": " + vector[i]);
        }

        s.close();
    }
}
