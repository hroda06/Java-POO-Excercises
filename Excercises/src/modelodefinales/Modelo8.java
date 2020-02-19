/*
 Escriba un programa que muestre todos los nodos que son padres de una hoja, indicando el nivel en que se encuentran.
 */
package modelodefinales;

import java.util.Scanner;


public class Modelo8 {
    
     public static void main(String[]args){
    int x, al;
    Scanner sn= new Scanner(System.in);   
    arbol_trabajo2 a= new arbol_trabajo2();
    
    System.out.println(" Ingrese un nodo: 0=FIN");
    x=sn.nextInt();
    while(x!=0)
    {
        a.ingresarBus(x);
        System.out.println(" Ingrese un nodo: 0=FIN");
        x=sn.nextInt();   
   
     }
    
      al=a.calcAltura();
      System.out.println("altura del arbol = "+a.calcAltura());
      for(int i=1; i<=al; i++)
      {
          System.out.println(" Nodos padre de un solo nodo del nivel: "+i);
          a.mostrarPadres(i);
          System.out.println(" ");
      }
     }
}

class arbol_trabajo2 extends Arbol
{
   int cont;
    public void mostrarPadres(int i)
    {
        PadresHoja(raiz, 1, i);
        
        
    }
    
    public void PadresHoja(NodoAr r, int nivel, int i)
    {
        if(r!=null)
        {
            if(nivel==i)
            {     
            if(r.getIzq()!=null || r.getDer()!=null)
            {
                if(r.getIzq()==null || r.getDer()==null)
                {
                    System.out.println(" "+r.getInfo());
                }
               
            }
            }
            
            PadresHoja(r.getIzq(), nivel+1, i);
            PadresHoja(r.getDer(), nivel+1, i);
        }
   
    }
    
    public int calcAltura()
    {
        cont=0;
        altura(raiz, 1);
        return cont;
    }
    
    public void altura(NodoAr r, int nivel)
    {
        if(r!=null)
        {
            if(cont<nivel)
            {
            cont=nivel;
            altura(r.getIzq(), nivel+1);
            altura(r.getDer(), nivel+1);
            }
        }
       
    }
}
