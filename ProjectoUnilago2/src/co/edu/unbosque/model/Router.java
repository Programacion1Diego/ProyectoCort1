// Package declaration. This code belongs to the 'co.edu.unbosque.model' package.
package co.edu.unbosque.model;

// The Router class is a subclass of Producto and represents a network router with additional attributes.
public class Router extends Producto {
    // Attributes specific to the Router class
    int numeroPuertos; // Number of ports the router has
    double velocidadMaximaMb; // Maximum speed of the router in Megabits per second (Mb)

    /**
     * Constructor with parameters to initialize a Router object with all attributes.
     * @param numeroSerial The serial number of the product (inherited from Producto).
     * @param nombreProducto The name of the product (inherited from Producto).
     * @param marcaProducto The brand of the product (inherited from Producto).
     * @param paisDeOrigen The country of origin of the product (inherited from Producto).
     * @param numeroPuertos The number of ports on the router.
     * @param velocidadMaximaMb The maximum speed of the router in Megabits per second.
     */
    public Router(int numeroSerial, String nombreProducto, String marcaProducto, String paisDeOrigen, int numeroPuertos,
                  double velocidadMaximaMb) {
        // Call to the parent class (Producto) constructor to initialize inherited attributes.
        super(numeroSerial, nombreProducto, marcaProducto, paisDeOrigen);
        // Initialize the specific attributes of the Router class.
        this.numeroPuertos = numeroPuertos;
        this.velocidadMaximaMb = velocidadMaximaMb;
    }

    /**
     * Constructor with parameters to initialize a Router object with inherited attributes only.
     * This constructor does not initialize the Router-specific attributes.
     * @param numeroSerial The serial number of the product (inherited from Producto).
     * @param nombreProducto The name of the product (inherited from Producto).
     * @param marcaProducto The brand of the product (inherited from Producto).
     * @param paisDeOrigen The country of origin of the product (inherited from Producto).
     */
    public Router(int numeroSerial, String nombreProducto, String marcaProducto, String paisDeOrigen) {
        // Call to the parent class (Producto) constructor to initialize inherited attributes.
        super(numeroSerial, nombreProducto, marcaProducto, paisDeOrigen);
    }

    /**
     * Default constructor to create an empty Router object.
     * Calls the default constructor of the parent class Producto.
     */
    public Router() {
        super();
    }

    // Getter method for the numeroPuertos attribute.
    public int getNumeroPuertos() {
        return numeroPuertos;
    }

    // Setter method for the numeroPuertos attribute.
    public void setNumeroPuertos(int numeroPuertos) {
        this.numeroPuertos = numeroPuertos;
    }

    // Getter method for the velocidadMaximaMb attribute.
    public double getVelocidadMaximaMb() {
        return velocidadMaximaMb;
    }

    // Setter method for the velocidadMaximaMb attribute.
    public void setVelocidadMaximaMb(double velocidadMaximaMb) {
        this.velocidadMaximaMb = velocidadMaximaMb;
    }

    /**
     * Overridden toString method to provide a string representation of the Router object.
     * @return A string that includes the number of ports and the maximum speed of the router.
     */
    @Override
    public String toString() {
        return "Router [numeroPuertos=" + numeroPuertos + ", velocidadMaximaMb=" + velocidadMaximaMb + "]";
    }
}

