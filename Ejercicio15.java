import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de segundos: ");
        int segundos = s.nextInt();

        if (segundos > 0) {
            int horas = segundos / 3600;
            int minutos = (segundos % 3600) / 60;
            int segundosRestantes = segundos % 60;

            System.out.println("El número de horas, minutos y segundos contenidos en " + segundos + " segundos es:");
            System.out.println(horas + " horas, " + minutos + " minutos y " + segundosRestantes + " segundos.");
        } else {
            System.out.println("El número de segundos debe ser mayor a cero.");
        }

        s.close();
    }
}
