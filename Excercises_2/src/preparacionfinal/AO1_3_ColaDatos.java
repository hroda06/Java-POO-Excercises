
package preparacionfinal;


public class AO1_3_ColaDatos {
    
    
    
    protected AO1_3_Datos elemento [] ;
	protected int frente; 
	protected int fin;
	protected int maxcola;
 
    public AO1_3_ColaDatos(){   
     frente=0;
     fin=0;
     maxcola=101;
     elemento= new AO1_3_Datos[maxcola];
    }

    public AO1_3_ColaDatos(int max){   
     	frente=0;
      	fin=0;
      	maxcola=max;
      	elemento= new AO1_3_Datos[maxcola];
     }

   	public boolean colaVacia(){
		if (fin == frente)
	    	return( true );
		else
	    	return ( false ); 
    }

	public boolean insertarEnCola(AO1_3_Datos x ){
		boolean exito;
  		fin=(fin+1) % maxcola;
  		if( frente==fin){
  			exito=false;
		    if (fin==0 )
		    	fin=maxcola-1;
			else
				fin=fin-1;
		}else{
			elemento[fin]=x;
		    exito=true;
		}
  		return exito; 
 	}

 	public AO1_3_Datos sacarDeCola( ){
 		AO1_3_Datos x=null;
  		if ( colaVacia() ){
		 	System.out.println(" Cola Vacia ");
		}else{
			frente = (frente+1) % maxcola;
		   	x=elemento[frente];
		}
 		return x;
 	}
        
        public void ordenarCola(int cant)
        {
            AO1_3_Datos vec[]=new AO1_3_Datos[cant];
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
    
}
    

