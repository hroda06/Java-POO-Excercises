
package preparacionfinal;

class Nodo
{
protected int info; //informacion del nodo
protected Nodo enlace; // enlace al siguiente nodo
// constructor con argumentos
Nodo (int x,Nodo en)
{ info=x;
enlace=en;
}
// constructor sin argumentos
Nodo()
{info=0;
enlace=null;
}
public void setInfo(int x) // insertar informacion (x)
{info=x;
}
public void setEnlace(Nodo en) //insertar enlace (en)
{enlace=en;
}
public int getInfo() // obtener informacion
{return info;
}
public Nodo getEnlace() // obtener enlace
{ return enlace;
}
public String toString() // metodo toString devuelve cadena de caracteres
{ return ("\t"+info);
}
}

