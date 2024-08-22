
package Programas;
import java.util.Scanner;

public class Programa2 {
    
    public static void main(String[] args) {
    //declarar variable
    String cliente,producto;
    double precio,cantidad,subtotal,igv,totalpagar;
    
    //creando el objeto lectura
    Scanner lectura= new Scanner (System.in);
    
    //Entrada de datos
    System.out.print("Nombre del cliente: ");
    cliente=lectura.next();
    
    System.out.print("Producto: ");
    producto=lectura.next();
    
    System.out.print("Precio: ");
    precio=lectura.nextDouble();
    
    System.out.print("Cantidad: ");
    cantidad=lectura.nextDouble();
    
    //Operaciones
    subtotal=cantidad*precio;
    igv=subtotal*0.18;
    totalpagar=subtotal+igv;
    
    // salida de datos
    System.out.println("Cliente: "+cliente);
    System.out.println("Producto: "+producto);
    System.out.println("Subtotal: "+subtotal);
    System.out.println("IGV: "+igv);
    System.out.println("Total a pagar: "+totalpagar);

    }
}
