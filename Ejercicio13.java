import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = s.nextInt();

        boolean esCapicua = esCapicua(numero);

        if (esCapicua) {
            System.out.println("El número " + numero + " es capicúa.");
        } else {
            System.out.println("El número " + numero + " no es capicúa.");
        }

        s.close();
    }

    public static boolean esCapicua(int numero) {
        int numeroRevertido = 0;
        int numeroOriginal = numero;

        while (numero > 0) {
            int digito = numero % 10;
            numeroRevertido = numeroRevertido * 10 + digito;
            numero /= 10;
        }
        return numeroOriginal == numeroRevertido;
    }
}