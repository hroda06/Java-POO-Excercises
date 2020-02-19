
package preparacionfinal;


public class Cola
{
	   protected int  elemento [] ;
	   protected int frente; 
	   protected int fin;
	   protected int maxcola;
           
 // constructor del objeto sin parametros (para cuando no necesito utilizar Scanner y cambiar el valor de algun atributo)
         
     public Cola ()      
     {   
      frente=0;
      fin=0;
      maxcola=100; // valor por defecto de cola siempre y cuando no ingrese un valor propio por teclado con Scanner
      elemento= new int[maxcola]; // creo el elemento con el valor maxcola por defecto=10
     }
// constructor del objeto con parametros ( se crea por si necesito introducir algun parametro propio (en este caso valor de maxcola) por teclado con Scanner
     public Cola (int max)      
     {   
      frente=0;
      fin=0;
      maxcola=max; // valor de maxcola modificado por el valor introducido en teclado con Scanner
      elemento= new int[maxcola]; // creo el elemento con el valor maxcola pasado por parametro
     }

   public boolean colaVacia()
    {
      if (fin == frente)
	       return( true );
	     else
	       return ( false ); 
    }

public boolean insertarEnCola(int x )
 { boolean exito;
  fin=(fin+1) % maxcola;
  if( frente==fin)
		   { exito=false;
		    
		    if (fin==0 )
				 fin=maxcola-1;
			       else
				 fin=fin-1;

		   }
		  else
		   {
		    elemento[fin]=x;
		    exito=true;
		   }
  return exito; 
 }

 public int  sacarDeCola( )
 { int x=-1;
  if ( colaVacia() )
		{
		 System.out.println(" Cola Vacia ");
		}
	    else
		{  frente = (frente+1) % maxcola;
		   x=elemento[frente];
		 }
 return x;

 }
 
 public void ordenarCola(int cant)
        {
            int vec[]=new int[cant];
            int c=0, aux;           
            boolean band=false;
            //De cola a vector
            while(!this.colaVacia())
            {
                vec[c]=sacarDeCola();
                c++;
            }
            //Ordenamiento burbuja
            while(!band)
            {
                band=true;
                for(int i=0; i<cant-1; i++)
                {
                    if(vec[i]>vec[i+1])
                    {
                        aux=vec[i];
                        vec[i]=vec[i+1];
                        vec[i+1]=aux;
                        band=false;
                        
                    }
                }
            }
            // De vector a cola
            for(int i=0; i<cant; i++)
            {
                insertarEnCola(vec[i]);
            }
        }
}