public class Ejercicio4 {

    public static void main(String[] args) {
        int[] numerosDivisiblesPor3 = new int[34];

        for (int i = 0, num = 0; num <= 100; num++) {
            if (num % 3 == 0) {
                numerosDivisiblesPor3[i] = num;
                i++;
            }
        }

        System.out.println("Valores del arreglo con sus índices:");
        for (int i = 0; i < numerosDivisiblesPor3.length; i++) {
            System.out.println("Índice " + i + ": " + numerosDivisiblesPor3[i]);
        }
    }
}