/**
 * Clase Operador
 * Contiene los constructores y metodos del objeto Operador 
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
 **/

public class Tecnico extends Empleado {

    /**
     * Constructor con parametros que fue heredado de la clase operador
     * @param nombre del tecnico
     * @param apellido del tecnico
     */
    public Tecnico(String nombre, String apellido) {
        super(nombre, apellido);
    }

    /**
     * Constructor sin parametros que fue heredado de la clase operador
     */
    public Tecnico() {
        super();
    }


    /**
     * Metodo que devuelve el nombre y apellido del tecnico en forma de cadena
     * @return nombre y apellido del tecnico 
     */
    @Override
    public String toString() {
        return "La matricula del tecnico es: " + this.nombre + this.apellido;
    }


    /**
    Metodo que regresa que el tecnico esta trabajando.
    @return String toy trabajando.
    */
    public String trabaja() {
        return "toy trabajando";
    }

}