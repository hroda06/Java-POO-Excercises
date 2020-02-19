/*
 a) Crear un árbol binario con los códigos de productos.
 b) Imprimir el árbol con los códigos de manera ordenada.
 c) Crear una clase arbol_trabajo donde pase los nodos terminales a una lista doblemente enlazada e imprimirlo 
 d) Pasar los códigos de los nodos interiores del arbol a una cola e imprimirlo.
 */
package modelodefinales;

import java.util.Scanner;


public class Modelo7 {
     public static void main(String[]args){
    int x;
    Scanner sn= new Scanner(System.in);   
    arbol_trabajo a= new arbol_trabajo();
    
    System.out.println(" Ingrese el codigo del producto: 0=FIN");
    x=sn.nextInt();
    while(x!=0)
    {
        a.ingresarBus(x);
        System.out.println(" Ingrese el codigo del producto: 0=FIN");
        x=sn.nextInt();      
    }
    System.out.println(" Impresion del arbol: ");
    a.impCentral();
    System.out.println(" ");
    System.out.println(" Lista doble de Nodos Hoja del arbol de busqueda: ");
    a.mostrarLista();
    System.out.println(" Cola de nodos internos del arbol: ");
    a.mostrarCola2();
    
    
   
    
}
}

class arbol_trabajo extends Arbol{
    
    int x;
    ListaDoble b= new ListaDoble();
    Cola e=new Cola();
    public void mostrarLista()
    {
        HojasLista(raiz);
        b.imprimirLista();
        
    }
    public void mostrarCola2()
    {
       NodosCola(raiz);
       while(!e.colaVacia())
       {
           x=e.sacarDeCola();
           System.out.println(x);
       }
    }
    public void HojasLista(NodoAr r)
    {
        if(r!=null)
        {
            if(r.getIzq()==null && r.getDer()==null)
            {
               b.insertarDoble(r.getInfo());
            }
            
            HojasLista(r.getIzq());
            HojasLista(r.getDer());
        }
   
    }
    public void NodosCola(NodoAr r)
    {
        if(r!=null)
        {
            if(r.getIzq()!=null || r.getDer()!=null)
            {
            e.insertarEnCola(r.getInfo());
            }
            NodosCola(r.getIzq());
            NodosCola(r.getDer());
        }
   
    }
    
}

