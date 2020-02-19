/*
 3. Cargar un árbol binario de búsqueda 5 números aleatorios y crear un menú con las siguientes operaciones: 

  a) Buscar y eliminar un valor.

  b) Calcular el promedio de los nodos hoja.

  c) Calcular la cantidad de niveles que tiene el árbol.
 */
package preparacionfinal;

import java.util.Scanner;


public class AO2_3 {
    
     public static void main (String []arg)
    {
       
       int x ;
       char op;
       ArbolBus a= new ArbolBus();
       Scanner sn=new Scanner(System.in);
       System.out.println(" Ingrese 5 numeros aleatorios: ");
       
       for(int i=0; i<10; i++)
       {
           x=sn.nextInt();
           a.ingresarBus(x);                    
       } 
       System.out.println(" Impresion del Arbol: ");
       a.impCentral();
       System.out.println(" ");
       
       do{
           System.out.println(" Eliga una opcion: ");
           System.out.println(" a) Buscar y eliminar un valor. ");
           System.out.println(" b) Calcular el promedio de los nodos hoja. ");
           System.out.println(" c) Calcular la cantidad de niveles que tiene el árbol. ");          
           System.out.println(" d) Salir. ");
           op=sn.next().charAt(0);
           switch(op)
           {
               case 'a':
                   System.out.println(" Ingrese el valor a eliminar: ");
                   x=sn.nextInt();
                   a.eliminar(x);
                   System.out.println(" Arbol resultante: ");
                   a.impCentral();
                   System.out.println("  ");                  
                   break;
               case 'b':
                   System.out.println(" Promedio de los nodos hoja: "+a.promedio());                  
                   break;
               case 'c':
                   System.out.println(" Cantidad de niveles del árbol: "+a.altura());                   
                   break;
               
               
           }
           
       }
       while(op!='e');
}
}

class ArbolBus extends Arbol{
    int cont, sum, h;
    float prom;
    
    public float promedio()
    {
        sum=0;
        cont=0;       
        hojas(raiz);    
        prom=((float)sum/cont);
        return prom;
    }
    public void hojas(NodoAr r)
    {
        if(r!=null)
        {
            if(r.getDer()==null && r.getIzq()==null)
            {
                cont++;
                sum=sum+r.getInfo();
            }
            hojas(r.getIzq());
            hojas(r.getDer());
        }
        
    }
    public int altura()
    {
        h=0;
        nivel(raiz, 1);
        return h;       
    }
    public void nivel(NodoAr r, int nivel)
    {
        if(r!=null)
        {                                
           h=nivel;         
           nivel(r.getIzq(), nivel+1);
           nivel(r.getDer(), nivel+1); 
          
        }
    }
    
    
    
    public boolean eliminar(int d)
{
    
    NodoAr auxiliar=raiz;
    
    NodoAr r= raiz;
    boolean esHijoIzq= true;
    
    while(auxiliar.info!=d)
    {
        
        r= auxiliar;
        if(d<auxiliar.info)
        {
            esHijoIzq=true;
            auxiliar=auxiliar.izq;
        }
        else
        {
            esHijoIzq= false;
            auxiliar=auxiliar.der;
            
        }
        if (auxiliar==null)
        {
            return false;
        }
    }
    if (auxiliar.izq==null && auxiliar.der==null )
    {
        if (auxiliar==raiz)
        {
            raiz=null;
        }
        else if (esHijoIzq)
        {
            
            r.izq=null;
        }
        else {
            r.der=null;
        }
    }
    else if (auxiliar.der==null)
    {
        if (auxiliar==raiz)
        {
            raiz=auxiliar.izq;
        }
        else if (esHijoIzq)
        {
            r.izq=auxiliar.izq;
        }
        else {
            r.der=auxiliar.izq;
        }
        
    }
    else if (auxiliar.izq==null)
    {
        if (auxiliar==raiz)
        {
            raiz=auxiliar.der;
        }
        else if (esHijoIzq)
        {
            r.izq=auxiliar.der;
        }
        else {
            r.der=auxiliar.der;
        }
        
    }
    else{
        NodoAr reemplazo= obtenerNodoReemplazo(auxiliar);
        if(auxiliar==raiz)
        {
            raiz=reemplazo;
        }
        else if (esHijoIzq)
        {
            r.izq=reemplazo;
        }
        else{
            r.der= reemplazo;
        }
        reemplazo.izq=auxiliar.izq;
        }
    return true;

}
//metodo encargado de devolvernos el nodo reemplazo
public NodoAr obtenerNodoReemplazo(NodoAr nodoReemp)
{
    NodoAr reemplazarPadre= nodoReemp;
    NodoAr reemplazo=nodoReemp;
    NodoAr auxiliar= nodoReemp.der;
    while(auxiliar!=null)
    {
        reemplazarPadre= reemplazo;
        reemplazo= auxiliar;
        auxiliar=auxiliar.izq;
    }
    if(reemplazo!=nodoReemp.der)
    {
        reemplazarPadre.izq= reemplazo.der;
        reemplazo.der = nodoReemp.der;
    }
    System.out.println(" El nodo Reemplazo es " + reemplazo);
    return reemplazo;
    
}

   
}
