package interfaz;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import interfaz_usuario.Usuario_Cliente;



public class interfazEdad extends JFrame {
	
	//dividir edades
		public static int rango1;
		public static int rango2;
		public static int rango3;
		public static int rango4;
		public static int rango5;
		public static int Auxiliar;

	
	public interfazEdad(String aplicactionTitle,String charTitle,int rango1,int rango2,int rango3,int rango4,int rango5){
		
		super(aplicactionTitle);
	JFreeChart barChart = ChartFactory.createBarChart(
			charTitle,
			"Alumnos",
			"Edades",
			createDataset(rango1,rango2,rango3,rango4,rango5),
			PlotOrientation.VERTICAL,
			true,true,false);
		
		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new java.awt.Dimension(560,367));
		setContentPane( chartPanel );
		
	}

	private CategoryDataset createDataset(int rango1,int rango2,int rango3,int rango4,int rango5) {

	final String alumnos = "Alumnos";
	final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	

	dataset.addValue(rango1, "15 - 20", alumnos);
	dataset.addValue(rango2, "20 - 25", alumnos);
	dataset.addValue(rango3, "25 - 30", alumnos);
	dataset.addValue(rango4, "30 - 35", alumnos);
	dataset.addValue(rango5, "35 - 40", alumnos);

	
		
		
		return dataset;
	}

	
	
	//Dividir por edades 
	public static void edad() {
		 rango1=0;
		 rango2=0;
		 rango3=0;
		 rango4=0;
		 rango5=0;

		 for(int i=0;i<30;i++) {
			 
			 if(Usuario_Cliente.Cliente[i][0] != null) {
			 
			 Auxiliar = Integer.parseInt( Usuario_Cliente.Cliente[i][6]);
			 
			 if(Auxiliar>=15 && Auxiliar<20) {
					
					rango1+=1;
					
				}
				if(Auxiliar>=20 && Auxiliar<25) {
					
					rango2+=1;
				}
				if(Auxiliar>=25 && Auxiliar<30) {
					
					rango3+=1;
				}
				if(Auxiliar>=30 && Auxiliar<35) {
					
					rango4+=1;
				}
				if(Auxiliar>=35 && Auxiliar<=40) {
					
					rango5+=1;
				}
			 }}
		//---------------------------------------------
		
	System.out.println("15 a 20 : " + rango1 + " \n20 a 25: " + rango2 + " \n25 a 30: " +  rango3 + " \n30  a 35: " + rango4 + " \n35 a 40: " + rango5 );
	interfazEdad inter = new interfazEdad("Grafica edad", "Edad", rango1, rango2, rango3, rango4, rango5);
	inter.setSize(600,600);
	inter.setDefaultCloseOperation(2);
	inter.show();
	
		
	}
}