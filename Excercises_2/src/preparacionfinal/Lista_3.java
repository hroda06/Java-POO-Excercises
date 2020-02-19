//3. Genere una lista lineal, inviértala y muéstrela.
package preparacionfinal;
import java.util.Scanner;

public class Lista_3 {
    
    public static void main(String[]args){
        int x, n;
        ListaInvertida a=new ListaInvertida();
        Scanner sn=new Scanner(System.in);
        System.out.println(" ingrese un numero:  0=FIN");
        x=sn.nextInt();
        while(x!=0)
        {
            a.insertarFinal(x);
            System.out.println(" ingrese un numero:  0=FIN");
            x=sn.nextInt();
        }
        a.invertir();
        a.imprimirLista();
        
    
}
}

class ListaInvertida extends Lista{
    Lista LA=new Lista();
    
    public void invertir()
    {        
        int x;
        Nodo p;  
        // SE CARGA LA LISTA AUXILIAR CON LOS VALORES INVERTIDOS DE LA LISTA ORIGINAL
        while(frente!=null)
        {
            x=this.borrarPri(); //utilizo el metodo borrarPri que me devuelve el primer valor de la lista original y lo guardo en x
            LA.insertarAntes(x); //inserto el valor x en la lista auxiliar con el metodo "insertarAntes cosa que cada valor que saco de la lista original se guarda primero que el anterior guardado y se va invirtiendo la lista original en la auxiliar                
        }
        p=LA.frente; // asigno el nodo p como frente de la lista auxiliar LA
        //SE CARGA LA LISTA ORIGINAL NUEVAMENTE CON LOS VALORES DE LA LISTA AUXILIAR(YA INVERTIDOS)
        while(p!=null) //mientras que p no sea el ultimo numero de la lista...
        {            
            this.insertarFinal(p.getInfo()); //voy insertando al final de la lista original los valores (pasados por parametro(p.getInfo)) de la lista auxiliar LA
            p=p.getEnlace(); // y asigno al nodo p el enlace del siguiente nodo de la lista auxiliar por el metodo "p.getEnlace()--> es decir cambia su referencia de LA.FRENTE al siguiente enlace de la lista auxiliar y asi hasta que el enlace siguiente es= null y termina el while
        }
        
    }
    
    
}