
package preparacionfinal;

public class Pila
{ 
protected int elemento[]; //array que recorre la pila y la carga
protected int top; // es el puntero que indica que tan llena esta la pila(ultimo o primer numero de la pila ) 
protected int maxpila; // es el maximo de elementos que puede tener la pila

//Inicializar Pila
public Pila() //constructor sin argumentos
{ top=0;
maxpila=100; //por defecto tiene 3 elementos la pila salvo que le asigne por teclado un nuevo valor n
elemento =new int[maxpila]; //cargo el atributo(array) elemento por teclado con el valor de maxpila"
}
public Pila(int max) //constructor con argumentos
{ top=0;
maxpila=max; // cargo(inicio) por teclado el atributo(variable) "maxpila" con la cantidad de elementos de la pila(el cual por defecto tiene 3 pero se le puede poner cualquier valor
elemento =new int[maxpila]; //cargo el array con la variable maxpila que indica la cantidad de elementos de la pila
}
// Pilavacía
public boolean pilaVacia()
{ if(top==0)
return true;
else
return false;
}
// Pilallena
public boolean pilaLlena()
{
if(top == maxpila )
return true;
else
return false;
}
// Poner en pila
public boolean ponerPila(int x)
{ boolean exito; // variable exito" de tipo boolean 
if( pilaLlena() ) //si "pila llena"== true entonces exito= false
{
exito=false;
}
else
{ elemento[top]= x;
top ++;
exito=true; // cargo el array pila con el valor por teclado x" y aumento el array al siguiente valor y termino con exito==true
}
return exito;
}
// Sacardepila
public int sacarPila()
{ int aux=-1; // declaro la variable aux en -1 por si la pila esta vacia y me tenga que retornar -1
if( pilaVacia() ) // si el metodo (pilaVacia) == true me salta el msj que la pila esta vacia
{System.out.println("\t Pila Vacia ");
}
else
{ top-- ; // me descuenta un elemento del top
aux=elemento[top]; // guarda en la variable aux el elemento del top que quedo y retorna aux
}
return aux;
}
}//fin de la clase pila