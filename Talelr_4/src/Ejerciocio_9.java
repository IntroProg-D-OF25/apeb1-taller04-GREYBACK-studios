import java.util.Scanner; 
public class Ejerciocio_9 {
    public static void main(String[] args) {
        double areatriagRectangulo, baseCuadrado, alturaRect, areaTotal;
        Scanner teclado = new Scanner(System.in); 
        System.out.print("Ingrese valores para la base del cuadrado: "); 
        baseCuadrado = teclado.nextDouble();
        System.out.print("Ingrese valores para la altura del rectangulo: "); 
        alturaRect = teclado.nextDouble();
        areatriagRectangulo = ((baseCuadrado * alturaRect)* 3); 
        baseCuadrado = ( baseCuadrado * baseCuadrado); 
        alturaRect = (baseCuadrado * alturaRect); 
        areaTotal = (areatriagRectangulo + baseCuadrado + alturaRect); 
        System.out.println("El area total es: " + areaTotal);
    }
}
/***
 * Ingrese valores para la base del cuadrado: 4
 * Ingrese valores para la altura del rectangulo: 6
 * El area total es: 184.0
 */