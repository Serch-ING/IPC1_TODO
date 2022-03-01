package save_admin;

import javax.swing.JOptionPane;

import interfaz_admin.Pantallas;
import interfaz_admin.ingreso;
import interfaz_usuario.Usuario_Cliente;


public class datosinteracciones {
	//validar 
	int noid;
	int nousu;
	int aux=1;
	int auxi=1;
	int valorar=1;
	
	Pantallas p = new Pantallas();
	
	
	public static void actializacionCliente() {
		int op=1;
	
		
				
	
		
			if(ingreso.Usuario.equals(Usuario_Cliente.Cliente[ingreso.nousuario][0]) && op!=0) {
				
				JOptionPane.showMessageDialog(null, "Datos correspondientes actualizados");
				if(ingreso.nombre.getText().length() >0) {
					
					
					Usuario_Cliente.Cliente[ingreso.nousuario][1] = ingreso.nombre.getText();
				}
				
				
				if(ingreso.apellido.getText().length() >0) {
					
					
					Usuario_Cliente.Cliente[ingreso.nousuario][2] = ingreso.apellido.getText();
				}
			

				if(ingreso.contrsena.getText().length() >0) {
	
	
					Usuario_Cliente.Cliente[ingreso.nousuario][3] = ingreso.contrsena.getText();
				}	
				
		
			}
			
		
		ingreso.Perfil();
	}
	
	
	//saddasas
	
	public void actializacionAdmin() {
		int op=1;
		
		for(int i=0;i<10;i++) {
			
			if(i != ingreso.nousuario && AlmacenarDatos.Administradores[i][0] != null ) {
				
				if(Pantallas.usuario.getText().equals(AlmacenarDatos.Administradores[i][2])) {
					JOptionPane.showMessageDialog(null, "El usuario ya existe");
	
					
					op=0;
				}else {
					
				
					
				}
				
				
				
			}
			
		}
		
		
		for(int i=0;i<30;i++) {
				
				if( Usuario_Cliente.Cliente[i][0] != null ) {
					
					if(Pantallas.usuario.getText().equals(Usuario_Cliente.Cliente[i][0])) {
						JOptionPane.showMessageDialog(null, "El usuario ya existe");
		
						
						op=0;
					}else {
						
					
						
					}
					
					
					
				}
				
			}
		
			if(Pantallas.Usuario.equals(AlmacenarDatos.Administradores[ingreso.nousuario][2]) && op!=0) {
				
				JOptionPane.showMessageDialog(null, "Datos correspondientes actualizados");
				if(Pantallas.nombre.getText().length() >0) {
					
					
				AlmacenarDatos.Administradores[ingreso.nousuario][0] = Pantallas.nombre.getText();
				}
				
				
				if(Pantallas.apellido.getText().length() >0) {
					
					
				AlmacenarDatos.Administradores[ingreso.nousuario][1] = Pantallas.apellido.getText();
				}
				
				if(Pantallas.usuario.getText().length() >0) {
					
					
				AlmacenarDatos.Administradores[ingreso.nousuario][2] = Pantallas.usuario.getText();
				}

				if(Pantallas.contrsena.getText().length() >0) {
	
	
				AlmacenarDatos.Administradores[ingreso.nousuario][3] = Pantallas.contrsena.getText();
				}	
				
				if(Pantallas.frase.getText().length() >0) {
					
					
				AlmacenarDatos.Administradores[ingreso.nousuario][4] = Pantallas.frase.getText();
					}	
			}
			
		
		p.PerfilAdmin();
	}
	
	public void Recuperar() {
		

		for(int i=0;i<10;i++) {
			if(AlmacenarDatos.Administradores[i][2]!=null) {
				System.out.println(Pantallas.usu.getText() + "-" +AlmacenarDatos.Administradores[i][2]  );
				
			if(Pantallas.usu.getText().equals(AlmacenarDatos.Administradores[i][2]) && Pantallas.par.getText().equals(AlmacenarDatos.Administradores[i][4])) {
				JOptionPane.showMessageDialog(null, AlmacenarDatos.Administradores[i][0]+" su contrasena es: " + AlmacenarDatos.Administradores[i][3]);
	
				
			}
			}
		}
		
		for(int i=0;i<30;i++) {
			if(Usuario_Cliente.Cliente[i][0]!=null) {
				System.out.println(Pantallas.usu.getText() + "-" +Usuario_Cliente.Cliente[i][0]  );
				
			if(Pantallas.usu.getText().equals(Usuario_Cliente.Cliente[i][0]) && Pantallas.par.getText().equals(Usuario_Cliente.Cliente[i][4])) {
				JOptionPane.showMessageDialog(null,Usuario_Cliente.Cliente[i][1]+" su contrasena es: " + Usuario_Cliente.Cliente[i][3]);
	
				
				}
			}
		}
		
		
		
	}
	
