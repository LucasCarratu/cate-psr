import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        System.out.println("Ingrese 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = s.nextInt();
            suma += numeros[i];
        }
        
        double promedio = suma / 5.0;
        System.out.println("El promedio es: " + promedio);
        
        s.close();
    }
    
}
