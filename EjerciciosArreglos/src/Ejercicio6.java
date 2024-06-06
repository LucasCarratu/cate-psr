public class Ejercicio6 {
    public static void main(String[] args) {
        int[] numerosPares = new int[20];
        int suma = 0;
        int par = 2;

        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = par;
            suma += numerosPares[i];
            par += 2;
        }

        System.out.println("Los primeros 20 números pares son:");
        for (int i = 0; i < numerosPares.length; i++) {
            System.out.println("Índice " + i + ": " + numerosPares[i]);
        }

        System.out.println("La suma de los primeros 20 números pares es: " + suma);
    }
}
