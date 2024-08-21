// Package declaration. This code belongs to the 'co.edu.unbosque.persistence' package.
package co.edu.unbosque.persistence;

import java.util.ArrayList; // Importing ArrayList from Java's Collections Framework to store Router objects.

import co.edu.unbosque.model.Router; // Importing the Router class from the model package.

/**
 * RouterDAO is a Data Access Object (DAO) class that implements the CRUDOperation interface for Router objects.
 * It provides methods to create, read, update, and delete Router objects in an ArrayList.
 */
public class RouterDAO implements CRUDOperation<Router> {

    // An ArrayList to store Router objects.
    ArrayList<Router> routers = new ArrayList<Router>();

    /**
     * Adds a new Router object to the list.
     * 
     * @param nuevoDato The Router object to be added.
     */
    @Override
    public void crear(Router nuevoDato) {
        routers.add(nuevoDato);
    }

    /**
     * Removes a specific Router object from the list.
     * 
     * @param nuevoDato The Router object to be removed.
     * @return true if the object was successfully removed, false otherwise.
     */
    @Override
    public boolean eliminar(Router nuevoDato) {
        return routers.remove(nuevoDato); // If the object exists in the list and is removed, returns true.
    }

    /**
     * Removes a Router object from the list at a specified index.
     * 
     * @param index The index of the Router object to be removed.
     * @return true if the object was successfully removed, false otherwise.
     */
    @Override
    public boolean eliminar(int index) {
        if (index < 0 || index >= routers.size()) { // Check if the index is valid.
            return false;
        } else {
            routers.remove(index); // Remove the object at the specified index.
            return true;
        }
    }

    /**
     * Removes a Router object from the list based on the name of the product.
     * 
     * @param name The name of the Router product to be removed.
     * @return true if the object was successfully removed, false otherwise.
     */
    @Override
    public boolean eliminar(String name) {
        for (Router router : routers) {
            if (router.getNombreProducto().equals(name)) { // Check if the Router's name matches the given name.
                routers.remove(router); // Remove the matching Router object.
                return true;
            }
        }
        return false;
    }

    /**
     * Updates the Router object at the specified index with a new Router object.
     * 
     * @param index The index of the Router object to be updated.
     * @param nuevo The new Router object to replace the existing one.
     * @return true if the object was successfully updated, false otherwise.
     */
    @Override
    public boolean actualizar(int index, Router nuevo) {
        if (index < 0 || index >= routers.size()) { // Check if the index is valid.
            return false;
        } else {
            routers.set(index, nuevo); // Replace the existing Router at the index with the new one.
            return true;
        }
    }

    /**
     * Adds a new Router object to the list, essentially updating the list with a new Router.
     * 
     * @param nuevo The new Router object to be added.
     * @return true if the object was successfully added, false otherwise.
     */
    @Override
    public boolean actualizar(Router nuevo) {
        routers.add(nuevo); // Adds the new Router object to the list.
        return true;
    }

    /**
     * Returns the list of all Router objects.
     * 
     * @return An ArrayList containing all Router objects.
     */
    @Override
    public ArrayList<Router> mostrar() {
        return routers;
    }

    /**
     * Returns a string representation of all Router objects in the list.
     * 
     * @return A string containing information about all Router objects in the list.
     */
    @Override
    public String mostrarTodo() {
        int i = 0;
        String cont = "";
        for (Router router : routers) {
            cont += i + "->"; // Append the index.
            cont += router.toString(); // Append the Router's string representation.
            i++; // Increment the index.
        }
        return cont;
    }
}
