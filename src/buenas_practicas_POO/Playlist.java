package buenas_practicas_POO;

public class Playlist extends Biblioteca{

    private String namePlaylist;

    public Playlist(String name, String namePlaylist) {
        super(name);
        this.namePlaylist = namePlaylist;
    }
}
