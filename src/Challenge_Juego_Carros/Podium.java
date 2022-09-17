package Challenge_Juego_Carros;

import java.util.Arrays;

/**
 *  Permite la creación de objetos de tipo podium
 *  @author Jonathan Fonseca
 */
public class Podium {

    //Atributos

    /**
     * listado de conductores en el podium
     */
    private final Driver[] drivers;

    // Constructores

    /**
     * Constructor de la clase
     * inicializa la lista de carros en el podium
     */
    public Podium() {
        this.drivers = new Driver[3];
    }

    //Método Públicos

    /**
     * Permite asignar el primer lugar en el podium
     * @param driver conductor
     */
    public void setFirst(Driver driver){
        this.drivers[0] = driver;
    }

    /**
     * Permite asignar el segundo lugar en el podium
     * @param driver conductor
     */
    public void setSecond(Driver driver){
        this.drivers[1] = driver;
    }

    /**
     * Permite asignar el tercer lugar en el podium
     * @param driver conductor
     */
    public void setThird(Driver driver){
        this.drivers[2] = driver;
    }

    /**
     * Retorna el Conductor que ocupa el primer puesto del podium
     * @return conductor
     */
    public Driver getFirst (){
        return this.drivers[0];
    }

    /**
     * Retorna el Conductor que ocupa el segundo puesto del podium
     * @return conductor
     */
    public Driver geSecond (){
        return this.drivers[1];
    }

    /**
     * Retorna el Conductor que ocupa el tercer puesto del podium
     * @return conductor
     */
    public Driver geThird (){
        return this.drivers[2];
    }

    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante
     * @return cadena con el valor de los atributos
     */
    @Override
    public String toString() {
        return  "Podium " + Arrays.toString(drivers);
    }
}
