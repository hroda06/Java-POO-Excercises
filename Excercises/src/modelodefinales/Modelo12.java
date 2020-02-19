/*
 Dado un árbol que contiene datos enteros, realizar un programa que:
 -Imprima los nodos hoja
 -Calcule el promedio de los nodos hoja
 -Determine cuantos nodos del árbol son menores al promedio
 */
package modelodefinales;

import java.util.Scanner;


public class Modelo12 {
    public static void main(String[]args){
    int x; 
    float p;
    Scanner sn= new Scanner(System.in);       
    Arboles b= new Arboles();    
    System.out.println(" Ingrese un numero: 0=FIN");
    x=sn.nextInt();
    while(x!=0)
    {
        b.ingresarBus(x);
        System.out.println(" Ingrese un numero: 0=FIN");
        x=sn.nextInt();
    }
    System.out.println(" Nodos Hoja: ");
    b.impHojas();
    System.out.println("el promedio de los nodos es: "+b.CalcPromedio());
    p=b.CalcPromedio();
    System.out.println(" Cantidad de Nodos menores al promedio: "+b.menores(p));
    
    
}
}
    class Arboles extends Arbol
    {
        int sum, cont;
        float prom;
        
        public float CalcPromedio()
        {
           cont=0;
           sum=0;
           promedio(raiz);
           return((float)sum/cont);           
           
            
        }
        
        public void promedio(NodoAr r)
        {
            if(r!=null)
            {
                if(r.getIzq()==null && r.getDer()==null)
                {
                    cont++;
                    sum=sum+r.getInfo();                  
                }
                promedio(r.getIzq());
                promedio(r.getDer());
            } 
        }
        public void impHojas()
        {         
           Hojas(raiz);       
        }
        
        public void Hojas(NodoAr r)
        {
           if(r!=null)
            {
                if(r.getIzq()==null && r.getDer()==null)
                {              
                    System.out.println(r.getInfo()); 
                }
                    Hojas(r.getIzq());
                    Hojas(r.getDer());
            } 
           
        }
        public int menores(float p)
        {
           cont=0;
           calcMenores(raiz, p);
           return cont;
            
        }
        public void calcMenores(NodoAr r, float p)
        {
            if(r!=null)
            {
                if(r.getInfo()<p)
                {
                    cont++;                
                }
                calcMenores(r.getIzq(), p);
                calcMenores(r.getDer(), p);
            }
        }
    }
