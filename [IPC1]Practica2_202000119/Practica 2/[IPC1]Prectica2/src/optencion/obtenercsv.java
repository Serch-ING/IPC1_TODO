package optencion;
import java.util.Scanner;

import menu.Menu;

import java.io.File;




public class obtenercsv {
	
	//Para Alumnos
	public static  String GuardarAlumnos[][];
	public static int rowsAlumnos ;
	public static int columnsAlumnos;
	//Para Profesores
	public static String GuardarProfesores[][];
	public static int rowsProfesores ;
	public static int columnsProfesores;
	//Para Cursos
	public static String GuardarCursos[][];
	public static int rowsCursos ;
	public static int columnsCursos;
	//Asinar Alumnos
	public static String AsignarAA[][];
	public static int rowsAA ;
	public static int columnsAA;
	//Asinar Alumnos
	public static String AsignarAP[][];
	public static int rowsAP ;
	public static int columnsAP;
	//Asinar Cursos
	public static String AsignarAC[][];
	public static int rowsAC ;
	public static int columnsAC;
	public static int CursosAC;	
	
	//Guardar la lista para Cursos para reporte
	public void GuardarListaAC(){
		try {
		
			Asignacion.AsignarCursos = new String[rowsCursos][150][150];
			
			for(int i =0; i<rowsCursos;i++) {
				for(int j =0; j<2;j++) {
					Asignacion.AsignarCursos[i][j][0]= GuardarCursos[i][j];
			}
			}
			
			System.out.print( "\nLista de Cursos: \n");
			
			for(int i =0; i<rowsCursos;i++) {
				for(int j =0; j<2;j++) {
				System.out.print(Asignacion.AsignarCursos[i][j][0] + " ");
				}System.out.println("");
		}
		
		
		
			
		}catch(Exception e) {
			
			System.out.println(e);
			
		}
		
	
	}
	
	//Guardar la lista para profesores para reporte
	public void GuardarListaAP(){
		try {
			Asignacion.AsignarProfesores = new String[rowsProfesores][6];
			for(int i =0; i<rowsProfesores;i++) {
				for(int j =0; j<3;j++) {
					Asignacion.AsignarProfesores[i][j]= GuardarProfesores[i][j];
			}
			}
			
			
			System.out.print( "\nLista de Profesores: \n");
			for(int i =0; i<rowsProfesores;i++) {
				for(int j =0; j<3;j++) {
				System.out.print(Asignacion.AsignarProfesores[i][j] + " ");
				}System.out.println("");
		}
		
		
			
		}catch(Exception e) {}
		
	
	}
	
	//Guardar la lista para alumnos para reporte
	public void GuardarListaAA(){
		try {
			Asignacion.AsignarAlumnos = new String[rowsAlumnos][6];
			
			for(int i =0; i<rowsAlumnos;i++) {
				for(int j =0; j<3;j++) {
					Asignacion.AsignarAlumnos[i][j]= GuardarAlumnos[i][j];
			}
			}
			
			System.out.print( "\nLista de alumnos: \n");
			for(int i =0; i<rowsAlumnos;i++) {
				for(int j =0; j<3;j++) {
				System.out.print(Asignacion.AsignarAlumnos[i][j] + " ");
				}System.out.println("");
		}
		
		}catch(Exception e) {System.out.println(e + "aqui ");}
		 System.out.print( "\n");

		
	}
	
	//Guardar la lista csv de agignaciones profesores
	public void AsignarAP() {
		try {
			Asignacion.AsignarProfesores = new String[obtenercsv.rowsProfesores][5];
			//File txt = new File("AsignarProfesor.csv");
			File txt = new File(Menu.rutaAP);
			Scanner reader = new Scanner(txt);
			String data="";
			while(reader.hasNextLine()) {
				data += reader.nextLine()+"\n";
			}
			
			String rows [] = data.split("\n");
			rowsAP =rows.length;
		
			
			String columns[]=rows[0].split(",");
			columnsAP=columns.length;
		
			
			
				
				AsignarAP = new String[rows.length][3];
			System.out.println("Fueron Asignados: "+rowsAP+" cursos a profesores" ); 
			
			
			for(int i =0; i<rows.length;i++) {
				columns=rows[i].split(",");
				for(int j=0;j<columns.length;j++) {
					AsignarAP[i][j]=(columns[j]);
					
				}
			}
			
			/*
			System.out.println( "\nLista Asignacion Profesores ");
			

			for(int i=0;i<rows.length;i++) {
				for(int j=0;j<columns.length;j++) {
					
					System.out.print("|" +AsignarAP[i][j] + "|\t");
					
				}	System.out.println("\t salto");
				
			}*/
			
		


			reader.close();
		}catch(Exception e) {
			System.out.println("Hubo un error en cargar alumnos error: " + e);
		}
		 System.out.print( "\n");
		
	}

