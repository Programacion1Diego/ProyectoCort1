package co.edu.unbosque.persistence;

import java.util.ArrayList;


import co.edu.unbosque.model.Router;

public class RouterDAO implements CrudOperation<Router>{

	ArrayList<Router> routers = new ArrayList<Router>();

	@Override
	public void crear(Router nuevoDato) {
		routers.add(nuevoDato);
		
	}

	@Override
	public boolean eliminar(Router nuevoDato) {
		if(routers.remove(nuevoDato)) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public boolean eliminar(int index) {
		if(index < 0 || index>= routers.size()) {
			return false;
		}
		else {
			routers.remove(index);
			return true;
		}
	}

	@Override
	public boolean eliminar(String name) {
		for (Router router : routers) {
			if(router.getNombreProducto() ==name) {
				routers.remove(router);
				return true;
			}	
		
		}
		return false;
	}

	@Override
	public boolean actualizar(int index, Router nuevo) {
		if(index < 0 || index>= routers.size()) {
			return false;
		}
		else {
			routers.add(index, nuevo);
			return true;
		}
	}

	@Override
	public boolean actualizar(Router nuevo) {
		routers.add(nuevo);
		return true;
	}

	@Override
	public ArrayList<Router> mostrar() {
		
		return routers;
	}

	@Override
	public String mostrarTodo() {
		int i = 0;
		String cont ="";
		for (Router Router : routers) {
			cont += i + "->";
			cont += Router.toString();	
		}
		return cont;
		
		
	}

}
