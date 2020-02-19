
package librerias;

/**
 *
 * @author HERNAN
 */
public class Cola
{
   protected int  elemento [] ;
   protected int frente; 
   protected int fin;
   protected int maxcola;
           
         
     public Cola ()      
     {   
      frente=0;
      fin=0;
      maxcola=100; 
      elemento= new int[maxcola]; 
     }

     public Cola (int max)      
     {   
      frente=0;
      fin=0;
      maxcola=max; 
      elemento= new int[maxcola]; 
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
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 //METODO EXTERNO PARA ORDENAR UNA COLA CON VECTOR PASADO POR PARAMETRO O CALCULADO
 public void ordenarCola(int cant)
        {
            int vec[]=new int[cant];
            int c=0, aux;           
            boolean band=false;
            //De cola a vector
            while(!this.colaVacia())
            {
                vec[c]=this.sacarDeCola();
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
                this.insertarEnCola(vec[i]);
            }
        }
 
 //METODO EXTERNO PARA BUSCAR UN VALOR PASADO POR PARAMETRO EN UNA COLA
  public void buscar (int x)
    {
       int a;
       int b=0;
       
       while(!this.colaVacia())
       {
           a=this.sacarDeCola();
           if(a==x)
           {
               b=1;
           }          
       }
    if (b==1)
        System.out.println("el valor  se encuentra en la cola");
    else
    {
        System.out.println("el valor  no existe");
    }
}
  //METODO EXTERNO IMPRIMIR COLA 
  public void imprimirCola()
  {
      int x;       
      while(!this.colaVacia())
      {
          x=this.sacarDeCola();
          System.out.println(x);
          
      }
  }
 
 
 
}
