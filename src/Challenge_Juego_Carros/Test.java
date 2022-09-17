package Challenge_Juego_Carros;


public class Test {

    public static void main(String[] args) throws IllegalAccessException {

        // set del juego
        int numLanes = 3;
        int sizeTrack = 200;

        // Creation del juego
        Game game = new Game(1, "Pacific-Ring", numLanes, sizeTrack);

        Car car1 = new Car(Color.BLACK, "X1");
            car1.addDriver(new Driver(1, "juan", "jua@k.com", "Stone_1"));
        Car car2 = new Car(Color.WHITE, "X2");
            car2.addDriver(new Driver(2, "pedro", "jua@k.com", "Stone_2"));
        Car car3 = new Car(Color.BLUE, "X3");
            car3.addDriver(new Driver(3, "Marco", "jua@k.com", "Stone_3"));
        Car car4 = new Car(Color.RED, "X4");
            car4.addDriver(new Driver(4, "Esteban", "jua@k.com", "Stone_4"));
        Car car5 = new Car(Color.GREEN, "X5");
        car5.addDriver(new Driver(5, "Jose", "jua@k.com", "Stone_5"));



        // se agregan los carros a los carriles
        game.agregateCarsToLane(1, car1);
        game.agregateCarsToLane(2, car2);
        game.agregateCarsToLane(2, car3);
        game.agregateCarsToLane(3, car4);
        game.agregateCarsToLane(1, car5);

        // se inicia el juego
        Podium podium = game.initGame();


        // Resultados
        System.out.println(podium);

    }

}
