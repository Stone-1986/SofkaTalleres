package Clases_Objetos;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a una clase Fruta, sus atributos y métodos
 * @author: Jonathan Fonseca Clavijo
 * https://github.com/Stone-1986/SofkaTalleres.git
 */
public class Fruta {
    /**
     * Representa los posibles atributos de una clase Fruta
     */
    public String name;
    private float averageWeight;
    private List<String> colors;

    /**
     * Crea una instancia de la clase Fruta sin especificar sus atributos
     */
    public Fruta(){}

    /**
     * Crea una instancia de la clase Fruta especificando sus atributos
     * @param name - nombre
     * @param averageWeight - peso promedio
     */
    public Fruta(String name, float averageWeight) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = new ArrayList<>();
    }

    /**
     * Permite agregar colores al objeto Fruta
     * @param color - Color de Fruta
     */
    public void addColors(String color) {
        this.colors.add(color);
    }

    /**
     *  Permite consultar la lista de colores de un objeto Fruta
     *  Caso no se hayan agregado automóviles retornará el mensaje "No hay Colores asignados"
     */
    public void showColors() {
        if(colors.isEmpty()){
            System.out.println("No hay Colores asignados");
        }else {
            for (String color : colors) {
                System.out.println(color);
            }
        }
    }

    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante dado
     * @return una cadena con el valor de los atributos de un objeto en un instante dado
     */
    @Override
    public String toString() {
        return "Fruta{" +
                "name='" + name + '\'' +
                ", averageWeight=" + averageWeight +
                ", colors=" + colors +
                '}';
    }
}
