package co.edu.unbosque.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Producto;

public interface CrudOperation<E> {
	public void crear(E nuevoDato);

	public boolean eliminar(E nuevoDato);

	public boolean eliminar(int index);
	
	public boolean eliminar(String name);

	public boolean actualizar(int index, E nuevo);
	
	public boolean actualizar(E nuevo);

	public ArrayList<E> mostrar();

	public String mostrarTodo();
}
