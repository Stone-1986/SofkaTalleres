package Challenge_Juego_Carros;

import java.util.Random;

/**
 * Permite la creación de objetos de tipo conductor
 * @author Jonathan Fonseca
 */
public class Driver  extends Player{
    // Atributos

    /**
     * Id del conductor
     */
    private final Integer idDriver;

    /**
     * Nombre del conductor
     */
    private String nameDriver;

    // Constructores

    /**
     * Constructor de la clase
     * @param idDriver id del conductor
     * @param nameDriver nombre del conductor
     */
    public Driver(Integer idDriver, String nameDriver, String email, String nickName) {
        super(idDriver,email, nickName );
        this.idDriver = idDriver;
        this.nameDriver = nameDriver;
    }

    //Método Públicos

    /**
     * Realiza la accion de lanzar dado
     */
    public Integer rollDie(){
        Random r = new Random();
        return r.nextInt(6) + 1;
    }

    /**
     * Permite actualizar el nombre de un conductor
     * @param nameDriver Nombre del conductor
     */
    public void setNameDriver(String nameDriver){
        this.nameDriver = nameDriver;
    }

    /**
     * Retorna él, id de un conductor
     * @return id de un conductor
     */
    public Integer showIdDriver() {
        return idDriver;
    }

    /**
     * Retorna él, nombre de un conductor
     * @return id de un conductor
     */
    public String showNameDriver() {
        return nameDriver;
    }

    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante
     * @return cadena con el valor de los atributos
     */
    @Override
    public String toString() {
        return "idDriver = " + idDriver +
                ", nameDriver='" + nameDriver;
    }
}
