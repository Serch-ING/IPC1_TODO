package save;

import java.io.FileWriter;



public class reporte {
//Comezar reporte
	
	public static String  ReporteInicio = "";

	public static String ReporteFinal = "";
	
	public static String  ReporteApps= "";

	public static String ReporteUsuarios = "";
	
	public static String ReporteJuntar="";
	
	
	public static void ReporteJuntar() {
		
		ReporteJuntar = ReporteUsuarios + ReporteApps;
		ReporteMostrar();
		
		
	}
	
	public static void ReporteUsuarios() {
		ReporteUsuarios= "";
		ReporteUsuarios+= "<table class=\"steelBlueCols\">\r\n"
				+ "<thead>\r\n"
				+ "<tr>\r\n"
				+ "<th>Nombre</th>\r\n"
				+ "<th>Apellido</th>\r\n"
				+ "<th>Usuario</th>"
				//+ "<th>Contrasena</th>\r\n"
				+ "<th>Frase</th>\r\n"
				+ "<th>Rol</th>\r\n"
				+ "</tr>\r\n"
				+ "</thead>\r\n"
				+ "<tbody>\r\n"
				+ "<tr>\r\n";
		
	for(int i=0;i<10;i++) {
 			
 			for(int j=0;j<6;j++) {
 				if(AlmacenarDatos.Administradores[i][j] != null && j!=3) {
 				ReporteUsuarios+="<td>" + AlmacenarDatos.Administradores[i][j] +" </td> " ;
 				}
 			}
 				
 				ReporteUsuarios+="</tr> \n <tr>";
			}
		
	
	ReporteUsuarios += "</tr></tbody></table><br>";
	
	}
	
	
	public static void ReporteApps() {
		ReporteApps = "";
		ReporteApps+= "<table class=\"steelBlueCols\">\r\n"
				+ "<thead>\r\n"
				+ "<tr>\r\n"
				+ "<th>ID</th>\r\n"
				+ "<th>Titulo</th>\r\n"
				+ "<th>Descargas</th>"
				+ "<th>Descripcion</th>\r\n"
				+ "<th>Precio</th>\r\n"
				+ "</tr>\r\n"
				+ "</thead>\r\n"
				+ "<tbody>\r\n"
				+ "<tr>\r\n";
		
	for(int i=0;i<cargasmasivas.rowsAPPS;i++) {
 			
 			for(int j=0;j<cargasmasivas.columnsAPPS;j++) {
 					
 				ReporteApps+="<td>" + cargasmasivas.APPS[i][j] +" </td> " ;
 			}
 				
 			ReporteApps+="</tr> \n <tr>";
		}
		
	
	ReporteApps += "</tr></tbody></table><br>";
	
	}
	
	
	public static void ReporteMostrar() {

		try{
			
			FileWriter archivo = new FileWriter("Reporte/ejemplo.html");
			archivo.write(ReporteInicio + ReporteJuntar +  ReporteFinal );
			archivo.close();
			
			}catch(Exception e) {}
			
		}
		
	public static void ReporteStart() {
		
		ReporteInicio="<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<meta name=\"name\" content=\"Sergie Daniel Arizandieta Yol\">\r\n"
				+ "<meta name=\"description\" content=\"Reportes sobre opraciones de la practica 2\">\r\n"
				+ "<meta name=\"keywods\" content=\"Opraciones de usuarios en Java\">\r\n"
				+ "<meta name=\"robots\" content=\"Index, Follow\">\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\"/>\r\n"
				+ "<title>Reporte</title>\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<center>\r\n"
				+ "<h1 class=\"titulos\"><font size=\"30px\"><b> Reporte</b></h1></center>";
		
		
		ReporteFinal="</body>\r\n"
				+ "</html>";
		
		
	}
	
}
