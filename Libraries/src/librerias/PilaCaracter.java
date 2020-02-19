
package librerias;


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
//METODO EXTERNO PARA CARGAR DIRECTAMENTE UNA PALABRA EN LA PILA
public void cargar()
{
   
int i;
char car;
System.out.print(" Ingrese una palabra :");
car=Leer.carácter(); //se utiliza este metodo (caracter() de la clase Leer) para ingresar por teclado una palabra entera directamente y no un char a la vez
while(car!='\n' ) // mientras que car sea sea distinto a /n??-->mueve el cursor hacia la siguiente linea (\n)
{ if(ponerPila(car)==false) //invoca al método ponerPila de la clase base utilizando (this) ya que esta dentro de otro metodo que es de esta clase (como si fuera un super)
{ //del objeto que invoca al método cargar
System.out.println(" PILA LLENA ");
break;
}
car=Leer.carácter();
}

}
//METODO EXTERNO PARA SACAR LA PALABRA DE LA PILA Y MOSTRARLA INVERTIDA 
public void MostrarInvertida()
{char car;
while (!pilaVacia()) //el uso de this es como super (se utiliza para lo mismo y da el mismo resultado) o utilizo uno u el otro
{ car= sacarPila();
System.out.print( car);
}
System.out.println();
}

}//fin de la clase pila 

