package co.edu.unbosque.view;

// The package declaration indicates that this class belongs to the package 'co.edu.unbosque.view'.
// It helps in organizing the classes into name spaces to avoid name conflicts.

public class ViewFacade {
    // The ViewFacade class acts as a facade, which simplifies the interaction with multiple classes (MainVentana, VentanaCelular, VentanaComputador, VentanaRouter).
    // It provides a unified interface to a set of interfaces in the subsystem, making the subsystem easier to use.

    private MainVentana mv;
    // mv is an instance of the MainVentana class, which likely represents the main window or user interface in the application.

    private VentanaCelular vc;
    // vc is an instance of the VentanaCelular class, likely representing a window or UI related to a mobile phone in the application.

    private VentanaComputador vco;
    // vco is an instance of the VentanaComputador class, likely representing a window or UI related to a computer in the application.

    private VentanaRouter vr;
    // vr is an instance of the VentanaRouter class, likely representing a window or UI related to a router in the application.

    public ViewFacade() {
        // The constructor of the ViewFacade class initializes the instances of MainVentana, VentanaCelular, VentanaComputador, and VentanaRouter.
        mv = new MainVentana();
        vc = new VentanaCelular();
        vco = new VentanaComputador();
        vr = new VentanaRouter();
    }

    public MainVentana getMv() {
        // Getter method for the MainVentana instance.
        // It returns the mv object, allowing other classes to access the MainVentana instance.
        return mv;
    }

    public void setMv(MainVentana mv) {
        // Setter method for the MainVentana instance.
        // It allows other classes to set or update the mv object.
        this.mv = mv;
    }

    public VentanaCelular getVc() {
        // Getter method for the VentanaCelular instance.
        // It returns the vc object, allowing other classes to access the VentanaCelular instance.
        return vc;
    }

    public void setVc(VentanaCelular vc) {
        // Setter method for the VentanaCelular instance.
        // It allows other classes to set or update the vc object.
        this.vc = vc;
    }

    public VentanaComputador getVco() {
        // Getter method for the VentanaComputador instance.
        // It returns the vco object, allowing other classes to access the VentanaComputador instance.
        return vco;
    }

    public void setVco(VentanaComputador vco) {
        // Setter method for the VentanaComputador instance.
        // It allows other classes to set or update the vco object.
        this.vco = vco;
    }

    public VentanaRouter getVr() {
        // Getter method for the VentanaRouter instance.
        // It returns the vr object, allowing other classes to access the VentanaRouter instance.
        return vr;
    }

    public void setVr(VentanaRouter vr) {
        // Setter method for the VentanaRouter instance.
        // It allows other classes to set or update the vr object.
        this.vr = vr;
    }
}
