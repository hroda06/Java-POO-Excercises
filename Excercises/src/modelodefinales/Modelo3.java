/*
 Realice un programa que verifique si una Lista A esta contenida en una lista B.
La Lista A esta contenida en la lista B, si todos los elementos de A estan en B.
Almacene en una Cola los elementos de B que no estan en A. Imprimir la Cola resultante
(35 ptos)
 */
package modelodefinales;

import java.util.Scanner;


public class Modelo3 {
    
    public static void main(String[]args){
    int x;
    Scanner sn= new Scanner(System.in);
    Lista a= new Lista();
    Lista b= new Lista();
    Cola c= new Cola();
    System.out.println("Lista A-> Ingrese un numero: 0=FIN");
    x=sn.nextInt();
    while(x!=0)
    {
        a.insertarFinal(x);
        System.out.println("Lista A-> Ingrese un numero: 0=FIN");
        x=sn.nextInt();      
    }
    System.out.println("Lista B-> Ingrese un numero: 0=FIN");
    x=sn.nextInt();
    while(x!=0)
    {
        b.insertarFinal(x);
        System.out.println("Lista B-> Ingrese un numero: 0=FIN");
        x=sn.nextInt();      
    }
    System.out.println("Lista A: ");
    a.imprimirLista();
    System.out.println(" ");
    System.out.println("Lista B: ");
    b.imprimirLista();
    System.out.println("Comparando las Listas.. ");
    while(a.frente!=null)
    {
        x=a.borrarPri();
        if(b.buscar(x)==false)
        {
            System.out.println("El elemento "+x+" de la Lista A no esta en la Lista B");
            c.insertarEnCola(x);           
        }
    }
    if(c.colaVacia())
    {
        System.out.println("La lista A esta contenida en B");
    }
    else{
        System.out.println("La lista A no esta contenida en B");
        System.out.println("Cola resultante de nodos que no estan en la Lista B");
        while(!c.colaVacia())
        {
            x=c.sacarDeCola();
            System.out.print(" "+x);           
        }
        System.out.println(" ");        
    }
}
}
