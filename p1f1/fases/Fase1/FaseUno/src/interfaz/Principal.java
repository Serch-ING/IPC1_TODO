package interfaz;
import javax.swing.*;


import save.AlmacenarDatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Principal extends JFrame{
	JTable table;
	JButton boton;
	
	
	Pantallas pan = new Pantallas();
	
		public Principal() {
			JFrame jsj = new JFrame();
			AlmacenarDatos.tabla();
			
			//Label
			JLabel lbl = new JLabel("Usuarios Activos");
			lbl.setBounds(550,30,100,20);
			jsj.add(lbl);
			
			//VENTANA
			jsj.setTitle("Ventana Principal Admin");
			jsj.setSize(900,500);
			jsj.setLayout(null);
			jsj.setLocationRelativeTo(null);
		
			
			//BOton Pefil
			boton = new JButton("Perfil");
			boton.setBounds(20,10,100,20);
			jsj.add(boton);
			boton.addActionListener(new ActionListener() 
			{public void actionPerformed(ActionEvent e) { pan.PerfilAdmin(); jsj.dispose();}});
			
			//BOton Nuevo admin
			boton = new JButton("Nuevo Usuario");
			boton.setBounds(20,50,150,20);
			jsj.add(boton);
			boton.addActionListener(new ActionListener() 
			{public void actionPerformed(ActionEvent e) { pan.USuarioAdmin(); jsj.dispose();}});
			
			//BOton regresar
			boton = new JButton("Editar Usuarios");
			boton.setBounds(650,300,150,20);
			jsj.add(boton);
			boton.addActionListener(new ActionListener() 
			{public void actionPerformed(ActionEvent e) { pan.Editar(); jsj.dispose();}});
			
			
			//BOton regresar
			boton = new JButton("Cerras sesion");
			boton.setBounds(20,400,150,20);
			jsj.add(boton);
			boton.addActionListener(new ActionListener() 
			{public void actionPerformed(ActionEvent e) {
				jsj.dispose();
			ingreso login = new ingreso(); }});
			
			//BOton Apliaciones
			boton = new JButton("Aplicaciones");
			boton.setBounds(20,100,130,20);
			jsj.add(boton);
			boton.addActionListener(new ActionListener() 
			{public void actionPerformed(ActionEvent e) {
				jsj.dispose();
			pan.aplicaciones();}});
			
			
			//Tbla(falta carga masciva, agragr y elimnar  apps )
			
			String[] columnNames = {"Name","Apellido","Usuario","Rol"};
			
		
			table = new JTable (AlmacenarDatos.tabla,columnNames);
			table.setBounds(400, 100, 400, 200);
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setBounds(400, 100, 400, 200);
			jsj.add(scrollPane);
			
			
			jsj.setVisible(true);
		}
		
		public void PerfilAdmin() {
			
			
			this.setTitle("Loginas");
			this.setSize(400,400);
			this.setLayout(null);
			this.setLocationRelativeTo(null);
			
			JLabel lbl = new JLabel("Recuperar Contrasena");
			lbl.setBounds(140,10,130,40);
			this.add(lbl);
			
		
			JTextField tf = new JTextField("Usuario");
			tf.setBounds(125,120,150,20);
			this.getContentPane().add(tf);
			this.setVisible(true);
			
			
			JTextField t = new JTextField("Ingrese pregunta secreta");
			t.setBounds(125,150,150,20);
			this.getContentPane().add(t);
			this.setVisible(true);
			
			
			JButton boton = new JButton("Rescuperar contraseņa");
			boton.setBounds(125,250,150,20);
			this.add(boton);
			
		}
						
			
}		
		
		

