package interfaz;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import interfaz_usuario.Usuario_Cliente;

public class interfazSexo extends JFrame {

	public static int male=0;
	public static int famale=0;
	
	public interfazSexo(String aplicactionTitle,String charTitle,int Male,int Famale){
		
		super(aplicactionTitle);
	JFreeChart barChart = ChartFactory.createBarChart(
			charTitle,
			"Clientes",
			"Cantidad por sexo",
			createDataset(Male,Famale),
			PlotOrientation.VERTICAL,
			true,true,false);
		
		ChartPanel chartPanel = new ChartPanel(barChart);
		chartPanel.setPreferredSize(new java.awt.Dimension(560,367));
		setContentPane( chartPanel );
		
	}

	private CategoryDataset createDataset(int Male,int Famale) {

	final String alumnos = "Alumnos";
	final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
	

	dataset.addValue(Male, "Famale", alumnos);
	dataset.addValue(Famale, "Male", alumnos);

	
		
		
		return dataset;
	}

	public static void separar() {
		
		male=0;
		famale=0;
		
		
		for(int i=0;i<30;i++) {
			
			if(Usuario_Cliente.Cliente[i][7]!=null ) {
				if( Usuario_Cliente.Cliente[i][7].equals("F") ) {
				
					famale+=1;
					
			
				}else if(Usuario_Cliente.Cliente[i][7].equals("M")) {
					
					male+=1;
				
				}
		
			}
		}
		
		System.out.println("Male: " + male + "\n Famlae: " + famale);
		
	}
}
