package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class VentanaCelular extends JPanel{
	
	boolean thisInMemory = false;
	PanelUpMain upIndex = new PanelUpMain();
	SidePanel sideP = new SidePanel();
	public VentanaCelular() {
		this.setBackground(Color.blue);
		this.setLayout(new BorderLayout());
		this.add(sideP,BorderLayout.WEST);
		this.add(upIndex,BorderLayout.NORTH);
		upIndex.getLabel().ponerTexto("Pantalla de Manejo de Celulares");
		upIndex.getLabel().setTamano(20);
		
		
	}
	public boolean isThisInMemory() {
		return thisInMemory;
	}
	public void setThisInMemory(boolean thisInMemory) {
		this.thisInMemory = thisInMemory;
	}
	public PanelUpMain getUpIndex() {
		return upIndex;
	}
	public void setUpIndex(PanelUpMain upIndex) {
		this.upIndex = upIndex;
	}
	public SidePanel getSideP() {
		return sideP;
	}
	public void setSideP(SidePanel sideP) {
		this.sideP = sideP;
	}
	
	
	

}
