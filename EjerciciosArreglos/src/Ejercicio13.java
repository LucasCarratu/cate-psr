public class Ejercicio13 {
    public static void main(String[] args) {
        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        System.out.println("Números pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();

        System.out.println("Números impares:");
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }
    }
}
