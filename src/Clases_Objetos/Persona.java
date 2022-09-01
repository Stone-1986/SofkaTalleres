package Clases_Objetos;

import java.util.Date;

/**
 * Representa a una clase Persona, sus atributos y métodos
 * @author: Jonathan Fonseca Clavijo
 * https://github.com/Stone-1986/SofkaTalleres.git
 */
public class Persona {

    /**
     * Representa los posibles atributos de una clase Persona
     */
    public String name;
    public String lastName1;
    public String lastName2;
    public Date dateBirth;
    public float height;

    /**
     * Crea una instancia de la clase Persona sin especificar sus atributos
     */
    public Persona(){}

    /**
     * Crea una instancia de la clase Persona especificando sus atributos
     * @param name - nombre de una persona
     * @param lastName1 - primer apellido de una persona
     * @param lastName2 - segundo apellido de una persona
     * @param height - altura de una persona
     */
    public Persona(String name, String lastName1, String lastName2, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.height = height;
    }

    /**
     * Retorna el nombre de un objeto Persona
     * @return nombre de la persona
     */
    public String getName() {
        return name;
    }

    /**
     * Permite asignar un nombre al objeto Persona, pasando como argumento su nombre
     * Se válida que el campo nombre sea diferente de nulo
     * @param name - nombre de una persona
     */
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    /**
     * Retorna la fecha de nacimiento de un objeto Persona
     * @return fecha de nacimiento
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * Permite asignar una fecha de nacimiento al objeto Persona, pasando como argumento su nombre
     * Se válida que el campo fecha de nacimiento sea diferente de nulo
     * @param dateBirth - fecha de nacimiento de una persona
     */
    public void setDateBirth(Date dateBirth) {
        if (dateBirth != null) {
            this.dateBirth = dateBirth;
        }
    }

    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante dado
     * @return una cadena con el valor de los atributos de un objeto en un instante dado
     */
    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", lastName1='" + lastName1 + '\'' +
                ", lastName2='" + lastName2 + '\'' +
                ", dateBirth=" + dateBirth +
                ", height=" + height +
                '}';
    }
}
