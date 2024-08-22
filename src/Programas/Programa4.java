
package Programas;
import java.util.Scanner;

public class Programa4 {
    

    public static void main(String[] args) {
        //declarar variable
        String nombreempleado, cargoempleado;
        double ingresom, gastom, ahorromen, ahorrobi, ahorrosem, ahorroan;
        
        //creando el objeto lectura
    Scanner lectura = new Scanner (System.in);
    
        //Declarar variables
        System.out.print("Nombre del empleado: ");
        nombreempleado=lectura.next();
        
        System.out.print("Cargo del empleado:");
        cargoempleado=lectura.next();
        
        System.out.print("Ingreso mensual:");
        ingresom=lectura.nextDouble();
        
        System.out.print("Gasto mensual: ");
        gastom=lectura.nextDouble();
        
        //Operaciones
       ahorromen=ingresom-gastom;
       ahorrobi=ahorromen*2;
       ahorrosem=ahorromen*6;
       ahorroan=ahorrosem*2;
       
       //Salida de datos
       System.out.println("Ahorro mensual: "+ahorromen);
       System.out.println("Ahorro bimestral: "+ahorrobi);
       System.out.println("Ahorro semestral: "+ahorrosem);
       System.out.println("Ahorro anual : "+ahorroan);
       
       // // Cerrar el objeto Scanner
        lectura.close();
       
    }
   
}
