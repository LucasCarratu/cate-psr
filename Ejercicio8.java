import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		float pi = 3.14159f;
		float circunferencia;
		int radio;
		float diametro;
		float area;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese el radio de su circunferencia:");
		radio = s.nextInt();
		
		diametro = 2 * radio;
		circunferencia = 2 * (pi * radio);
		area = pi * (radio * radio);
		
		System.out.println("El diametro de su circunferencia es " + diametro + ", la circunferencia es "+ circunferencia + " y el area es "+ area);
		
		s.close();
	}

}
