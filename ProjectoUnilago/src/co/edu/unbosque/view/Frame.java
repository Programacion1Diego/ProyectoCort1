package co.edu.unbosque.view;

import java.awt.HeadlessException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame  extends JFrame{


	public Frame() throws HeadlessException {
		ImageIcon icon = new ImageIcon();
		this.setSize(680,680);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Unilago");
		
		//this.setIconImage(icono);
		this.setResizable(false);
		
		
	}
	
	

	
	

}
