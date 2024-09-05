
package programas;

/* CONDICIONAL DOBLE
Verificar si un numero es par o impar
*/
import java.util.Scanner;
public class Tarea2Semana3 {
    public static void main (String [] args){
        
        //Declarar variables
        int num;
        String ip;
        Scanner lectura = new Scanner (System.in);
        //Entrada de datos
        System.out.print("Ingrese el numero:");
        num=lectura.nextInt();
        //Proceso de datos
        if (num%2==0){
            ip="par";
        }else {
            ip="impar";
        }
        //Salida de datos
        System.out.println("El numero es: "+ip);
         
        }
    }
