//4. Escriba una función que mueva el elemento final de la cola al frente de la misma.
package preparacionfinal;
import java.util.Scanner;

public class Cola_1 {
    public static void main(String[]args){
        int x;
       
        Cola c=new Cola();
        Cola caux=new Cola();
        Pila p=new Pila();
        Scanner sn=new Scanner(System.in);
        System.out.println("ingrese un numero: 0=FIN");
        x=sn.nextInt();
        while(x!=0)
        {           
            c.insertarEnCola(x);          
            p.ponerPila(x);
            System.out.println("ingrese un numero: 0=FIN");
            x=sn.nextInt();                      
        }
           x=p.sacarPila();
           caux.insertarEnCola(x);
           while(!c.colaVacia())
           {
               x=c.sacarDeCola();
               caux.insertarEnCola(x);
           }
           
        System.out.println("impresion de la cola: ");
        while(!caux.colaVacia())
        {
            x=caux.sacarDeCola();
            System.out.println(x);            
        }
  
    }
    
}
