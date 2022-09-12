package buenas_practicas_POO;

/**
 * La clase Cancion permite crear y consultar un objeto de tipo cancion
 * @@author: Jonathan Fonseca Clavijo
 */
public class Cancion {

    /**
     * Atributos de la clase Cancion
     */
    private String title;
    private String idSong;
    private int date;
    private int duration;
    private Genero genre;
    private String cover;
    private String description;

    /**
     * Constructor de la clase Cancion
     * @param title Título de la cancion
     * @param idSong id de la cancion
     * @param date año de publicación de la cancion
     * @param duration duración de la cancion en minutos
     * @param genre Género de la cancion
     * @param cover carátula de la cancion
     * @param description descripción corta
     */
    public Cancion(String title, String idSong, int date, int duration, Genero genre, String cover, String description){
        this.title = title;
        this.idSong = idSong;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }

    /**
     * Retorna el título de una cancion
     * @return Título de la cancion
     */
    public String getTitle() {
        return title;
    }

    /**
     * Retorna él id de una cancion
     * @return Id de una cancion
     */
    public String getIdSong() {
        return idSong;
    }

    /**
     * Retorna el género de una cancion
     * @return Género de la cancion
     */
    public Genero getGenre() {
        return genre;
    }

    /**
     * Retorna el año de publicación de una cancion
     * @return Género de la cancion
     */
    public int getDate() {
        return this.date;
    }

    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante
     * @return cadena con el valor de los atributos
     */
    @Override
    public String toString() {
        return "Cancion{" +
                "title='" + title + '\'' +
                ", idSong='" + idSong + '\'' +
                ", date='" + date + '\'' +
                ", duration=" + duration +
                ", genre=" + genre +
                ", cover='" + cover + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
