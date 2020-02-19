/*
 -Buscar un numero en una lista y borrarlo 
 */
package preparacionfinal;

import java.util.Scanner;


public class Lista_5_practicamia {
    
    public static void main(String[]args){
        int x, n;
        Lista a=new Lista();
        Scanner sn=new Scanner(System.in);
        System.out.println(" ingrese un numero:  0=FIN");
        x=sn.nextInt();
        while(x!=0)
        {
            a.insertarFinal(x);
            System.out.println(" ingrese un numero:  0=FIN");
            x=sn.nextInt();
        }
        a.imprimirLista();
        
        System.out.println(" ingrese el numero a eliminar: ");
        x=sn.nextInt();      
        a.borrarUno(a.buscarElemento(x)); //el metodo buscarelemento le da la referencia del nodo a eliminar al metodo borraruno.
        a.imprimirLista();
        
    
}
}
