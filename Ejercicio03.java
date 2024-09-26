/*Programa  que calcule el factorial de un numero 
entero positivo.
 */
import java.util.Scanner;
public class Ejercicio03 {
    public static void main (String [] args){
    //declarar variables
    int num;
    Scanner lectura = new Scanner (System.in);
    //Entrada de datos
    System.out.print("Ingrese un numero entero positivo: ");
    num = lectura.nextInt();
    //Proceso de datos
    int fac=1;
    int i=1;
    while (i<=num){
        fac*=i;
        i=i+1;  
    }
    //Salida de datos
    System.out.println("El factorial de "+num+" es: "+fac);
    }
    
}