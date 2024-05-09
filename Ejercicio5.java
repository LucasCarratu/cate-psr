
public class Ejercicio5 {

    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 1;
        
        System.out.println("Los primeros 20 números de la sucesión de Fibonacci son:");
        System.out.print(x1 + " " + x2 + " ");
     
        for (int i = 3; i<21; i++) {
            int xn = x1 + x2;
            System.out.print(xn + " ");
            x1 = x2;
            x2 = xn;
        }
    }
}
