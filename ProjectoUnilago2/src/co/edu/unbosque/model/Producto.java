// Package declaration: Specifies that this class belongs to the 'co.edu.unbosque.model' package.
package co.edu.unbosque.model;

// Public class 'Producto' represents a product with a serial number, name, brand, and country of origin.
public class Producto {

    // Instance variables to store product details.
    int numeroSerial;            // Serial number of the product.
    String nombreProducto;      // Name of the product.
    String marcaProducto;      // Brand of the product.
    String paisDeOrigen;       // Country of origin of the product.

    /**
     * Parameterized constructor that initializes a new 'Producto' object with the given details.
     * 
     * @param numeroSerial The serial number of the product.
     * @param nombreProducto The name of the product.
     * @param marcaProducto The brand of the product.
     * @param paisDeOrigen The country of origin of the product.
     */
    public Producto(int numeroSerial, String nombreProducto, String marcaProducto, String paisDeOrigen) {
        super(); // Calls the superclass constructor (Object class, in this case).
        this.numeroSerial = numeroSerial;
        this.nombreProducto = nombreProducto;
        this.marcaProducto = marcaProducto;
        this.paisDeOrigen = paisDeOrigen;
    }

    /**
     * Default constructor that creates an empty 'Producto' object.
     */
    public Producto() {
        super(); // Calls the superclass constructor (Object class, in this case).
    }

    /**
     * Getter method for 'numeroSerial'.
     * 
     * @return The serial number of the product.
     */
    public int getNumeroSerial() {
        return numeroSerial;
    }

    /**
     * Setter method for 'numeroSerial'.
     * 
     * @param numeroSerial The serial number to set.
     */
    public void setNumeroSerial(int numeroSerial) {
        this.numeroSerial = numeroSerial;
    }

    /**
     * Getter method for 'nombreProducto'.
     * 
     * @return The name of the product.
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * Setter method for 'nombreProducto'.
     * 
     * @param nombreProducto The name to set.
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * Getter method for 'marcaProducto'.
     * 
     * @return The brand of the product.
     */
    public String getMarcaProducto() {
        return marcaProducto;
    }

    /**
     * Setter method for 'marcaProducto'.
     * 
     * @param marcaProducto The brand to set.
     */
    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    /**
     * Getter method for 'paisDeOrigen'.
     * 
     * @return The country of origin of the product.
     */
    public String getPaisDeOrigen() {
        return paisDeOrigen;
    }

    /**
     * Setter method for 'paisDeOrigen'.
     * 
     * @param paisDeOrigen The country of origin to set.
     */
    public void setPaisDeOrigen(String paisDeOrigen) {
        this.paisDeOrigen = paisDeOrigen;
    }

    /**
     * Overridden 'toString' method that returns a string representation of the 'Producto' object.
     * 
     * @return A string containing the product's serial number, name, brand, and country of origin.
     */
    @Override
    public String toString() {
        return "Producto [numeroSerial=" + numeroSerial + ", nombreProducto=" + nombreProducto 
               + ", marcaProducto=" + marcaProducto + ", paisDeOrigen=" + paisDeOrigen + "]";
    }

}
