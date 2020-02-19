/*
 2. Calcular el factorial de un número por medio de una función recursiva.--> ej: 4!=4x3x2x1=24   (factorial de 0=1)
    Realizar un programa que calcule el producto de dos numeros mediante sucesivas sumas.--> ej: 4x3 = 4+4+4 = 12 (el numero (y) solo se utiliza como referencia para descontar en 1 cada vez que se recursa, hasta que y=0 y retorna 0 y se termina el metodo).
    Sumatoria de un numero mediante recursividad. sumatoria --> ej: 4=4+3+2+1=10
    
 */
package preparacionfinal;

import java.util.Scanner;


public class AO2_2 {
    
    
    public static void main (String []arg)
    {
       double n;
       int x, y, z;
       Scanner sn=new Scanner(System.in);
       System.out.println(" Ingrese 1 numero: ");
       n=sn.nextDouble();
       System.out.println(" su factorial es: "+fact(n));
       System.out.print("Ingrese el primer numero: ");
       x=sn.nextInt();
       System.out.print("Ingrese el segundo numero: ");
       y=sn.nextInt();
       System.out.println(" El producto es " + producto (x,y));
       System.out.print("Ingrese el numero recursivo: ");
       z=sn.nextInt();
       System.out.println(" la suma es " + suma (z));
     
        
    }
    
      static double fact (double n)
    {
       if (n==0)
       return 1;
       else 
       return n*fact(n-1);
       // n=4 retorna 4*3*2*1*1(el ultimo 1 es lo que retorna cuando n=0 ya que el factorial de 0=1 coincide)
    }
    
    static int producto (int x, int y)
    {
      if (y==0)
      return 0;
      else
      return x+producto(x, y-1);
      // n=4,y=3 retorna 4+4+4+0 (el ultimo 0 es cuando "y" llega a 0 y termina el metodo sumas susesivas de "x")
    }

   static int suma (int z)
    {   
       if (z==1)        
       return 1;      
       else
       return z+suma(z-1); 
       // n=4 retorna 4+3+2+1 (el ultimo 1 es cuando corta el metodo ya que z=1)(es lo mismo si hago z==0, return 0)
    }
        
}
