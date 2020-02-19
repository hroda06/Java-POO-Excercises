/*
 - Cargar elementos en una cola, invertir la cola, mostrar ambas estructuras.
 
 */
package modelodefinales;

import java.util.Scanner;


public class Modelo10 {
    public static void main(String[]args){
    int x;  
    Scanner sn= new Scanner(System.in); 
    Pila a=new Pila();
    Cola c=new Cola();  
    System.out.println(" cargar un numero: 0=FIN");
    x=sn.nextInt();
    while(x!=0)
    {
        c.insertarEnCola(x);      
        System.out.println(" cargar un numero: 0=FIN");
        x=sn.nextInt();
    }
    System.out.println(" Impresion de la Cola original: ");
    while(!c.colaVacia())
    {
        x=c.sacarDeCola();
        System.out.println(x);
        a.ponerPila(x);
    }
    
    System.out.println(" Impresion de la Cola invertida: ");
    while(!a.pilaVacia())
    {
        x=a.sacarPila();
        System.out.println(x);
    }
  
}
}
