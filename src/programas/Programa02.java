
package programas;

/*Crear un programa en Java que permita ingresar las tres notas de un alumno
Visualizar el promedio y condicion
>=12 aprobado
<12 desaprobado
*/
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args){
        
    //declarar variables
    double nota1,nota2,nota3,promedio;
    String alumno,condicion;
    Scanner lectura=new Scanner(System.in);
    
    //entrada de datos
    System.out.print("Ingresar nombre del alumno: ");
    alumno=lectura.next();
    System.out.print("Ingresar nota 1: ");
    nota1=lectura.nextDouble();
    System.out.print("Ingresar nota 2: ");
    nota2=lectura.nextDouble();
    System.out.print("Ingresar nota 3: ");
    nota3=lectura.nextDouble();
    
    //Proceso de datos
    promedio=(nota1+nota2+nota3)/3;
    if (promedio>=12){
        condicion="Aprobado";
    }else{
        condicion="Desaprobado";        
    }
    
    //Salida de datos
        System.out.println("El promedio es:"+promedio);
        System.out.println("La condicion es: "+condicion);
    }
     
}
