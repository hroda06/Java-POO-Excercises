
package preparacionfinal;


public class NodoLisDoble {
    

private int info;
private NodoLisDoble prox;
private NodoLisDoble ant;
NodoLisDoble()
{info=0;
prox=null;
ant=null;
}
public void setInfo(int x)
{info=x;
}
public void setProx(NodoLisDoble p)
{prox=p;
}
public void setAnt(NodoLisDoble a)
{ant=a;
}
public int getInfo()
{return info;
}
public NodoLisDoble getProx()
{ return prox;
}
public NodoLisDoble getAnt()
{ return ant;
}
public String toString()
{ return ("\t"+info);
}
}

