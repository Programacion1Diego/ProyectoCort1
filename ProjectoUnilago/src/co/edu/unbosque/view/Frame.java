package co.edu.unbosque.view;

import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame  extends JFrame{
	MainVentana ventana1;

	public Frame() throws HeadlessException {
		ventana1 = new MainVentana();
		ImageIcon icon = new ImageIcon();
		this.setSize(680,680);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Unilago");
		
		//this.setIconImage(icono);
		this.setResizable(false);
		addVent1();
		
	}
	
	public MainVentana getVentana1() {
		return ventana1;
	}

	public void setVentana1(MainVentana ventana1) {
		this.ventana1 = ventana1;
	}

	public void addVent1() {
		this.add(ventana1);
		
	}
	
	

}
