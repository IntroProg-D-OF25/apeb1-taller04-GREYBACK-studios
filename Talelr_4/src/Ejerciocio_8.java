import java.util.Scanner;
public class Ejerciocio_8 {
    public static void main(String[] args) {
        int edad;
        double costoNetflix, costoYouTube, costoDropbox, costoSpotify,totalMensual, descuento = 0;
        Scanner teclado = new Scanner(System.in);    
        System.out.print("Ingrese el costo mensual de Netflix: ");
        costoNetflix = teclado.nextDouble();
        System.out.print("Ingrese el costo mensual de YouTube Premium: ");
        costoYouTube = teclado.nextDouble();
        System.out.print("Ingrese el costo mensual de Dropbox: ");
        costoDropbox = teclado.nextDouble();
        System.out.print("Ingrese el costo mensual de Spotify: ");
        costoSpotify = teclado.nextDouble();
        System.out.print("Ingrese la edad de la persona: ");
        edad = teclado.nextInt();
        totalMensual = costoNetflix + costoYouTube + costoDropbox + costoSpotify;
        if (edad < 30) {
            descuento = totalMensual * 0.20;
            totalMensual -= descuento;
        }
        if (descuento > 0) {
            System.out.println("Se ha aplicado un descuento de 20%: $" + descuento);
        }
        System.out.println("El valor total a pagar de los servicios digitales es: $" + totalMensual);
    }
}
/***
 * CON DESCUENTO
 * Ingrese el costo mensual de Netflix: 20
 * Ingrese el costo mensual de YouTube Premium: 15
 * Ingrese el costo mensual de Dropbox: 15
 * Ingrese el costo mensual de Spotify: 10
 * Ingrese la edad de la persona: 25
 * Se ha aplicado un descuento de 20%: $12.0
 * El valor total a pagar de los servicios digitales es: $48.0
 * ****************************************************************************************************************************
 * SIN DESCUENTO
 * Ingrese el costo mensual de Netflix: 20
 * Ingrese el costo mensual de YouTube Premium: 15
 * Ingrese el costo mensual de Dropbox: 15
 * Ingrese el costo mensual de Spotify: 10
 * Ingrese la edad de la persona: 45
 * El valor total a pagar de los servicios digitales es: $60.0
 */