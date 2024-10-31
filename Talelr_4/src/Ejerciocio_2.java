import java.util.Scanner;
public class Ejerciocio_2 {
    public static void main(String[] args) {
        //Bloque de declaracion de variables
        double gastoHijo1, GastoHijo2, GastoHijo3, TotalGastos;
        Scanner Teclado = new Scanner(System.in);
        //Bloque de Lectura de datos de entrada
        System.out.print("Dame los gastos del hijo 1");
        gastoHijo1 = Teclado.nextDouble();
        System.out.print("Dame los gastos del hijo 2");
        GastoHijo2 = Teclado.nextDouble();
        System.out.print("Dame los gastos del hijo 3");
        GastoHijo3 = Teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO
        TotalGastos = gastoHijo1 + GastoHijo2 + GastoHijo3;
        //Bloque de salida de resultado
        System.out.println("Gasto Total:" + TotalGastos);
    }
    }
/***
 * run:
 * Dame los gastos del hijo 1 10
 * Dame los gastos del hijo 2 20
 * Dame los gastos del hijo 3 70
 * Gasto Total:100.0
 */