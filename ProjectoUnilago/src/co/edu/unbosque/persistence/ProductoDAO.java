package co.edu.unbosque.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Producto;

public class ProductoDAO implements CrudOperation<Producto>{
	
	ArrayList<Producto> productos = new ArrayList<Producto>();

	@Override
	public void crear(Producto nuevoDato) {
		productos.add(nuevoDato);
		
	}

	@Override
	public boolean eliminar(Producto nuevoDato) {
		if(productos.remove(nuevoDato)) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public boolean eliminar(int index) {
		if(index < 0 || index>= productos.size()) {
			return false;
		}
		else {
			productos.remove(index);
			return true;
		}
	}

	@Override
	public boolean eliminar(String name) {
		for (Producto producto : productos) {
			if(producto.getNombreProducto()==name) {
				productos.remove(producto);
				return true;
			}	
		
		}
		return false;
	}

	@Override
	public boolean actualizar(int index, Producto nuevo) {
		if(index < 0 || index>= productos.size()) {
			return false;
		}
		else {
			productos.add(index, nuevo);
			return true;
		}
	}

	@Override
	public boolean actualizar(Producto nuevo) {
		productos.add(nuevo);
		return true;
	}

	@Override
	public ArrayList<Producto> mostrar() {
		
		return productos;
	}

	@Override
	public String mostrarTodo() {
		int i = 0;
		String cont ="";
		for (Producto producto : productos) {
			cont += i + "->";
			cont += producto.toString();	
		}
		return cont;
		
		
	}
}
