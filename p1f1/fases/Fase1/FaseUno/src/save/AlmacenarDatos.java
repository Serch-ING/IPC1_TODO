package save;

import javax.swing.JOptionPane;

public class AlmacenarDatos {
	
	//Para tabla inical 
	public static  String tabla[][] = new String[10][4];
	
	
	//Administradores
		public static  String Administradores[][] = new String[10][6];

		
		//Para el uso 
		String name,lastname,user,pass;
		
		//Agregar admin
		public static void addAdmib(String name,String lastname,String user,String pass,String frase){
			int op=1;

			for(int i=0;i<10;i++) {
				
				if(AlmacenarDatos.Administradores[i][0] != null ) {
					
					if(user.equals(AlmacenarDatos.Administradores[i][2])) {
						
							JOptionPane.showMessageDialog(null, "Usuario en uso");
						
						op=0;
					}else {
						
					
						
					}
					
					
					
				}
				
			}
			
			if(op!=0) {
			
				if(Administradores[9][3] != null) {
					JOptionPane.showMessageDialog(null, "Numero de usuarios administradores maximo alcanzado");
			
				
				}else {
					
			
			
					for(int i=0; i<10;i++) {
				
						if( user == Administradores[i][2]) {
							
						
							JOptionPane.showMessageDialog(null, "Usuario en uso");
							break;
							
					}else{
					
						if(Administradores[i][0] == null) {
						
							
							Administradores[i][0] =name;
							Administradores[i][1]=lastname;
							Administradores[i][2]=user;
							Administradores[i][3]=pass;
							Administradores[i][4]=frase;
							Administradores[i][5]="admin";
							if(i==0) {
								
								
							}else {
								
								JOptionPane.showMessageDialog(null, "Usuario creado! - " +Administradores[i][0]);
							}
							
							break;
							
						
						
							} 
					
						}	
				
					}
		
				}
			
			}
			
			
		
		}
		
		//Cambiar datos Admin
		public void CambioAdmin(String name,String lastname,String user,String pass){
		
			for(int i=1;i<10;i++) {
				
				if(user.equals(this.Administradores[i][3])) {
					
					name = Administradores[i][0];
					lastname = Administradores[i][1];
					user = Administradores[i][2];
					pass = Administradores[i][3];
					//Usuario actulizado con exito 
				}else{
					//Usuario no existe
					
				}
				
				
			}
			
		}
		
		public void CambioUsuario(String user){
		}
		
		
	public static void tabla(){
			
			for(int i=0;i<10;i++) {
				
				
				if(Administradores!= null) {
					
					tabla[i][0] = Administradores[i][0];
					tabla[i][1] = Administradores[i][1];
					tabla[i][2] = Administradores[i][2];
					tabla[i][3] = Administradores[i][5];
					
					
				}
				
			}
		}
		
}
