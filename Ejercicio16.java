import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese la hora en formato hh:mm:ss: ");
        String horaStr = s.nextLine();

        System.out.print("Ingrese la cantidad de segundos: ");
        int segundos = s.nextInt();

        if (esHoraValida(horaStr)) {
            String[] partesHora = horaStr.split(":");
            int horas = Integer.parseInt(partesHora[0]);
            int minutos = Integer.parseInt(partesHora[1]);
            int segundosActuales = Integer.parseInt(partesHora[2]);

            segundosActuales += segundos;

            minutos += segundosActuales / 60;
            segundosActuales %= 60;
            horas += minutos / 60;
            minutos %= 60;
            horas %= 24; 

            System.out.println("El tiempo después de " + segundos + " segundos será: " + formatearHora(horas, minutos, segundosActuales));
        } else {
            System.out.println("La hora ingresada no es válida.");
        }

        s.close();
    }

    public static boolean esHoraValida(String horaStr) {
        return horaStr.matches("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$");
    }

    public static String formatearHora(int horas, int minutos, int segundos) {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
