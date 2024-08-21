package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainVentana extends JPanel {
	PanelUpMain upMain;
	SidePanel panelSide;

	public MainVentana() {
		
		panelSide = new SidePanel();
		upMain = new PanelUpMain();
		this.setBackground(Color.green);
		this.setLayout(new BorderLayout());
		this.add(upMain, BorderLayout.NORTH);
		this.add(panelSide,BorderLayout.WEST);
		upMain.getLabel().setText("Base de Datos Unilago");
		
		}


	public SidePanel getPanelSide() {
		return panelSide;
	}

	public void setPanelSide(SidePanel panelSide) {
		this.panelSide = panelSide;
	}

	public boolean isButtonStateUpMain() {
		return upMain.isStateButton();
	}

	public void setButtonStateUpMain(boolean state) {
		upMain.setStateButton(state);
	}

	public PanelUpMain getUpMain() {
		return upMain;
	}

	public void setUpMain(PanelUpMain upMain) {
		this.upMain = upMain;
	}

}
