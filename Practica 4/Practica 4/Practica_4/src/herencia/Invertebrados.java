package herencia;

public class Invertebrados extends animal{

		public String Carece;
		public String ExoEsqueleto;
		
		
		
		public Invertebrados(String nombre,String nombre_cientigfico, String Reino,
				String Carece,String ExoEsqueleto) {
			
			
			 super(nombre,nombre_cientigfico,Reino);
			this.Carece = Carece;
			this.ExoEsqueleto = ExoEsqueleto;
		}
}
