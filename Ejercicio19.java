import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double vel;
		
		System.out.println("Ingrese la velocidad que se desea convertir:");
		vel = s.nextInt();
		
		vel = vel/3.6;
		
		System.out.println("El resultado es "+ vel +"m/s");
		
		s.close();
	}

}