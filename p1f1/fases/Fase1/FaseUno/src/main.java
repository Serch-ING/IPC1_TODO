import interfaz.ingreso;
import save.AlmacenarDatos;
import save.reporte;



public class main {
	
	 static AlmacenarDatos almace;
	
	public static void main(String[] args) {
		
		
		
		reporte.ReporteStart();
		
		AlmacenarDatos.addAdmib("Usuario","Maestro","admin","admin","Administrador");
		//AlmacenarDatos.addAdmib("Usuario","Maestro","a","a","a");
		
	//	AlmacenarDatos.addAdmib("a","1","1","1","a");
	//	AlmacenarDatos.addAdmib("Segie","Yol","Serch","usac2008","papito");
		
		ingreso login = new ingreso();
		
		
		
		
	}

}
