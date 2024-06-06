public class Ejercicio9 {
    public static void main(String[] args) {
        int[] primos = new int[25];
        int cantidadPrimos = 0;

        for (int numero = 2; numero <= 100; numero++) {
            if (esPrimo(numero)) {
                primos[cantidadPrimos] = numero;
                cantidadPrimos++;
            }
        }

        for (int i = 0; i < cantidadPrimos; i++) {
            System.out.println("Índice: " + i + ", Valor: " + primos[i]);
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
