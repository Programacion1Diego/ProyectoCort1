package co.edu.unbosque.view;

import java.awt.Font;

import javax.swing.JLabel;

public class LabelStandar extends JLabel{

	public LabelStandar() {
		this.setFont(new Font("impact",Font.PLAIN,20));
		this.setHorizontalAlignment(CENTER);
		
	}
	
	public void ponerTexto(String text) {
		this.setText(text);
	}
	
	public void setTamano(int tamano) {
		this.setFont(new Font("impact",Font.PLAIN,tamano));
	}
	
	
	

}