	public void MOstrarApp() {
		
		if(Pantallas.idnormal.getText() == "") {
			
			
			JOptionPane.showMessageDialog(null,"ingrese id");
			
		}else {
			
			
			for(int i=0;i<cargasmasivas.rowsAPPS;i++) {
				
				if(cargasmasivas.APPS[i][0].equals(Pantallas.idnormal.getText()) ) {
					
					noid = i;
					
				}
				
			}
			
			JOptionPane.showMessageDialog(null, "Busque finalizada!, Resultados 1 app \nID: " + cargasmasivas.APPS[noid][0] + "\nTitulo: " +cargasmasivas.APPS[noid][1] + "\nDescargas: "+cargasmasivas.APPS[noid][2] + "\nDescripcion: " +cargasmasivas.APPS[noid][3] + "\nPrecio: " + 	cargasmasivas.APPS[noid][4] );

			
			
			
		}

	}
	
	public void ActualizarCargas() {
		
	int op=1;
		
	for(int i=0;i<cargasmasivas.rowsAPPS;i++) {
		
		if(cargasmasivas.APPS[i][0].equals(Pantallas.idnormal.getText()) ) {
			
			noid = i;
			
		}
		
	}
	
	
		for(int i=0;i<cargasmasivas.rowsAPPS;i++) {
			
			if(i != noid && cargasmasivas.APPS[i][0] != null ) {
				
				if(Pantallas.id.getText().equals(cargasmasivas.APPS[i][0])) {
					JOptionPane.showMessageDialog(null, "El ID ya existe");
					
					
					op=0;
				}else {
					
				
					
				}
				
				
				
			}
			
		}
		
		if( cargasmasivas.APPS[noid][0].equals(Pantallas.idnormal.getText()) && op!=0) {
			
			JOptionPane.showMessageDialog(null, "Usuario: " + cargasmasivas.APPS[noid][0] + " Actualizado");
			
			if(Pantallas.id.getText().length() >0) {
				
				
				cargasmasivas.APPS[noid][0] = Pantallas.id.getText();
				}
			
			if(Pantallas.title.getText().length() >0) {
				
				
				cargasmasivas.APPS[noid][1] = Pantallas.title.getText();
				}
			
			if(Pantallas.dowload.getText().length() >0) {
				
				
				cargasmasivas.APPS[noid][2] = Pantallas.dowload.getText();
				}
			
			if(Pantallas.descripcion.getText().length() >0) {
				
				
				cargasmasivas.APPS[noid][3] = Pantallas.descripcion.getText();
				}
			
			if(Pantallas.precio.getText().length() >0) {
				
				
				cargasmasivas.APPS[noid][4] = Pantallas.precio.getText();
				}
		}
		
		for(int i=0;i<6;i++) {
		System.out.println(cargasmasivas.APPS[noid][i]);
		}
		p.aplicaciones();
		
		
	}

	public void EliminarCarga() {
		
		
		
		
		for(int i=0;i<cargasmasivas.rowsAPPS;i++) {
			
			if(cargasmasivas.APPS[i][0].equals(Pantallas.idnormal.getText()) ) {
				
				noid = i;
				
			}
			
		}
		JOptionPane.showMessageDialog(null, "Usuario: " + cargasmasivas.APPS[noid][0] + " Eliminado");

				cargasmasivas.APPS[noid][0] = "";

				cargasmasivas.APPS[noid][1] = "";
				
				cargasmasivas.APPS[noid][2] = "";

				cargasmasivas.APPS[noid][3] = "";
	
				cargasmasivas.APPS[noid][4] = "";
				
				
		p.aplicaciones();
		
	}

	public void EliminarUsuarioAdmin() {

		System.out.println(Pantallas.ModUser.getText() + " usuario");
	for(int i=0;i<10;i++) {
		aux =1;
		auxi =1;
			if(Pantallas.ModUser.getText().equals(AlmacenarDatos.Administradores[i][2])) {
				
				nousu = i;
				aux =0;
				break;
			}	
			
			
			if(Pantallas.ModUser.getText().equals(Usuario_Cliente.Cliente[i][0])) {
				
				nousu = i;
				auxi =0;
				break;
			}
			
			
		}
	
	System.out.println(nousu+ "  nosu");
	if(aux ==0) {
		
		JOptionPane.showMessageDialog(null, "Usuario: " + AlmacenarDatos.Administradores[nousu][2] + " Administrador - Eliminado");
		
		AlmacenarDatos.Administradores[nousu][0] = "";
			
		AlmacenarDatos.Administradores[nousu][1] = "";
				
		AlmacenarDatos.Administradores[nousu][2] = "";
			
		AlmacenarDatos.Administradores[nousu][3] = "";
			
		AlmacenarDatos.Administradores[nousu][4] = "";
		
		AlmacenarDatos.Administradores[nousu][5] = "";
		
	}
	
	if(auxi ==0) {
		
		JOptionPane.showMessageDialog(null, "Usuario: " + AlmacenarDatos.Administradores[nousu][2] + " Cliente - Eliminado");
		
		Usuario_Cliente.Cliente[nousu][0] = "";
			
		Usuario_Cliente.Cliente[nousu][1] = "";
				
		Usuario_Cliente.Cliente[nousu][2] = "";
			
		Usuario_Cliente.Cliente[nousu][3] = "";
			
		Usuario_Cliente.Cliente[nousu][4] = "";
		
		Usuario_Cliente.Cliente[nousu][5] = "";
		
		Usuario_Cliente.Cliente[nousu][6] = "";
		
		Usuario_Cliente.Cliente[nousu][7] = "";
		
		Usuario_Cliente.Cliente[nousu][8] = "";
		
	}
				
		AlmacenarDatos.tabla();
		p.Editar();
		
		
	}

