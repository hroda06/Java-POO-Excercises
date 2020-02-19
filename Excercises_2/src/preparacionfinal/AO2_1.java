/*
 1. Cargar en una lista lineal 6 valores aleatorios y crear los métodos calcularPromedio() y mostrarLista().
 Luego separar los números pares en una lista circular y los impares en una lista doblemente enlazada.
 Para cada lista resultante (lista circular y doblemente enlazada) crear los métodos contarElemento(),
 calcularSumatoria() y calcularPromedio(). Finalmente mostrar por pantalla todos los resultados.
 */
package preparacionfinal;

import java.util.Scanner;
public class AO2_1 {
    public static void main(String[]args)
    {   
        int x;
        Scanner sn=new Scanner(System.in);
        ListaHijo a= new ListaHijo();
        ListaCirHija b= new ListaCirHija();
        ListaDobleHija c= new ListaDobleHija();
        
        System.out.println("ingrese 6 valores a la lista: ");
        for(int i=0; i<6; i++)
        {
           x=sn.nextInt();
           a.insertarFinal(x);
           if(x%2==0)
              {              
                b.insertarCircular(x);
              }
            else
               {
                c.insertarDoble(x);
               }
           }
               
        System.out.println("Impresion de la lista: ");
        a.mostrarLista();
        System.out.println("Promedio de la lista: ");
        System.out.println(a.calcularPromedio()); 
        
        b.imprimirCircular();   
        System.out.println("Cantidad de Nodos: "+b.contarElemento());
        System.out.println("Sumatoria de Nodos: "+b.calcularSumatoria());
        System.out.println("Promedio de los nodos: "+b.calcularPromedio());
        
        c.imprimirLista();
        System.out.println("Cantidad de Nodos: "+c.contarElemento());
        System.out.println("Sumatoria de Nodos: "+c.calcularSumatoria());
        System.out.println("Promedio de los nodos: "+c.calcularPromedio());
        
        
       
        
        
        
      
        
    }
    
    
}

class ListaHijo extends Lista{
    
    int cont, sum;
    float prom;
    
    
    
    public float calcularPromedio()
    {
        sum=0;
        cont=0;        
        Promedio(frente);
        prom=(float)sum/cont;
        return prom;
    }
    public void Promedio(Nodo p)
    {
        
        p=frente;
        
        while(p!=null)
        {
            
            sum=sum+p.getInfo();
            cont ++;    
            p=p.getEnlace();
        }
        
    }
    
    public void mostrarLista() //ES LO MISMO QUE IMPRIMIRLISTA(). LO HAGO POR LA CONSIGNA NOMAS
    {
        Nodo p;
        p=frente;
        System.out.println(" Impresion de la lista de enteros ");
         while (p!=null)
         { System.out.print(" "+p.toString());
           p=p.getEnlace(); // recorro la lista utliziando la referencia auxiliar P
         }
          System.out.println( );
    }
}

class ListaCirHija extends ListaCircular
{
    public int contarElemento()
    {
        int cant=1;
        NodoCir p;
        p=frente.getEnlace();
        while (p!=frente)
          {cant++;
           p=p.getEnlace();
          }
        return cant;
}
      
      public int calcularSumatoria() 
      {
        int sum=0;
        NodoCir p;
        
        p=frente.getEnlace();
        
        while (p!=frente)
          {
           sum=sum+frente.getInfo();
           p=p.getEnlace();
          }
        return sum;
      }
            
        public float calcularPromedio()
        {
            
            float prom=((float)this.calcularSumatoria()/this.contarElemento());
            return prom;
            
        }
    
}

class ListaDobleHija extends ListaDoble{
    
    public int contarElemento()
    {
        int cant=0;
        NodoLisDoble p;
         p=frente;
        while (p!=null)
          {  cant++;
             p=p.getProx();
          }
        return cant;
}
         
      public int calcularSumatoria() 
      {
          int sum=0;
        NodoLisDoble p;
         p=frente;
        while (p!=null)
          {  
              sum=sum+p.getInfo();
             p=p.getProx();
          }
         return sum;
      }
            
        public float calcularPromedio()
        {
            float prom=((float)this.calcularSumatoria()/this.contarElemento());
            return prom;
        }
    
    
}

