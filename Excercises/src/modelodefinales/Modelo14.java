/*
 - A partir de un arbol con datos, contar e imprimir los nodos interiores. Hacer una funcion que muestre el maximo elemento y lo muestre por pantalla.
 */
package modelodefinales;

import java.util.Scanner;


public class Modelo14 {
    
    public static void main(String[]args){
    int x;  
    Scanner sn= new Scanner(System.in); 
    Arbols a=new Arbols();
    
    System.out.println(" cargar un numero: 0=FIN");
    x=sn.nextInt();
    while(x!=0)
    {  
        a.ingresarBus(x);
        System.out.println(" cargar un numero: 0=FIN");
        x=sn.nextInt();
    }
    System.out.println("Impresion del arbol:  ");
    a.impCentral();
    System.out.println("  ");
    System.out.println(" Cantidad de nodos interiores del arbol: "+a.contar());
    a.max();
    
}
}
class Arbols extends Arbol
{
    int cont=1;
    int may=0;
    public int contar()
    {
        
        contarNodo(raiz);
        return cont;
    }
    public void max()
    {
        calcMax(raiz);
        System.out.println("El maximo elemento es: "+may);
    }
    public int contarNodo(NodoAr r)
    {
        if(r!=null)
        {
            if(r.getIzq()!=null || r.getDer()!=null)
            {
            cont++;
            }
            contarNodo(r.getIzq());
            contarNodo(r.getDer());
        }
        return cont;
        
    }
    public void calcMax(NodoAr r)
    {
       if(r!=null)
       {
           if(r.getInfo()>may)
           {
               may=r.getInfo();
           }
           calcMax(r.getIzq());
           calcMax(r.getDer());           
       }
       //return may;
    }
    
}
