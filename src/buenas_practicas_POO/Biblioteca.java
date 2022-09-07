package buenas_practicas_POO;


import java.util.*;
import java.util.stream.Collectors;


public class Biblioteca {

    private String nameLibrary;
    private ArrayList<Cancion> listSongs;

    public Biblioteca(String nameLibrary) {
        this.nameLibrary = nameLibrary;
        this.listSongs = new ArrayList<>();
    }

    public void addSong(Cancion song){
        listSongs.add(song);
    }

    public Cancion searchSong(String title){
        Cancion findSong = null;
        Iterator<Cancion> iSong = this.listSongs.iterator();
        while (iSong.hasNext() && findSong == null){
            Cancion song = iSong.next();
            if (song.getTitle().equalsIgnoreCase(title)){
                findSong = song;
            }
        }
        return findSong;
    }

    public void removeSong(String title){
        Cancion song = searchSong(title);
        if (song == null ){
            System.out.println("!Cancion no disponible!");
        }else {
            listSongs.remove(song);
            System.out.println("Se ha removido la cancion " + song.getTitle());
        }
    }

    public void filterSongs(Genero genero){
        listSongs.stream().filter(j -> j.getGenre().equals(genero))
                 .map(Cancion::getTitle).forEach(System.out::println);
    }
    public void filterSongs(int date){
        listSongs.stream().filter(j -> j.getDate() == date)
                .map(Cancion::getTitle).forEach(System.out::println);
    }
    public void orderSong(){
        listSongs.sort(Comparator.comparing(Cancion::getDate)
                .thenComparing(Cancion::getGenre)
        );
        listSongs.forEach(System.out::println);
    }
    @Override
    public String toString() {
        return "Biblioteca{" +
                "nameLibrary='" + nameLibrary + '\'' +
                ", listSongs=" + listSongs +
                '}';
    }
}
