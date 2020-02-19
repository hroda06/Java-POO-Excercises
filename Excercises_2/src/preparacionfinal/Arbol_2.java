/*
6. Genere un  árbol binario equilibrado y calcule el promedio de los nodos que están en el nivel  “i”;
desarrolle una subclase (clase derivada) de Árbol que contenga los nuevos comportamientos.
*/
package preparacionfinal;

import java.util.Scanner;


public class Arbol_2 {
    
    public static void main(String[]args){
    int x, i;
    Scanner sn= new Scanner(System.in);
    ArbolPromedio a= new ArbolPromedio();
    System.out.println("ingrese la cantidad de nodos: ");
    x=sn.nextInt();
    a.ingresar(x);
    System.out.println("impresion del arbol: ");
     a.impPreOrden();
    System.out.println("ingrese el iesimo nivel a promediar: "); 
    i=sn.nextInt();
    System.out.println("el promedio del nivel "+i+" es: "+a.promedio(i)); 
  
}
}
class ArbolPromedio extends Arbol{
    int cont, sum;
    float prom;
    public float promedio(int i)
    {
        cont=0;
        sum=0;        
        calcPromedio(raiz, 1, i);
        prom=(float) sum/cont;
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
            calcPromedio(r.getDer(), nivel+1, i);
            calcPromedio(r.getIzq(), nivel+1, i);
            
        }
    }
    
    
}

