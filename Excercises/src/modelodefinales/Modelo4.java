/*
 Se tiene una lista ordenanda con los datos correspondientes a una secuencia de
numeros enteros, los cuales pueden aparecer repetidos. Se pide generar un arbol a
partir de esta lista, evitando la repeticion de numeros en el mismo. Imprimir el arbol
resultante en orden de menor a mayor.
 */
package modelodefinales;

import java.util.Scanner;


public class Modelo4 {
    public static void main(String[]args){
    int x;
    Scanner sn= new Scanner(System.in);
    Lista a= new Lista();
    Arbol b= new Arbol();
    
    System.out.println(" Ingrese un numero: 0=FIN");
    x=sn.nextInt();
    while(x!=0)
    {
        a.insertarFinal(x);
        System.out.println(" Ingrese un numero: 0=FIN");
        x=sn.nextInt();      
    }
    while(a.frente!=null)
    {
        x=a.borrarPri();
        
        if(b.buscarNumero(x)==false)
        {
            b.ingresarBus(x);
        }

    }
    System.out.println(" Impresion del arbol");
    b.impCentral();
    
}
}

    
