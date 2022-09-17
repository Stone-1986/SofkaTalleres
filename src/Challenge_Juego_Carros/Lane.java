package Challenge_Juego_Carros;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *  * Permite la creación de objetos de tipo carril
 *  * @author Jonathan Fonseca
 */
public class Lane {
    // Atributos

    /**
     * Numero del carril
     */
    private final Integer numberLane;

    /**
     * Tamaño del carril en kilómetros
     */
    private final Integer size;

    /**
     * Lista de carros para el carril
     */
    private List<Car> cars;

    // Constructores

    /**
     * Constructor de la clase
     * @param numberLane Numero del carril
     * @param size Tamaño del carril en KM
     */
    public Lane(Integer numberLane, Integer size) {
        this.numberLane = numberLane;
        this.cars = new ArrayList<>();
        this.size = Objects.requireNonNull(size);
        if (size < 0 ){
            throw new IllegalArgumentException(" no posible una pista de tamaño menor a cero");
        }
    }

    //Método Públicos

    /**
     * Permite agregar un carro a un carril
     * @param car carro
     */
    public void addCar(Car car){
        this.cars.add(car);
    }

    /**
     * Retorna el tamaño de un carril en KM
     * @return tamaño del carril en KM
     */
    public Integer displaySize(){
        return this.size;
    }

    /**
     * Retorna el progreso en % del carro en un carril
     * si el carro no está asignado al carril arroja una exception
     * @param patent patente del carro
     * @return Progreso del carro en un carril
     */
    public Integer progressCar(String patent){
        for (Car car : cars ){
            if (car.getPatent().equalsIgnoreCase(patent)){
                int meters = displaySize() * 100;
                return (100  * car.getKm()) / meters;
            }
        }
        throw new IllegalArgumentException("No existe el carro");
    }

    /**
     * Retorna la lista de carros asignada a un carril
     * @return lista de carros
     */
    public List<Car> getCars() {
        return cars;
    }
}
