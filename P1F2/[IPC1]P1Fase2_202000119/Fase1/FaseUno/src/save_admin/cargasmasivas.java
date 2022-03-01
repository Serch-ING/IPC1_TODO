package save_admin;

import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

import interfaz_admin.Pantallas;
import interfaz_admin.ingreso;
import interfaz_usuario.Usuario_Cliente;




public class cargasmasivas {
	public static int validez=0;
	//Para Apps
	public static  String APPS[][];
	public static int rowsAPPS ;
	public static int columnsAPPS;
	
	public static int aux;
	public static int auxi=1;
	public static int auxili=1;
	
	public void CARGAaplicaciones() {
		
		Pantallas p = new Pantallas();
		try {
			
			System.out.println("Hola soy el cargasr");
			//File txt = new File("Test.txt");
			//Prueba.csv
			File txt = new File(Pantallas.ruta.getText());
			Scanner reader = new Scanner(txt);
			String data="";
			while(reader.hasNextLine()) {
				data += reader.nextLine()+"\n";
			}
			
			String rows [] = data.split("\n");
			rowsAPPS =rows.length;
		
			
			String columns[]=rows[0].split(",");
			columnsAPPS=columns.length;
			
			
		
				
				APPS = new String[rows.length][6];
			System.out.println("Fueron ingresdaos: "+rowsAPPS+" aplicaciones" ); 
			
			
			for(int i =0; i<rows.length;i++) {
				columns=rows[i].split(",");
				for(int j=0;j<columns.length;j++) {
					APPS[i][j]=(columns[j]);
					
				}
			}
			
	
			
			validez=1;
			
	
			JOptionPane.showMessageDialog(null, "Lista de aplicaciones cargada!");
			
			
			p.aplicaciones();
			reader.close();
			
		}catch(Exception e) {
			System.out.println("Hubo un error en cargar apps error: " + e);
		}
	
}
	
	//Carga cleintes
	public void CargaCleintes() {
	
		Pantallas p = new Pantallas();
		try {
			
			System.out.println("Hola soy el cargasr clientes");
			//File txt = new File("Usuario.txt");
			//Prueba.csv
		File txt = new File(Pantallas.poppp.getText());
			Scanner reader = new Scanner(txt);
			String data="";
			while(reader.hasNextLine()) {
				data += reader.nextLine()+"\n";
			}
			
			String rows [] = data.split("\n");
	
		
			
			String columns[]=rows[0].split(",");
			
			
			
				
				
			
			
			
			for(int i =0; i<rows.length;i++) {
				
				columns=rows[i].split(",");
				
				for(int j=0;j<columns.length;j++) {
					
						for(int k=0;k<30;k++) {
							
							if(Usuario_Cliente.Cliente[k][j]==null) {
								
								aux =k;
								break;
								
							}
						
							}
							
						
						for(int k=0;k<30;k++) {
							
							if(Usuario_Cliente.Cliente[k][0]!=null) {
								if(Usuario_Cliente.Cliente[k][0].equals(columns[0]) && auxili==1) {
									auxi =0;
									break;
								}
							}
						
							}
						
						
						
						
						if(auxi==1) {
								Usuario_Cliente.Cliente[aux][j]=(columns[j]);
								System.out.println(columns[j] + " agregar");
								auxili=0;
						}else {
							
								System.out.println("Usuario repetido: " + columns[0]);
								break;
						}
					}
				}
			
			
	
			
			validez=1;
			
	
			JOptionPane.showMessageDialog(null, "Lista de usuarios cargada!");
			
			
			
			
			
		}catch(Exception e) {
			System.out.println("Hubo un error en cargar clientes error: " + e);
		}
		auxi=1;
		auxili=1;
}
	}
