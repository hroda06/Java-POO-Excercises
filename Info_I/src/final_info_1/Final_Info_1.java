/*
1.ingreso de datos
2.ciudades ordenadas por nombre
3.busqueda de datos de ciudad por nombre / si no existe dar msj
4.ciudades con mas de 5000km2 / si no hay dar msj
5.ciudad por cantidad de habitantes de mayor a menor
6.salir
 */
package final_info_1;

import java.util.Scanner;

/**
 *
 * @author HERNAN
 */
public class Final_Info_1 {

   

    static  String nombre[];
   static  int canthab[];
   static  int superficie[];
   static  int c=0;
   static  int n;
   static String buscar;
   static int p;
    public static void main(String[] args)
     {
        
        
        Scanner sn=new Scanner(System.in);
        System.out.println("ingrese cantidad de ciudades");
        n=Integer.parseInt(sn.nextLine());
        nombre= new String[n];
        canthab= new int[n];
        superficie=new int[n];
        while(c!=6)
        {
        	System.out.println("eliga una opcion");
        	System.out.println("1.ingreso de datos");
        	System.out.println("2.ciudades ordenadas por nombre");
        	System.out.println("3.busqueda de datos de ciudad por nombre");
        	System.out.println("4.ciudades con mas de 5000km2");
        	System.out.println("5.ciudad por cantidad de habitantes de mayor a menor");
        	System.out.println("6.salir");
        	c=Integer.parseInt(sn.nextLine());
        	
        	switch(c)
        	{
        		
        		case 1:
        		ingreso(nombre, canthab, superficie);
        		break;
        		case 2:
        			ordenar(nombre, canthab, superficie);
        			mostrar(nombre, canthab, superficie);
        			break;
        		case 3:
        			buscar();
    			if(p!=-1)
    			{
    				System.out.println(" nombre: "+nombre[p]);
    				System.out.println(" cantidad de habitantes: "+canthab[p]);
    				System.out.println(" superficie: "+superficie[p]);
    				
    			}	
    				else {
    				
    					System.out.println(" no se encuentra la ciudad ");
    				}
        			break;
        		case 4:
        			mostrar2(nombre, canthab, superficie);
        			
        			break;
        		case 5:
        			ordenar2(nombre, canthab, superficie);
        			mostrar(nombre, canthab, superficie);
        			
        			break;
        			
        	    }
        	
        	
        }
        
        
    }
    
    static void ingreso(String nombre[], int canthab[], int superficie[])
    {
    	for(int i=0;i<canthab.length;i++)
    	{
    	
    	Scanner sn=new Scanner(System.in);
    	System.out.println("ingrese nombre");
    	nombre[i]=sn.nextLine();
    	
    	System.out.println("ingrese cantidad de habitantes");
    	canthab[i]=Integer.parseInt(sn.nextLine());
    	
    	System.out.println("ingrese superficie");
    	superficie[i]=Integer.parseInt(sn.nextLine());
    	}
    	
    	
    	
    }
    
    static void ordenar(String nombre[], int canthab[], int superficie[])
    
    {
    	int a;
    	int indice;
    	a=canthab.length-1;
    	while (a>0)
    	{
    		indice=0;
    		 for(int i=0; i<a; i++)
    		 {
    		 	if (nombre[i+1].compareToIgnoreCase(nombre[i])<0)
    		 	{
    		 		String aux1=nombre[i];
    		 		nombre[i]=nombre[i+1];
    		 		nombre[i+1]=aux1;
    		 		
    		 		int aux2=canthab[i];
    		 		canthab[i]=canthab[i+1];
    		 		canthab[i+1]=aux2;
    		 		
    		 		int aux3=superficie[i];
    		 		superficie[i]=superficie[i+1];
    		 		superficie[i+1]=aux3;
    		 		
    		 	
    		 		
    		 		indice=i;
    		 	}
    		 }
    		 a=indice;
    	}
    }
    	static void mostrar(String nombre[], int canthab[], int superficie[])
    {
    	for (int i=0; i<canthab.length; i++)
    	{
    		
    		    System.out.println(" nombre: "+nombre[i]);
    			System.out.println(" cantidad de habitantes: "+canthab[i]);
    			System.out.println(" superficie: "+superficie[i]);
    			
    			
    	}
    }
    static void buscar()
    {
    	Scanner sn=new Scanner (System.in);
    	System.out.println(" ingrese ciudad a buscar");
    	buscar=sn.nextLine();
    	p=encontrar(nombre, canthab, superficie);
    	
    	
    }
    static int encontrar (String nombre[], int canthab[], int superficie[])
    {
    	for(int i=0; i<canthab.length; i++)
    		if(buscar.equals(nombre[i]))
    			return i;
    			return -1;
    }
    static void mostrar2(String nombre[], int canthab[], int superficie[])
    {
        int sup=5000;
        int cont=0;
    	for (int i=0; i<canthab.length; i++)
    	{
    		if(superficie[i]>sup)
    		{
    		
    		    System.out.println(" nombre: "+nombre[i]);
                    System.out.println(" cantidad de habitantes: "+canthab[i]);
                    cont=1;
    			
    		}
                
    			
    	}
       if (cont==0) 
       { System.out.println(" no hay ciudades de mas de 5000 habitantes ");}
    }
    static void ordenar2(String nombre[], int canthab[], int superficie[])
   {
    	int i,j;
    					int indice;
    					j=canthab.length-1;
    					while(j>0)
                       {
                             indice=0;
                             for (i=0;i<j;i++)
                             {
                                if(canthab[i+1]>canthab[i])
                              { 
                              	String aux1=nombre[i];
    		 		            nombre[i]=nombre[i+1];
    		 		            nombre[i+1]=aux1;
    		 		
    		 		           int aux2=canthab[i];
    		 		           canthab[i]=canthab[i+1];
    		 		          canthab[i+1]=aux2;
    		 		
    		 		          int aux3=superficie[i];
    		 		          superficie[i]=superficie[i+1];
    		 	          	superficie[i+1]=aux3;
    						
    						
    						
    						indice=i;
                              }
                             }
                             j=indice;
                       }
   	}
   	
    
    
    
    
    
    
}