package buenas_practicas_POO;

public class Test {

    public static void main(String[] args){

        Biblioteca b = new Biblioteca("Stone");
        Cancion c = new Cancion("Sky",
                "01", 2022, 3,
                Genero.BLUES, "InFire", "description");

        Cancion c1 = new Cancion("Blue",
                "02", 2001, 3,
                Genero.BLUES, "InFire", "description");

        b.addSong(c);
        b.addSong(c1);

    b.orderSong();

    }

}
