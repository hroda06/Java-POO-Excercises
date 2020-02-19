/*
 -Cargar pila de 6 elementos enteros, sin repetirse. del 1 al 20, de forma aleatoria.
Ingresar 2 valores a eliminar que se insertaran en cola (en caso de ingresar valor que no esta
en la pila solicitar otro).Mostrar pila y cola
 */
package modelodefinales;
import java.util.Scanner;

public class Modelo15 {
    
    public static void main(String[]args)
    {
        int x, b;      
        boolean band=false;
        boolean band2=false;
        Scanner sn= new Scanner(System.in);
        Pila paux=new Pila();     
        Pila p=new Pila(6);
        Cola c=new Cola();
        Lista a=new Lista(); //la utilizo por su metodo "buscar" unicamente
        System.out.println("Ingrese 6 valores a la Pila (del 1 al 20): ");
        while(!p.pilaLlena())
        {
             x=sn.nextInt();
             if(x<1 || x>20) 
             {
                 System.out.println("Error. Ingrese un valor del 1 al 20: ");
             }
             else if(a.buscar(x)==true)
             {
              System.out.println("Valor repetido. Ingrese otro valor:  ");   
             }
               else
                 {
                  p.ponerPila(x);
                 }
             a.insertarFinal(x);// pase lo que pase el numero x se inserta en la lista para luego buscarlos
                        
        }             
               System.out.println("Ingrese el 1er valor a eliminar:  "); 
               x=sn.nextInt();
               while(band==false)
               {    
               if(a.buscar(x)==true)
               {
                   while(!p.pilaVacia())
                   {
                       b=p.sacarPila();
                       if(b==x)
                       {
                           c.insertarEnCola(b);                    
                       }
                       else
                       {
                           paux.ponerPila(b);
                       }
                   } 
                   band=true;
               }         
               if(a.buscar(x)==false)
                   
                   {
                       System.out.println("valor no encontrado. Ingrese otro valor  "); 
                       x=sn.nextInt();
                   }
               }
               
               System.out.println("Ingrese el 2do valor a eliminar  ");
               x=sn.nextInt();
               
               while(band2==false)
               {    
               if(a.buscar(x)==true)
               {
                   while(!paux.pilaVacia())
                   {
                       b=paux.sacarPila();
                       if(b==x)
                       {
                           c.insertarEnCola(b);                       
                       }
                       else
                       {
                           p.ponerPila(b);
                       }
                   } 
                   band2=true;
               }         
               if(a.buscar(x)==false)
                   
                   {
                       System.out.println("valor no encontrado. Ingrese otro valor  "); 
                       x=sn.nextInt();
                   }
               }
                                        
               System.out.println("Impresion de cola: "); 
               while(!c.colaVacia())
               {
                   x=c.sacarDeCola();
                   System.out.println(x); 
               }
               
               System.out.println("Impresion de pila restante: "); 
               while(!p.pilaVacia())
               {
                   x=p.sacarPila();               
                   System.out.println(x); 
               }

        }
    
    }



