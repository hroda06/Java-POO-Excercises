/*
 5. Generar una lista ordenada con los datos correspondientes a una secuencia de números enteros,
 los cuales pueden aparecer repetidos. Se pide generar un árbol a partir de esta lista, evitando
 la repetición de números en el mismo. Imprimir el árbol resultante por niveles.
 */
package preparacionfinal;

import java.util.Scanner;


public class AO2_5 {
    public static void main (String []arg)
    {      
       int x, cant ;      
       ListaOrd a= new ListaOrd();
       ArbolNuevo b= new ArbolNuevo();
       Scanner sn=new Scanner(System.in);
       System.out.println(" Ingrese un numero:  0=FIN");
       x=sn.nextInt();
       while(x!=0)
       {
           a.insertarFinal(x);
           System.out.println(" Ingrese un numero:  0=FIN");
           x=sn.nextInt();
           
       }
       cant=a.contar();            
       a.ordenarLista(cant);      
       a.imprimirLista();
       
       while(a.frente!=null)
       {
           x=a.borrarPri();          
           if(b.buscarNumero(x)==false)
           {
              b.ingresarBus(x);
           }          
       }
       System.out.println(" arbol busqueda impreso"); 
       b.impCentral();    
       System.out.println(" ");
       System.out.println(" arbol busqueda impreso por niveles: ");
       b.impreso();    
      /* (metodo para ingresar a un arbol equilibrado pero no logro hacerlo funcionar)
       b.ingresarOrdenado(cant);      
       System.out.println(" impresion del arbol equilibrado");      
       b.impCentral();
      */  
}
}

    
class ListaOrd extends Lista
{
        public void ordenarLista(int cant)
        {            
            int vec[]=new int[cant];
            int c=0, aux;           
            boolean band=false; //lo inicializo band en falso para el while se haga mientras es falso
            //De Lista a vector
            while(frente!=null)
            {
                vec[c]=this.borrarPri(); //voy sacando el primero de la lista y lo guardo en el vector hasta que el frente de la lista es = null
                c++; // incremento el vector en 1
            }
            //Ordenamiento burbuja
            while(band==false)
            {
                band=true; //una vez dentro del while el band es true ya que esta antes que el for, y si el for no se ejecuta xq termino su condicion pasa de largo y el while queda =true y se corta el ciclo
                for(int i=0; i<cant-1; i++)
                {
                    if(vec[i]>vec[i+1]) // este signo ">" ordena de menor a mayor. Si se cambia a "<" ordena de mayor a menor
                    {
                        aux=vec[i];
                        vec[i]=vec[i+1];
                        vec[i+1]=aux;
                       band=false;
                        
                    }
                }
            }
            // De vector a Lista
            for(int i=0; i<cant; i++)
            {
                this.insertarFinal(vec[i]);
            }
        }
        
        
    }


class ArbolNuevo extends Arbol 
{
    int h;
    public void impreso()
    {
        h=0;
        imprimir(raiz, 1);       
    }
   
public void imprimir(NodoAr r, int nivel)        
{
    if(r!=null)
    {
        h=nivel;
        System.out.println(" nodos del nivel "+h+": "+r.getInfo());    
        imprimir(r.getIzq(), nivel+1);
        imprimir(r.getDer(), nivel+1);
        
    }
    
}
 /*   
    public void ingresarOrdenado (int cant) // genera un arbol equilibrado
{
    raiz = this.crearNodos2(cant);
}
    
   public NodoAr  crearNodos2(int cant)
{
    
    ListaOrd a= new ListaOrd();
    
    int ni,nd;
    int x;
    NodoAr nuevoNodo;

     if (cant==0)
      return null;
     else
      {
       ni=cant / 2;
       nd=cant-ni-1;
       nuevoNodo=new NodoAr();      
       x=a.borrarPri();
       System.out.println("numero extraido "+x);
       nuevoNodo.setInfo(x);
       nuevoNodo.setIzq(crearNodos2(ni));
       nuevoNodo.setDer(crearNodos2(nd));
       return (nuevoNodo);
      }
}
*/
}
