import java.util.Scanner;
public class Ejerciocio_6 {
    public static void main(String[] args) {
        int Numero_Pagos = 12;
        double Monton_Prestamo, Interes_Mensual, Pago_Mensual;
        Scanner Teclado = new Scanner (System.in);
        System.out.print("Ingre el monto del prestamo");
        Monton_Prestamo = Teclado.nextDouble();
        System.out.print("ingrese el interes mensual %");
        Interes_Mensual = Teclado.nextDouble() /100;
        Pago_Mensual = (Monton_Prestamo * Interes_Mensual) / (1 - Math.pow(1 + Interes_Mensual, -Numero_Pagos));
        System.out.println("el pago mensual del prestamo es de: " + Pago_Mensual);
    }
}
/***
 * Lic este ejercio lo vi en youtube se me hizo mas complicado que los demas xD
 * Ingre el monto del prestamo 400
 * ingrese el interes mensual % 6
 * el pago mensual del prestamo es de: 47.71081175226542
 */