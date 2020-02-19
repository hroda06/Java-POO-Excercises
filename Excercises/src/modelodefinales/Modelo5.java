/*
 1-Se tiene una cola conteniendo el legajo de los alumnos de la carrera de ingenieria 
   de Sistemas de primer año:
   a) Generar un arbol binario de busqueda que contenga un nodo por cada elemento de la Cola de enteros.
   b) Recorrer el arbol y generar una lista con los nodos que tienen nro. De legajo del alumno par, los que seran evaluados en el primer llamado.
   c) Imprimir el arbol por niveles.
 */
package modelodefinales;

import java.util.Scanner;


public class Modelo5 {
    
    public static void main(String[]args){
    int x,al;
    Scanner sn= new Scanner(System.in);
    
    Cola c= new Cola();
    ArbolHijos b= new ArbolHijos();
    
    System.out.println(" Ingrese un Legajo: 0=FIN");
    x=sn.nextInt();
    while(x!=0)
    {
        c.insertarEnCola(x);
        System.out.println(" Ingrese un Legajo: 0=FIN");
        x=sn.nextInt();      
    }
    System.out.println(" Impresion Legajos de Cola");
    while(!c.colaVacia())
    {
        x=c.sacarDeCola();
        System.out.println(x);
        b.ingresarBus(x);
    }
    b.mostrarBus();
    System.out.println(" Impresion Arbol por niveles: ");
    al=b.calcAltura();
    for(int i=1; i<=al; i++)
    {
        System.out.println(" Nodos del nivel: "+i);
        b.impNivel(i);
        System.out.println(" ");
        
    }
    
    
}
}

class ArbolHijos extends Arbol
{
    int k, i;   
    Lista a= new Lista();
    public void mostrarBus()
    {
        int x;
        busquedas(raiz);
        System.out.println(" Impresion Lista de Legajos pares");  
         while(a.frente!=null)
          {
          x=a.borrarPri();
          System.out.println(x); 
          }
    }
    
    public void busquedas(NodoAr r)
    {     
        if(r!=null)
        {
            if(r.getInfo()%2==0)
            {
            a.insertarFinal(r.getInfo());
            }
            busquedas(r.getIzq());
            busquedas(r.getDer());           
       }
      
    }
    
    public int calcAltura()
    {
        k=0;
        altura(raiz, 1);
        return k;
        
    }
    public void altura(NodoAr r, int nivel)
    {
        if(r!=null)
        {
            if(k<nivel)
          {     
            k=nivel;
            altura(r.getIzq(), nivel+1);
            altura(r.getDer(), nivel+1);                    
          }
        }
    }
    public void impNivel(int i)
    {   
        nivel(raiz, 1, i);  
        
    }
    public void nivel(NodoAr r, int nivel, int i)
    {
        if(r!=null)
        {           
           if(nivel==i)
           {
             System.out.print("  "+r.getInfo());
           }
           nivel(r.getIzq(), nivel+1, i);
           nivel(r.getDer(), nivel+1, i);
           }
    }
}


