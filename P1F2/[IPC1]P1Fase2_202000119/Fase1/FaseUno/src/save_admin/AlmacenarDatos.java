package save_admin;

import javax.swing.JOptionPane;

import interfaz_usuario.Usuario_Cliente;



public class AlmacenarDatos {
	static //Aux
	int aux=0;
	static int opo=1;
	
	//Para tabla inical 
	public static  String tabla[][] = new String[40][4];
	
	
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
					
			
			
					for(int i=0; i<30;i++) {
				
						
						if(i<10) {
						
							if( user == Administradores[i][2]) {
							
						
								JOptionPane.showMessageDialog(null, "Usuario en uso");
								opo=0;
								break;
							
							}
						
						}
						
						
						
						if( user.equals(Usuario_Cliente.Cliente[i][0])) {
							
							
							JOptionPane.showMessageDialog(null, "Usuario en uso");
							opo=0;
							break;
						
						}
						
						
					}
				
					for(int i=0; i<10;i++) {
						
						if(Administradores[i][0] == null && opo==1) {
						
							
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
			
			opo=1;
		
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
		aux=0;
		
		for(int i=0;i<40;i++) {
			
			
			
				
				tabla[i][0] = null;
				tabla[i][1] = null;
				tabla[i][2] = null;
				tabla[i][3] = null;
			
				
			
			
		}
		
		
			for(int i=0;i<10;i++) {
				
				
				if(Administradores[i][0]!= null && tabla[i][0] == null  ) {
					
					tabla[i][0] = Administradores[i][0];
					tabla[i][1] = Administradores[i][1];
					tabla[i][2] = Administradores[i][2];
					tabla[i][3] = Administradores[i][5];
					
					System.out.println( Administradores[i][0] + "\n" + Administradores[i][1] + "\n" + Administradores[i][2]);
				}
				
			}
			
			for(int i=0;i<40;i++) {
				
				
				if( Usuario_Cliente.Cliente[aux][0] != null && tabla[i][0] == null ) {
					
					tabla[i][0] = Usuario_Cliente.Cliente[aux][1];
					tabla[i][1] = Usuario_Cliente.Cliente[aux][2];
					tabla[i][2] = Usuario_Cliente.Cliente[aux][0];
					tabla[i][3] = Usuario_Cliente.Cliente[aux][8];
					aux+=1;
					
				}
				
			}
			
			
			
		}
		
}
