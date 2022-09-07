package buenas_practicas_POO;

public class Cancion {

    private String title;
    private String idSong;
    private int date;
    private int duration;
    private Genero genre;
    private String cover;
    private String description;

    public Cancion(String title, String idSong, int date, int duration, Genero genre, String cover, String description) {
        this.title = title;
        this.idSong = idSong;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public Genero getGenre() {
        return genre;
    }
    public int getDate() {
        return this.date;
    }

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
