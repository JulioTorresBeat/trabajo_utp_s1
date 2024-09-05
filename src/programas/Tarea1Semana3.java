
package programas;

/* CONDICIONAL SIMPLE 
Programa para verificar si una persona es mayor de edad
*/
import java.util.Scanner;
public class Tarea1Semana3 {
    public static void main (String [] args){
        
    //Declara variables
    int edad;
    String mensaje;
    Scanner lectura = new Scanner (System.in);
       
    //Entrada de datos
    System.out.print("Ingrese la edad: ");
    edad=lectura.nextInt();
    
    //Proceso de datos
    mensaje="Eres mayor de edad";
    if(edad>=18){
    }
    //Salida de datos
    System.out.println(""+mensaje);
    }
}
