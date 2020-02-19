/*
EJERCICIO NRO 2
*/
package final_infoii_roda_hernan;

import java.util.Scanner;
public class Lista1 {
    
    public static void main(String[]args)
    {
        int x;
        Scanner sn=new Scanner(System.in);
        ArbolHijo a= new ArbolHijo();
        System.out.println("ingresar las ventas de la empresa: 0=FIN");
        x=sn.nextInt();
        while(x!=0)
        {
            a.ingresarBus(x);
            System.out.println("ingresar las ventas de la empresa: 0=FIN");
            x=sn.nextInt();
            
        }
        System.out.println("Arbol resultante: ");
        a.impCentral();
        System.out.println(" ");
        a.mostrarLista();
        System.out.println(" ");
        a.mostrarPila();
        
        

        
}
}
    
class ArbolHijo extends Arbol
{
    int x;
    ListaCircular li= new ListaCircular();
    Pila p=new Pila();
    
    public void mostrarLista()
    {
        mayores(raiz);
        System.out.println("Lista circular con valores mayores a 2000: ");
        li.imprimirCircular();
        
        
    }
    
    public void mostrarPila()
    {
        menores(raiz);
        System.out.println("Pila restante con los demas valores: ");
        while(!p.pilaVacia())
        {
            x=p.sacarPila();
            System.out.println(x);
        }
    }
    
    public void mayores(NodoAr r)
    {
        if(r!=null)
        {
            if(r.getInfo()>2000)
            {
                li.insertarCircular(r.getInfo());
            }
            
            mayores(r.getIzq());
            mayores(r.getDer());
            
        }
    }
        
        public void menores(NodoAr r)
        {
           if(r!=null)
           {
            if(r.getInfo()<=2000)
            {
                p.ponerPila(r.getInfo());
            }          
          
            menores(r.getIzq());
            menores(r.getDer());
            
        }
       }
    
}
       
