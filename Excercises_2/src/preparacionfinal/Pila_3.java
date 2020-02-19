//3. Usando la clase pila, genere una subclase pilaTrabajo que invierta los elementos de una pila. Cargar una pila con las letras de una palabra y luego mostrarla invertida.
package preparacionfinal;


public class Pila_3 {
    public static void main (String []arg)
{ PilaTrabajo p=new PilaTrabajo();
  p.cargar();
  p.MostrarInvertida();
}
    
}

 class PilaTrabajo extends PilaCaracter //esta clase hereda (extends) de PilaCaracter
{
 
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

public void MostrarInvertida()
{char car;
while (!pilaVacia()) //el uso de this es como super (se utiliza para lo mismo y da el mismo resultado) o utilizo uno u el otro
{ car= sacarPila();
System.out.print( car);
}
System.out.println();
}
}