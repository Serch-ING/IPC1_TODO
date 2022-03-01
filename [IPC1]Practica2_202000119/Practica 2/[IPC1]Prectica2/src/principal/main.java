package principal;
import menu.Menu;
import optencion.obtenercsv;
import reporte.Reportes;
import optencion.Asignacion;

public class main {
	
	static obtenercsv as = new obtenercsv();

	public static void main(String[] args) {
		
		Reportes.ReporteStarrt();
		
		Menu.useras[0][0] = "admin";
		Menu.useras[0][1] = "1234";
		
	
		Menu.login();
		
		System.out.println("\n Noce que pasa");
		
		
		
	}

}
