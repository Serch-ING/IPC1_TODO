package interfaz_admin;


import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class ventana extends JFrame{

	public ventana() {
		
		this.setSize(530,520);
		this.setLayout(null);
		
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				
				
				this.add(new Panel("Posicion " +i +","+j, 100*j, 100*i));
				
				
			}
		}
		
	
		
	}
	
}
