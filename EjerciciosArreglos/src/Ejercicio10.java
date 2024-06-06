import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String texto = s.nextLine();

        int contadorVocales = contarVocales(texto);
        System.out.println("El número de vocales en la cadena es: " + contadorVocales);
        s.close();
    }

    public static int contarVocales(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                contador++;
            }
        }
        return contador;
    }
}
