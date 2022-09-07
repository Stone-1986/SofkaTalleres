package Abstracciones_interfaces_polimorfismo;

/**
 * Clase abstracta que permite modelar diferentes tipos de naves espaciales
 * @author: Jonathan Fonseca Clavijo
 * https://github.com/Stone-1986/SofkaTalleres.git
 */
public abstract class NaveEspacial {
    /**
     * Representa los atributos de un objeto Nave Espacial
    */
    private String nombre;
    private int speed;
    private int power;
    private int weight;
    private String Assignment;

    /**
     * Constructor de la clase Nave espacial
     * @param nombre - nombre de la nave espacial
     * @param speed - velocidad
     * @param power - Potencia
     * @param weight - Peso
     * @param assignment - mision asignada
     */
    protected NaveEspacial(String nombre, int speed, int power, int weight, String assignment) {
        this.nombre = nombre;
        this.speed = speed;
        this.power = power;
        this.weight = weight;
        this.Assignment = assignment;
    }

    /**
     * Método abstracto que permite definir la forma de despegue para cada nave
     */
    public abstract void detach();

    /**
     * Permite recuperar el nombre de una nave
     * @return - nombre de una nave espacial
     */
    public String getName() {
        return nombre;
    }

    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante
     * @return cadena con el valor de los atributos
     */
    @Override
    public String toString() {
        return "NaveEspacial{" +
                "nombre='" + nombre + '\'' +
                ", speed=" + speed +
                ", power=" + power +
                ", weight=" + weight +
                ", Assignment='" + Assignment + '\'' +
                '}';
    }
}

