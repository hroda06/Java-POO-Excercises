/*
 Realize un programa que calcule e imprima la cantidad de nodos internos que tiene
un arbol binario de busqueda ingresado por teclado. Ademas imprima el arbol ordenado
por su campo info de menor a mayor (40ptos)
 */
package modelodefinales;

import java.util.Scanner;
public class Modelo2 {
    public static void main(String[]args)
    {
        int x;
        int cont=0;
        Scanner sn=new Scanner(System.in);
        ArbolHijo a= new ArbolHijo();
        System.out.println("ingrese un numero: 0=FIN");
        x=sn.nextInt();
        while(x!=0)
        {
            a.ingresarBus(x);
            cont++;
            System.out.println("ingrese un numero: 0=FIN");
            x=sn.nextInt();           
        }
        //PRIMERA FORMA DE CONTAR NODOS DIRECTA
        System.out.println("cantidad de nodos del arbol: "+cont);
        // 2DA FORMA DE CONTAR LOS NODOS POR METODO
        System.out.println("cantidad de nodos del arbol: "+a.contarNodos());
        System.out.println("Arbol impreso de menor a mayor: ");
        a.impCentral();
        
        
    }
    
}

class ArbolHijo extends Arbol
{
    int cont;
    public int contarNodos()
    {
        cont=0;
        cuenta(raiz);
        return cont;
    }
    public void cuenta(NodoAr r)
    {
        if (r!=null)
                {
                    cont++;
                    cuenta(r.getDer());
                    cuenta(r.getIzq());
                }
    }
}
