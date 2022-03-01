package outhuesos;

import herencia.Invertebrados;
import intefaces.Actividades;

public class Moluscos extends Invertebrados implements Actividades {

	
	public String Respiracion;
	public String Concha;
	
	public Moluscos(String nombre,String nombre_cientigfico, String Reino , String Carece, String ExoEsqueleto,
		 String  Respiracion, String Concha) {
		
		 super(nombre,nombre_cientigfico,Reino,Carece,ExoEsqueleto);
		
		this.Respiracion = Respiracion;
		this.Concha = Concha;

	}
	
	
	public void Comida(String comida) {
		
		
		System.out.println("Comen: " + comida);
		
	}
	
public void Domestico(String Domestico) {
		
		
		System.out.println("Domestico: " + Domestico);
		
	}

public void Ambiente(String Ambiente) {
	
	
	System.out.println("Ambiente: " + Ambiente);
	
}


public void Movimiento(String Movimiento) {
	
	
	System.out.println("Se mueven: " + Movimiento);
	
}

public void Duermen(String Duermen) {
	
	
	System.out.println("Se Duermen: " + Duermen);
	
}


public void Cazan(String Cazan) {
	
	
	System.out.println("Se cazan: " + Cazan);
	
}




	
	
	
}
