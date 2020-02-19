
package librerias;

/**
 *
 * @author HERNAN
 */
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
//METODO EXTERNO BASADO EN EL METODO DE ABAJO PARA UTILIZARLO Y BUSCAR UN NUMERO EN EL ARBOL BUSQUEDA
public boolean buscarNumero(int x) //metodo que se basa en los datos del metodo "busqueda" para retornar un resultado
{ if(busqueda(raiz,x)==null)
return false; // si retorna falso el numero x no se encontro--> es decir busqueda==null
else
return true; //si no es null el metodo es true--> es decir el numero x se encontro
}


// METODO EXTERNO PARA REALIZAR UNA BUSQUEDA EN UN ARBOL DE BUSQUEDA (sacado de la guia)
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

















//METODO EXTERNO CALCULAR PROMEDIO ARBOL 
public float promedio()
    {
        int sum=0;
        int cont=0;       
        hojas(raiz);    
        float prom=((float)sum/cont);
        return prom;
    }
    public void hojas(NodoAr r)
    {
        int cont=0;
        int sum=0;
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
    
    //METODO EXTERNO CALCULAR ALTURA DEL ARBOL
    public int altura()
    {
        int h=0;
        nivel(raiz, 1);
        return h;       
    }
    public void nivel(NodoAr r, int nivel)
    {
        int h=0;
        if(r!=null)
        {                                
           h=nivel;         
           nivel(r.getIzq(), nivel+1);
           nivel(r.getDer(), nivel+1); 
          
        }
    }
    
    //METODO EXTERNO CALCULAR PROMEDIO DE NODOS DE UN NIVEL DEL ARBOL
    public float promedio(int i)
{
    int sum=0;
    int cont=0;   
    calcPromedio(raiz, 1, i);
    float prom=((float)sum/cont); //importante tiene que ir debajo del metodo calcPromedio asi los valores sum y cont toman el valor final y calcula. si no calcula el prom con 0/0.
    return prom;    
}

public void calcPromedio(NodoAr r, int nivel, int i)
{
    int cont=0; 
    int sum=0;
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

//METODO EXTERNO IMPRIMIR ARBOL POR NIVELES 
/*
System.out.println(" Impresion del arbol por niveles: ");
       
    int al=b.calculaAltura();    
    for(int i=1;i<=al;i++)
        {
            System.out.println("\n nodos del nivel "+i+" = "); 
            b.imprimirNivel(i);
        }
    System.out.println(" "); 
*/
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
        
        
        
        //METODO EXTERNO PARA CALCULAR EL NODO MAYOR DE UN ARBOL 
        public void May()
    {
        int may=0;
        calcMay(raiz);
        System.out.println("El mayor promedio es: "+may);
    }
    
    
    public int calcMay(NodoAr r)
    {
        int may=0;
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
    
    
    //METODO EXTERNO ELIMINAR UN VALOR pasado por parametro
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

/* MENU OPCIONES CON CHAR
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
*/


// PROMEDIO DE NODOS HOJAS Y NODOS MENORES AL PROMEDIO YA SACADO
/*
public float impHojas()
        {
           cont=0;
           sum=0;
           Hojas(raiz);
           prom=((float)sum/cont);
           System.out.println("promedio de nodos Hoja: "+prom); 
           return prom;
        }
        
        public void Hojas(NodoAr r)
        {
           if(r!=null)
            {
                if(r.getIzq()==null && r.getDer()==null)
                {
                    cont++;
                    sum=sum+r.getInfo();
                    System.out.println(r.getInfo());
                }
                Hojas(r.getIzq());
                Hojas(r.getDer());
            } 
        }
        public int menores(float p)
        {
           cont=0;
           calcMenores(raiz, p);
           return cont;
            
        }
        public void calcMenores(NodoAr r, float p)
        {
            if(r!=null)
            {
                if(r.getInfo()<prom)
                {
                    cont++;                
                }
                calcMenores(r.getIzq(), prom);
                calcMenores(r.getDer(), prom);
            }
        }
*/
