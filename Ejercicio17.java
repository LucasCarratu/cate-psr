import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese los valores de a, b y c:");
        System.out.print("a: ");
        double a = s.nextDouble();
        System.out.print("b: ");
        double b = s.nextDouble();
        System.out.print("c: ");
        double c = s.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las raices de la ecuacion son: " + raiz1 + " y " + raiz2);
        } else if (discriminante == 0) {
            double raiz = -b / (2 * a);
            System.out.println("La ecuacion tiene una raiz doble: " + raiz);
        } else {
            System.out.println("La ecuacion no tiene raices reales.");
        }

        s.close();
    }
}
