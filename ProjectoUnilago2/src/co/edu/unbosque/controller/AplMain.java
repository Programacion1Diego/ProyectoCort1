// Package declaration. This code belongs to the 'co.edu.unbosque.controller' package.
package co.edu.unbosque.controller;

/**
 * The AplMain class contains the main method, which is the entry point of the application.
 * This class is responsible for initiating the execution of the program.
 */
public class AplMain {

    /**
     * The main method is the entry point of the Java application.
     * It is responsible for creating an instance of the Controller class and invoking its run method.
     *
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        // Create an instance of the Controller class.
        Controller cn = new Controller();
        
        // Call the run method on the Controller instance to start the application.
        cn.run();
    }
}

