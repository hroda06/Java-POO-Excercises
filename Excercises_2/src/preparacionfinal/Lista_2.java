//2. Modifique el campo Info del nodo n-iésimo de una lista lineal.
package preparacionfinal;
import java.util.Scanner;

public class Lista_2 {
    
    public static void main(String[]args){
        int x, n;
        ListaModificada a=new ListaModificada();
        Scanner sn=new Scanner(System.in);
        System.out.println(" ingrese un numero:  0=FIN");
        x=sn.nextInt();
        while(x!=0)
        {
            a.insertarFinal(x);
            System.out.println(" ingrese un numero:  0=FIN");
            x=sn.nextInt();
        }
        System.out.println(" Ingrese la posicion N para modificar el valor :");
        n=sn.nextInt();
        a.modificar(n);
        a.imprimirLista();     
    } 
}

class ListaModificada extends Lista{
    
    Scanner sn=new Scanner(System.in);
    public void modificar(int n)
    {       
        int cant=1;
        Nodo p;
        p=frente;
        while(cant<n)
        {
           p=p.getEnlace();
            cant++;
        }
        System.out.println(" Ingrese el nuevo valor del nodo: ");
        int x=sn.nextInt();
        p.setInfo(x);          
    }
}