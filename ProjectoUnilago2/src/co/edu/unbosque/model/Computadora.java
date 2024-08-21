package co.edu.unbosque.model;

// The 'Computadora' class extends the 'Producto' class, representing a specific type of product, a computer.
public class Computadora extends Producto {
	
	// Private fields to store information specific to a computer
	private String tipoProcesador; // The type of processor in the computer
	private String oS;             // The operating system installed on the computer
	private double memoriaRamGb;   // The amount of RAM memory in gigabytes

	// Constructor that initializes all attributes, including those inherited from 'Producto'
	public Computadora(int numeroSerial, String nombreProducto, String marcaProducto, String paisDeOrigen,
			String tipoProcesador, String oS, double memoriaRamGb) {
		// Call to the parent class constructor to initialize common attributes
		super(numeroSerial, nombreProducto, marcaProducto, paisDeOrigen);
		// Initialize specific attributes for 'Computadora'
		this.tipoProcesador = tipoProcesador;
		this.oS = oS;
		this.memoriaRamGb = memoriaRamGb;
	}

	// Overloaded constructor that only initializes attributes inherited from 'Producto'
	public Computadora(int numeroSerial, String nombreProducto, String marcaProducto, String paisDeOrigen) {
		// Call to the parent class constructor to initialize common attributes
		super(numeroSerial, nombreProducto, marcaProducto, paisDeOrigen);
		// Specific attributes are not initialized here; they will need to be set later
	}

	// Default constructor that creates a 'Computadora' object with default values
	public Computadora() {
		// No specific or inherited attributes are initialized here
	}

	// Getter method to retrieve the 'tipoProcesador' value
	public String getTipoProcesador() {
		return tipoProcesador;
	}

	// Setter method to update the 'tipoProcesador' value
	public void setTipoProcesador(String tipoProcesador) {
		this.tipoProcesador = tipoProcesador;
	}

	// Getter method to retrieve the 'oS' value
	public String getoS() {
		return oS;
	}

	// Setter method to update the 'oS' value
	public void setoS(String oS) {
		this.oS = oS;
	}

	// Getter method to retrieve the 'memoriaRamGb' value
	public double getMemoriaRamGb() {
		return memoriaRamGb;
	}

	// Setter method to update the 'memoriaRamGb' value
	public void setMemoriaRamGb(double memoriaRamGb) {
		this.memoriaRamGb = memoriaRamGb;
	}

	// Override of the 'toString' method to provide a string representation of the 'Computadora' object
	@Override
	public String toString() {
		// Concatenates the values of the specific attributes into a readable string format
		return "Computadora [tipoProcesador=" + tipoProcesador + ", oS=" + oS + ", memoriaRamGb=" + memoriaRamGb + "]";
	}
}
