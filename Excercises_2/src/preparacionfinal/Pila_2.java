//2. Escribir una función que obtenga el i-ésima elemento a partir de la cima de una pila, sin borrarlo.

package preparacionfinal;
import java.util.Scanner;

public class Pila_2 {
    
    public static void main (String[]args){
        
        Scanner sn=new Scanner(System.in);
        int n,x,i,a;
        int cont=0;
        System.out.println("ingresar la cantidad de numeros de la pila: ");
        n=sn.nextInt();
        Pila p=new Pila(n);
        Pila paux=new Pila(n);
        // INGRESO LOS NUMEROS CON UN FOR (aunque podria hacerlo mediante el metodo distinto de 0 uno por uno (sin pasar parametro n al objeto pila p)
        System.out.println("ingrese los numeros: ");      
        for( i=0; i<n; i++)
        {         
            x=sn.nextInt();
            p.ponerPila(x);   
        }
        // INGRESO EL IESIMO ELEMENTO A BUSCAR Y LO COMPARO CON EL CONTADOR Y LO IMPRIMO 
       System.out.println("ingrese el iesimo elemento a buscar de la pila: ");
       a=sn.nextInt();
       while(!p.pilaVacia())
       {
           x=p.sacarPila();
           cont++;
           if(cont==a)
           {
               System.out.println("el iesimo elemento es: "+x);
           }
           paux.ponerPila(x);
       }
       // IMPRIMO LA PILA AUXILIAR
       System.out.println("impresion de la pila original");
       while(!paux.pilaVacia())
       {
           x=paux.sacarPila();
           System.out.println(x);
       }
       
       
    
}
}


