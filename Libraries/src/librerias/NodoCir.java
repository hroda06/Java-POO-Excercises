
package librerias;

/**
 *
 * @author HERNAN
 */
public class NodoCir {
    private int info;
private NodoCir enlace;
NodoCir (int x,NodoCir en)
{ info=x;
enlace=en;
}
NodoCir()
{info=0;
enlace=null;
}
public void setInfo(int x)
{info=x;
}
public void setEnlace(NodoCir en)
{enlace=en;
}
public int getInfo()
{return info;
}
public NodoCir getEnlace()
{ return enlace;
}
public String toString()
{ return ("\t"+info);
}
}
