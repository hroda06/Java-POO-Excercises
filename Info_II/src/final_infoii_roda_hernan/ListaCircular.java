/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_infoii_roda_hernan;

public class ListaCircular {
    
   protected NodoCir frente;
public ListaCircular()
{
frente=null;
}
public void insertarCircular(int x)
{ NodoCir p;
p=new NodoCir();
p.setInfo(x);
if(frente==null)
{frente=p;
frente.setEnlace(frente);
}
else
{p.setEnlace(frente.getEnlace());
frente.setEnlace(p);
frente=p;
}
}
public void imprimirCircular()
{ NodoCir p;
System.out.println("\n Lista circular ");
p=frente.getEnlace();
while (p!=frente)
{
System.out.println("\t "+p.toString()) ;
p=p.getEnlace();
}
System.out.println("\t "+p.toString()) ;
}
 public void buscarBorrar(int x)
{ NodoCir ant;
NodoCir p;
if(frente!=null)
{ p=frente.getEnlace();
ant=frente;
while( p!=frente && x!=p.getInfo() )
{ ant=p;
p=p.getEnlace();
}
if (p!=frente) // si la condicion se cumple x estaba en la lista
{ ant.setEnlace(p.getEnlace());
p=null;
}
else
{ if(x==frente.getInfo()) //si se cumple la condicion x estaba referenciado por frente
{frente=ant;
ant.setEnlace(p.getEnlace());
p=null;
}
else
    System.out.println("\n El valor ingresado no esta en la lista ");
}
}
else
System.out.println("\n No hay elementos en la lista ");
}
public String toString()
{ String aux="\n Lista Circular " ;
NodoCir p;
p=frente.getEnlace();
while (p!=frente)
{
aux+=p.toString();
p=p.getEnlace();
}
aux+=p.toString();
return aux;
}
    
    
}