package herencia;

public class Vertebrados extends animal {

	
	public String huesos;
	public int hueso;
	
	public Vertebrados (String nombre,String nombre_cientigfico, String Reino, String huesos,int hueso) {
		
		super(nombre,nombre_cientigfico,Reino);
		this.huesos = huesos;
		this.hueso = hueso;
		
		
	}
	
	
	
}
