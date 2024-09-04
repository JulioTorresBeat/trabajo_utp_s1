/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;

/**
Crear un programa en Java que permita ingresar cuatro numeros.
Visualizar el numero mayor.
 */
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args){
    
 //Declarar variables
  int n1,n2,n3,n4,mayor;
  Scanner lectura = new Scanner (System.in);
 
 //Entrada de datos
  System.out.print("Ingresar numero 1: ");
  n1=lectura.nextInt();
  System.out.print("Ingresar numero 2: ");
  n2=lectura.nextInt();
  System.out.print("Ingresar numero 3: ");
  n3=lectura.nextInt();
  System.out.print("Ingresar numero 4: ");
  n4=lectura.nextInt();
  //Proceso de datos
  mayor=n1;
  if (n2>mayor){
      mayor=n2;
    if (n3>mayor){
      mayor=n3;
        if (n4>mayor){
      mayor=n4;
        }
  //Salida de datos
  System.out.println("El numero mayor es: "+mayor);
    }
  }
 }
}
    
