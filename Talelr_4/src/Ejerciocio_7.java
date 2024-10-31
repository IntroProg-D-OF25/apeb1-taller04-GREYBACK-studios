import java.util.Scanner;
public class Ejerciocio_7 {
    public static void main(String[] args) {
        int edad;
        double costoPorKilovatio, kilovatiosConsumidos, valorPlanilla, descuento = 0;
        Scanner Teclado = new Scanner (System.in);
       System.out.print("Ingrese el costo por kilovatio/hora: ");
        costoPorKilovatio = Teclado.nextDouble();
        System.out.print("Ingrese el número de kilovatios consumidos en el mes: ");
        kilovatiosConsumidos = Teclado.nextDouble();
        System.out.print("Ingrese la edad del usuario: ");
        edad = Teclado.nextInt();
        valorPlanilla = costoPorKilovatio * kilovatiosConsumidos;
        if (edad > 65) {
            descuento = valorPlanilla * 0.10;
            valorPlanilla -= descuento;
        }
        if (descuento > 0) {
            System.out.println("Se ha aplicado un descuento de 10%: $" + descuento);
        }
        System.out.println("El valor a cancelar de la planilla de luz es: $" + valorPlanilla);
    }
}
/***
 * Licen este codigo me guie con youtube por que no me queria salir el descuento xD
 * CON DESCUENTO
 * Ingrese el costo por kilovatio/hora: 5
 * Ingrese el número de kilovatios consumidos en el mes: 120
 * Ingrese la edad del usuario: 75
 * Se ha aplicado un descuento de 10%: $60.0
 * El valor a cancelar de la planilla de luz es: $540.0
 ******************************************************
 * CON DESCUENTO
 * Ingrese el costo por kilovatio/hora: 5
 * Ingrese el número de kilovatios consumidos en el mes: 120
 * Ingrese la edad del usuario: 25
 * El valor a cancelar de la planilla de luz es: $600.0
 */