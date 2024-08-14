package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.Frame;
import co.edu.unbosque.view.MainVentana;

public class Controller implements ActionListener {
	Frame fame;
	MainVentana ventana1;
	public Controller() {
		addLectures1();
	}
	
	public void run() {
		addLectures1();
		fame = new Frame();
	}

	public void addLectures1() {

		fame.getVentana1().getUpMain().getButton().addActionListener(this);
		//fame.getVentana1().getUpMain().getButton().setActionCommand("screen");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "screen": {
			
			System.out.println("si");
			break;
		}
		case "si":{
			System.out.println("A");
		}
	
		}
	}
}
