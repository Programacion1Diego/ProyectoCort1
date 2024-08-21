// Package declaration: This specifies the package name where this class resides.
// It helps in organizing classes into namespaces, avoiding name conflicts.
package co.edu.unbosque.view;

// Importing the Color class from the java.awt package.
// Color class provides predefined colors and methods to create custom colors.
import java.awt.Color;

// Importing the JButton class from the javax.swing package.
// JButton is a Swing component that represents a button in a GUI.
import javax.swing.JButton;

// Importing the EmptyBorder class from the javax.swing.border package.
// EmptyBorder is used to create an empty (invisible) border around a component.
import javax.swing.border.EmptyBorder;

// Class declaration: ComputerButton is a subclass of JButton.
// This class customizes a JButton to create a specific type of button labeled "Comp".
public class ComputerButton extends JButton {
    
    // Constructor: This is the default constructor for the ComputerButton class.
    // It initializes the button with specific properties.
    public ComputerButton() {
        
        // Setting the text of the button to "Comp".
        this.setText("Comp");
        
        // Setting the background color of the button to light gray.
        // The Color.LIGHT_GRAY is a predefined constant in the Color class.
        this.setBackground(Color.LIGHT_GRAY);
    }
}
