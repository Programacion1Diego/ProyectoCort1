// Package declaration. This code belongs to the 'co.edu.unbosque.persistence' package.
package co.edu.unbosque.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Celular;

/**
 * The CelularDAO class implements the CRUDOperation interface for managing Celular objects.
 * This class provides basic CRUD (Create, Read, Update, Delete) operations for a list of Celular objects.
 */
public class CelularDAO implements CRUDOperation<Celular> {

    // A list to store Celular objects.
    ArrayList<Celular> celulares = new ArrayList<Celular>();

    /**
     * Adds a new Celular object to the list.
     * 
     * @param nuevoDato the Celular object to be added
     */
    @Override
    public void crear(Celular nuevoDato) {
        celulares.add(nuevoDato);
    }

    /**
     * Removes a specific Celular object from the list.
     * 
     * @param nuevoDato the Celular object to be removed
     * @return true if the object was successfully removed, false otherwise
     */
    @Override
    public boolean eliminar(Celular nuevoDato) {
        return celulares.remove(nuevoDato);
    }

    /**
     * Removes a Celular object at a specific index in the list.
     * 
     * @param index the index of the Celular object to be removed
     * @return true if the object was successfully removed, false otherwise
     */
    @Override
    public boolean eliminar(int index) {
        if (index < 0 || index >= celulares.size()) {
            return false;
        } else {
            celulares.remove(index);
            return true;
        }
    }

    /**
     * Removes a Celular object from the list by matching its name.
     * 
     * @param name the name of the Celular object to be removed
     * @return true if the object was successfully removed, false otherwise
     */
    @Override
    public boolean eliminar(String name) {
        for (Celular celular : celulares) {
            String nombre = celular.getNombreProducto();
            if (nombre.equals(name)) { // Use equals() to compare strings
                celulares.remove(celular);
                return true;
            }
        }
        return false;
    }

    /**
     * Updates a Celular object at a specific index in the list.
     * 
     * @param index the index of the Celular object to be updated
     * @param nuevo the new Celular object that will replace the existing one
     * @return true if the object was successfully updated, false otherwise
     */
    @Override
    public boolean actualizar(int index, Celular nuevo) {
        if (index < 0 || index >= celulares.size()) {
            return false;
        } else {
            celulares.set(index, nuevo); // Replace the old object at the given index with the new object
            return true;
        }
    }

    /**
     * Adds a new Celular object to the list, intended as a way to update or add.
     * 
     * @param nuevo the new Celular object to be added
     * @return true always, since adding to the list always succeeds
     */
    @Override
    public boolean actualizar(Celular nuevo) {
        celulares.add(nuevo);
        return true;
    }

    /**
     * Returns the list of all Celular objects.
     * 
     * @return an ArrayList containing all Celular objects in the list
     */
    @Override
    public ArrayList<Celular> mostrar() {
        return celulares;
    }

    /**
     * Returns a string representation of all Celular objects in the list.
     * 
     * @return a concatenated string of all Celular objects' string representations
     */
    @Override
    public String mostrarTodo() {
        int i = 0;
        StringBuilder cont = new StringBuilder();
        for (Celular celular : celulares) {
            cont.append(i).append("->");
            cont.append(celular.toString());
            i++;
        }
        return cont.toString();
    }
}
