import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Ingrese la fecha (dd mm aaaa): ");
        int dia = s.nextInt();
        int mes = s.nextInt();
        int ano = s.nextInt();

        if (esFechaValida(dia, mes, ano)) {
            String fechaEnTexto = obtenerFechaEnTexto(dia, mes, ano);

            System.out.println("La fecha en texto es: " + fechaEnTexto);
        } else {
            System.out.println("La fecha ingresada es inválida.");
        }

        s.close();
    }

    public static boolean esFechaValida(int dia, int mes, int ano) {
        return (dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (ano >= 0 && ano <= 9999);
    }

    public static String obtenerFechaEnTexto(int dia, int mes, int ano) {
        String[] nombresMeses = {
            "", "enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
        };

        String fechaEnTexto = dia + " de " + nombresMeses[mes] + " de " + ano;
        return fechaEnTexto;
    }
}
