import java.util.Scanner;
public class Ejerciocio_4 {
    public static void main(String[] args) {
        int minutos_mes;
        double costo_minuto, valor_Total;
        Scanner Teclado = new Scanner (System.in); 
        System.out.print("ingresar el costo por minuto");
        costo_minuto = Teclado.nextDouble ();
        System.out.print("ingresar el numero de minutos por mes");
        minutos_mes = Teclado.nextInt();
        valor_Total = minutos_mes * costo_minuto;
        System.out.println("el valor de la planilla del telefon por mes es: "+ valor_Total);
    }
}
/***
 * ingresar el costo por minuto 2,50
 * ingresar el numero de minutos por mes 35
 * el valor de la planilla del telefon por mes es: 87.5
 */