package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaRouter extends JPanel{
	
	SidePanel panelSide = new SidePanel();
	PanelUpMain upMain = new PanelUpMain();
	boolean thisInMemory = false; 
	public boolean isThisInMemory() {
		return thisInMemory;
	}
	public void setThisInMemory(boolean thisInMemory) {
		this.thisInMemory = thisInMemory;
	}
	public VentanaRouter() {
		
		upMain.getLabel().ponerTexto("Pantalla de Manejo de Routers");
		
		upMain.getLabel().setTamano(20);
		
	
		this.setLayout(new BorderLayout());
		this.setBackground(Color.ORANGE);
		this.add(upMain,BorderLayout.NORTH);
		this.add(panelSide,BorderLayout.WEST);
		
		//sur	
		JPanel pBot = new JPanel(new GridBagLayout());
		pBot.setBorder(new EmptyBorder(0, 60, 0, 60));
		
		
		JButton bProcesar = new JButton("Procesar");
		pBot.add(bProcesar);
		
		JButton bSalir = new JButton("Salir");
		pBot.add(bSalir);
		
		this.add(pBot, BorderLayout.SOUTH);
		
		//Centro 
		JPanel pPanelForm = new JPanel(new GridLayout(7, 1,10,60));
		pPanelForm.setBorder(javax .swing.BorderFactory.createEmptyBorder());
		pPanelForm.setBounds(50, 25, 45, 15);
		
		GridBagConstraints reg = new GridBagConstraints();
		
		reg.gridx = 0;
		reg.gridy = 0;
		reg.gridwidth = 0;
		reg.gridheight= 0;
		JLabel lNom = new JLabel("Nombre: ");
		pPanelForm.add(lNom, reg);
		this.add(pPanelForm);
		
		reg.gridx = 1;
		reg.gridy = 2;
		reg.gridwidth = 2;
		reg.gridheight = 2;
		reg.weightx = 0.0;
		JTextField nom = new JTextField((10));
		nom.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pPanelForm.add(lNom);
		pPanelForm.add(nom);
		this.add(pPanelForm);
		
		reg.gridx = 0;
		reg.gridy = 3;
		reg.gridwidth = 2;
		reg.gridheight= 1;
		JLabel lMarca = new JLabel("Marca: ");
		pPanelForm.add(lMarca, reg);
		this.add(pPanelForm);
		
		reg.gridx = 1;
		reg.gridy = 3;
		reg.gridwidth = 2;
		reg.gridheight = 1;
		reg.weightx = 1.0;
		JTextField mar = new JTextField((10));
		mar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pPanelForm.add(lMarca);
		pPanelForm.add(mar);
		this.add(pPanelForm);
		
		reg.gridx = 0;
		reg.gridy = 2;
		reg.gridwidth = 1;
		reg.gridheight= 1;
		JLabel lPais = new JLabel("Pais de Origen: ");
		pPanelForm.add(lPais, reg);
		this.add(pPanelForm);
		
		reg.gridx = 0;
		reg.gridy = 2;
		reg.gridwidth = 1;
		reg.gridheight = 1;
		reg.weightx = 1.0;
		JTextField pais = new JTextField((10));
		pais.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pPanelForm.add(lPais);
		pPanelForm.add(pais);
		this.add(pPanelForm);
		
		reg.gridx = 0;
		reg.gridy = 3;
		reg.gridwidth = 2;
		reg.gridheight= 2;
		JLabel lnumS = new JLabel("Numero de Serie: ");
		pPanelForm.add(lnumS, reg);
		this.add(pPanelForm);
		
		reg.gridx = 0;
		reg.gridy = 3;
		reg.gridwidth = 2;
		reg.gridheight = 2;
		reg.weightx = 1.0;
		JTextField numS = new JTextField((10));
		numS.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pPanelForm.add(lnumS);
		pPanelForm.add(numS);
		this.add(pPanelForm);
		
		reg.gridx = 0;
		reg.gridy = 3;
		reg.gridwidth = 2;
		reg.gridheight= 2;
		JLabel lnumP = new JLabel("Numero de Puertos: ");
		pPanelForm.add(lnumP, reg);
		this.add(pPanelForm);
		
		reg.gridx = 0;
		reg.gridy = 3;
		reg.gridwidth = 2;
		reg.gridheight = 2;
		reg.weightx = 1.0;
		JTextField numP = new JTextField((10));
		numS.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pPanelForm.add(lnumP);
		pPanelForm.add(numP);
		this.add(pPanelForm);
		
		reg.gridx = 0;
		reg.gridy = 3;
		reg.gridwidth = 2;
		reg.gridheight= 2;
		JLabel lVelocidad = new JLabel("Velocidad de Transmicion: ");
		pPanelForm.add(lVelocidad, reg);
		this.add(pPanelForm);
		
		reg.gridx = 0;
		reg.gridy = 3;
		reg.gridwidth = 2;
		reg.gridheight = 2;
		reg.weightx = 1.0;
		JTextField velocidad = new JTextField((10));
		numS.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pPanelForm.add(lVelocidad);
		pPanelForm.add(velocidad);
		this.add(pPanelForm);
		
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

