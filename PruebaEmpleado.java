/**
 * Clase Usuario
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
*/
public class PruebaEmpleados {
    /**
     * Metodo principal donde se imprimen los datos de los empleados
     * @param args Los argumentos
     * */
 public static void main (String [] args){
 
 Empleado empleado1 = new Empleado(); 
 System.out.println("El Nombre del empleado1 es: " + empleado1.getNombre());
 System.out.println("El apellido del empleado1 es: " + empleado1.getApellido());
  System.out.println(empleado1.toString());
 
  Empleado empleado2 = new Empleado();
 empleado2.setNombre("Luis");
 empleado2.setApellido("Mendevel");
 System.out.println("El Nombre del empleado2 es: " + empleado2.getNombre());
 System.out.println("El apellido del empleado2 es: " + empleado2.getApellido());
  System.out.println(empleado2.toString());
 
Operador o = new Operador();
 System.out.println("El Nombre del Operador es: " + o.getNombre());
 System.out.println("El apellido del Operador es: " + o.getApellido());
  System.out.println(o.toString());

   Operador o1 = new Operador();
 o1.setNombre("Chad");
 o1.setApellido("Monspier");
 System.out.println("El Nombre del Operador2 es: " + o1.getNombre());
 System.out.println("El apellido del Operador2 es : " + o1.getApellido());
  System.out.println(o1.toString());
 
 Directivo d = new Directivo();
 System.out.println("El Nombre del Directivo es: " + d.getNombre());
 System.out.println("El apellido del Directivo es: " + d.getApellido());
  System.out.println(d.toString());

   Directivo d1 = new Directivo();
 d1.setNombre("Frank");
 d1.setApellido("Kastle");
 System.out.println("El Nombre del Directivo2 es: " + d1.getNombre());
 System.out.println("El apellido del Directivo2 es : " + d1.getApellido());
  System.out.println(d1.toString());
 
Tecnico t = new Tecnico();
 System.out.println("El Nombre del Tecnico es: " + t.getNombre());
 System.out.println("El apellido del Tecnico es: " + t.getApellido());
  System.out.println(t.toString());
    System.out.println(t.trabaja());

   Tecnico t1 = new Tecnico();
 t1.setNombre("Robbie");
 t1.setApellido("Williams");
 System.out.println("El Nombre del Tecnico2 es: " + t1.getNombre());
 System.out.println("El apellido del Tecnico2 es : " + t1.getApellido());
  System.out.println(t1.toString());
  System.out.println(t1.trabaja());
 
Oficial of = new Oficial();
 System.out.println("El Nombre del Oficial es: " + of.getNombre());
 System.out.println("El apellido del Oficial es: " + of.getApellido());
  System.out.println(of.toString());
    System.out.println(of.trabaja());

   Oficial of2 = new Oficial();
 of2.setNombre("Rosalind");
 of2.setApellido("Franklin");
 System.out.println("El Nombre del Oficial2 es: " + of2.getNombre());
 System.out.println("El apellido del Oficial2 es : " + of2.getApellido());
  System.out.println(of2.toString());
    System.out.println(of2.trabaja());

 }
}
 
