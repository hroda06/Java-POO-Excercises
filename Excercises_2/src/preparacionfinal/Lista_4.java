// 4. Cargue una lista circular de enteros y borre de la misma un nodo cuyo campo Info sea igual a un número x ingresado por teclado.
package preparacionfinal;
import java.util.Scanner;

public class Lista_4 {

    public static void main(String[]args){
        int x;
        ListaCircular a= new ListaCircular();
        Scanner sn=new Scanner(System.in);
        System.out.println(" ingrese un numero:  0=FIN");
        x=sn.nextInt();
        while(x!=0)
        {
            a.insertarCircular(x);
            System.out.println(" ingrese un numero:  0=FIN");
            x=sn.nextInt();
        }
        System.out.println(" Impresion de la lista: ");
        a.imprimirCircular();
        System.out.println(" ingrese el numero a borrar de la lista");
        x=sn.nextInt();
        a.buscarBorrar(x);
        System.out.println(" Impresion de la lista: ");
        a.imprimirCircular();
    
}
}
