package Challenge_Juego_Carros;

import java.util.ArrayList;
import java.util.List;

/**
 * Permite la creación de un objeto jugador
 * @author Jonathan Fonseca
 */
public class Player {

    // Campos de la clase

    /**
     * id de un jugador
     */
    private final Integer idPlayer;

    /**
     * Correo electrónico asociado a un jugador
     */
    private String mail;

    /**
     * Nombre asignado a un conductor
     */
    private final String nickName;

    /**
     * Listado de puntos obtenidos por un jugador
     */
    private List<Integer> points;

    // Constructores

    /**
     * Constructor de la clase
     * @param idPlayer id del jugador
     * @param mail mail del jugador
     * @param nickName sobrenombre del jugador
     */
    public Player(Integer idPlayer, String mail, String nickName) {
        this.idPlayer = idPlayer;
        this.mail = mail;
        this.nickName = nickName;
        this.points = new ArrayList<>();
    }


    //Método Públicos

    /**
     * Permite actualizar el mail de jugador
     * @param mail mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Permite agregar los puntos de una carrera al jugador
     * @param points puntos
     */
    public void addPoints(Integer points){
        this.points.add(points);
    }

    /**
     * Retorna el total de puntos de un jugador
     * @return total de puntos
     */
    public Integer totalPoints(){
        return points.stream().reduce(Integer::sum).orElseThrow();
    }


    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante
     * @return cadena con el valor de los atributos
     */
    @Override
    public String toString() {
        return "Player{" +
                "idPlayer='" + idPlayer + '\'' +
                ", mail='" + mail + '\'' +
                ", nickName='" + nickName + '\'' +
                ", points=" + points +
                '}';
    }
}
