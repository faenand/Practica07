/**
 * Clase Empleado
 * Contiene los constructores y metodos del objeto empleado 
 * @author Fernando Mendoza Eslava-319097690
 * @version 1.0
 */
public class Empleado {
    protected String nombre; // nombre del empleado
    protected String apellido; //apellido del empleado

    /**
     *Constructor sin parametros 
     *asigna el nombre y apellido del empleado
     **/
    public Empleado() {
        this.nombre = "Talan";
        this.apellido = "Larregui";
    }

    /**
     *Constructor con parametros 
     * @param nombre del empleado
     * @param apellido del empleado 
     **/
    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     *Metodo para regresar el nombre del empleado 
     * @return nombre del empleado 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo que modifica el nombre del empleado
     *@param nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *Metodo para regresar el apellido del empleado
     * @return apellido del empleado  
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Metodo que establece el nombre del empleado
     *@param apellido de empleado
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Metodo que regresa el nombre y apellido del empleado en forma de una cadena
     *@return nombre y apellido del empleado 
     */
    public String toString() {
        return "La matricula del empleado es: " + this.nombre + this.apellido;
    }
    /**
     Metodo que compara dos empleados para saber si son iguales.
     @param empleado que se va a comparar con otro empleado
     @return boolean, devuelve true si los empleados son iguales y false en caso contrario
     */
    public boolean equals(Object empleado) {
        Empleado empleado1 = (Empleado) empleado;
        boolean i = true;
        i = this.nombre.equals(empleado1.getNombre());
        return i;
    }
}
