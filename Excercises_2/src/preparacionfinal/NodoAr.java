
package preparacionfinal;

public class NodoAr
{  protected  int info ;
   protected  NodoAr der ;
   protected  NodoAr izq ;
 public NodoAr()
 { info=0;
   der=null;
   izq=null;
 } 
 public NodoAr(int x,NodoAr de,NodoAr iz)
 { info=x;
   der=de;
   izq=iz;
 } 

public void insertarNodo( int x )//SOLO SE UTILIZA EN ARBOLES DE BUSQUEDA. (NO LOS BINARIOS)
{
    if ( x > info  )
      {   if(der==null)         	
             der = new  NodoAr(x,null,null) ;
          else
            der.insertarNodo(x); 
      }
     else
      {   if(izq==null)
            izq= new NodoAr(x,null,null);
          else   
            izq.insertarNodo(x);

      } 
}

 
 public void setInfo(int x)
 {info=x;
 }
 public void setDer(NodoAr de)
 {der=de;
 }
 public void setIzq(NodoAr iz)
 {izq=iz;
 }
 public int getInfo() 
 { return info;
 }
 public NodoAr getDer()
 {return der;
 }

 public NodoAr getIzq()
 {return izq;
 }
 
 public String  toString()
    { return ("\t"+info);   
    }	


}