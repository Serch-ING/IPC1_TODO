package optencion;


public class Asignacion {
	
	

	//Asignaciones
	public static  String AsignarAlumnos[][];
	public static  String AsignarProfesores[][];
	public static  String AsignarCursos[][][];

	//Mostrar los cursos y notas
		public static void MostrarAsignarCursosNotas() {
			
			for(int j=0;j<obtenercsv.rowsCursos;j++) {
				
				for(int e=3;e<150;e++) {
					
					if(AsignarCursos[j][e][0]!= null && AsignarCursos[j][0][e]!= null) {
					System.out.print(AsignarCursos[j][0][0] + "\t");
					System.out.print(AsignarCursos[j][1][0] + "\t");
					System.out.print(AsignarCursos[j][e][0]+ "\t");
					System.out.print(AsignarCursos[j][0][e]+ "\t\n " );
					
				}
					
					
				}
			}
		
		}
	//Asignar Cursos y notass
	public static void AsignarCursos() {
		
		System.out.print( "\nLista de asignaciones a cursos: \n");

	for(int k=0;k<obtenercsv.rowsAA;k++) {

	for(int j=0;j<obtenercsv.rowsCursos;j++) {
			
	if(AsignarCursos[j][0][0].equals(obtenercsv.AsignarAA[k][1])) {
		 			
 			for(int w=0;w<obtenercsv.rowsAlumnos;w++) {
 	 			
 				if(obtenercsv.GuardarAlumnos[w][0].equals(obtenercsv.AsignarAA[k][0])) {
 					
 					for(int e=3;e<150;e++) {	
							
							if(AsignarCursos[j][e][0] == null  ) {
								AsignarCursos[j][e][0] =  obtenercsv.GuardarAlumnos[w][1] ;
								AsignarCursos[j][0][e] =  obtenercsv.AsignarAA[k][2];
								
								System.out.print(AsignarCursos[j][0][0] + "\t");
								System.out.print(AsignarCursos[j][1][0] + "\t");
								System.out.print(AsignarCursos[j][e][0]+ "\t");
								System.out.print(AsignarCursos[j][0][e]+ "\t\n");
					
								if(AsignarCursos[j][e][0] != null) {	
							
	 								break;
	 								
	 							}}}}}}}}
	 System.out.print( "\n");
		}
	
	//Mostrar los cursos asignados para profesores
	public static void MostrarAsignarCursosProf() {
		
		for(int i=0;i<obtenercsv.rowsProfesores;i++) {
 			
 			for(int j=0;j<6;j++) {
 				
		System.out.print(AsignarProfesores[i][j] + " ");	
		
 			}
 			System.out.println("");	
		
		}
	}
	
	//Asignar los cursos asignados para profesores
	public static void AsignarCursosProfesores() {
		
		for(int i=0;i<obtenercsv.rowsAP;i++) {
 			
 			for(int j=0;j<obtenercsv.rowsProfesores;j++) {
 	 			
 				for(int k=0;k<obtenercsv.rowsCursos;k++) {
 	 			
 				if(obtenercsv.GuardarProfesores[j][0].equals(obtenercsv.AsignarAP[i][0])) {
 					
 					if(obtenercsv.GuardarCursos[k][0].equals(obtenercsv.AsignarAP[i][1])){
 						
 						for(int q=3;q<6;q++) {	
 							
 							if(AsignarProfesores[j][q] == null) {

 								AsignarProfesores[j][q] = obtenercsv.GuardarCursos[k][1];
 							
 								if(AsignarProfesores[j][q] != null) {	
 							
 	 								break;
 	 								
 	 							}
 							}
 						}
 						
 						
 					}
 					
 				}
 				
 	 			}
 			}
 			}	

		}

	//Mostrar los cursos asignados para Alumnos
	public static void MostrarAsignarCursosAlum() {
		
		for(int i=0;i<obtenercsv.rowsAlumnos;i++) {
 			
 			for(int j=0;j<6;j++) {
 				
		System.out.print(AsignarAlumnos[i][j] + " ");	
		
 			}
 			System.out.println("");	
		
		}
	}
	
	//Asignar los cursos asignados para Alumnos
	public static void AsignarCursosAlumnos() {
		
		for(int i=0;i<obtenercsv.rowsAA;i++) {
 			
 			for(int j=0;j<obtenercsv.rowsAlumnos;j++) {
 	 			
 				for(int k=0;k<obtenercsv.rowsCursos;k++) {
 	 			
 				if(obtenercsv.GuardarAlumnos[j][0].equals(obtenercsv.AsignarAA[i][0])) {
 					
 					if(obtenercsv.GuardarCursos[k][0].equals(obtenercsv.AsignarAA[i][1])){
 						
 						for(int q=3;q<6;q++) {	
 							
 							if(AsignarAlumnos[j][q] == null) {

 								AsignarAlumnos[j][q] = obtenercsv.GuardarCursos[k][1];
 							
 								if(AsignarAlumnos[j][q] != null) {	
 							
 	 								break;
 	 								
 	 							}
 							}
 						}
 						
 						
 					}
 					
 				}
 				
 	 			}
 			}
 			}	

		}
	
	
	
}
