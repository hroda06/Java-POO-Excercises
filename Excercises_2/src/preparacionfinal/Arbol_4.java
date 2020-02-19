/*
  Genere un árbol binario de búsqueda con los empleados de una empresa,
* ordenado por legajo. Se pide mostrar el legajo de todos los empleados
* cuyo legajo sea > 1000 ordenados en forma ascendente(de menor a mayor)
* y otro listado con los legajos pares pero ordenados en forma descendente
* (de mayor a menor); desarrolle una subclase (clase derivada ) de Arbol
* que contenga los nuevos comportamientos.
 */
package preparacionfinal;

import java.util.Scanner;


public class Arbol_4 {
    
    public static void main (String []arg)
{ 
    Scanner sn=new Scanner(System.in);
    int x;
ArbolLegajo ar=new ArbolLegajo(); //creacion del objeto de tipo ArbolBusqueda (objeto de la clase Arbolbusqueda creada por mi que hereda de la clase arbol)
System.out.println(" Ingreso de datos al Arbol ");
System.out.print(" Ingrese un numero entero [0 = FIN] :");
x=sn.nextInt();
while(x!=0)
{
    ar.ingresarBus(x);
    System.out.print(" Ingrese un numero entero [0 = FIN] :");
    x=sn.nextInt();
}
System.out.println(" Legajos mayores a 1000: ");
ar.mostrarMay2(1000);
System.out.println(" ");
System.out.println(" legajos pares: ");
ar.imprimirPares();

}
}
    
class ArbolLegajo extends Arbol{
    
    public void mostrarMay(int valor){
        
        mayores(raiz, valor);
        
        
    }
    
    public void mayores(NodoAr r, int valor){
        if(r!=null)
        {
            mayores(r.getIzq(), valor);
            if(r.getInfo()>valor)
            
               System.out.println(r.getInfo()) ;            
               mayores(r.getDer(), valor);        
        }   
   }
    
    
    public void imprimirPares()
{
    impPares(raiz);
}
    
protected void impPares( NodoAr r)
{
    if ( r!=null )
  {
    impPares(r.getDer()); //primero empieza por la rama derecha
       if(r.getInfo()%2==0)
       {
        System.out.print(" "+r.getInfo());
       }
    impPares(r.getIzq());
  }
}
// METODO COMO 2DA OPCION 
public void mostrarMay2(int valor){
        
        mayores2(raiz, valor);
        
        
    }



public void mayores2(NodoAr r, int valor)
{
    if(r!=null)
    {
        if(r.getInfo()>valor)
        {
            System.out.print(" "+r.getInfo());
        }
        mayores2(r.getIzq(), valor);
        mayores2(r.getDer(), valor);
    }
}

 


   
}
