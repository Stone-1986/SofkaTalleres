package Buenas_Practicas_POO;

public class Test {

    public static void main(String[] args) {

       // crear una biblioteca
        Biblioteca b = new Biblioteca("list - Songs");

        // crear canciones
        Cancion c = new Cancion("Like Stone", "01", 2010,
                50, Genero.ROCK, "likeStone", "description");
        Cancion c1 = new Cancion("Sky",
                "01", 2022, 3,
                Genero.SOUL, "InFire", "description");
        Cancion c2 = new Cancion("Blue",
                "02", 2001, 3,
                Genero.BLUES, "InFire", "description");
        Cancion c3 = new Cancion("Indor",
                "03", 2001, 3,
                Genero.ROCK, "InFire", "description");

        // agregar canciones a una biblioteca
        b.addSong(c);
        b.addSong(c1);
        b.addSong(c2);
        b.addSong(c3);

        // crear una playlist
        b.createPlaylist("Big-Songs");

        // Agregar una cancion a una playlist
        b.addSong("01", "Big-Songs");

        System.out.println(b);

    }
}
