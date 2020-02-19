//5. Usando la clase cola, genere una subclase colaTrabajo que invierta los elementos de la cola.
package preparacionfinal;

import java.util.Scanner;


public class Cola_2 {
    public static void main(String[]args){         
        colaTrabajo co=new colaTrabajo();
        co.insertarFor();
        co.invertir();
        co.mostrare();
   
}
}

class colaTrabajo extends Cola{
    Scanner sn=new Scanner(System.in);   
    int x, n;
    // metodo para insertar en la cola con un FOR
    public void insertarFor()
    {            
        System.out.println("ingrese el tamaño de la cola: ");
        n=sn.nextInt();
        System.out.println("ingrese los numeros: ");
        for(int i=0; i<n; i++)
        {
            x=sn.nextInt();
            insertarEnCola(x);
        }
    }
    //metodo para insertar en la cola hasta un x=0
    public void insertar0()
    {   
        
      System.out.println(" Ingreso de datos a la Cola ");
      System.out.print(" Ingrese un numero entero [0 = FIN] :");
     x=sn.nextInt();
     while(x!=0)
     { if(insertarEnCola(x)==false) 
     { System.out.println(" Cola LLENA ");
      break;
     }
      System.out.print(" Ingrese un numero entero [0 = FIN] :");
       x=sn.nextInt();
     }
    }
    
    public void invertir()
    { 
        Pila p=new Pila();
        while(!colaVacia())
        {
            x=sacarDeCola();
            p.ponerPila(x);
        }
        while(!p.pilaVacia())
        {
            x=p.sacarPila();
            this.insertarEnCola(x);
        }                
    }
      
    public void mostrare()
{
System.out.println("\n Impresion de la cola ");
while(!colaVacia())
{ x=sacarDeCola(); //podria utilizar un this.sacarDeCola pero da igual funciona igual con o sin el
System.out.print(x+" ");
}
}
}
