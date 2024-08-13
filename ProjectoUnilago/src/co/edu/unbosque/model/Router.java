package co.edu.unbosque.model;

public class Router extends Producto{
	int numeroPuertos;
	double velocidadMaximaMb;
	
	public Router(int numeroSerial, String nombreProducto, String marcaProducto, String paisDeOrigen, int numeroPuertos,
			double velocidadMaximaMb) {
		super(numeroSerial, nombreProducto, marcaProducto, paisDeOrigen);
		this.numeroPuertos = numeroPuertos;
		this.velocidadMaximaMb = velocidadMaximaMb;
	}
	public Router(int numeroSerial, String nombreProducto, String marcaProducto, String paisDeOrigen) {
		super(numeroSerial, nombreProducto, marcaProducto, paisDeOrigen);
	}
	public Router() {
		super();
	}
	public int getNumeroPuertos() {
		return numeroPuertos;
	}
	public void setNumeroPuertos(int numeroPuertos) {
		this.numeroPuertos = numeroPuertos;
	}
	public double getVelocidadMaximaMb() {
		return velocidadMaximaMb;
	}
	public void setVelocidadMaximaMb(double velocidadMaximaMb) {
		this.velocidadMaximaMb = velocidadMaximaMb;
	}
	@Override
	public String toString() {
		return "Router [numeroPuertos=" + numeroPuertos + ", velocidadMaximaMb=" + velocidadMaximaMb + "]";
	}
	
	
	
	
	

}
