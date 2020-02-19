
package librerias;

/**
 *
 * @author HERNAN
 */
import java.util.Scanner;


public class Vector {
    
    
 Scanner sn=new Scanner(System.in);
   
  protected int []x; 
  
public Vector(int n)
{
    x=new int[n];
}

public void cargar()
{
for(int i=0;i<x.length;i++)
{ System.out.print(" Ingrese un numero entero ");
x[i]=sn.nextInt();
}
}
public int maximo() //método publico
{return maximo(x.length-1);
}
private int maximo(int c) // método sobrecargado y privado
{
int aux;
if (c==0)
return x[0];
if( x[c-1] < x[c] )
{
aux=x[c-1];
x[c-1]=x[c];
x[c]=aux;
return maximo(c-1);
}
else
return maximo(c-1);
}
public int minimo() //método publico
{return minimo(x.length-1);
}
private int minimo(int c) // método sobrecargado y privado
{ int aux;
if (c==0)
return x[0];
if( x[c-1] > x[c] )
{
aux=x[c-1];
x[c-1]=x[c];
x[c]=aux;
return minimo(c-1);
}
else
return minimo(c-1);
}
public int producto() //método publico
{ return producto(x.length-1);
}
private int producto(int c) // método sobrecargado y privado
{
if (c==0)
return x[0];
else
return x[c]*producto(c-1);
}
public int pares() //método publico
{return pares(x.length-1);
}
private int pares(int c) // método sobrecargado y privado
{ if (c==-1)
return 0;
else
if (x[c] %2==0 )
return 1+pares(c-1);
else
return pares(c-1);
}
public String toString()
{String aux="\n Elementos del vector \n";
for(int i=0;i<x.length;i++)
aux+="\t"+x[i];
return aux;
}











// METODO EXTERNO PARA CALCULAR FACTORIAL

static double fact (double n)
    {
       if (n==0)
       return 1;
       else 
       return n*fact(n-1);
       // n=4 retorna 4*3*2*1*1(el ultimo 1 es lo que retorna cuando n=0 ya que el factorial de 0=1 coincide)
    }
    // METODO EXTERNO PARA CALCULAR PRODUCTO DE 2 NUMEROS POR MEDIO DE SUMAS SUSESIVAS
    static int producto (int x, int y)
    {
      if (y==0)
      return 0;
      else
      return x+producto(x, y-1);
      // n=4,y=3 retorna 4+4+4+0 (el ultimo 0 es cuando "y" llega a 0 y termina el metodo sumas susesivas de "x")
    }
    // METODO EXTERNO PARA CALCULAR SUMATORIA RECURSIVA DE UN NUMERO
   static int suma (int z)
    {   
       if (z==1)        
       return 1;      
       else
       return z+suma(z-1); 
       // n=4 retorna 4+3+2+1 (el ultimo 1 es cuando corta el metodo ya que z=1)(es lo mismo si hago z==0, return 0)
    }



}
