package interfaz_usuario;

import save_admin.AlmacenarDatos;

public class Usuario_Cliente {

	//Para Alumnos
	public static  String Cliente[][] = new String[30][9];

	
	//Aux
	static int pop=1;
	
	
	public static void confir(String Usuario,String Nombre, String Apellido, String Contrasena, String Con_Contrasena, String Frase, String img, String edad, String Sexo) {
		
		if(Contrasena.equals(Con_Contrasena)) {
			
			
			agreagr( Usuario, Nombre,  Apellido,  Contrasena,  Frase,  img,  edad,  Sexo);
			
		}else {
			
			
			System.out.println("Contrasena incorrecta");
			
			
		}
		
	}
	
	public static void agreagr(String Usuario,String Nombre, String Apellido, String Contrasena, String Frase, String img, String edad, String Sexo) {
		
		
		
		for(int i=0;i<30;i++) {
			
				if(   Cliente[i][0] != null  ) {
					
					
					if(Cliente[i][0].equals(Usuario)) {
						System.out.println("Usuario en uso");	
					pop=0;
					break;
					
					}
				}
				
				
				if(i<10) {
				
				if(   AlmacenarDatos.Administradores[i][0] != null  ) {
					
					
					if(AlmacenarDatos.Administradores[i][2].equals(Usuario)) {
						System.out.println("Usuario en uso");	
					pop=0;
					break;
					
					}
				}
				
				}
			
		}
		
		

		for(int i=0;i<30;i++) {
			
				if(Cliente[i][0] == null  && pop==1 ) {
					
					Cliente[i][0] = Usuario;
					Cliente[i][1] = Nombre;
					Cliente[i][2] = Apellido;
					Cliente[i][3] = Contrasena;
					Cliente[i][4] = Frase;
					Cliente[i][5] = img;
					Cliente[i][6] = edad;
					Cliente[i][7] = Sexo;
					Cliente[i][8] = "Cliente";
					
					
					System.out.println(	Cliente[i][0]);
					break;
					
					
			
					
				}
			
			
		}
		
		pop=1;
		
	}
	
	
	public static void tabla(){
		
		
	}
	
	
}
