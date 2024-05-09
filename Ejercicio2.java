import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int numero;
        int sumaDigitos = 0;
        
        do {
            System.out.println("Ingrese un número de 5 dígitos:");
            numero = s.nextInt();
            
            if (numero < 10000 || numero > 99999) {
                System.out.println("Error: El número debe tener exactamente 5 dígitos.");
            }
        } while (numero < 10000 || numero > 99999);
        int digito;
        int numeroTemporal = numero;
        while (numeroTemporal > 0) {
            digito = numeroTemporal % 10;
            sumaDigitos += digito;
            numeroTemporal /= 10;
        }
        
        System.out.println("La suma de los dígitos es: " + sumaDigitos);
 
       
        s.close();
    }

}