/**
 * Clase Operador
 * Contiene los constructores y metodos del objeto Operador 
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
 **/

public class Operador extends Empleado {

    /**
     * Constructor con parametros que fue heredado de la clase empleado
     * @param nombre del operador
     * @param apellido del operador
     */
    public Operador(String nombre, String apellido) {
        super(nombre, apellido);
    }

    /**
     * Constructor sin parametros que fue heredado de la clase empleado
     **/
    public Operador() {
        super();
    }


    /**
     * Metodo que devuelve el nombre y apellido del operador en forma de cadena
     * @return nombre y apellido del operador
     */
    @Override
    public String toString() {
        return "La matricula del Operador es: " + this.nombre + this.apellido;
    }
    
}
