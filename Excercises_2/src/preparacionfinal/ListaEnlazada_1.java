/*  5. Implemente la clase lista doblemente enlazada. Cargue una lista doblemente enlazada cuyo campo Info contenga
    Legajo. Muestre la información de todos los nodos anteriores a aquel cuyo legajo se ingresa por teclado.
*/
package preparacionfinal;

import java.util.Scanner;


public class ListaEnlazada_1 {
    
    public static void main(String[]args){
        int x;
        buscarDoble a= new buscarDoble();
        Scanner sn=new Scanner(System.in);
        System.out.println(" ingrese un legajo:  0=FIN");
        x=sn.nextInt();
        while(x!=0)
        {
            a.insertarDoble(x);
            System.out.println(" ingrese un legajo:  0=FIN");
            x=sn.nextInt();
        }
        a.imprimirLista();
        System.out.println(" ingrese el legajo de referencia:  0=FIN");
        x=sn.nextInt();
        a.buscare(x);
        
        
    }
 
}

  class buscarDoble extends ListaDoble{               
   
 public void buscare(int x) //redefino el metodo buscar de la listaDoble original para la consigna
  {
     NodoLisDoble p;
     p=frente;
while(p!=null && p.getInfo()!=x)
   {
       p=p.getProx();
   }
if(p!=null)

{
    System.out.println("los legajos anteriores a "+x+" son:  ");
    while(p.getAnt()!=null)
      {
          System.out.println(p.getAnt().getInfo());
          p=p.getAnt();
      }
}
else 
  {
    System.out.println("el legajo no se encuentra ");
  }
}
 
    }
  
