// Package declaration indicates that this class is part of the 'co.edu.unbosque.model' package.
package co.edu.unbosque.model;

/**
 * The Celular class represents a mobile phone, which is a specific type of Producto.
 * It extends the Producto class, inheriting its properties and behaviors, and adds additional
 * attributes specific to a mobile phone such as the processor, operating system, RAM, and NFC capability.
 */
public class Celular extends Producto {

    // Fields specific to the Celular class
    private String procesdor;  // The processor of the mobile phone
    private String oS;         // The operating system of the mobile phone
    private double memoriaRamGb; // The amount of RAM in GB
    private boolean nfc;       // Indicates whether the mobile phone supports NFC

    /**
     * Full constructor for the Celular class.
     * 
     * @param numeroSerial The serial number of the mobile phone.
     * @param nombreProducto The name of the mobile phone.
     * @param marcaProducto The brand of the mobile phone.
     * @param paisDeOrigen The country of origin of the mobile phone.
     * @param procesdor The processor of the mobile phone.
     * @param oS The operating system of the mobile phone.
     * @param memoriaRamGb The amount of RAM in GB.
     * @param nfc Indicates whether the mobile phone supports NFC.
     */
    public Celular(int numeroSerial, String nombreProducto, String marcaProducto, String paisDeOrigen, String procesdor,
            String oS, double memoriaRamGb, boolean nfc) {
        super(numeroSerial, nombreProducto, marcaProducto, paisDeOrigen); // Call to the superclass constructor
        this.procesdor = procesdor;
        this.oS = oS;
        this.memoriaRamGb = memoriaRamGb;
        this.nfc = nfc;
    }

    /**
     * Partial constructor for the Celular class without specific mobile phone attributes.
     * 
     * @param numeroSerial The serial number of the mobile phone.
     * @param nombreProducto The name of the mobile phone.
     * @param marcaProducto The brand of the mobile phone.
     * @param paisDeOrigen The country of origin of the mobile phone.
     */
    public Celular(int numeroSerial, String nombreProducto, String marcaProducto, String paisDeOrigen) {
        super(numeroSerial, nombreProducto, marcaProducto, paisDeOrigen); // Call to the superclass constructor
    }

    /**
     * Default constructor for the Celular class.
     * Initializes a Celular object with default values.
     */
    public Celular() {
        // Empty constructor
    }

    // Getter and Setter methods for the Celular-specific fields

    /**
     * Gets the processor of the mobile phone.
     * 
     * @return The processor of the mobile phone.
     */
    public String getProcesdor() {
        return procesdor;
    }

    /**
     * Sets the processor of the mobile phone.
     * 
     * @param procesdor The processor of the mobile phone.
     */
    public void setProcesdor(String procesdor) {
        this.procesdor = procesdor;
    }

    /**
     * Gets the operating system of the mobile phone.
     * 
     * @return The operating system of the mobile phone.
     */
    public String getoS() {
        return oS;
    }

    /**
     * Sets the operating system of the mobile phone.
     * 
     * @param oS The operating system of the mobile phone.
     */
    public void setoS(String oS) {
        this.oS = oS;
    }

    /**
     * Gets the amount of RAM in GB.
     * 
     * @return The amount of RAM in GB.
     */
    public double getMemoriaRamGb() {
        return memoriaRamGb;
    }

    /**
     * Sets the amount of RAM in GB.
     * 
     * @param memoriaRamGb The amount of RAM in GB.
     */
    public void setMemoriaRamGb(double memoriaRamGb) {
        this.memoriaRamGb = memoriaRamGb;
    }

    /**
     * Checks if the mobile phone supports NFC.
     * 
     * @return true if the mobile phone supports NFC, false otherwise.
     */
    public boolean isNfc() {
        return nfc;
    }

    /**
     * Sets the NFC capability of the mobile phone.
     * 
     * @param nfc true if the mobile phone supports NFC, false otherwise.
     */
    public void setNfc(boolean nfc) {
        this.nfc = nfc;
    }

    /**
     * Overrides the toString() method to provide a string representation of the Celular object.
     * 
     * @return A string representation of the Celular object, including its processor, operating system, RAM, and NFC capability.
     */
    @Override
    public String toString() {
        return "Celular [procesdor=" + procesdor + ", oS=" + oS + ", memoriaRamGb=" + memoriaRamGb + ", nfc=" + nfc + "]";
    }

    /**
     * Overrides the getNombreProducto() method from the Producto class.
     * 
     * @return The name of the mobile phone (inherited from the Producto class).
     */
    @Override
    public String getNombreProducto() {
        // Call to the superclass method to get the product name
        return super.getNombreProducto();
    }
}
