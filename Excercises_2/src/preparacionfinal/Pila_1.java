//1. Luego de cargar una pila de n elementos, muestre los números pares de la pila sin eliminarlos de la misma.
/*
1) Para este ejercicio se crea un objeto Pila auxiliar para no tener que borrar los elementos de la pila.
2) Se utiliza un for para cargar la cantidad de elementos de la pila ya que la consigna dice (pila de N elementos).

*/
package preparacionfinal;
import java.util.Scanner;

public class Pila_1 {
    public static void main (String[]args){
        
        Scanner sn=new Scanner(System.in);
        int n,x,i;
        System.out.println("ingresar la cantidad de numeros de la pila: ");
        n=sn.nextInt();
        Pila p=new Pila(n);
        Pila aux= new Pila(n);
        
        // cargo la pila original
        for( i=0; i<n; i++)
        {
           System.out.println("ingrese un numero: ");
            x=sn.nextInt();
            if(p.ponerPila(x)==false) //este paso en este caso es al pedo porque ya tngo un for con un n asignado
            {
                System.out.println("La pila esta llena ");             
                break;
            }

        }
        // imprimo los pares
        System.out.println("impresion de pares: ");
          while(! p.pilaVacia())
        {
            x=p.sacarPila();
            if(x%2==0) {              
            System.out.println(x);           
        }
             aux.ponerPila(x);
        }
          // empiezo a recomponer la pila original
          while(! p.pilaLlena()) // podria haber utilizado esta condicion y seria igual (! aux.pilaVacia() )
          {
              x=aux.sacarPila();
              p.ponerPila(x);
          }
        // imprimo la pila recompuesta
        System.out.println("Impresion de la pila: ");
        while(! p.pilaVacia())
        {
             x=p.sacarPila();
            System.out.println(x);
            
        }
  
    }
    
}

 



