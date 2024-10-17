/**
Crear un programa donde imprima la tabla de multiplicar
 */
import java.util.Scanner;
public class Ejercicio01 {
    public static void main (String [] args){
    //Declarar variables
    int num;
    Scanner lectura = new Scanner(System.in);
    //Entrada de datos
    System.out.print("Ingresa un numero para generar su tabla de multiplicar: ");
    num = lectura.nextInt();
    //Proceso de datos y salida
    System.out.println("Tabla de multiplicar del " + num + ":");
    for (int i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + (num * i));
        }  
    }
}
