package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelUpMain extends JPanel {
	MoreButton button;

	public PanelUpMain() {
		JPanel panelUp = new JPanel();
		LabelStandar label = new LabelStandar();
		button = new MoreButton();
		this.setLayout(new BorderLayout());
		this.add(label, BorderLayout.CENTER);

		this.setBackground(Color.red);
		label.ponerTexto("hola");
		label.setTamano(50);
		this.add(button, BorderLayout.WEST);
	}

	public void esconderPanel() {
		this.setVisible(false);
	}

	public boolean isStateButton() {
		return button.isState();
	}

	public void setStateButton(boolean state) {
		button.setState(state);
	}

	public MoreButton getButton() {
		return button;
	}

	public void setButton(MoreButton button) {
		this.button = button;
	}

}
