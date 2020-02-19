/*
   5. Cargue un árbol binario equilibrado  y calcule la altura del mismo y la sumatoria de sus nodos hojas;
   desarrolle una subclase (clase derivada) de Árbol que contenga los nuevos comportamientos.
*/
package preparacionfinal;
import java.util.Scanner;

public class Arbol_1 {
    
    public static void main(String[]args){
    int x;
    Scanner sn= new Scanner(System.in);
    ArbolHijo a= new ArbolHijo();
    System.out.println("ingrese la cantidad de nodos: ");
    x=sn.nextInt();
    a.ingresar(x);
    System.out.println("impresion del arbol: ");
     a.impPreOrden();
     System.out.println("");
     System.out.println("La altura del arbol es: "+a.altura());
     System.out.println("La sumatoria de sus nodos hoja es: "+a.sumaHojas());
     
     
     
   
}
   
}


class ArbolHijo extends Arbol{
    int h, sum;
    
    public int altura(){
        h=0;
        calcAltura(raiz, 1);
        return h;
  
}
    public void calcAltura(NodoAr r, int nivel){
        if(r!=null)
        {
         if(h<nivel)
         {
             h=nivel;
             calcAltura(r.getIzq(), nivel+1);
             calcAltura(r.getDer(), nivel+1);            
         }
      }   
      }
    public int sumaHojas()
    {
        sum=0;
        hojas(raiz);
        return sum;
    }
    public void hojas(NodoAr r)
    {
        if (r!=null)
                {
                    if(r.getDer()==null && r.getIzq()==null)
                    {
                        sum=sum+r.getInfo();
                    }
                    hojas(r.getDer());
                    hojas(r.getIzq());
                }
    }
    
}
