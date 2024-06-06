public class Ejercicio3 {

    public static void main(String[] args) {
        int[] numerosPares = new int[50];

        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = (i + 1) * 2;
        }

        System.out.println("Valores del arreglo con sus índices:");
        for (int i = 0; i < numerosPares.length; i++) {
            System.out.println("Índice " + i + ": " + numerosPares[i]);
        }
    }
}