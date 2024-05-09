import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		int i;
		int n;
		int acum = 1;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Ingrese un numero N para calcular el factorial:");
		n = s.nextInt();
		
		for (i=1; i<n+1; i++) {
			acum = acum * i;
		}
		System.out.print("resultado: " + acum);

		s.close();
	}

}
