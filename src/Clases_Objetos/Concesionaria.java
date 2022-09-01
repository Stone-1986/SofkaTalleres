package Clases_Objetos;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a una clase Concesionaria, sus atributos y métodos
 * @author: Jonathan Fonseca Clavijo
 * https://github.com/Stone-1986/SofkaTalleres.git
 */
public class Concesionaria {

    /**
     * Representa los posibles atributos de una clase Concesionaria
     */
    private String name;
    protected List<Automovil> cars;

    /**
     * Crea una instancia de la clase Concesionaria especificando sus atributos
     * @param name - nombre de la concesionaria
     */
    public Concesionaria(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
    }

    /**
     * Permite agregar automóviles a la concesionaria
     * @param car - automovil para agregar
     */
    public void addCar (Automovil car){
        this.cars.add(car);
    }

    /**
     * Permite consultar la lista de automóviles de un objeto concesionaria
     * Caso no se hayan agregado automóviles retornará el mensaje "No hay automóviles"
     */
    public void showCars(){
        if(cars.isEmpty()){
            System.out.println("No hay automóviles");
        }else {
            for (Automovil a: cars  ) {
                System.out.println(a);
            }
        }
    }

    /**
     * Retorna el número de automóviles asignados a una concesionaria
     * @return - numero de automóviles asignados a una concesionaria
     */
    public int amountCars(){
        return cars.size();
    }

    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante dado
     * @return una cadena con el valor de los atributos de un objeto en un instante dado
     */

    @Override
    public String toString() {
        return "Concesionaria{" +
                "name='" + name + '\'' +
                ", cars=" + cars +
                '}';
    }
}
