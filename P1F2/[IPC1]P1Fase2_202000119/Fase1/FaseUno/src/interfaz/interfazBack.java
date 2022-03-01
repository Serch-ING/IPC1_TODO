package interfaz;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import save_admin.cargasmasivas;

public class interfazBack extends JFrame {

	//dividir edades
	public static int rango1;
	public static int rango2;
	public static int rango3;
	public static int rango4;
	public static int rango5;
	public static int rango6;
	public static int rango7;
	public static int rango8;
	public static int rango9;
	public static int rango10;
	
	
	
	public interfazBack(String aplicactionTitle,String charTitle,String app[][]){
		
		super(aplicactionTitle);
	JFreeChart barChart = ChartFactory.createBarChart(
			charTitle,
			"Clientes",
			"Cantidad por sexo",
			createDataset(app),
			PlotOrientation.VERTICAL,
			true,true,false);
		
		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new java.awt.Dimension(560,367));
		setContentPane( chartPanel );
		
	}

	private CategoryDataset createDataset(String app[][]) {
		int n;

	final String alumnos = "Alumnos";
	final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	
	n = app.length;
	for(int i=0;i<n;i++) {
		
		if(i<10) {
			if(app[i][3] != null) {
				
				rango1 = Integer.parseInt(app[i][3]);
				dataset.addValue(rango1, app[i][1], alumnos);
				
			}
		}
		
	}
			return dataset;
	}
	

	static int n;
	
	
	public static void menor(String app[][]) {
		
		
		try {
			 
			 
			 
			n =	cargasmasivas.APPS.length ;
			int i,j;
			int aux,auxi;
			String temp;
			String tempo;
			boolean swapped;
			
			for(i =0; i < n -1;i++) {
				
			
				for(j =0; j < n -i-1;j++) {
					
					aux	= Integer.parseInt(app[j][3] );
					auxi = Integer.parseInt(app[j+1][3] );
				
				if(aux < auxi ) {
					
					temp = app[j+1][3] ;
					app[j+1][3] = app[j][3];
					app[j][3] = temp;
					
					tempo = app[j+1][1] ;
					app[j+1][1]  = app[j][1] ;
					app[j][1]  = tempo;

				}
				
				}
			
			}
					
			
			
			}catch(Exception e) {
				
				System.out.println("error" + e );
			}
				
			
		
		
		
		interfazTop inter = new interfazTop("Grafica Top 10", "Top 10", app  );
		inter.setSize(600,600);
		inter.setDefaultCloseOperation(2);
		inter.show();
	}
	
	
}
