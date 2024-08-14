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
		
		//ventana1 = new MainVentana();
		
	}

	public void addLectures1() {

		ventana1.getUpMain().getButton().addActionListener(this);
		ventana1.getUpMain().getButton().setActionCommand("screen");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "screen": {
			
			System.out.println("si");
			break;
		}
		
	
		}
	}
}
