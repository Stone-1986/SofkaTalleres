package Challenge_Juego_Carros;

import java.util.Objects;

/**
 *  * Permite la creación de objetos de tipo carro
 *  * @author Jonathan Fonseca
 */
public class Car {
    // Atributos

    /**
     * id del carro
     */
    private final String patent;

    /**
     * kilómetros recorridos por un carro
     */
    private Integer km;

    /**
     * Estado del carro true en marcha o false detenido
     */
    private boolean itIsActive;

    /**
     * Color asignado al carro
     */
    private final Color color;

    /**
     * Conductor asignado al carro
     */
    private Driver driver;

    // Constructores

    /**
     * Constructor de la clase carro
     * @param patent Número de placa
     * @param km kilómetros recorridos
     * @param color Color de carro
     * @throws IllegalAccessException arroja una exception si los km recorridos son menores a cero
     */
    public Car(String patent, Integer km, Color color) throws IllegalAccessException {
        this.color = Objects.requireNonNull(color);
        this.patent = Objects.requireNonNull(patent);
        this.km = Objects.requireNonNull(km);
        if (km < 0){
            throw new IllegalAccessException(" no se puede ingresar una distancia negativa");
        }
        this.itIsActive = false;
    }

    /**
     * Constructor de la clase carro, inicializa los km recorridos en cero
     * @param color Color
     * @param patent patente
     * @throws IllegalAccessException arroja una exception si los km recorridos son menores a cero
     */
    public Car(Color color, String patent) throws IllegalAccessException {
        this(patent, 0,color );
    }

    // //Método Públicos

    /**
     * Permite asignar un conductor al carro
     * @param driver Conductor
     */
    public void addDriver(Driver driver){
        this.driver = Objects.requireNonNull(driver);
    }

    /**
     * Retorna el conductor asignado a un carro
     * @return conductor
     */
    public Driver getDriver() {
        return driver;
    }

    /**
     * Retorna la patente de un carro
     * @return Patente
     */
    public String getPatent() {
        return patent;
    }

    /**
     * Retorna el número de kilómetros recorridos por el carro
     * @return kilómetros recorridos
     */
    public Integer getKm() {
        return km;
    }

    /**
     * Permite colocar en marcha un carro
     */
    public void starter(){
        this.itIsActive = true;
    }

    /**
     * Permite detener la marcha de un carro
     */
    public void stop(){
        this.itIsActive = false;
    }

    /**
     * Informa si estado del carro; True en marcha o Fase detenido
     * @return estado del carro True o false
     */
    public boolean itIsActive(){
        return itIsActive;
    }

    /**
     * Permite aumentar la distancia recorrida de un carro
     */
    public void increaseDistance(){
        if (this.itIsActive){
            this.km += 1;
        }
    }

    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante
     * @return cadena con el valor de los atributos
     */
    @Override
    public String toString() {
        return "Car{" +
                "patent='" + patent + '\'' +
                ", km=" + km +
                ", itIsActive=" + itIsActive +
                ", color=" + color +
                ", driver=" + driver +
                '}';
    }
}
