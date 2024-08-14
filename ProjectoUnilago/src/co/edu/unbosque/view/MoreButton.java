package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class MoreButton extends JButton {
	private boolean state = false;

	public MoreButton() {

		ImageIcon iconoBoton = new ImageIcon("61140.png");
		this.setIcon(iconoBoton);
		this.setContentAreaFilled(false);
		this.setBorderPainted(false);

	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

}
