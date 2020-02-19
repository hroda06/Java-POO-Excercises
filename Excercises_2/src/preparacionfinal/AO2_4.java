/*
 4. Cargar un árbol equilibrado con 5 números y crear un menú con las siguientes operaciones:

  a) Buscar y eliminar un valor.

  b) Calcular la sumatoria de los nodos hoja.

  c) Calcular el promedio de los nodos del nivel i.

  d) Mostrar todos los elementos del árbol.
 */
package preparacionfinal;

import java.util.Scanner;


public class AO2_4 {
    
    public static void main (String []arg)
    {
       
       int x, i;
       char op;
       ArbolEqui a= new ArbolEqui();
       Scanner sn=new Scanner(System.in);
       System.out.println(" Ingrese 5 numeros aleatorios: ");          
           a.ingresar(5);          
       do{
           System.out.println(" Eliga una opcion: ");
           System.out.println(" a) Buscar y eliminar un valor. ");
           System.out.println(" b)Calcular la sumatoria de los nodos hoja. ");
           System.out.println(" c) Calcular el promedio de los nodos del nivel i. ");
           System.out.println(" d) Mostrar todos los elementos del árbol. ");
           System.out.println(" e) Salir. ");
           op=sn.next().charAt(0);
           switch(op)
           {
               case 'a':
                   System.out.println(" Ingrese el valor a eliminar: ");
                   x=sn.nextInt();
                   // no puedo terminar de desarrollarlo todabia 
                   System.out.println(" Arbol resultante: ");
                   a.impCentral();
                   System.out.println("  ");                  
                   break;
               case 'b':
                   System.out.println(" Sumatoria de los nodos hoja: "+a.suma());                  
                   break;
               case 'c':
                   System.out.println(" Ingrese el nivel i a calcular su promedio: ");
                   i=sn.nextInt();
                   System.out.println(" Promedio de los nodos del nivel i: "+a.promedio(i));                   
                   break;
               
               
           }
           
       }
       while(op!='e');
    
    
    
}
}

class ArbolEqui extends Arbol
{
    int sum, cont;
    float prom;
    public int suma()
    {
        sum=0;
        sumatoriaHojas(raiz);
        return sum;       
    }
    
    public void sumatoriaHojas(NodoAr r)
    {
        if(r!=null)
        {
           if(r.getIzq()==null && r.getDer()==null)
           {
               sum=sum+r.getInfo();
           }
           sumatoriaHojas(r.getIzq());
           sumatoriaHojas(r.getDer());
        }
    }


public float promedio(int i)
{
    sum=0;
    cont=0;   
    calcPromedio(raiz, 1, i);
    prom=((float)sum/cont); //importante tiene que ir debajo del metodo calcPromedio asi los valores sum y cont toman el valor final y calcula. si no calcula el prom con 0/0.
    return prom;    
}

public void calcPromedio(NodoAr r, int nivel, int i)
{
   if(r!=null)
   {
       if(nivel==i)
       {
           cont++;
           sum=sum+r.getInfo();
       }
       calcPromedio(r.getIzq(), nivel+1, i);
       calcPromedio(r.getDer(), nivel+1, i);
   }
}
}

