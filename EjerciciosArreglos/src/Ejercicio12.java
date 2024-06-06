import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una cadena para verificar si es un palíndromo:");
        String cadena = s.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
            
            s.close();
        }
    }

    public static boolean esPalindromo(String cadena) {
        cadena = cadena.toLowerCase().replaceAll("\\s+", "");
        int i = 0;
        int j = cadena.length() - 1;
        while (i < j) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
