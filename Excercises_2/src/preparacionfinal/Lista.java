
package preparacionfinal;

import java.util.Scanner;

class Lista
{ protected Nodo frente;
public Lista()
{
frente=null;
}
public void insertarAntes (int x)
{
Nodo p;   // creo una variable p de tipo nodo
p=new Nodo() ; // genero un nuevo nodo vacio y lo guardo en p
if(p!=null)
{
p.setInfo(x); // asigno la informacion x al nodo p con el metodo setInfo
p.setEnlace(frente); //enlazo el frente (que seria el comienzo de la lista) al nodo p con el metodo setEnlace
frente=p; // queremos que "frente" referencie (tenga acceso) al primer nodo
}
else
System.out.println(" no hay memoria ");
}
public void insertarFinal( int x)
{ Nodo p;
Nodo q=null;
p = frente;
while (p!=null)
{ q = p; //guardo la variable p(empieza como frente y luego va recorriendo la lista) en q
p = p.getEnlace(); //recorro la lista con p hasta que p==null (termina la lista)
}
p= new Nodo() ; //creo un nuevo objeto p tipo nodo
p.setInfo(x) ; //seteo info(valor de x por teclado) en en nuevo nodo p
if (frente==null) // si frente==null quiere decir que la lista esta vacia entonces..
frente=p; //seteo al nuevo nodo p como frente de la lista
else
q.setEnlace(p); // si no esta vacia la lista seteo el nuevo nodo p como enlace al nodo siguiente de la lista q (osea agrego un nodo nuevo al final de la lista) 
}
public void imprimirLista() //recorrido de una lista
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
public int contar()
{int cant=0;
Nodo p;
p=frente;
while (p!=null)
{cant++;
p=p.getEnlace();
}
return cant;
}
public int borrarPri() // borra el primer elemento de la lista
{Nodo p;
int aux;
if(frente!=null) // el nodo siguiente es null? quiere decir que no posicionado en la primer posicion de la lista
{ p=frente; // asigna como frente (primero) al nodo p
frente=frente.getEnlace(); //asigno el enlace del nodo siguiente a "frente" y lo guardo como "frente" actual
aux=p.getInfo(); //obtengo la informacion del nodo p y lo asigo a la variable auxiliar
p=null; // igualo p a nulo (borro p )
return aux; // retorno el valor de la variable auxiliar ( que seria el primer valor p eliminado)
}
else
return 0;
}
public void borrarUno( Nodo p1 )
{
if(p1==frente) // pregunto si el nodo p1 es igual al nodo frente ?
{frente=frente.getEnlace(); // asigno el enlace del nodo siguiente a "frente" y lo guardo como "frente" actual
p1=null; //elimino(desreferencio p1) 
}
else
{Nodo p;
Nodo q=null; // nodo auxiliar q con valor nulo 
p=frente; // asigno como frente al nodo P
while(p!=p1&&p!=null) // pregunto si el nodo P es distinto de p1(valor que quiero eliminar) y null(si no es el ultimo nodo)
{q=p;
p=p.getEnlace();
}
if(p!=null) // aca pregunta si el nodo P es distinto de null y si es asi quiere decir que p==p1 porque no queda alternativa entonces :
{q.setEnlace(p.getEnlace()); // aca obtiene en enlace al siguiente nodo de P (p es el que se va a eliminar) y lo setea como enlace de q (nodo que quedo anterior a p)
p=null; // se elimina p (se desreferencia)
}
else
System.out.println(" la refencia no tiene acceso a ningun nodo de la lista");
}
}
//El método buscar devuelve un valor false si al elemento no lo encuentra y true si lo encuentra en la lista ( retorna valores tipo booleano-> true o false)
public boolean buscar(int x)
{Nodo p;
p=frente; // asigno al nodo P el valor de "frente"
while(p!=null) // mientras que p no sea nulo (es decir su valor de "frente" no sea nulo (el ultimo nodo) )
{ if(p.getInfo()==x)
return true;
p=p.getEnlace();
}
return false;
}
// el siguiente metodo retorna una referencia a un nodo buscado ( retorna p o retorna null que son valores de tipo NODO)
public Nodo buscarElemento(int x) // se utiliza conjuntamente con "borrarUno" que es para buscar un elemento determinado y borrarlo
{Nodo p;
p=frente;
while(p!=null)
{ if(p.getInfo()==x)
return p;
p=p.getEnlace();
}
return null;
}
public String toString()
{String aux=" ";
Nodo p;
p=frente;
while (p!=null)
{ aux=aux+p.toString();
p=p.getEnlace();
}
return aux;
}
// ESTE METODO MODIFICAR LO AGREGUE YO !!!
public void modificar(int n) // metodo modificar el cual no esta en la libreria Lista (tener en cuenta !!! ) busca un i-esimo valor pasado por teclado y lo modifica con otro que eligamos
{
  Scanner sn=new Scanner(System.in);
  int cant=1;
Nodo p;
p=frente;
while (p!=null && cant < n) // con este ciclo while me posiciono en el iesimo nodo que quiero modificar
{cant++;
p=p.getEnlace();
}
if (p!=null) // cuando estoy en la posicion del iesimo nodo pregunto si es distinto de null.  y SI LO ES imprimo su valor :
{ System.out.println("\n valor de nodo = "+p.getInfo());
System.out.print("\n Ingrese el nuevo valor ");
p.setInfo(sn.nextInt()); // seteo el valor nuevo ingresado por teclado en el nodo a modificar
}
else
System.out.println("\n"+n+" es mayor que La cantidad de nodos "); // si el numero iesimo es mayor que la cantidad de nodos me salta este msj
}

// METODO INVERTIR LISTA TAMBIEN AGREGADO EXTERNAMENTE
public void invertir()
{Lista LA=new Lista(); // Lista Auxiliar;
Nodo q;
int x;
while (frente!=null)
{ x=borrarPri(); // borro primer elemento de la lista originial-> entonces me queda en la variable x el 1er elemento borrado
LA.insertarAntes(x); // paso la variable x (1er valor de la lista original) como primer valor de la lista auxiliar
}
q=LA.frente; // aca empiezo a recorrer la lista auxiliar-> guardo en la posicion frente al nodo q
while (q!=null) // pregunto si q es distinto de null
{ this.insertarFinal(q.getInfo()); // llamo al metodo insertaralfinal ya que va al nodo siguiente y obtengo su informacion (getinfo)
q=q.getEnlace(); // obtengo el enlace del siguiente nodo y lo guardo en el nodo p para posocionarme ahi y volver a repetir el while hasta que q = null
}

// la lista Auxiliar 'LA' se borra porque queda desreferenciada
}
}





