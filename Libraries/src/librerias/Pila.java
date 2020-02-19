
package librerias;

/**
 *
 * @author HERNAN
 */
public class Pila {
     
protected int elemento[]; 
protected int top; 
protected int maxpila; 


public Pila() 
{ top=0;
maxpila=100; 
elemento =new int[maxpila]; 
}
public Pila(int max) 
{ top=0;
maxpila=max; 
elemento =new int[maxpila]; 
}

public boolean pilaVacia()
{ if(top==0)
return true;
else
return false;
}

public boolean pilaLlena()
{
if(top == maxpila )
return true;
else
return false;
}

public boolean ponerPila(int x)
{ boolean exito; 
if( pilaLlena() ) 
{
exito=false;
}
else
{ elemento[top]= x;
top ++;
exito=true; 
}
return exito;
}

public int sacarPila()
{ int aux=-1; 
if( pilaVacia() ) 
{System.out.println("\t Pila Vacia ");
}
else
{ top-- ; 
aux=elemento[top]; 
}
return aux;
}











//METODO EXTERNO PARA ORDENAR UNA PILA CON VECTOR PASADO POR PARAMETRO O CALCULADO
public void ordenarPila()
        {
            int vec[]=new int[5];
            int c=0, aux;           
            boolean band=false;
            
            while(!this.pilaVacia())
            {
                vec[c]=this.sacarPila();
                c++;
            }
            
            while(!band)
            {
                band=true;
                for(int i=0; i<4; i++)
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
            
            for(int i=0; i<5; i++)
            {
                this.ponerPila(vec[i]);
            }
        }

//METODO EXTERNO PARA BUSCAR UN VALOR PASADO POR PARAMETRO EN UNA PILA
public void buscar (int x)
    {
       int a;
       int b=0;
       
       while(!this.pilaVacia())
       {
           a=this.sacarPila();
           if(a==x)
           {
               b=1;
           }          
       }
    if (b==1)
        System.out.println("el valor  se encuentra en la pila");
    else
    {
        System.out.println("el valor  no existe");
    }
    }
    
}

/*
System.out.println("ingrese un numero iesimo a eliminar: ");
        n=sn.nextInt();
        c=0;
        while(!p.pilaVacia())
        {
         
               x=p.sacarPila();
               paux.ponerPila(x);
               c++;
               if(c==n)
               {
                  paux.sacarPila();              
               }               
            
        }
*/
    

