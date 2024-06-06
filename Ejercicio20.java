import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de variedades de artículos vendidos: ");
        int cantidadVariedades = s.nextInt();

        double totalPagar = 0;

        System.out.println("Ingrese los datos de cada variedad de artículo:");

        for (int i = 1; i <= cantidadVariedades; i++) {
            System.out.println("Variedad " + i + ":");
            System.out.print("Ingrese el número de artículo: ");
            int numeroArticulo = s.nextInt();
            System.out.print("Ingrese la cantidad vendida: ");
            int cantidad = s.nextInt();
            System.out.print("Ingrese el precio unitario: ");
            double precioUnitario = s.nextDouble();

            double subtotal = cantidad * precioUnitario;
            totalPagar += subtotal;

            System.out.println("\nDetalle de factura:");
            System.out.println("Número de artículo: " + numeroArticulo);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Precio unitario: " + precioUnitario);
            System.out.println("Subtotal: " + subtotal + "\n");
        }

        System.out.println("Total a pagar: " + totalPagar);

        s.close();
    }
}