	//Guardar la lista csv de agignaciones alumnos
	public void AsignarAA() {
		try {
			//File txt = new File("AsignarAlumno.csv");
			File txt = new File(Menu.rutaAA);
			Scanner reader = new Scanner(txt);
			String data="";
			while(reader.hasNextLine()) {
				data += reader.nextLine()+"\n";
			}
			
			String rows [] = data.split("\n");
			rowsAA =rows.length;
			
			
			String columns[]=rows[0].split(",");
			columnsAA=columns.length;
		
			
		
				
				AsignarAA = new String[rows.length][4];
			System.out.println("Fueron asignados: "+rowsAA+" cursos a alumnos" ); 
			
			
			for(int i =0; i<rows.length;i++) {
				columns=rows[i].split(",");
				for(int j=0;j<columns.length;j++) {
					AsignarAA[i][j]=(columns[j]);
					
				}
			}
			
			/*
			System.out.println( "\nLista Asignacion Alumnos ");
			

			for(int i=0;i<rows.length;i++) {
				for(int j=0;j<columns.length;j++) {
					
					System.out.print("|" +AsignarAA[i][j] + "|\t");
					
				}	System.out.println("\t salto");
				
			}*/
			
			


			reader.close();
		}catch(Exception e) {
			System.out.println("Hubo un error en cargar alumnos error: " + e);
		}
		 System.out.print( "\n");
	}
		
	//Guardar la lista csv de Alumnos
 	public void GuardarAlumnos() {
		try {
			//File txt = new File("Alumnos.csv");
			File txt = new File(Menu.rutaAlumnos);
			Scanner reader = new Scanner(txt);
			String data="";
			while(reader.hasNextLine()) {
				data += reader.nextLine()+"\n";
			}
			
			String rows [] = data.split("\n");
			rowsAlumnos =rows.length;
		
			
			String columns[]=rows[0].split(",");
			columnsAlumnos=columns.length;
			
			
			if(rowsAlumnos<=150) {
				
				GuardarAlumnos = new String[rows.length][4];
			System.out.println("Fueron ingresdaos: "+rowsAlumnos+" alumnos" ); 
			
			
			for(int i =0; i<rows.length;i++) {
				columns=rows[i].split(",");
				for(int j=0;j<columns.length;j++) {
					GuardarAlumnos[i][j]=(columns[j]);
					
				}
			}
			
			/*
			System.out.println( "\nLista de ALumnos ");
			

			for(int i=0;i<rows.length;i++) {
				for(int j=0;j<columns.length;j++) {
					
					System.out.print("|" +GuardarAlumnos[i][j] + "|\t");
					
				}	System.out.println("\t salto");
				
			}*/
			
			}else {
				
				
				System.out.println("El sistema solo acepta 150 alumnos: y esta ingresando: "+rowsAlumnos+" alumnos" );
			}


			reader.close();
		}catch(Exception e) {
			System.out.println("Hubo un error en cargar alumnos error: " + e);
		}
	}
 	
 	//Guardar la lista csv de profesores
 	public void GuardarProfesores() {
		try {
			//File txt = new File("Profesores.csv");
			File txt = new File(Menu.rutaProfesores);
			Scanner reader = new Scanner(txt);
			String data="";
			while(reader.hasNextLine()) {
				data += reader.nextLine()+"\n";
			}
			
			String rows [] = data.split("\n");
			rowsProfesores =rows.length;
	
			
			String columns[]=rows[0].split(",");
			columnsProfesores=columns.length;
			
			
			if(rowsProfesores<=25) {
				
				GuardarProfesores = new String[rows.length][4];
			System.out.println("Fueron ingresdaos: "+rowsProfesores+" profesores" ); 
			
			
			for(int i =0; i<rows.length;i++) {
				columns=rows[i].split(",");
				for(int j=0;j<columns.length;j++) {
					GuardarProfesores[i][j]=(columns[j]);
					
				}
			}
			
			/*
			System.out.println( "\nLista de Profesor ");
			

			for(int i=0;i<rows.length;i++) {
				for(int j=0;j<columns.length;j++) {
					
					System.out.print("|" +GuardarProfesores[i][j] + "|\t");
					
				}	System.out.println("\t salto");
				
			}*/
			
			}else {
				
				
				System.out.println("El sistema solo acepta 25 profesores: y esta ingresando: "+rowsProfesores+" profesores" );
			}


			reader.close();
		}catch(Exception e) {
			System.out.println("Hubo un error en cargar profesores error: " + e);
		}
	}
	
 	//Guardar la lista csv de cursos
 	public void GuardarCursos() {
		try {
			//File txt = new File("Cursos.csv");
			File txt = new File(Menu.rutaCursos);
			Scanner reader = new Scanner(txt);
			String data="";
			while(reader.hasNextLine()) {
				data += reader.nextLine()+"\n";
			}
			
			String rows [] = data.split("\n");
			rowsCursos =rows.length;
			
			
			String columns[]=rows[0].split(",");
			columnsCursos=columns.length;
			
			
			if(rowsCursos<=30) {
				
				GuardarCursos = new String[rows.length][2];
			System.out.println("Fueron ingresdaos: "+rowsCursos+" cursos" ); 
			
			
			for(int i =0; i<rows.length;i++) {
				columns=rows[i].split(",");
				for(int j=0;j<columns.length;j++) {
					GuardarCursos[i][j]=(columns[j]);
					
				}
			}
			
			/*
			System.out.println( "\nLista de Cursos ");
			

			for(int i=0;i<rows.length;i++) {
				for(int j=0;j<columns.length;j++) {
					
					System.out.print("|" +GuardarCursos[i][j] + "|\t");
					
				}	System.out.println("\t salto");
				
			}*/
			
			}else {
				
				
				System.out.println("El sistema solo acepta 30 cursos: y esta ingresando: "+rowsCursos+" cursos" );
			}


			reader.close();
		}catch(Exception e) {
			System.out.println("Hubo un error en cargar profesores error: " + e);
		}
	}
}
