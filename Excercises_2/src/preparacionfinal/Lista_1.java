//1. Realice un procedimiento para contar la cantidad de nodos de una lista lineal.
package preparacionfinal;
import java.util.Scanner;

public class Lista_1 {
    
    public static void main(String[]args){
        int x;
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
        System.out.println(" cantidad de nodos de la lista: "+a.contar());
        
    }
    
    
    
    
}
