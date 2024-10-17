import java.util.Scanner;

/**
Crear un programa en Java que permita almacenar cinco números en el arreglo a y b. 
Visualizar los valores del arreglo a y b en forma intercalada al arreglo c.
a[]=10 20 30 40 50
b[]=60 70 80 90 100
c[]=10 60 20 70 30 80……100
 */
public class Ejercicio5 {
public static void main (String [] args){
    // Declarar los arreglos a y b
    int[] a = new int[5];
    int[] b = new int[5];
    int[] c = new int[10]; // Arreglo para almacenar la intercalación
    Scanner scanner = new Scanner(System.in);
    //Ingresar los valores para el arreglo a
    System.out.println("Ingresa 5 valores para el arreglo a:");
    for (int i = 0; i < a.length; i++) {
        System.out.print("a[" + i + "]: ");
        a[i] = scanner.nextInt();
        }
    //Ingresar los valores para el arreglo b
    System.out.println("Ingresa 5 valores para el arreglo b:");
    for (int i = 0; i < b.length; i++) {
        System.out.print("b[" + i + "]: ");
        b[i] = scanner.nextInt();
        }
    //Intercalar los valores de a y b en el arreglo c
    int indexC = 0;
    for (int i = 0; i < 5; i++) {
        c[indexC++] = a[i]; // Insertar elemento de a
        c[indexC++] = b[i]; // Insertar elemento de b
        }
    //Mostrar el resultado del arreglo c intercalado
    System.out.println("\nValores del arreglo c: ");
    for (int i = 0; i < c.length; i++) {
        System.out.print(c[i] + " ");
        }      
    }    
}
