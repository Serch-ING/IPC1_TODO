package interfaz_admin;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel{

	public Panel(String nombre,int x,int y) {
		
		
		this.setBounds(x,y,100,100);
		JLabel label = new JLabel(nombre);
		this.add(label);
		this.setBorder(BorderFactory.createLineBorder(Color.black));
		
	}
	
}
