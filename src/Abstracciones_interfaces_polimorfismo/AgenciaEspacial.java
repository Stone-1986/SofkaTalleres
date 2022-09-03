package Abstracciones_interfaces_polimorfismo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 */
public class AgenciaEspacial {

    /**
     *  Representa los atributos de un objeto Agencia espacial
     */
    private String name;
    private ArrayList<NaveEspacial> listShips;

    /**
     * Constructor de la clase Agencia espacial sin argumentos
     */
    public AgenciaEspacial(){
        this.listShips = new ArrayList<>();
    }

    /**
     * Constructor de la clase Agencia espacial con argumentos
     */
    public AgenciaEspacial(String name){
        this.name = name;
        this.listShips = new ArrayList<>();
    }

    /**
     * Permite crear un objet nave espacial
     * @param ship Nave espacial
     */
    public void addShips(NaveEspacial ship) {
        this.listShips.add(ship);
    }

    /**
     * Permite listar las vanes espaciales
     */
    public void listarNaves() {
        if (listShips.isEmpty()) {
            System.out.println("Aun no hay naves");
        } else {
            for (NaveEspacial nave : listShips) {
                System.out.println(nave);
            }
        }
    }

    /**
     * Permite buscar una nave espacial por su nombre
     * @param name nombre de una nave espacial
     * @return retorna él detalla de una nave espacial
     */
    public NaveEspacial searchShip(String name) {
        NaveEspacial findShip = null;
        Iterator<NaveEspacial> i = this.listShips.iterator();
        while (i.hasNext() && findShip == null) {
            NaveEspacial ship = i.next();
            if (ship.getName().equalsIgnoreCase(name)) {
                findShip = ship;
            }
        }
        return findShip;
    }

    /**
     * Sobrescribe el método toString para mostrar el estado o el valor de los atributos de un objeto en un instante
     * @return cadena con el valor de los atributos
     */
    @Override
    public String toString() {
        return "AgenciaEspacial{" +
                "name='" + name + '\'' +
                ", listShips=" + listShips +
                '}';
    }
}
