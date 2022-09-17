package Abstracciones_Interfaces_Polimorfismo;

/**
 * clase que permite modelar una nave espacial de tipo Nave Tripulada
 * @author: Jonathan Fonseca Clavijo
 * https://github.com/Stone-1986/SofkaTalleres.git
 */
public class NaveTripulada extends NaveEspacial{

    /**
     * Representa los atributos de un objeto nave espacial- Tripulada
     */
   private int capacity;
   private int orbit;

    /**
     * Constructor de la clase Nave Tripulada con argumentos
     * @param nombre Nombre de la nave
     * @param speed Velocidad maxima
     * @param power Potencia Maxima
     * @param weight Peso de la nave
     * @param assignment Mision asignada
     * @param capacity Capacidad maxima de carga
     * @param orbit Orbita a la que transita
     */
    public NaveTripulada(String nombre, int speed, int power, int weight, String assignment, int capacity, int orbit) {
        super(nombre, speed, power, weight, assignment);
        this.capacity = capacity;
        this.orbit = orbit;
    }

    /**
     * Método abstracto que permite definir la forma de despegue para cada nave
     */
    @Override
    public void detach() {
        System.out.println("1. Calibrar Instrumentos");
        System.out.println("3. Asegurar compuertas");
        System.out.println("4. Despegue");
    }

    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante
     * @return cadena con el valor de los atributos
     */
    @Override
    public String toString() {
        return "NaveTripulada{" +
                "capacity=" + capacity +
                ", orbit=" + orbit +
                '}';
    }
}