	public void EditarAdmin() {
		
		valorar=1;
		
		int op=1;
		
		int po=1;
		
		
		for(int i=0;i<30;i++) {
				
				if( Usuario_Cliente.Cliente[i][0] != null ) {
					
					if(Pantallas.ModNewUser.getText().equals(Usuario_Cliente.Cliente[i][0])) {
						JOptionPane.showMessageDialog(null, "El ID ya existe");
						
						
						po=0;
						break;
					}else {
						
					
						
					}
					
					
					
				}
				
			}
	
		
		for(int i=0;i<10;i++) {
			
			if(Pantallas.ModUser.getText().equals(AlmacenarDatos.Administradores[i][2])) {
				
				nousu = i;
				System.out.println(AlmacenarDatos.Administradores[i][2] + " - " + nousu );
			
			}	
		}
		
		
		
	for(int i=0;i<10;i++) {
			
			if(i != nousu && AlmacenarDatos.Administradores[i][0] != null ) {
				
				if(Pantallas.ModNewUser.getText().equals(AlmacenarDatos.Administradores[i][2])) {
					JOptionPane.showMessageDialog(null, "El ID ya existe");
					
					
					
					op=0;
					break;
				}else {
					
				
					
				}
				
				
				
			}
			
		}
	
	System.out.println(" op " + op );
	
	if( AlmacenarDatos.Administradores[nousu][2].equals(Pantallas.ModUser.getText()) && op!=0 && po!=0 ) {
		System.out.println(" cambiar data " + AlmacenarDatos.Administradores[nousu][2] );
		
		 valorar=0;
		
		JOptionPane.showMessageDialog(null, "Usuario: " + AlmacenarDatos.Administradores[noid][0] + " Actualizado");
		
		if(Pantallas.ModNewUser.getText().length() >0) {
			
			
			AlmacenarDatos.Administradores[nousu][2] = Pantallas.ModNewUser.getText();
			
		}
		
		if(Pantallas.ModNom.getText().length() >0) {
			
			
			AlmacenarDatos.Administradores[nousu][0] = Pantallas.ModNom.getText();
			
		}
	
		if(Pantallas.ModApe.getText().length() >0) {
		
		
		AlmacenarDatos.Administradores[nousu][1] = Pantallas.ModApe.getText();
		
		}
		
		
	
			
	}	
	
	
	
	
	//asddddddddddddddddddddddddddddddd
	
	
			for(int i=0;i<30;i++) {
				
				if(Pantallas.ModUser.getText().equals(Usuario_Cliente.Cliente[i][0])) {
					
					nousu = i;
					System.out.println(Usuario_Cliente.Cliente[i][0] + " - " + nousu );
				
				}	
			}
			
			
			
			
			
		for(int i=0;i<30;i++) {
				
				if(i != nousu && Usuario_Cliente.Cliente[i][0] != null ) {
					
					if(Pantallas.ModNewUser.getText().equals(Usuario_Cliente.Cliente[i][0])) {
						JOptionPane.showMessageDialog(null, "El ID ya existe");
						
						
						po=0;
						break;
					}else {
						
					
						
					}
					
					
					
				}
				
			}
		
		
		for(int i=0;i<10;i++) {
			
			if( AlmacenarDatos.Administradores[i][0] != null ) {
				
				if(Pantallas.ModNewUser.getText().equals(AlmacenarDatos.Administradores[i][2] ) && valorar==1 ) {
					JOptionPane.showMessageDialog(null, "El ID ya existe");
					
					
					op=0;
					break;
				}else {
					
				
					
				}
				
				
				
			}
			
		}
		
		System.out.println(" op " + po );
		
		if( Usuario_Cliente.Cliente[nousu][0].equals(Pantallas.ModUser.getText()) && po!=0 && op!=0) {
			System.out.println(" cambiar data " + Usuario_Cliente.Cliente[nousu][0] );
			
			
			JOptionPane.showMessageDialog(null, "Usuario: " +Usuario_Cliente.Cliente[nousu][1]+ " Actualizado");
			
			if(Pantallas.ModNewUser.getText().length() >0) {
				
				
				Usuario_Cliente.Cliente[nousu][0] = Pantallas.ModNewUser.getText();
				
			}
			
			if(Pantallas.ModNom.getText().length() >0) {
				
				
				Usuario_Cliente.Cliente[nousu][1] = Pantallas.ModNom.getText();
				
			}
		
			if(Pantallas.ModApe.getText().length() >0) {
			
			
				Usuario_Cliente.Cliente[nousu][2] = Pantallas.ModApe.getText();
			
			}
			
			
		
				
		}	
	
	
	//final
	AlmacenarDatos.tabla();
	p.Editar();

		
	}
}
	

