package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.Frame;
import co.edu.unbosque.view.MainVentana;

public class Controller implements ActionListener {
	Frame fame;
	MainVentana ventana1;

	public Controller() {
		ventana1 = new MainVentana();
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
		ventana1.getPanelSide().getRou().setActionCommand("rou");;
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "screen": {
			if (ventana1.getUpMain().getButton().isState()) {
				ventana1.getPanelSide().setVisible(false);
				ventana1.getUpMain().getButton().setState(false);
			}else {
				ventana1.getPanelSide().setVisible(true);
				ventana1.getUpMain().getButton().setState(true);
			}
			break;
		}
		case "rou":{
			ventana1.setVisible(false);
			break;
		}
		case "cel":{
			ventana1.setVisible(false);
			break;
		}
		case "comp":{
			ventana1.setVisible(false);
			break;
		}

		}
	}
}
