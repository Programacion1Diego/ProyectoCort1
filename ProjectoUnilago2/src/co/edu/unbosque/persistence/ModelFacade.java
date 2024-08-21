// Package declaration for the persistence layer of the project.
// It organizes the code into a namespace and indicates that this class is part of the `co.edu.unbosque.persistence` package.
package co.edu.unbosque.persistence;

/**
 * The ModelFacade class serves as a facade for managing different Data Access Objects (DAOs) within the persistence layer.
 * It provides a simple interface to access and modify different types of products, including Celular (mobile phones), 
 * Computadora (computers), and Router.
 */
public class ModelFacade {
    
    // Private member variables to hold instances of different DAOs.
    private ProductoDAO pDAO;      // Data Access Object for Producto (product) entities.
    private CelularDAO cDAO;       // Data Access Object for Celular (mobile phone) entities.
    private ComputadoraDAO coDAO;  // Data Access Object for Computadora (computer) entities.
    private RouterDAO rDAO;        // Data Access Object for Router entities.
    
    /**
     * Constructor for the ModelFacade class.
     * Initializes instances of the DAOs that are responsible for handling the data operations of different product types.
     */
    public ModelFacade() {
        // Instantiating DAOs for each type of product.
        pDAO = new ProductoDAO();
        coDAO = new ComputadoraDAO();
        cDAO = new CelularDAO();
        rDAO = new RouterDAO();
    }

    /**
     * Getter method for the ProductoDAO instance.
     * @return the instance of ProductoDAO.
     */
    public ProductoDAO getpDAO() {
        return pDAO;
    }

    /**
     * Setter method for the ProductoDAO instance.
     * Allows the injection or replacement of a ProductoDAO instance.
     * @param pDAO the ProductoDAO instance to set.
     */
    public void setpDAO(ProductoDAO pDAO) {
        this.pDAO = pDAO;
    }

    /**
     * Getter method for the CelularDAO instance.
     * @return the instance of CelularDAO.
     */
    public CelularDAO getcDAO() {
        return cDAO;
    }

    /**
     * Setter method for the CelularDAO instance.
     * Allows the injection or replacement of a CelularDAO instance.
     * @param cDAO the CelularDAO instance to set.
     */
    public void setcDAO(CelularDAO cDAO) {
        this.cDAO = cDAO;
    }

    /**
     * Getter method for the ComputadoraDAO instance.
     * @return the instance of ComputadoraDAO.
     */
    public ComputadoraDAO getCoDAO() {
        return coDAO;
    }

    /**
     * Setter method for the ComputadoraDAO instance.
     * Allows the injection or replacement of a ComputadoraDAO instance.
     * @param coDAO the ComputadoraDAO instance to set.
     */
    public void setCoDAO(ComputadoraDAO coDAO) {
        this.coDAO = coDAO;
    }

    /**
     * Getter method for the RouterDAO instance.
     * @return the instance of RouterDAO.
     */
    public RouterDAO getrDAO() {
        return rDAO;
    }

    /**
     * Setter method for the RouterDAO instance.
     * Allows the injection or replacement of a RouterDAO instance.
     * @param rDAO the RouterDAO instance to set.
     */
    public void setrDAO(RouterDAO rDAO) {
        this.rDAO = rDAO;
    }
}
