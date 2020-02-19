/*
 2. Dada una pila de números enteros (A) y un número (N), eliminar el n-ésimo elemento de la pila. Mostrar la pila resultante.
 */
package preparacionfinal;

import java.util.Scanner;


public class AO1_2 {
    
     public static void main (String[]args){
        
        Scanner sn=new Scanner(System.in);
        Pila p=new Pila();
        Pila paux= new Pila();
        int x, n, c;
        System.out.println("ingrese un numero:  0=FIN");
        x=sn.nextInt();
        while(x!=0)
        {
            p.ponerPila(x);
            System.out.println("ingrese un numero:  0=FIN");
            x=sn.nextInt();
        }
        System.out.println("ingrese un numero iesimo a eliminar: ");
        n=sn.nextInt();
        c=0;
        while(!p.pilaVacia())
        {
         
               x=p.sacarPila();
               paux.ponerPila(x);
               c++;
               if(c==n)
               {
                  paux.sacarPila();              
               }               
            
        }
        while(!paux.pilaVacia())
        {
            x=paux.sacarPila();
            p.ponerPila(x);
        }
        System.out.println("Pila resultante: ");
        while(!p.pilaVacia())
        {
            x=p.sacarPila();
            System.out.println(x);
        }
    
}
}
