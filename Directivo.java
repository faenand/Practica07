/**
 * Clase Operador
 * Contiene los constructores y metodos del objeto Operador 
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
 **/

public class Directivo extends Empleado {

    /**
     * Constructor con parametros
     * @param nombre del directivo
     * @param apellido del directivo
     */
    public Directivo(String nombre, String apellido) {
        super(nombre, apellido);
    }

    /**
     * Constructor sin parametros
     */
    public Directivo() {
        super();
    }

    /**
     * Metodo que devuelve el nombre y apellido del directivo en forma de cadena
     * @return nombre y apellido del directivo
     */
    @Override
    public String toString() {
        return "La matricula del directivo es: " + this.nombre + this.apellido;
    }
}