import java .util.Scanner;
public class Ejerciocio_1 {
    public static void main(String[] args) {
        System.out.println("Hola");
        //BLOQUE DE CLARACIO DE VARIALES == DATOS DE ENTRADA Y SALIDA
        double baseTriangulo, altoTriangulo, areaTriangulo;
        Scanner teclado = new Scanner(System.in); //para leer desde consola
        //bloque de prosesamiento de datos de entrada 
        //areaTriangulo = baseTriangulo *
        System.out.print("Dme la base del triandulo");
        baseTriangulo = teclado.nextDouble();
        System.out.print("Dame el alto del triangulo");
        altoTriangulo = teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA LEIDOS
        areaTriangulo = (baseTriangulo * altoTriangulo) / 2;
        //BLOQUE DE SALIDA DE RESULTADO
        System.out.println("Area del t. -"+ areaTriangulo);
    }
}
        /***
         * Salida de resultado
         * run:
        * Hola
        * Dme la base del triandulo : 5
        * Dame el alto del triangulo : 6
        * Area del t. -15.0
         */