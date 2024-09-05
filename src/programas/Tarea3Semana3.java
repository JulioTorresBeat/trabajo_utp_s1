
package programas;

/*CONDICIONAL MULTIPLE
Programa de comentario basada en una nota
nota>=18 : Aprobaste
nota>=16 : Puedes mejorar aun mas
nota>=14 : Puedes mejorar
nota>=12 : No te rindas
nota<12 : Desaprobaste
*/
import java.util.Scanner;
public class Tarea3Semana3 {
    public static void main (String [] args){
        //Declarar variable 
        int nota;
        String mensaje,nombre;
        Scanner lectura= new Scanner (System.in);
        //Entrada de datos
        System.out.print("Ingrese el nombre del alumno: ");
        nombre=lectura.next();
        System.out.print ("Ingrese la nota: ");
        nota=lectura.nextInt();
        //Proceso de datos
        if (nota >= 18){
            mensaje="Aprobaste";
        }else if (nota>=16){
            mensaje="Puedes mejorar aun mas";
        }else if (nota>=14){
            mensaje="Puedes mejorar";
        }else if (nota >=12){
            mensaje="No te rindas";
        }else mensaje="Desaprobaste";
        //Salida de datos
        System.out.println(""+mensaje);
    }

}
