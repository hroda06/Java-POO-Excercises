/*
 9. Mostrar  los nodos del subárbol izquierdo de un árbol binario de búsqueda, 
 ordenados de menor a mayor. desarrolle una subclase (clase derivada) de Árbol 
 que contenga los nuevos comportamientos.
 */
package preparacionfinal;

import java.util.Scanner;


public class Arbol_5 {
    
     public static void main (String []arg)
{ 
    Scanner sn=new Scanner(System.in);
    int x;
ArbolIzq a=new ArbolIzq(); 
System.out.println(" Ingreso de datos al Arbol ");
System.out.print(" Ingrese un numero entero [0 = FIN] :");
x=sn.nextInt();
while(x!=0)
{
    a.ingresarBus(x);
    System.out.print(" Ingrese un numero entero [0 = FIN] :");
    x=sn.nextInt();
}
System.out.println(" Nodos del lado izquierdo del arbol: ");
  a.impIzq();
  System.out.println(" ");
  System.out.println("Nodos del lado derecho del arbol:  ");
  a.arbolder();
  System.out.println(" ");
  
}
}
     
class ArbolIzq extends Arbol{
    
    public void impIzq(){
        
        central(raiz.getIzq());      
    }
    public void impDer(){
        
        central(raiz.getDer());      
    }
    
    public void arbolder()
    {
        derecha(raiz);
    }
    public void derecha(NodoAr r)
    {
        if(r!=null)
           
        {
           
           System.out.println(" "+ r.getInfo());
           derecha(r.getDer());
        }
    }
    
}
