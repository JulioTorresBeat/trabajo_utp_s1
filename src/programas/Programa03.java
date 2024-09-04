
package programas;
/* Crear un programa en Java que permita ingresar dos numeros y un tipo
de operacion aritmetica (+,-,*,/)
visualizar el resulatdo de la operacion aritmetica
*/
import java.util.Scanner;
public class Programa03 {
    public static void main (String[] args){
    double num1,num2,resultado;
    String opa;
    Scanner lectura=new Scanner(System.in);
    
    //Entrada de datos
    System.out.print("Ingresar numero 1: ");
    num1=lectura.nextDouble();
    System.out.print("Ingresar numero 2: ");
    num2=lectura.nextDouble();
    System.out.print("Ingresar operacion[+,-,*,/]: ");
    opa=lectura.next();
    
    //proceso de datos
    if (opa.equals("+")){
        resultado=num1+num2;
    }else if (opa.equals("-")){
        resultado=num1-num2;
    }else if (opa.equals("*")){
        resultado=num1*num2;
    }else{
        resultado=num1/num2;
}
    //salida de datos
    System.out.println("El resultado es: "+resultado);
    }
}
