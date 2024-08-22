
package Programas;
import java.util.Scanner;


public class Programa3 {
   
    public static void main(String[] args) {
    //declarar variable
    double sueldo1,sueldo2,sueldo3,sueldo4,sueldo5;
    double totalsueldos,promediosueldos;
    
    //creando el objeto lectura
    Scanner lectura = new Scanner (System.in);
    
    //Declara variables
    System.out.print("Ingrese el sueldo 1: ");
    sueldo1=lectura.nextDouble();
    
    System.out.print("Ingrese el sueldo 2: ");
    sueldo2=lectura.nextDouble();
    
    System.out.print("Ingrese el sueldo 3: ");
    sueldo3=lectura.nextDouble();
    
    System.out.print("Ingrese el sueldo 4: ");
    sueldo4=lectura.nextDouble();
    
    System.out.print("Ingrese el sueldo 5: ");
    sueldo5=lectura.nextDouble();
            
    //Operaciones
    totalsueldos=sueldo1+sueldo2+sueldo3+sueldo4+sueldo5;
    promediosueldos=totalsueldos/5;
    
    //salida de datos
    System.out.println("--Detalle de sueldos--");
    System.out.println("Total de sueldos: S/. "+totalsueldos);
    System.out.println("Promedio de sueldos: S/. "+promediosueldos);
    
    // Cerrar el objeto Scanner
        lectura.close();
    }
}
