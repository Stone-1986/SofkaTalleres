package Challenge_Juego_Carros;

import java.util.Map;

/**
 *  * Permite la creación de objetos de tipo pista
 *  * @author Jonathan Fonseca
 */
public class Track {

    //Atributos

    /**
     * Id de la pista de carreras
     */
    private final Integer idTrack;

    /**
     * Nombre de la pista de carreras
     */
    private String name;

    /**
     * Listado <Numero de carril, Carril> para la pista
     */
    private Map<Integer, Lane> laneList;

    // Constructores

    /**
     * Constructor de la clase
     * @param idTrack Id de la pista
     * @param name nombre de la pista
     * @param laneList carriles de la pista
     */
    public Track(Integer idTrack, String name, Map<Integer, Lane> laneList) {
        this.idTrack = idTrack;
        this.name = name;
        this.laneList = laneList;
    }

    //Método Públicos

    /**
     * Permite agregar carros a un carril
     * Lanza una exception si el carro no tiene asignado un conductor
     * @param numberLane numero del carril
     * @param car carro
     */
    public void addCarToLane(Integer numberLane, Car car){
        laneList.get(numberLane).addCar(car);
    }

    /**
     * Retorna la lista de carriles asignados a una pista
     * @return Lista de carriles
     */
    public Map<Integer, Lane> getLaneList() {
        return laneList;
    }

}
