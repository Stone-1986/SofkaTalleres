package Abstracciones_interfaces_polimorfismo;

/**
 * clase que permite modelar una nave espacial de tipo Robot
 * @author: Jonathan Fonseca Clavijo
 * https://github.com/Stone-1986/SofkaTalleres.git
 */
public class Robot extends NaveEspacial{

    /**
     * Representa los atributos de un objeto nave espacial- Robot
     */
    private String destiny;

    /**
     * Constructor de la clase Nave Robot con argumentos
     * @param nombre Nombre de la nave
     * @param speed Velocidad maxima
     * @param power Potencia maxima
     * @param weight Peso de la nave
     * @param assignment Mision asignada
     * @param destiny Destino asignado
     */
    public Robot(String nombre, int speed, int power, int weight, String assignment, String destiny) {
        super(nombre, speed, power, weight, assignment);
        this.destiny = destiny;
    }

    /**
     * Método abstracto que permite definir la forma de despegue para cada nave
     */
    @Override
    public void detach() {
        System.out.println("1. Calibrar Instrumentos");
        System.out.println("2. Desplegar propulsores");
        System.out.println("3. Fijar Curso");
        System.out.println("4. Despegue");
    }

    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante
     * @return cadena con el valor de los atributos
     */
    @Override
    public String toString() {
        return "Robot{" +
                "destiny='" + destiny + '\'' +
                '}';
    }
}
