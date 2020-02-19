/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_infoii_roda_hernan;

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