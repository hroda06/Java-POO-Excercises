
package preparacionfinal;

// CLASE PILA CARACTER LA CUAL SE LLEVA HECHA AL FINAL 
public class PilaCaracter 
   { 
private char elemento[];
private int top;
private int maxpila;
public PilaCaracter() //constructor sin argumentos
{ top=0;
maxpila=100; //por defecto tiene 100 elemntos la pila
elemento =new char[maxpila];
}
public PilaCaracter(int max) //constructor con argumentos
{ top=0;
maxpila=max;
elemento =new char[maxpila];
}
public boolean pilaVacia()

{ if(top==0)
return true;
else
return false;
}
public boolean pilaLlena()
{
if(top == maxpila )
return true;
else
return false;
}
public boolean ponerPila(char x)
{ boolean exito;
if( pilaLlena() )
{
exito=false;
}
else
{ elemento[top]= x;
top ++;
exito=true;
}
return exito;
}
public char sacarPila()
{ char aux='*';
if( pilaVacia() )
{System.out.println("\t Pila Vacia ");
}
else
{ top-- ;
aux=elemento[top];
}
return aux;
}
public int getMaxPila()
{return maxpila;
}
}//fin de la clase pila 



