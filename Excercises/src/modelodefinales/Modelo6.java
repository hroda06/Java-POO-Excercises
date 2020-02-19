/*
 Se define por frontera de un arbol binario, la secuencia formada por los elementos
 almacenados en las hojas de un arbol binario, tomados de izquierda a derecha.
 Escribir un metodo que, dado un arbol binario y una lista vacia pasados como
 parametros, devuelva en dicha lista la frontera del arbol.( Es decir, agregar un metodo para la clase arbol
 que devuelva en forma de lista el resultado del recorrido en anchura del arbol) 
 */
package modelodefinales;

import java.util.Scanner;


public class Modelo6 {   
    

    public static void main(String[]args){
    int x;
    Scanner sn= new Scanner(System.in);
    
    
    ArbolHojas a= new ArbolHojas();
    
    System.out.println(" Ingrese un numero: 0=FIN");
    x=sn.nextInt();
    while(x!=0)
    {
        a.ingresarBus(x);
        System.out.println(" Ingrese un numero: 0=FIN");
        x=sn.nextInt();      
    }
    System.out.println(" Lista de Nodos Hoja del arbol de busqueda: ");
    a.mostrarLista();
    
   /*
    System.out.println(" Ingrese la cantidad de Nodos");
    x=sn.nextInt();
    a.ingresar(x);
    System.out.println(" Lista de Nodos Hoja del arbol equilibrado: ");
    a.mostrarLista();
    */
    
    
    
}
}
    
class ArbolHojas extends Arbol
{
    int x;
    Lista b= new Lista();
    public void mostrarLista()
    {
        HojasLista(raiz);
       while(b.frente!=null)
       {
           x=b.borrarPri();
           System.out.println(x);
       }
        
    }
    public void HojasLista(NodoAr r)
    {
        if(r!=null)
        {
            if(r.getIzq()==null && r.getDer()==null)
            {
               b.insertarFinal(r.getInfo());
            }
            HojasLista(r.getIzq());
            HojasLista(r.getDer());
        }
        
        
        
    }
    
}
