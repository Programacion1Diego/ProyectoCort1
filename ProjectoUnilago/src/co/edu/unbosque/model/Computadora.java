package co.edu.unbosque.model;

public class Computadora extends Producto {
	private String tipoProcesador, oS;
	private double memoriaRamGb;

	public Computadora(int numeroSerial, String nombreProducto, String marcaProducto, String paisDeOrigen,
			String tipoProcesador, String oS, double memoriaRamGb) {
		super(numeroSerial, nombreProducto, marcaProducto, paisDeOrigen);
		this.tipoProcesador = tipoProcesador;
		this.oS = oS;
		this.memoriaRamGb = memoriaRamGb;
	}

	public Computadora(int numeroSerial, String nombreProducto, String marcaProducto, String paisDeOrigen) {
		super(numeroSerial, nombreProducto, marcaProducto, paisDeOrigen);
	}

	public Computadora() {
		
	}

	public String getTipoProcesador() {
		return tipoProcesador;
	}

	public void setTipoProcesador(String tipoProcesador) {
		this.tipoProcesador = tipoProcesador;
	}

	public String getoS() {
		return oS;
	}

	public void setoS(String oS) {
		this.oS = oS;
	}

	public double getMemoriaRamGb() {
		return memoriaRamGb;
	}

	public void setMemoriaRamGb(double memoriaRamGb) {
		this.memoriaRamGb = memoriaRamGb;
	}

	@Override
	public String toString() {
		return "Computadora [tipoProcesador=" + tipoProcesador + ", oS=" + oS + ", memoriaRamGb=" + memoriaRamGb + "]";
	}
	
	
	
	

}
