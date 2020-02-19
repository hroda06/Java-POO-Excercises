/*
  1. Realice un programa en donde se cree el siguiente menú de opciones con sus respectivas funciones:

  a) cargar 5 valores aleatorios en una pila y una cola

  b) mostrar pila / cola

  c) ordenar pila / cola

  d) invertir los valores de pila / cola

  e) buscar un valor en una pila / cola
 */
package preparacionfinal;

import java.util.Scanner;

public class AO1_1 {
    
    public static void main(String[]args){
        Scanner sn=new Scanner(System.in);
        metodosPila p=new metodosPila();
        metodosCola c=new metodosCola();
        int op, x;  
        System.out.println("Ingrese una opcion:  0=FIN");
        
    do{
        
        System.out.println("1. cargar 5 valores aleatorios en una pila y una cola ");
        System.out.println("2. mostrar pila / cola ");
        System.out.println("3. ordenar pila / cola ");
        System.out.println("4. invertir los valores de pila / cola ");
        System.out.println("5. buscar un valor en una pila / cola ");
        op=sn.nextInt();
        switch(op)
        {
            case 1:
                System.out.println("ingrese 5 valores a cargar en la Pila y Cola:  ");
                
                for(int i=0; i<5; i++)
                 {
                     x=sn.nextInt();
                     p.ponerPila(x);
                     c.insertarEnCola(x);
                     
                 }                                 
                break;
            case 2:
                System.out.println("impresion Pila:  ");
                p.imprimirPila();
                 System.out.println("  ");
                System.out.println("impresion Cola:  ");
                c.imprimirCola();
                System.out.println("  ");
                
                break;
            case 3:
                System.out.println("Pila ordenada: ");
                p.ordenarPila();
                p.imprimirPila();

                System.out.println("Cola ordenada: ");
                c.ordenarCola();
                c.imprimirCola();                                             
                break;
            case 4:               
                System.out.println("Pila invertida: ");
                p.invertirPila();
                p.imprimirPila();
                System.out.println("Cola invertida: ");
                c.invertirCola();
                c.imprimirCola();               
                break;
            case 5:
                System.out.println("Ingrese el valor a buscar en la pila y cola: "); 
                x=sn.nextInt();
                p.buscar(x);
                c.buscar(x);
        }
  
}
    while(op!=0);
    
}
}

class metodosPila extends Pila
{   
    int x;
   
    public void imprimirPila()
    {
        while(!this.pilaVacia())
        {
            x=this.sacarPila();        
           System.out.println(x);
        }
    }
    
    
    
    public void ordenarPila()
        {
            int vec[]=new int[5];
            int c=0, aux;           
            boolean band=false;
            
            while(!this.pilaVacia())
            {
                vec[c]=this.sacarPila();
                c++;
            }
            
            while(!band)
            {
                band=true;
                for(int i=0; i<4; i++)
                {
                    if(vec[i]>vec[i+1])
                    {
                        aux=vec[i];
                        vec[i]=vec[i+1];
                        vec[i+1]=aux;
                        band=false;
                        
                    }
                }
            }
            
            for(int i=0; i<5; i++)
            {
                this.ponerPila(vec[i]);
            }
        }
    
    public void invertirPila()
    {
        metodosCola a= new metodosCola();
        while(!this.pilaVacia())
        {
            x=this.sacarPila();
            a.insertarEnCola(x);           
        }
        while(!a.colaVacia())
        {
            x=a.sacarDeCola();
            this.ponerPila(x);
        }
    }
    public void buscar (int x)
    {
       int a;
       int b=0;
       
       while(!this.pilaVacia())
       {
           a=this.sacarPila();
           if(a==x)
           {
               b=1;
           }          
       }
    if (b==1)
        System.out.println("el valor  se encuentra en la pila");
    else
    {
        System.out.println("el valor  no existe");
    }
}
}

class metodosCola extends Cola
{
    int x;
   
        public void imprimirCola()
    {
        while(!this.colaVacia())
        {
            x=this.sacarDeCola();
           System.out.println(x);
        }
    }
        public void ordenarCola()
        {
            int vec[]=new int[5];
            int c=0, aux;           
            boolean band=false;
            //De cola a vector
            while(!this.colaVacia())
            {
                vec[c]=this.sacarDeCola();
                c++;
            }
            //Ordenamiento burbuja
            while(!band)
            {
                band=true;
                for(int i=0; i<4; i++)
                {
                    if(vec[i]>vec[i+1])
                    {
                        aux=vec[i];
                        vec[i]=vec[i+1];
                        vec[i+1]=aux;
                        band=false;
                        
                    }
                }
            }
            // De vector a cola
            for(int i=0; i<5; i++)
            {
                this.insertarEnCola(vec[i]);
            }
        }
        
        public void invertirCola()
    {
        metodosPila a= new metodosPila();
        while(!this.colaVacia())
        {
            x=this.sacarDeCola();
            a.ponerPila(x);
        }
        while(!a.pilaVacia())
        {
            x=a.sacarPila();
            this.insertarEnCola(x);
        }
    }
        
        public void buscar (int x)
    {
       int a;
       int b=0;
       
       while(!this.colaVacia())
       {
           a=this.sacarDeCola();
           if(a==x)
           {
               b=1;
           }          
       }
    if (b==1)
        System.out.println("el valor  se encuentra en la cola");
    else
    {
        System.out.println("el valor  no existe");
    }
}
   
}

 