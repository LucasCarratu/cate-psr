import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		int prestamo;
		int interes;
		int mensual;
		
		System.out.println("Ingrese el prestamo deseado:");
		prestamo = s.nextInt();
		
		System.out.println("Ingrese el % de interes anual que tendrá:");
		interes = s1.nextInt();
		
		System.out.println("Ingrese el valor que desea abonar por mes:");
		mensual = s2.nextInt();
		
		
		
		
		
		s.close();
		s1.close();
		s2.close();
	}

}
