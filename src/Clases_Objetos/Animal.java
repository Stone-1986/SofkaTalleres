package Clases_Objetos;

/**
 * Representa a una clase Persona, sus atributos y métodos
 * * @author: Jonathan Fonseca Clavijo
 * https://github.com/Stone-1986/SofkaTalleres.git
 */
public class Animal {

    /**
     * Representa los posibles atributos de una clase Animal
     */
    public String name;
    private String kindAnimal;
    protected String raceAnimal;

    /**
     * Crea una instancia de la clase Animal sin especificar sus atributos
     */
    public Animal(){}

    /**
     * Crea una instancia de la clase Animal especificando sus atributos
     * @param name - nombre de un animal
     * @param kindAnimal - tipo de un animal
     * @param raceAnimal - raza de un animal
     */
    public Animal(String name, String kindAnimal, String raceAnimal) {
        this.name = name;
        this.kindAnimal = kindAnimal;
        this.raceAnimal = raceAnimal;
    }

    /**
     * Retorna el nombre de un objeto Animal
     * @return nombre del animal
     */
    public String getName() {
        return name;
    }

    /**
     * Permite asignar un nombre al objeto Animal
     * @param name - nombre del animal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retorna el tipo de animal de un objeto Animal
     * @return tipo de animal
     */
    public String getKindAnimal() {
        return kindAnimal;
    }

    /**
     * Permite asignar un tipo de animal al objeto Animal
     * @param kindAnimal - tipo de animal
     */
    public void setRaceAnimal(String kindAnimal) {
        this.kindAnimal = kindAnimal;
    }

    /**
     * Retorna la raza de un objeto Animal
     * @return raza de un animal
     */
    public String getRaceAnimal() {
        return raceAnimal;
    }

    /**
     * Permite asignar una raza al objeto Animal
     * @param typeAnimal - raza de un animal
     */
    public void setTypeAnimal(String typeAnimal) {
        this.raceAnimal = typeAnimal;
    }

    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante dado
     * @return una cadena con el valor de los atributos de un objeto en un instante dado
     */
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", kindAnimal='" + kindAnimal + '\'' +
                ", raceAnimal='" + raceAnimal + '\'' +
                '}';
    }
}
