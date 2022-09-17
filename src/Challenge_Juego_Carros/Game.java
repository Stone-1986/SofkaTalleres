package Challenge_Juego_Carros;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;

/**
 * Permite inicializar el juego
 * @author Jonathan Fonseca
 */
public class Game {
    // Atributos

    /**
     * Podium del juego
     */
    private final Podium podium;

    /**
     * Pista del juego
     */
    private final Track track;

    /**
     * Estado del juego puede ser INITIATED, FINALIZED, EARRING
     */
    private State state;

    // Constructores

    /**
     * Constructor de la clase - se crea el juego
     * inicializa el podium, crea la pista de carreras, el estado de juego es no iniciado
     */
    public Game(Integer idTrack, String nameTrack ,Integer numLanes, Integer size ) {
        this.podium = new Podium();
        Map<Integer, Lane> lanes = generateLanes(numLanes, size);
        this.track = new Track(idTrack, nameTrack, lanes );
        this.state = State.NO_INITIATED;
    }


    //Método Públicos

    /**
     * Permite agregar carros a un carril
     * @param lane Carril
     * @param car Carro
     */
    public void agregateCarsToLane (Integer lane, Car car){
        if (Objects.isNull(car.getDriver())){
            throw new IllegalArgumentException("El carro no tiene conductor--");
        }
        track.addCarToLane(lane, car);
    }

    /**
     * Inicia el Juego
     * Válida los carriles, inicializa los carros, cambia el estado del juego a INITIATED
     * @return Podium
     */
    public Podium initGame(){
        validateLanes();
        starterCars();
        do {
            state = State.INITIATED;
            track.getLaneList().forEach(moveLane());
        }while (state.equals(State.INITIATED));

        return podium;
    }


    //Método Privados

    /**
     * Permite la creación de los carriles de la pista
     * @param numLanes Número de carriles
     * @param size  tamaño de los carriles en Km
     * @return listado de carriles
     */
    private Map<Integer, Lane> generateLanes(Integer numLanes, Integer size){
        Map<Integer, Lane> lanes = new HashMap<>();
        for (int i = 1; numLanes >= i; i++){
            lanes.put(i, new Lane(i, size));
        }
        return lanes;
    }

    /**
     * Permite cambiar el estado del juego
     * puede ser uno de estos INITIATED, FINALIZED, EARRING
     */
    private void endGame(){
        state = State.FINALIZED;
    }

    /**
     * Asigna las pociones del podium en orden de llegada
     * @param car carro
     */
    private void setPodium(Car car){
        if (Objects.isNull(podium.getFirst())) {
            podium.setFirst(car.getDriver());
            car.stop();
        }else if (Objects.isNull(podium.geSecond())){
            podium.setSecond(car.getDriver());
            car.stop();
        }
        else if (Objects.isNull(podium.geThird())){
            podium.setThird(car.getDriver());
            car.stop();
            endGame();
        }
    }

    /**
     * Determina un ganador del juego
     * @param lane Carril
     * @param car carro
     */
    private void assignWinner(Lane lane, Car car){
        if (car.itIsActive()){
            double progress = lane.progressCar(car.getPatent());
            if (progress >= 100) {
                setPodium(car);
            }
        }
    }

    /**
     * Permite mover el carro en un carril
     * la distancia que avanza el carro es informada por el lanzamiento de dado
     * @param lane carril
     * @return el avance de un carro en un carril
     */
    private Consumer<Car> moveCar(Lane lane){
        return car -> {
          int die = car.getDriver().rollDie();
            IntStream.range(0, die * 100).forEach( value -> car.increaseDistance());
            assignWinner(lane, car);
        };
    }

    /**
    * mueve los carros de una pista de forma secuencial
    */
    private BiConsumer<Integer, Lane> moveLane (){
        return (idLane, lane) -> lane.getCars().forEach(moveCar(lane));
    }

    /**
     * Permite colocar en marcha todos los carros de una pista
     */
    private void starterCars(){
        track.getLaneList().values().forEach(lane -> lane.getCars().forEach(Car::starter));
    }

    /**
     * Válida que el juego contenga una cantidad minima de carros en la pista
     */
    private void validateLanes() {
        int cantCars = 0;
        for (Lane lane : track.getLaneList().values()){
            cantCars += lane.getCars().size();
        }
        if (cantCars <= 2){
            throw new IllegalStateException("El juego no tiene la cantidad necesario de carros en la pista");
        }
    }
}
