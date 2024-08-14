package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SidePanel extends JPanel{
	CelButton cel = new CelButton();
	ComputerButton  comp= new ComputerButton();
	RouterButton rou = new RouterButton();
	public SidePanel() {
		this.setBorder(new EmptyBorder(10, 5, 10, 10));
		this.setLayout(new GridLayout(3,1));
		this.setBackground(Color.PINK);
		this.setVisible(true);
		this.add(cel);
		this.add(comp);
		this.add(rou);
		
	}
	public CelButton getCel() {
		return cel;
	}
	public void setCel(CelButton cel) {
		this.cel = cel;
	}
	public ComputerButton getComp() {
		return comp;
	}
	public void setComp(ComputerButton comp) {
		this.comp = comp;
	}
	public RouterButton getRou() {
		return rou;
	}
	public void setRou(RouterButton rou) {
		this.rou = rou;
	}

}
