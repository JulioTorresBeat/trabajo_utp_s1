
package Programas;
import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        //declarar variables
        String empleado;
        double ingreso,gasto,ahorrom,ahorroa;
        //creando el objeto lectura
        Scanner lectura= new Scanner(System.in);
        //Entrada de datos
        System.out.print("Nombre del emplead: ");
        empleado=lectura.next();
        System.out.print("Ingresos del empleado: ");
        ingreso=lectura.nextDouble();
        System.out.print ("Gastos del empleado: ");
        gasto=lectura.nextDouble();
        //proceso de datos
        ahorrom=ingreso-gasto;
        ahorroa=ahorrom*12;
        //salida de datos
        System.out.println("Ahorro mensual: "+ahorrom);
        System.out.println("Ahorro anual. "+ahorroa);
    }
    
}
