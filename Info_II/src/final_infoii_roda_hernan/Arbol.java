/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_infoii_roda_hernan;

import java.util.Scanner;

public class Arbol
{ 
    protected  NodoAr raiz ;
    
  public Arbol()
  {
      raiz=null;
  }
  
public void ingresar (int n) // genera un arbol equilibrado
{
    raiz = crearNodos(n);
}
protected NodoAr  crearNodos(int n)
{  
    Scanner sn=new Scanner(System.in);
    int ni,nd;
    int x;
    NodoAr nuevoNodo;

     if (n==0)
      return null;
     else
      {
       ni=n / 2;
       nd=n-ni-1;
       nuevoNodo=new NodoAr();
       System.out.print(" Ingrese un Numero :");
       x=sn.nextInt();
       nuevoNodo.setInfo(x);
       nuevoNodo.setIzq(crearNodos(ni));
       nuevoNodo.setDer(crearNodos(nd));
       return (nuevoNodo);
      }
}
public void ingresarBus(int x )// genera un nodo en un arbol de busqueda
{ if(raiz==null)
    raiz=new NodoAr(x,null,null);
  else
   raiz.insertarNodo(x);
}
public void impPreOrden()
{ preOrden(raiz);
}
protected void preOrden( NodoAr r)
{
 if ( r!=null )
  { System.out.print("  "+r.getInfo());
    preOrden(r.getIzq());
    preOrden(r.getDer());
  }
}
public void impCentral()
{  central(raiz);
}
protected void central( NodoAr  r)
{
 if ( r!=null )
  { central(r.getIzq());
     System.out.print("  "+r.getInfo());
    central(r.getDer());
  }
    
}
public void impPostOrden()
{ postOrden(raiz);
}

protected void postOrden( NodoAr r)
{
 if (r!=null)
  {
   postOrden(r.getIzq());
   postOrden(r.getDer());
    System.out.print("  "+r.getInfo());
  }
}

public boolean buscarNumero(int x) //metodo que se basa en los datos del metodo "busqueda" para retornar un resultado
{ if(busqueda(raiz,x)==null)
return false; // si retorna falso el numero x no se encontro--> es decir busqueda==null
else
return true; //si no es null el metodo es true--> es decir el numero x se encontro
}



protected NodoAr busqueda( NodoAr r,int x) 
{ if ( r!=null )
{ if(x==r.getInfo())
return r;
else
if (r.getInfo() > x )
return busqueda(r.getIzq(),x);
else
return busqueda(r.getDer(),x);
}
else
return null;
}


}