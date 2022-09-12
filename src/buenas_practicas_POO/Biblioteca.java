package buenas_practicas_POO;

import java.util.*;

/**
 * La clase biblioteca permite agregar, elimina y consultar canciones y playlist
 * @@author: Jonathan Fonseca Clavijo
 */
public class Biblioteca {

    /**
     * Atributos de la clase biblioteca
     */
    private String nameLibrary;
    private List<Cancion> listSongs;
    private Map<String, List<Cancion>> playlists;

    /**
     * Constructor de la clase, este requiere de un parámetro nombré, inicializa el atributo listSongs
     * @param nameLibrary Nombre asignado al objeto biblioteca
     */
    public Biblioteca(String nameLibrary) {
        this.nameLibrary = nameLibrary;
        this.listSongs = new ArrayList<>();
        this.playlists = new HashMap<>();
    }

    /**
     * Permite agregar una cancion a la Biblioteca
     * @param song cancion
     */
    public void addSong(Cancion song) {
       if (listSongs.contains(song)){
         System.out.println("La cancion ya ha sido agregada con anterioridad");
       }else {
         listSongs.add(song);
         System.out.println("!Ha agregado la cancion!  " + song.getTitle());
       }
    }

    /**
     * Permite agregar una cancion de la Biblioteca a una lista de reproducción.
     * @param idSong Id de la cancion
     * @param namePlaylist nombre de la biblioteca en la que será agregada la cancion
     */
    public void addSong(String idSong, String namePlaylist) {
        Cancion findSong = searchSong(idSong);
        if (listSongs.contains(findSong)){
            this.playlists.get(namePlaylist).add(findSong);
        }
    }

    /**
     * Permite realizar la busqueda de una cancion por su título
     * @param idSong  Titulo de una cancion
     * @return retorna un objeto de tipo cancion
     */
    public Cancion searchSong(String idSong){
        Cancion findSong = null;
        Iterator<Cancion> iSong = listSongs.iterator();
        while (iSong.hasNext() && findSong == null){
            Cancion song = iSong.next();
            if (song.getIdSong().equalsIgnoreCase(idSong)){
                findSong = song;
            }
        }
        return findSong;
    }

    /**
     * Remueve un cancion ingresado su título
     * @param idSong Título de la cancion
     */
    public void removeSong(String idSong){
        Cancion song = searchSong(idSong);
        if (song == null ){
            System.out.println("!Cancion no disponible!");
        }else {
            listSongs.remove(song);
            System.out.println("Se ha removido la cancion " + song.getTitle());
        }
    }

    /**
     * Permite filtrar canciones por un género de música específico
     * @param genero Género de música
     */
    public void filterSongs(Genero genero){
        listSongs.stream().filter(j -> j.getGenre().equals(genero))
                .forEach(System.out::println);
    }

    /**
     * Permite filtrar canciones por un género de música específico
     * @param date año de publicación
     */
    public void filterSongs(int date){
        listSongs.stream().filter(j -> j.getDate() == date)
                .forEach(System.out::println);
    }

    /**
     * Permite ordenar las canciones de acuerdo al año de publicación y al género
     */
    public void orderSong(){
        listSongs.sort(Comparator.comparing(Cancion::getDate)
                .thenComparing(Cancion::getGenre)
        );
        listSongs.forEach(System.out::println);
    }

    /**
     * Permite crear una lista de reproducción dentro de la biblioteca
     * @param namePlaylist Nombre de la lista de reproducción
     */
    public void createPlaylist(String namePlaylist){
        List<Cancion> list = new ArrayList<>();
        playlists.put(namePlaylist, list);
        System.out.println("Playlist " + namePlaylist + " creada con éxito");
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "nameLibrary='" + nameLibrary + '\'' +
                ", listSongs=" + listSongs +
                ", playlists=" + playlists +
                '}';
    }
}
