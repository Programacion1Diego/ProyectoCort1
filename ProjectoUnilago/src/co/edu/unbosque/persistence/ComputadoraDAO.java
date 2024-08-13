package co.edu.unbosque.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Computadora;


public class ComputadoraDAO implements CrudOperation<Computadora>{

	ArrayList<Computadora> computadoras = new ArrayList<Computadora>();

	@Override
	public void crear(Computadora nuevoDato) {
		computadoras.add(nuevoDato);
		
	}

	@Override
	public boolean eliminar(Computadora nuevoDato) {
		if(computadoras.remove(nuevoDato)) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public boolean eliminar(int index) {
		if(index < 0 || index>= computadoras.size()) {
			return false;
		}
		else {
			computadoras.remove(index);
			return true;
		}
	}

	@Override
	public boolean eliminar(String name) {
		for (Computadora Computadora : computadoras) {
			if(Computadora.getNombreProducto()==name) {
				computadoras.remove(Computadora);
				return true;
			}	
		
		}
		return false;
	}

	@Override
	public boolean actualizar(int index, Computadora nuevo) {
		if(index < 0 || index>= computadoras.size()) {
			return false;
		}
		else {
			computadoras.add(index, nuevo);
			return true;
		}
	}

	@Override
	public boolean actualizar(Computadora nuevo) {
		computadoras.add(nuevo);
		return true;
	}

	@Override
	public ArrayList<Computadora> mostrar() {
		
		return computadoras;
	}

	@Override
	public String mostrarTodo() {
		int i = 0;
		String cont ="";
		for (Computadora Computadora : computadoras) {
			cont += i + "->";
			cont += Computadora.toString();	
		}
		return cont;
		
		
	}

}
