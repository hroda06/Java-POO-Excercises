
package preparacionfinal;

import java.io.*;
// ESTA CLASE LEER" ES UNA LIBRERIA DE JAVA LA CUAL SE UTILIZA PARA LEER VALORES Y EN EL FINAL DIRECTAMENTE SE LLEVA PREPARADA
// IGUAL QUE LA CLASE NODO Y LA CLASE PILA Y ARBOL
public class Leer 
 {
// Definir un flujo de caracteres de entrada: flujoE
private static InputStreamReader isr = new InputStreamReader(System.in);
private static PushbackReader flujoE = new PushbackReader(isr);
public static void tecla()
{
System.out.print(" Presione una tecla para continuar ");
dato();
}
public static void limpiar()
{
int car = 0;
try
{
while (flujoE.ready()) flujoE.read(); // limpiar flujoE
}
catch(IOException e)
{
System.err.println("Error: " + e.getMessage());
}
}
public static char mirar()
{
int car = 0;
try
{
car = flujoE.read();
flujoE.unread(car);
}
catch(IOException e)
{
System.err.println("Error: " + e.getMessage());
}
return (char)car; // retornar el primer carácter disponible
}
public static String dato()
{

StringBuffer sdato = new StringBuffer();
int car = 0;
try
{
// Leer. La entrada finaliza al pulsar la tecla Entrar
while ((car = flujoE.read()) != '\r' && car != -1)
sdato.append((char)car);
limpiar();
}
catch(IOException e)
{
System.err.println("Error: " + e.getMessage());
}
if (car == -1) return null;
return sdato.toString(); // devolver el dato tecleado
}
public static char carácter() //METODO LEER CHAR
{
int car = 0;
try
{
car = flujoE.read();
}
catch(IOException e)
{
System.err.println("Error: " + e.getMessage());
}
return (char)car; // devolver el dato tecleado
}
public static short datoShort() // METODO LEER SHORT
{
try
{
String sdato = dato();
if (sdato == null)
{
System.out.println();
return Short.MIN_VALUE;
}
else
return Short.parseShort(sdato);
}
catch(NumberFormatException e)
{
System.out.print("Ese dato no es válido. Teclee otro: ");
return datoShort();
}
}
public static int datoInt() //METODO LEER INT

{
try
{
String sdato = dato();
if (sdato == null)
{
System.out.println();
return Integer.MIN_VALUE;
}
else
return Integer.parseInt(sdato);
}
catch(NumberFormatException e)
{
System.out.print("Ese dato no es válido. Teclee otro: ");
return datoInt();
}
}
public static long datoLong() // METODO LEER LONG
{
try
{
String sdato = dato();
if (sdato == null)
{
System.out.println();
return Long.MIN_VALUE;
}
else
return Long.parseLong(sdato);
}
catch(NumberFormatException e)
{
System.out.print("Ese dato no es válido. Teclee otro: ");
return datoLong();
}
}
public static float datoFloat() //METODO LEER FLOAT
{
try
{
String sdato = dato();
if (sdato == null)
{
System.out.println();
return Float.NaN; // No es un Número; valor float.
}
else
{
Float f = new Float(sdato);

return f.floatValue();
}
}
catch(NumberFormatException e)
{
System.out.print("Ese dato no es válido. Teclee otro: ");
return datoFloat();
}
}
public static double datoDouble()  // METODO LEER DOUBLE
{
try
{
String sdato = dato();
if (sdato == null)
{
System.out.println();
return Double.NaN; // No es un Número; valor double.
}
else
{
Double f = new Double(sdato);
return f.doubleValue();
}
}
catch(NumberFormatException e)
{
System.out.print("Ese dato no es válido. Teclee otro: ");
return datoDouble();
}
}
}

    

