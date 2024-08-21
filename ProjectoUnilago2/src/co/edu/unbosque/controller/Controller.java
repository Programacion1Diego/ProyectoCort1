package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.Frame;
import co.edu.unbosque.view.MainVentana;
import co.edu.unbosque.view.VentanaCelular;
import co.edu.unbosque.view.VentanaComputador;
import co.edu.unbosque.view.VentanaRouter;

public class Controller implements ActionListener {
	Frame fame;
	MainVentana ventana1;
	VentanaCelular ventana2;
	VentanaComputador ventana3 ;
	VentanaRouter ventana4;
	public Controller() {
		ventana1 = new MainVentana();
		ventana2 = new VentanaCelular();
		ventana3 = new VentanaComputador();
		ventana4 = new VentanaRouter();
		addLectures1();
	}

	public void run() {

		fame = new Frame();
		fame.add(ventana1);
		
		// ventana1 = new MainVentana();

	}

	public void addLectures1() {

		ventana1.getUpMain().getButton().addActionListener(this);
		ventana1.getUpMain().getButton().setActionCommand("screen");

		ventana1.getPanelSide().setVisible(false);
		
		ventana1.getPanelSide().getCel().addActionListener(this);
		ventana1.getPanelSide().getCel().setActionCommand("cel");
		
		ventana1.getPanelSide().getComp().addActionListener(this);
		ventana1.getPanelSide().getComp().setActionCommand("comp");
		
		ventana1.getPanelSide().getRou().addActionListener(this);
		ventana1.getPanelSide().getRou().setActionCommand("rou");
		
		
		/*----------------------------------------------------------*/
		
		
		ventana2.getUpIndex().getButton().addActionListener(this);
		ventana2.getUpIndex().getButton().setActionCommand("screen");
		
		ventana2.getSideP().getComp().addActionListener(this);
		ventana2.getSideP().getComp().setActionCommand("comp");
		
		ventana2.getSideP().getCel().addActionListener(this);
		ventana2.getSideP().getCel().setActionCommand("cel");
		
		ventana2.getSideP().getRou().addActionListener(this);
		ventana2.getSideP().getRou().setActionCommand("rou");
		
		/*--------------------------------------------------------*/
		
		ventana3.getUpMain().getButton().addActionListener(this);
		ventana3.getUpMain().getButton().setActionCommand("screen");

		ventana3.getPanelSide().setVisible(false);
		
		ventana3.getPanelSide().getCel().addActionListener(this);
		ventana3.getPanelSide().getCel().setActionCommand("cel");
		
		ventana3.getPanelSide().getComp().addActionListener(this);
		ventana3.getPanelSide().getComp().setActionCommand("comp");
		
		ventana3.getPanelSide().getRou().addActionListener(this);
		ventana3.getPanelSide().getRou().setActionCommand("rou");
		
		/*-----------------------------------------------------*/
		
		ventana4.getUpMain().getButton().addActionListener(this);
		ventana4.getUpMain().getButton().setActionCommand("screen");

		ventana4.getPanelSide().setVisible(false);
		
		ventana4.getPanelSide().getCel().addActionListener(this);
		ventana4.getPanelSide().getCel().setActionCommand("cel");
		
		ventana4.getPanelSide().getComp().addActionListener(this);
		ventana4.getPanelSide().getComp().setActionCommand("comp");
		
		ventana4.getPanelSide().getRou().addActionListener(this);
		ventana4.getPanelSide().getRou().setActionCommand("rou");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "screen": {
			if (ventana1.getUpMain().getButton().isState()) {
				ventana1.getPanelSide().setVisible(false);
				ventana1.getUpMain().getButton().setState(false);
				
				ventana2.getSideP().setVisible(false);
				ventana2.getUpIndex().getButton().setState(false);
				
				ventana3.getPanelSide().setVisible(false);
				ventana3.getUpMain().getButton().setState(false);
				
				ventana4.getPanelSide().setVisible(false);
				ventana4.getUpMain().getButton().setState(false);
				
				
			}else {
				ventana1.getPanelSide().setVisible(true);
				ventana1.getUpMain().getButton().setState(true);
				
				ventana2.getSideP().setVisible(true);
				ventana2.getUpIndex().getButton().setState(true);
				
				ventana3.getPanelSide().setVisible(true);
				ventana3.getUpMain().getButton().setState(true);
				
				ventana4.getPanelSide().setVisible(true);
				ventana4.getUpMain().getButton().setState(true);
			}
			break;
		}
		case "rou":{
			ventana1.setVisible(false);
			ventana2.setVisible(false);
			ventana3.setVisible(false);
			if(!(ventana4.isThisInMemory())) {
				fame.add(ventana4);
				ventana4.setVisible(true);
				ventana4.getPanelSide().setVisible(false);
				ventana4.getUpMain().getButton().setState(false);
				ventana4.setThisInMemory(true);
			}else {
				ventana4.setVisible(true);
				ventana4.getPanelSide().setVisible(false);
				ventana4.getUpMain().getButton().setState(false);
			}
			break;
		}
		case "cel":{
			ventana1.setVisible(false);
			ventana3.setVisible(false);
			ventana4.setVisible(false);
			if(!(ventana2.isThisInMemory())) {
				fame.add(ventana2);
				ventana2.setVisible(true);
				ventana2.getSideP().setVisible(false);
				ventana2.getUpIndex().getButton().setState(false);
				ventana2.setThisInMemory(true);
			}else {
				ventana2.setVisible(true);
				ventana2.getSideP().setVisible(false);
				ventana2.getUpIndex().getButton().setState(false);
			}
			break;
			
		}
		case "comp":{
			ventana1.setVisible(false);
			ventana2.setVisible(false);
			ventana4.setVisible(false);
			if(!(ventana3.isThisInMemory())) {
				fame.add(ventana3);
				ventana3.setVisible(true);
				ventana3.getPanelSide().setVisible(false);
				ventana3.getUpMain().getButton().setState(false);
				ventana3.setThisInMemory(true);
			}else {
				ventana3.setVisible(true);
				ventana3.getPanelSide().setVisible(false);
				ventana3.getUpMain().getButton().setState(false);
			}
			break;
		}

		}
	}
}
