import java.util.Scanner;

/**
Crear un programa en Java que permita registrar el peso de las n 
personas en un arreglo de datos. Visualizar el peso promedio de las personas. 
 */
public class Ejercicio1 {
    public static void main (String [] args){
    //Declarar variables
    int i,n;
    double suma,prompeso;
    suma=0;
    Scanner lectura = new Scanner(System.in);
   //Entrada de datos
        System.out.print("Ingrese el numero de personas: ");
        n=lectura.nextInt();
        //Proceso - creacion del arreglo
        double[] peso = new double[n];
        for (i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona "+(i+1)+ ": ");
            peso[i] = lectura.nextDouble();
            suma += peso[i];}
        //Calcular el peso promedio
       prompeso = suma /n;
       //Salida de datos
            System.out.println("El peso promedio de las personas es: " +prompeso+" kg");
    }
}
