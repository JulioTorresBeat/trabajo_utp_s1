import java.util.Scanner;

/**
Crear un programa en Java que permita registrar las compras de los n personas en un arreglo de datos. 
Visualizar el total, promedio y compra mayor y menor.
 */
public class Ejercicio3 {
public static void main (String [] args){
    //Declarar variables
    int i,n;
    double suma,prom,compmayor,compmenor;
    suma=0;
    compmayor=Double.MIN_VALUE;
    compmenor=Double.MAX_VALUE;
    Scanner lectura= new Scanner(System.in);
    //Entrada de datos
    System.out.print("Ingrese el numero de personas: ");
    n=lectura.nextInt();
    //Proceso - creacion del arreglo
    double[]compras = new double[n];
    for (i=0;i<n;i++){
        System.out.print("Ingrese el monto de la compra "+(i+1) +": ");
        compras[i]=lectura.nextDouble();
        suma += compras[i];
        if (compras[i]>compmayor){
            compmayor=compras[i];
        }
        if (compras[i]<compmenor){
        compmenor=compras[i];
        }
    }
        //Calculo del promedio
        prom=suma/n;
        //Salida de datos
        System.out.println("El total de las compras es: " + suma + " soles");
        System.out.println("El promedio de las compras es: " + prom + " soles");
        System.out.println("La compra mayor es: " + compmayor + " soles");
        System.out.println("La compra menor es: " + compmenor + " soles");
    }    
}
