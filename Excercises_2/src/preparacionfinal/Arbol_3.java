/*
 7. Genere un árbol binario de búsqueda con una serie de números donde no debe haber números
 repetidos; luego muestre los elementos en forma ordenada; desarrolle una subclase (clase derivada)
 de Árbol llamada ArbolBusqueda que contenga los nuevos comportamientos que permitan la resolución de la actividad.
 */
package preparacionfinal;

import java.util.Scanner;


public class Arbol_3 {
    
    public static void main (String []arg)
{ 
    Scanner sn=new Scanner(System.in);
    int x;
ArbolBusqueda ar=new ArbolBusqueda(); //creacion del objeto de tipo ArbolBusqueda (objeto de la clase Arbolbusqueda creada por mi que hereda de la clase arbol)
System.out.println(" Ingreso de datos al Arbol ");
System.out.print(" Ingrese un numero entero [0 = FIN] :");
x=sn.nextInt();
while(x!=0)
{ ar.ingresarBus2(x);  // metodo para ingresar datos a un arbol binario de busqueda (SOLO DE BUSQUEDA) este esta redefinido para que largue un msj si se ingresa un numero repetido
System.out.print(" Ingrese un numero entero [0 = FIN] :");
x=sn.nextInt();
}
ar.impCentral();// imprime el arbol de forma central (nizq, raiz, nder) // muestra los elementos en forma ordenada de menor a mayor CONSIGNA
}
    
}
    

class ArbolBusqueda extends Arbol{
    
     public void ingresarBus2(int x )//redefinicion del método de la clase base para cumplir con la consigna
{
if(buscarNumero(x)==false) // el metodo hace uso del metodo "buscarNumero" para ver si da false entonces el numero no esta repetido y puede ingresarse
{
    ingresarBus(x );//llamada al metodo de la clase base Arbol "ingresarBus" para ingresar datos a un arbol de busqueda
}
else // si buscarNumero da true quiere decir que el numero existe entonces larga el msj(debajo)
System.out.println(" El Dato "+x+" ya existe en el Arbol "); 
}
    
}