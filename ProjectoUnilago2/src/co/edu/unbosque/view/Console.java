// Package declaration: This declares that the class belongs to the package `co.edu.unbosque.view`.
// Packages in Java are used to group related classes and organize the project structure.
package co.edu.unbosque.view;

import java.util.Scanner;

// Public class `Console`: This class provides a simple console-based interface for reading various types of input
// from the user using the `Scanner` class.
public class Console {
    
    // Private field `sc`: This field is a `Scanner` object that is used to read input from the console.
    private Scanner sc;

    // Constructor `Console`: Initializes the `sc` field by creating a new `Scanner` object that reads input from `System.in`.
    // `System.in` refers to the standard input stream, typically the keyboard.
    public Console() {
        sc = new Scanner(System.in);
    }
    
    // Method `leerEntero`: Reads and returns an integer value from the console.
    public int leerEntero() {
        return sc.nextInt();
    }
    
    // Method `leerlargo`: Reads and returns a long value from the console.
    public long leerlargo() {
        return sc.nextLong();
    }
    
    // Method `leerflotante`: Reads and returns a float value from the console.
    public float leerflotante() {
        return sc.nextFloat();
    }
    
    // Method `leerDoble`: Reads and returns a double value from the console.
    public double leerDoble() {
        return sc.nextDouble();
    }
    
    // Method `leerLinea`: Reads and returns a line of text from the console.
    // This method reads input until the end of the line is reached.
    public String leerLinea() {
        return sc.nextLine();
    }
    
    // Method `leerPalabra`: Reads and returns a single word from the console.
    // A word is typically defined as a sequence of characters separated by whitespace.
    public String leerPalabra() {
        return sc.next();
    }
    
    // Method `leerboolean`: Reads a word from the console and returns a boolean value.
    // If the word is "SI" (case insensitive), it returns `true`.
    // If the word is "NO" (case insensitive), it returns `false`.
    // For any other input, it returns `false` by default.
    public boolean leerboolean() {
        String entrada = leerPalabra();
        if (entrada.toUpperCase().equals("SI")) {
            return true;
        } else if (entrada.toUpperCase().equals("NO")) {
            return false;
        }
        return false;
    }
    
    // Method `leerCaracter`: Reads and returns the first character of a word from the console.
    public char leerCaracter() {
        return sc.next().charAt(0);
    }
    
    // Method `quemarLinea`: Consumes the remainder of the current line.
    // This method is useful to clear the input buffer, especially after reading numeric inputs.
    public void quemarLinea() {
        sc.nextLine();
    }
    
    // Method `imprimirConSalto`: Prints the given text to the console without moving to the next line.
    public void imprimirConSalto(String texto) {
        System.out.print(texto);
    }
    
    // Method `imprimirSinSalto`: Prints the given text to the console and moves to the next line.
    public void imprimirSinSalto(String texto) {
        System.out.println(texto);
    }
}
