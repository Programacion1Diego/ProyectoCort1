// Package declaration. This code belongs to the 'co.edu.unbosque.persistence' package.
package co.edu.unbosque.persistence;

import java.util.ArrayList;

/**
 * Interface CRUDOperation defines a generic set of CRUD (Create, Read, Update, Delete) operations.
 * It uses a generic type parameter <E> to allow operations on any type of object.
 *
 * @param <E> the type of object that the CRUD operations will be performed on
 */
public interface CRUDOperation<E> {
    
    /**
     * Creates a new object and adds it to the underlying data structure.
     *
     * @param nuevoDato the new object to be added
     */
    public void crear(E nuevoDato);

    /**
     * Removes an object from the underlying data structure.
     *
     * @param nuevoDato the object to be removed
     * @return true if the object was successfully removed, false otherwise
     */
    public boolean eliminar(E nuevoDato);

    /**
     * Removes an object at a specific index from the underlying data structure.
     *
     * @param index the index of the object to be removed
     * @return true if the object was successfully removed, false otherwise
     */
    public boolean eliminar(int index);
    
    /**
     * Removes an object by its name from the underlying data structure.
     *
     * @param name the name of the object to be removed
     * @return true if the object was successfully removed, false otherwise
     */
    public boolean eliminar(String name);

    /**
     * Updates an object at a specific index in the underlying data structure with a new object.
     *
     * @param index the index of the object to be updated
     * @param nuevo the new object to replace the existing one
     * @return true if the object was successfully updated, false otherwise
     */
    public boolean actualizar(int index, E nuevo);
    
    /**
     * Updates an existing object in the underlying data structure with a new object.
     *
     * @param nuevo the new object to replace the existing one
     * @return true if the object was successfully updated, false otherwise
     */
    public boolean actualizar(E nuevo);

    /**
     * Retrieves all objects from the underlying data structure as an ArrayList.
     *
     * @return an ArrayList containing all objects
     */
    public ArrayList<E> mostrar();

    /**
     * Retrieves a string representation of all objects in the underlying data structure.
     *
     * @return a string representation of all objects
     */
    public String mostrarTodo();
}

