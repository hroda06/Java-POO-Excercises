/*
 Realizar un programa que permita, partiendo de un árbol cargado con datos numéricos,
 cargar una lista con los datos impares del árbol y una pila con los datos pares. 
 Imprimir ambas estructuras.
 */
package modelodefinales;

import java.util.Scanner;


public class Modelo13 {
    
    public static void main(String[]args){
    int x; 
    
    Scanner sn= new Scanner(System.in);       
    Arbolese b= new Arbolese();    
    System.out.println(" Ingrese un numero: 0=FIN");
    x=sn.nextInt();
    while(x!=0)
    {
        b.ingresarBus(x);
        System.out.println(" Ingrese un numero: 0=FIN");
        x=sn.nextInt();
    }
    System.out.println("Lista de datos impares: ");
    b.impares();
    System.out.println(" ");
    System.out.println("Pila de datos pares: ");
    b.pares();
    
    
}
}
    
class Arbolese extends Arbol
{   
    Lista a=new Lista();
    Pila p=new Pila();
   public void impares()
   {
      calcImpares(raiz);
      a.imprimirLista();
       
   }
   public void calcImpares(NodoAr r)
   {
      if(r!=null)
      {
          if(r.getInfo()%2!=0)
          {
            a.insertarFinal(r.getInfo());
          }
      calcImpares(r.getIzq());
      calcImpares(r.getDer());
      }
   }
   public void pares()
   {
       calcPares(raiz);
       while(!p.pilaVacia())
       {
           int x=p.sacarPila();
           System.out.println(x);
       }
   }
   public void calcPares(NodoAr r)
   {
       if(r!=null)
       {
          if(r.getInfo()%2==0)
          {
            p.ponerPila(r.getInfo());
          }
      calcPares(r.getIzq());
      calcPares(r.getDer());
       }
}
}
