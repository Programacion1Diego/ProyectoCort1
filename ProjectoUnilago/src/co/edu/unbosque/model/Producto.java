package co.edu.unbosque.model;

public class Producto {
	int numeroSerial;
	String nombreProducto, marcaProducto, paisDeOrigen;

	public Producto(int numeroSerial, String nombreProducto, String marcaProducto, String paisDeOrigen) {
		super();
		this.numeroSerial = numeroSerial;
		this.nombreProducto = nombreProducto;
		this.marcaProducto = marcaProducto;
		this.paisDeOrigen = paisDeOrigen;
	}

	public Producto() {
		super();
	}

	public int getNumeroSerial() {
		return numeroSerial;
	}

	public void setNumeroSerial(int numeroSerial) {
		this.numeroSerial = numeroSerial;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getMarcaProducto() {
		return marcaProducto;
	}

	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}

	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}

	public void setPaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}

	@Override
	public String toString() {
		return "Producto [numeroSerial=" + numeroSerial + ", nombreProducto=" + nombreProducto + ", marcaProducto="
				+ marcaProducto + ", paisDeOrigen=" + paisDeOrigen + "]";
	}

}
