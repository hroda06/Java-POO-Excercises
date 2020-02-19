/*
 3. Se tiene una cola con los resultados de una competencia de triatlón. De cada competidor se conoce:
 número de participante (np) y tiempo total de carrera (t). La cola se encuentra ordenada por tiempo total de carrera (t).
 Los tiempos están expresados en segundos. Hacer una función que agregue un competidor en la cola manteniendo el orden original de ésta.
 */
//COMPLICADO DE HACER CON 2 VARIABLES. NO LO ANALIZO
package preparacionfinal;

import java.util.Scanner;

public class AO1_3 {
    public static void main(String[]args){
        
        int x, n;
        int cant=0;
        Scanner sn=new Scanner(System.in);
       System.out.println("Ingrese tamaño de la Cola");
       n=sn.nextInt();
       
        ColaDatosHeredada c=new ColaDatosHeredada(n);
        ColaDatosHeredada caux=new ColaDatosHeredada(n);
        
        
        System.out.println("Ingresar tiempo en segundos: 0=FIN");
        x=sn.nextInt();
        while(x!=0)
        {  
            cant++;
            c.insertarEnCola(x); 
            System.out.println("Ingresar tiempo en segundos: 0=FIN");
            x=sn.nextInt();
    
       }
        c.ordenarCola(cant);
        System.out.println("Impresion de la Cola original");
        
        while(!c.colaVacia())
      {
          x=c.sacarDeCola();
          caux.insertarEnCola(x);
          System.out.println(x);
          
      }
       System.out.println("Ingrese tiempo en segundos: "); 
       x=sn.nextInt();
       caux.insertarEnCola(x);
       caux.ordenarCola(cant+1);
       System.out.println("Impresion de la Cola modificada");
       while(!caux.colaVacia())
       {
          x=caux.sacarDeCola();
          System.out.println(x);
       }
    }
}

 class ColaDatosHeredada extends AO1_3_ColaDatos
{
    
   public ColaDatosHeredada(int max)
     {   
     	super(max);
     }
	
	void imprimirCola()
        {       
		int auxL=fin;
		int auxF=frente;
		
		System.out.println(" ");
		do{
			AO1_3_Datos aux=new AO1_3_Datos();
			
			aux=this.sacarDeCola();
			
			System.out.println("NOMBRE: "+aux.getNombre()+" - TIEMPO: "+aux.getTiempo());
			
		}while(!colaVacia());
		
		fin=auxL;
		frente=auxF;
	}
 
    
    
}


