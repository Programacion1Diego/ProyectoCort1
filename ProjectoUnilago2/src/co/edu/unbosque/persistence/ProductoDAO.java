// Package declaration. This code belongs to the 'co.edu.unbosque.persistence' package.
package co.edu.unbosque.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Producto;

/**
 * The ProductoDAO class implements the CRUDOperation interface for managing Producto objects.
 * It provides the necessary methods to create, read, update, and delete Producto instances.
 */
public class ProductoDAO implements CRUDOperation<Producto> {
    
    // ArrayList to store Producto objects. This serves as the in-memory data store.
    ArrayList<Producto> productos = new ArrayList<Producto>();

    /**
     * Adds a new Producto to the productos list.
     *
     * @param nuevoDato the Producto object to be added
     */
    @Override
    public void crear(Producto nuevoDato) {
        productos.add(nuevoDato);
    }

    /**
     * Removes a Producto from the productos list.
     *
     * @param nuevoDato the Producto object to be removed
     * @return true if the Producto was successfully removed, false otherwise
     */
    @Override
    public boolean eliminar(Producto nuevoDato) {
        return productos.remove(nuevoDato);
    }

    /**
     * Removes a Producto at a specific index from the productos list.
     *
     * @param index the index of the Producto to be removed
     * @return true if the Producto was successfully removed, false otherwise
     */
    @Override
    public boolean eliminar(int index) {
        if (index < 0 || index >= productos.size()) {
            return false; // Invalid index, cannot remove
        } else {
            productos.remove(index);
            return true; // Producto removed successfully
        }
    }

    /**
     * Removes a Producto by its name from the productos list.
     *
     * @param name the name of the Producto to be removed
     * @return true if the Producto was found and removed, false otherwise
     */
    @Override
    public boolean eliminar(String name) {
        for (Producto producto : productos) {
            if (producto.getNombreProducto().equals(name)) {
                productos.remove(producto);
                return true; // Producto removed successfully
            }
        }
        return false; // No Producto found with the given name
    }

    /**
     * Updates a Producto at a specific index in the productos list with a new Producto.
     *
     * @param index the index of the Producto to be updated
     * @param nuevo the new Producto object to replace the existing one
     * @return true if the Producto was successfully updated, false otherwise
     */
    @Override
    public boolean actualizar(int index, Producto nuevo) {
        if (index < 0 || index >= productos.size()) {
            return false; // Invalid index, cannot update
        } else {
            productos.set(index, nuevo); // Replaces the Producto at the given index
            return true; // Producto updated successfully
        }
    }

    /**
     * Adds a new Producto to the productos list. 
     * This method can be considered as updating the list by adding new entries.
     *
     * @param nuevo the new Producto object to be added
     * @return true after the Producto is added to the list
     */
    @Override
    public boolean actualizar(Producto nuevo) {
        productos.add(nuevo);
        return true; // Producto added successfully
    }

    /**
     * Returns the list of all Producto objects.
     *
     * @return an ArrayList containing all Producto objects
     */
    @Override
    public ArrayList<Producto> mostrar() {
        return productos;
    }

    /**
     * Returns a string representation of all Producto objects in the list.
     *
     * @return a string with details of all Producto objects, each prefixed with its index in the list
     */
    @Override
    public String mostrarTodo() {
        int i = 0;
        StringBuilder cont = new StringBuilder();
        for (Producto producto : productos) {
            cont.append(i).append("->");
            cont.append(producto.toString()).append("\n");
            i++;
        }
        return cont.toString();
    }
}
