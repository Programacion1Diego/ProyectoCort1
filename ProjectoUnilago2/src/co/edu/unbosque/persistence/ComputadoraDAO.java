// Package declaration. This code belongs to the 'co.edu.unbosque.persistence' package.
package co.edu.unbosque.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Computadora;

/**
 * The ComputadoraDAO class implements the CRUDOperation interface for managing
 * a list of Computadora objects. It provides concrete implementations for creating,
 * reading, updating, and deleting Computadora objects from an ArrayList.
 */
public class ComputadoraDAO implements CRUDOperation<Computadora> {

    // ArrayList to store Computadora objects.
    ArrayList<Computadora> computadoras = new ArrayList<Computadora>();

    /**
     * Adds a new Computadora object to the ArrayList.
     * @param nuevoDato the Computadora object to be added
     */
    @Override
    public void crear(Computadora nuevoDato) {
        computadoras.add(nuevoDato);
    }

    /**
     * Removes a specified Computadora object from the ArrayList.
     * @param nuevoDato the Computadora object to be removed
     * @return true if the object was successfully removed, false otherwise
     */
    @Override
    public boolean eliminar(Computadora nuevoDato) {
        if (computadoras.remove(nuevoDato)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Removes a Computadora object from the ArrayList at a specified index.
     * @param index the index of the Computadora object to be removed
     * @return true if the object was successfully removed, false otherwise
     */
    @Override
    public boolean eliminar(int index) {
        if (index < 0 || index >= computadoras.size()) {
            return false;
        } else {
            computadoras.remove(index);
            return true;
        }
    }

    /**
     * Removes a Computadora object from the ArrayList based on the product's name.
     * @param name the name of the Computadora object to be removed
     * @return true if the object was successfully removed, false otherwise
     */
    @Override
    public boolean eliminar(String name) {
        for (Computadora computadora : computadoras) {
            if (computadora.getNombreProducto().equals(name)) {
                computadoras.remove(computadora);
                return true;
            }
        }
        return false;
    }

    /**
     * Updates a Computadora object at a specified index in the ArrayList.
     * @param index the index of the Computadora object to be updated
     * @param nuevo the new Computadora object to replace the existing one
     * @return true if the object was successfully updated, false otherwise
     */
    @Override
    public boolean actualizar(int index, Computadora nuevo) {
        if (index < 0 || index >= computadoras.size()) {
            return false;
        } else {
            computadoras.set(index, nuevo);
            return true;
        }
    }

    /**
     * Adds a new Computadora object to the ArrayList. This method does not replace an existing object.
     * @param nuevo the new Computadora object to be added
     * @return true since the object is always added successfully
     */
    @Override
    public boolean actualizar(Computadora nuevo) {
        computadoras.add(nuevo);
        return true;
    }

    /**
     * Returns the ArrayList containing all Computadora objects.
     * @return an ArrayList of Computadora objects
     */
    @Override
    public ArrayList<Computadora> mostrar() {
        return computadoras;
    }

    /**
     * Returns a string representation of all Computadora objects in the ArrayList.
     * @return a string representation of all Computadora objects
     */
    @Override
    public String mostrarTodo() {
        int i = 0;
        String cont = "";
        for (Computadora computadora : computadoras) {
            cont += i + " -> ";
            cont += computadora.toString() + "\n";
            i++;
        }
        return cont;
    }
}
