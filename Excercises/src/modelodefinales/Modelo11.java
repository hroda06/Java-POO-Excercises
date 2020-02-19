/*
1)Se tiene una cola con los números de los clientes de un banco. Imprimir Cola. 
 a.Cargar los números  en un árbol binario de búsqueda, recorrerlo y guardar los impares en una lista. Mostrar la lista.
 b.Imprimir el árbol por niveles.
 */
package modelodefinales;

import java.util.Scanner;


public class Modelo11 {
    public static void main(String[]args){
    int x;  
    Scanner sn= new Scanner(System.in);    
    Cola a=new Cola();
    Arbole b= new Arbole();    
    System.out.println(" cargar Nro de cliente: 0=FIN");
    x=sn.nextInt();
    while(x!=0)
    {
        a.insertarEnCola(x);       
        System.out.println(" ccargar Nro de cliente: 0=FIN");
        x=sn.nextInt();
    }
    System.out.println(" Impresion de la cola: ");
    while(!a.colaVacia())
    {
        x=a.sacarDeCola();
        System.out.println(x);
        b.ingresarBus(x);
    }
    System.out.println(" Impresion de la Lista de impares: ");
    b.mostrarLista();   
    System.out.println(" Impresion del arbol por niveles: ");
       
    int al=b.calculaAltura();    
    for(int i=1;i<=al;i++)
        {
            System.out.println("\n nodos del nivel "+i+" = "); 
            b.imprimirNivel(i);
        }
    System.out.println(" "); 
    
    }
    
}
class Arbole extends Arbol
{
    int x, h;
    Lista a =new Lista();
    
    public void imprimirNivel(int i) 
	{
		impNivel(raiz,1,i);
 	}
 	protected void impNivel(NodoAr r, int nivel,int i)
	{
		if (r!=null)
		{
	  		if (i==nivel) 
	   		{
	   			System.out.print("  "+r.getInfo());
	   		}
	  		impNivel (r.getIzq(),nivel+1,i); 
	  		impNivel (r.getDer(),nivel+1,i);
		}
	}
        
    public void mostrarLista()
    {
        listaArbol(raiz);
        a.imprimirLista();
    }
    public void listaArbol(NodoAr r)
    {
        if(r!=null)
        {
            if(r.getInfo()%2!=0)
            {
               x=r.getInfo();
               a.insertarFinal(x);
            }
            listaArbol(r.getIzq());
            listaArbol(r.getDer());
        }
        
    }
    public int calculaAltura() 
	{
		h=0;
  		altura(raiz,1);
  		return h;
	}
	protected void altura (NodoAr r, int nivel) 
	{
		if (r!=null)
		{
                    if(h<nivel)
                    {
		        h=nivel;
			altura (r.getIzq(),nivel+1);
			altura (r.getDer(),nivel+1);
                    }
		}
	}
        
        
    
}


