import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres:");
        String cadena = s.nextLine();

        String cadenaAlReves = revertirCadena(cadena);
        System.out.println("La cadena al revés es: " + cadenaAlReves);
        s.close();
    }

    public static String revertirCadena(String cadena) {
        StringBuilder reversed = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            reversed.append(cadena.charAt(i));
        }
        return reversed.toString();
    }
}
