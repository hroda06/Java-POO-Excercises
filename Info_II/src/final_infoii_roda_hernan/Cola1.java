/*
EJERCICIO NRO 1
*/
package final_infoii_roda_hernan;

import java.util.Scanner;
public class Cola1 {

    public static void main(String[]args)
    {
        Scanner sn=new Scanner(System.in);
        int x;
        
        int y=1;
        int z=1;
        Cola a= new Cola();
        Cola aaux= new Cola();
        Cola b=new Cola();
         Cola baux=new Cola();
        Pila p=new Pila();
        Pila aux=new Pila();
        Lista li=new Lista();
        Lista li2=new Lista();
        
        
        
        System.out.println("ingrese los 5 valores de la 1er cola");
        
        
       for(int i=1; i<=5; i++)
       {
           
           x=sn.nextInt();
           while(z==1)
           {
              if(li.buscar(x)==true)
              {
               System.out.println("valor repetido. Ingrese otro valor: ");
               x=sn.nextInt();
               
              }
              if(li.buscar(x)==false)
              {
                  z=0;
              }
           }
           
          
           a.insertarEnCola(x);
           li.insertarFinal(x);
           
       }
       
       while(!a.colaVacia())
       {
           x=a.sacarDeCola();
           p.ponerPila(x);
           aaux.insertarEnCola(x);
           
       }
       System.out.println("1er cola invertida : ");
       while(!p.pilaVacia())
       {
           x=p.sacarPila();
           System.out.println(x);
       }
       
          

          
          System.out.println("ingrese los 5 valores de la 2da cola");
        
        
       for(int i=1; i<=5; i++)
       {
           x=sn.nextInt();
           while(y==1)
           {
              if(li2.buscar(x)==true)
              {
               System.out.println("valor repetido. Ingrese otro valor: ");
               x=sn.nextInt();
              }
              else
              {
                  y=0;
              }
           }
           
          
           b.insertarEnCola(x);
           li2.insertarFinal(x);
           
       }
       
       while(!b.colaVacia())
       {
           x=b.sacarDeCola();
           aux.ponerPila(x);
           baux.insertarEnCola(x);
           
       }
       System.out.println("2da cola invertida : ");
       while(!aux.pilaVacia())
       {
           x=aux.sacarPila();
           System.out.println(x);
       }
       
       while(!baux.colaVacia())
       {
           x=baux.sacarDeCola();
           aaux.insertarEnCola(x);
       }
       System.out.println("impresion de las Colas originales juntas concatenadas:  ");
       while(!aaux.colaVacia())
       {
           x=aaux.sacarDeCola();
           System.out.println(x);
       }
       
       
       
       
       
         
       
        
    }    
    
    
}
