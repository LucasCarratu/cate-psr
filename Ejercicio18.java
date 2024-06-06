import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = s.nextInt();

        String binario = convertirABinario(numero);

        System.out.println("El número " + numero + " en binario es: " + binario);

        s.close();
    }

    public static String convertirABinario(int numero) {
        if (numero == 0) {
            return "0"; 
        }
        StringBuilder resultado = new StringBuilder();
        while (numero > 0) {
            int residuo = numero % 2;
            resultado.insert(0, residuo);
            numero /= 2; 
        }
        return resultado.toString();
    }
}
