package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class VentanaComp extends JPanel{
	SidePanel panelSide = new SidePanel();
	PanelUpMain upMain = new PanelUpMain();
	boolean thisInMemory = false; 
	public boolean isThisInMemory() {
		return thisInMemory;
	}
	public void setThisInMemory(boolean thisInMemory) {
		this.thisInMemory = thisInMemory;
	}
	public VentanaComp() {
		
		upMain.getLabel().ponerTexto("Pantalla de Manejo de Computadores");
		
		upMain.getLabel().setTamano(20);
		
	
		this.setLayout(new BorderLayout());
		this.setBackground(Color.MAGENTA);
		this.add(upMain,BorderLayout.NORTH);
		this.add(panelSide,BorderLayout.WEST);
	}
	public PanelUpMain getUpMain() {
		return upMain;
	}
	public void setUpMain(PanelUpMain upMain) {
		this.upMain = upMain;
	}
	public SidePanel getPanelSide() {
		return panelSide;
	}
	public void setPanelSide(SidePanel panelSide) {
		this.panelSide = panelSide;
	}

}
