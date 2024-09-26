/*Programa para contar los numeros pares entre el 1
y cualquier numero
 */
import java.util.Scanner;
public class Ejercicio02 {
    public static void main (String [] args){
    //Declarar variable
    int num,par;
    Scanner lectura = new Scanner (System.in);
    //Proceso de datos
    num=1;
    par=0;
    while(num<=80){
    if (num%2 ==0){
    par=par+1;
    }
    num=num+1;
    }
    //salida de datos
    System.out.println("Hay " +par+" numero pares entre 1 y 50");
    }
    
}
