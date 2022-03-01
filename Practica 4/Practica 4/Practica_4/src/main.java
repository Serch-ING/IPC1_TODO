import Reporte.Reporte;
import huesos.Mamifero;
import outhuesos.Moluscos;

public class main {

	public static void main(String[] args) {
	
		
	
	Reporte.Starrt();
	generar();
	
	}

	
	public static void generar() {
		
		Mamifero m[] = new Mamifero[7];
		
		
		
		
		
		
	   m[0] = new Mamifero("Caballo", "Equus caballus", "Animalia", "con husos", 205 , "Terrestre", "Caliente");
	   m[1] = new Mamifero("Obeja", "Ovis aries", "Animalia", "con husos", 205 , "Terrestre", "Caliente");
	   m[2] = new Mamifero("Caballo", "Equus caballus", "Animalia", "con husos", 205 , "Terrestre", "Caliente");
	   m[3] = new Mamifero("Caballo", "Equus caballus", "Animalia", "con husos", 205 , "Terrestre", "Caliente");
	   m[4] = new Mamifero("Caballo", "Equus caballus", "Animalia", "con husos", 205 , "Terrestre", "Caliente");
	   m[5] = new Mamifero("Caballo", "Equus caballus", "Animalia", "con husos", 205 , "Terrestre", "Caliente");
	   m[6] = new Mamifero("Caballo", "Equus caballus", "Animalia", "con husos", 205 , "Terrestre", "Caliente");

	
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		System.out.println(  m[0].nombre  + " " +   m[0].nombre_cientigfico + " " +   m[0].Reino + " " +   m[0].huesos + " " +   m[0].hueso + " " +   m[0].Desplazamiento + " " +   m[0].Sangre);
	
		
		
		
		
		
		Moluscos molu = new Moluscos("cangrejo ermitaño" , "Paguroidea", "Animalia", "sin huesos", " ExoEsqueleto" ,  " branquial", "Concha ");
		System.out.println(molu.nombre + " " +  molu.nombre_cientigfico + " " +  molu.Reino + " " +  molu.Carece + " " +  molu.ExoEsqueleto + " " + molu.Respiracion+ " " +  molu.Concha);
		
		
		
		
		
		
		
		
		
		
		
		
		
	Reporte.Mami(m[0].nombre, m[0].nombre_cientigfico,m[0].Reino,m[0].huesos,m[0].hueso, m[0].Desplazamiento,m[0].Sangre );
	

		Reporte.molu(molu.nombre, molu.nombre_cientigfico,molu.Reino,molu.Carece,molu.ExoEsqueleto,  molu.Respiracion,molu.Concha );
		Reporte.ReporteJuntar();
		
	}
	
}
