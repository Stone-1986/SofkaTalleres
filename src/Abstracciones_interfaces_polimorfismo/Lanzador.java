package Abstracciones_interfaces_polimorfismo;

/**
 * clase que permite modelar una nave espacial de tipo lanzador
 * @author: Jonathan Fonseca Clavijo
 * https://github.com/Stone-1986/SofkaTalleres.git
 */
public class Lanzador extends NaveEspacial {

    /**
     * Representa los atributos de un objeto nave espacial- Lanzador
     */
    private int height;
    private int loadCapacity;

    /**
     * Constructor de la clase Lanzador con argumentos
     * @param nombre Nombre de la nave
     * @param speed Velocidad maxima
     * @param power Potencia maxima
     * @param weight Peso de la nave
     * @param assignment Mision asignada
     * @param height Altura de la nave
     * @param loadCapacity Capacidad maxima de carga
     */
    public Lanzador(String nombre, int speed, int power, int weight, String assignment, int height, int loadCapacity) {
        super(nombre, speed, power, weight, assignment);
        this.height = height;
        this.loadCapacity = loadCapacity;
    }

    /**
     * Sobreescribe el método abstract detach para emular el despegue de una nave de tipo Lanzador
     */
    @Override
    public void detach() {
        System.out.println("1. Asignar Plataforma");
        System.out.println("2. Cargando combustible");
        System.out.println("3. Asegurar carga");
        System.out.println("4. Despegar");
    }

    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante
     * @return cadena con el valor de los atributos
     */
    @Override
    public String toString() {
        return "Lanzador{" +
                "height=" + height +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}
