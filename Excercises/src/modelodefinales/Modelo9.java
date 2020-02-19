/*
 1-Generar un árbol con los promedios de venta de una empresa.
 2-Mostrar los promedios >= 2000.
 3-Mostrar el Promedio mas Alto.
 4-Mostrar el Promedio mas Bajo.
 5-Generar una cola con los Promedios < 2000 y mostrar la cola.
 */
package modelodefinales;

import java.util.Scanner;


public class Modelo9 {
    public static void main(String[]args){
    int x;  
    Scanner sn= new Scanner(System.in); 
    Arbola a= new Arbola();
      
  
    System.out.println(" Ingrese promedio de venta: 0=FIN");
    x=sn.nextInt();
    while(x!=0)
    {
        a.ingresarBus(x);           
        System.out.println(" Ingrese promedio de venta: 0=FIN");
        x=sn.nextInt(); 
        
    }    
    System.out.println(" Impresion del arbol: ");
    a.impCentral();
    System.out.println("  ");
    System.out.println(" Promedios mayores a 2000: ");
    a.promedio();
    a.May();
    a.Men();   
    System.out.println(" Promedios menores a 2000: ");
    a.MostrarCola();
    
}
}
    
class Arbola extends Arbol
{
    int may=0;
    int men=1000000;
    Cola b=new Cola(); 
    public void promedio()               
    {
        calcPromedio(raiz);
    }
    public void calcPromedio(NodoAr r)
    {
        if(r!=null)
        {
            if(r.getInfo()>2000)
            {
                System.out.println(r.getInfo());
            }
            calcPromedio(r.getIzq());
            calcPromedio(r.getDer());
        }
    }
    public void May()
    {
        calcMay(raiz);
        System.out.println("El mayor promedio es: "+may);
    }
    public void Men()
    {
        
        calcMen(raiz);
        System.out.println("El menor promedio es: "+men);
        
    }
    
    public int calcMay(NodoAr r)
    {
        if(r!=null)
        {
            if(r.getInfo()>may)
            {
                may=r.getInfo();
                
            }
            
            calcMay(r.getIzq());
            calcMay(r.getDer());
            
        }
        return may;
    }
    public int calcMen(NodoAr r)
    {
        if(r!=null)
        {
            
            if(r.getInfo()<men)
            {
                men=r.getInfo();
                
            }
            calcMen(r.getIzq());
            calcMen(r.getDer());
            
        }
        return men;
    }
    
    public void MostrarCola()
    {
        pasarCola(raiz);
        while(!b.colaVacia())
        {
           int x=b.sacarDeCola();
           System.out.println(x);
        }
        
    }
    public void pasarCola(NodoAr r)
    {
        if(r!=null)
        {
            if(r.getInfo()<2000)
            {
                b.insertarEnCola(r.getInfo());
            }
            pasarCola(r.getIzq());
            pasarCola(r.getDer());
        }
    }
}
