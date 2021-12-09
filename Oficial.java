/**
 * Clase Operador
 * Contiene los constructores y metodos del objeto Operador 
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
 **/

public class Oficial extends Empleado {

    /**
     * Constructor con parametros que fue heredado de la clase operador
     * @param nombre del operador
     *@param apellido del empleado
     */
    public Oficial(String nombre, String apellido) {
        super(nombre, apellido);
    }

    /**
     * Constructor sin parametros que fue heredado de la clase operador
     */
    public Oficial() {
        super();
    }


    /**
     * Metodo que devuelve el nombre y apellido del operador en forma de cadena
     * @return nombre y apellido del oficial 
     */
    @Override
    public String toString() {
        return "La matricula del Oficial es: " + this.nombre + this.apellido;
    }


    /**
     Metodo que regresa que el oficial no esta trabajando.
     @return String no toy trabajando.
     */
    public String trabaja() {
        return "no toy trabajando";
    }

}