package huesos;

import herencia.Vertebrados;
import intefaces.Actividades;
import intefaces.Otras;

public class Mamifero extends Vertebrados implements Actividades, Otras{

	
	 public  String Desplazamiento;
	 public  String Sangre;
	 
	 
	 public Mamifero(String nombre,String nombre_cientigfico, String Reino, String huesos,int hueso,String Desplazamiento, String Sangre ) {
		 
		super(nombre,nombre_cientigfico,Reino,huesos,hueso);
		
	
		 this.Desplazamiento = Desplazamiento;
		 this.Sangre = Sangre;
		 
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
