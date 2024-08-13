package co.edu.unbosque.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Celular;


public class CelularDAO implements CrudOperation<Celular>{

	ArrayList<Celular> celulares = new ArrayList<Celular>();

	@Override
	public void crear(Celular nuevoDato) {
		celulares.add(nuevoDato);
		
	}

	@Override
	public boolean eliminar(Celular nuevoDato) {
		if(celulares.remove(nuevoDato)) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public boolean eliminar(int index) {
		if(index < 0 || index>= celulares.size()) {
			return false;
		}
		else {
			celulares.remove(index);
			return true;
		}
	}

	@Override
	public boolean eliminar(String name) {
		for (Celular celular : celulares) {
			String nombre = celular.getNombreProducto();
			if(  nombre == name) {
				celulares.remove(celular);
				return true;
			}	
		
		}
		return false;
	}

	@Override
	public boolean actualizar(int index, Celular nuevo) {
		if(index < 0 || index>= celulares.size()) {
			return false;
		}
		else {
			celulares.add(index, nuevo);
			return true;
		}
	}

	@Override
	public boolean actualizar(Celular nuevo) {
		celulares.add(nuevo);
		return true;
	}

	@Override
	public ArrayList<Celular> mostrar() {
		
		return celulares;
	}

	@Override
	public String mostrarTodo() {
		int i = 0;
		String cont ="";
		for (Celular Celular : celulares) {
			cont += i + "->";
			cont += Celular.toString();	
		}
		return cont;
		
		
	}

}
