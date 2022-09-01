package Clases_Objetos;

/**
 * Representa a una clase Automovil, sus atributos y métodos
 * * @author: Jonathan Fonseca Clavijo
 */
public class Automovil {

    /**
     * Representa los posibles atributos de una clase Automovil
     */
    private String patent;
    private String brand;
    protected String color;
    public int kms;

    /**
     * Crea una instancia de la clase Automovil sin especificar sus atributos
     */
    public Automovil(){}

    /**
     * Crea una instancia de la clase Automovil especificando sus atributos
     * @param patent - placa
     * @param brand - marca
     * @param color - color
     * @param kms - kilómetros recorridos
     */
    public Automovil(String patent, String brand,String color, int kms) {
        this.patent = patent;
        this.brand = brand;
        this.color = color;
        this.kms = kms;
    }

    /**
     * Retorna la placa de un objeto Automovil
     * @return la placa de un Automovil
     */
    public String getPatent() {
        return patent;
    }

    /**
     * Permite asignar un número de placa a un objeto automovil, pasando como argumento una placa
     * @param patent - placa del automovil
     */
    public void setPatent(String patent) {
        this.patent = patent;
    }

    /**
     * Retorna la marca de un objeto Automovil
     * @return la placa de un Automovil
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Permite asignar una marca a un objeto automovil, pasando como argumento una maraca
     * @param brand - marca de un automovil
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Retorna los colores de un objeto Automovil
     * @return la placa de un Automovil
     */
    public String getColors() {
        return color;
    }

    /**
     * Permite asignar colores un objeto automovil
     * @param color - color de automovil
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Retorna los kms recorridos de un objeto Automovil
     * @return la placa de un Automovil
     */
    public int getKms() {
        return kms;
    }

    /**
     * Permite asignar los kms recorridos a un objeto automovil
     * @param kms - kilómetros recorridos
     */
    public void setKms(int kms) {
        this.kms = kms;
    }

    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante dado
     * @return una cadena con el valor de los atributos de un objeto en un instante dado
     */
    @Override
    public String toString() {
        return "Automovil{" +
                "patent='" + patent + '\'' +
                ", brand='" + brand + '\'' +
                ", colors=" + color +
                ", kms=" + kms +
                '}';
    }
}
