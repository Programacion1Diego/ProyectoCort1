// Package declaration: This line specifies the package to which this class belongs.
// It helps organize your classes into namespaces, avoiding naming conflicts.
package co.edu.unbosque.view;

// Import statements: These lines import necessary classes from Java's standard library.

// Importing the Color class from the java.awt package.
// The Color class is used to encapsulate colors in the default sRGB color space or arbitrary linear RGB color space.
import java.awt.Color;

// Importing the JButton class from the javax.swing package.
// The JButton class is a component that can trigger an action when the user clicks it.
import javax.swing.JButton;

// Class declaration: The CelButton class is a subclass of JButton.
// This means CelButton inherits all the properties and behaviors of a JButton, and can also have additional features.
public class CelButton extends JButton {
    
    // Constructor: This is a special method called when an instance of the CelButton class is created.
    // The constructor is used to initialize the object.
    public CelButton() {
        // Setting the text of the button to "Celular".
        this.setText("Celular");
        
        // Setting the background color of the button to yellow.
        this.setBackground(Color.yellow);
    }
}
