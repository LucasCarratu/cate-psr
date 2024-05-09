
public class Ejercicio6 {

	public static void main(String[] args) {
		int i;
		long poblacion = 7309784505L;
		long crecimiento = 24807909L;

		for (i=1; i<6; i++) {
			poblacion = poblacion + crecimiento;
			System.out.println("luego de " + i + " año de crecimiento poblacional, la tierra tendra " + poblacion + " habitantes");

		}
	}

}
