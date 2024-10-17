import java.util.Scanner;

/**
Crear un programa en Java que permita registrar el ingreso 
económico de las n personas en un arreglo de datos. 
Visualizar ingreso promedio, ingreso mayor de las personas.
 */
public class Ejercicio2 {
public static void main (String [] args){
    //Declarar variables
    int i,n;
    double suma, ingprom, ingmayor;
    suma=0;
    ingprom=0;
    ingmayor=0;
    Scanner lectura = new Scanner (System.in);
    //Entrada de datos
    System.out.print("Ingrese el numero de personas: ");
    n=lectura.nextInt();
    //Proceso de datos-creacion del arreglo
    double[] ingresos= new double[n];
    for (i=0; i<n; i++){
        System.out.print("Ingrese el ingreso de la persona "+(i+1)+ ": ");
        ingresos[i]=lectura.nextDouble();
        suma += ingresos [i];
        if (ingresos [i]> ingmayor){
        ingmayor=ingresos[i];
        }    
    }
    //Calculo del promedio
    ingprom=suma/n;
    //Salida de datos
        System.out.println("El ingreso promedio es: "+ingprom+" soles");
        System.out.println("El ingreso mayor es: "+ingmayor+ " soles");
    }    
}
