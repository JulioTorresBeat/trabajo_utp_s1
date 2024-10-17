/**
Programa para determinar el sueldo más alto y más bajo
 */
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        //declarar variables
        int nemp;
        double sueldo,smax,smin;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresa la cantidad de empleados: ");
        nemp = lectura.nextInt();
        //proceso de datos
        if (nemp <= 0) {
            System.out.println("No se ingresaron empleados.");
            return;
        }
        System.out.print("Ingresa el sueldo del empleado 1: ");
        sueldo = lectura.nextDouble();
        smax = sueldo;
        smin = sueldo;
        for (int i = 2; i <= nemp; i++) {
            System.out.print("Ingresa el sueldo del empleado " + i + ": ");
            sueldo = lectura.nextDouble();
            if (sueldo > smax) {
                smax = sueldo;
            }
            if (sueldo < smin) {
                smin = sueldo;
            }
        }
        //salida de datos
        System.out.println("El sueldo mas alto es: " + smax);
        System.out.println("El sueldo mas bajo es: " + smin);
    }
}

