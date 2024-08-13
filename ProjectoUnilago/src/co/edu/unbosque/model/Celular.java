package co.edu.unbosque.model;

public class Celular extends Producto{
	private String procesdor,oS;
	private double memoriaRamGb;
	private boolean nfc;
	
	public Celular(int numeroSerial, String nombreProducto, String marcaProducto, String paisDeOrigen, String procesdor,
			String oS, double memoriaRamGb, boolean nfc) {
		super(numeroSerial, nombreProducto, marcaProducto, paisDeOrigen);
		this.procesdor = procesdor;
		this.oS = oS;
		this.memoriaRamGb = memoriaRamGb;
		this.nfc = nfc;
	}

	public Celular(int numeroSerial, String nombreProducto, String marcaProducto, String paisDeOrigen) {
		super(numeroSerial, nombreProducto, marcaProducto, paisDeOrigen);
	}

	public Celular() {
		
	}

	public String getProcesdor() {
		return procesdor;
	}

	public void setProcesdor(String procesdor) {
		this.procesdor = procesdor;
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

	public boolean isNfc() {
		return nfc;
	}

	public void setNfc(boolean nfc) {
		this.nfc = nfc;
	}
	

	@Override
	public String toString() {
		return "Celular [procesdor=" + procesdor + ", oS=" + oS + ", memoriaRamGb=" + memoriaRamGb + ", nfc=" + nfc
				+ "]";
	}
	@Override
	public String getNombreProducto() {
		// TODO Auto-generated method stub
		return super.getNombreProducto();
	}
	
	
	
	

}
