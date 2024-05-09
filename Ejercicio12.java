import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		int ano;
		Scanner s = new Scanner(System.in);
		
		System.out.println("ingrese el ano que desea averiguar si es bisiesto:");
		ano = s.nextInt();
		
        if (ano % 400 == 0) {
            System.out.println(ano + " es un año bisiesto.");
        } else if (ano % 100 == 0) {
            System.out.println(ano + " no es un año bisiesto.");
        } else if (ano % 4 == 0) {
            System.out.println(ano + " es un año bisiesto.");
        } else {
            System.out.println(ano + " no es un año bisiesto.");
        }

        s.close();
    }
}
