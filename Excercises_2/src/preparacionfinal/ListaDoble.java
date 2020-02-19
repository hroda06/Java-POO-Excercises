
package preparacionfinal;


public class ListaDoble {
protected NodoLisDoble frente;
public ListaDoble()
{frente=null;
}
public void insertarDoble(int x )
{ NodoLisDoble p;
p = new NodoLisDoble();
if(p!=null) 
{
    p.setInfo(x);     //seteo como info del nodo el valor x ingresado
    p.setProx(frente); //seteo como "frente" el nodo proximo al actual
if( frente != null) //si el nodo seteado como frente es distinto de null(no es el ultimo) entonces..
    frente.setAnt(p);// al nodo actual que ahora es "frente" (no es p) le seteo como nodo anterior el nodo p(donde estaria el valor x ingresado)
    frente = p;//ahora "frente" pasa a tener el valor de p (valor x ingresado) y asi se repetiria el ciclo con un while o for
}
else
System.out.println("\n Error falta memoria ");
}
public void imprimirLista()
{
NodoLisDoble p;
p=frente;
System.out.println(" Impresion de la lista doble de enteros ");
while (p!=null)
{ System.out.print(" "+p.toString());
p=p.getProx();
}
System.out.println( );
}
public String toString()
{String aux=" ";
NodoLisDoble p;
p=frente;
while (p!=null)
{ aux=aux+p.toString();
p=p.getProx();
}
return aux;
}
public void buscar(int x)
{NodoLisDoble p;
p=frente;
while(p!=null && p.getInfo()!=x)
{p=p.getProx();
}
if(p!=null)
{
if(p.getProx()!=null)
System.out.println("el elemento posterior es "+p.getProx().getInfo());
else
System.out.println("No hay elemento posterior ");
if(p.getAnt()!=null)
System.out.println("el elemento anterior es "+p.getAnt().getInfo());
else
System.out.println("No hay elemento anterior ");
}
}
}
    

