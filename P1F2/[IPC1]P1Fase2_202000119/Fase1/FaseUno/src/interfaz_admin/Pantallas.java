package interfaz_admin;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import interfaz_usuario.Usuario_Cliente;
import save_admin.AlmacenarDatos;
import save_admin.cargasmasivas;
import save_admin.datosinteracciones;
import save_admin.reporte;


public class Pantallas extends JFrame {

	//Fase 2-----------------------------------------------------------------------------
	
	
	
	
	//Fase 1-----------------------------------------------------------------------------
	//Aux
	public static  String aux[][] = new String[1][6];
	public static  String auxiliar[][] = new String[1][6];
	
	reporte report = new reporte();
	cargasmasivas cs = new cargasmasivas();
	static datosinteracciones ds = new datosinteracciones();
	
	public static String Usuario;
	public static String Contrasena;
	//Ingreso cargar masiva
	public static JTextField ruta;
	//Actualizacion de usuario
	static JTable table;
	public static JTextField usuario;
	public static JTextField contrsena;
	public static JTextField nombre;
	public static JTextField apellido;
	public static JTextField frase;
	//Creacionde usuario
	public static JTextField user;
	public static JTextField pass;
	public static JTextField name;
	public static JTextField last;
	//EDITAR USUARIO
	public static JTextField text1;
	public static JTextField text2;
	public static JTextField text3;
	//Para app
	public static JTextField idnormal;
	public static JTextField id;
	public static JTextField title;
	public static JTextField dowload;
	public static JTextField descripcion;
	public static JTextField precio;
	//Recuperar
	public static JTextField usu;
	public static JTextField par;
	//Editar Usuarios
	public static JTextField ModUser;
	public static JTextField ModNewUser;
	public static JTextField ModApe;
	public static JTextField ModNom;
	
	public static JTextField poppp;
	//PerfilAdmin
	public void PerfilAdmin() {
		JFrame js = new JFrame();
		
		Usuario = AlmacenarDatos.Administradores[ingreso.nousuario][2];
	
	for(int i=0; i<10;i++) {
		
		if(Usuario.equals(AlmacenarDatos.Administradores[i][2])) {
			aux[0][0] =  AlmacenarDatos.Administradores[i][0];
			aux[0][1] =  AlmacenarDatos.Administradores[i][1];
			aux[0][2] =  AlmacenarDatos.Administradores[i][2];
			aux[0][3] =  AlmacenarDatos.Administradores[i][3];
			aux[0][4] =  AlmacenarDatos.Administradores[i][4];
			aux[0][5] =  AlmacenarDatos.Administradores[i][5];
		
		}		
	}
	
		
		
		js.setVisible(true);
		js.setTitle("Loginas");
		js.setSize(1000,550);
		js.setLayout(null);
		js.setLocationRelativeTo(null);
		
		JLabel lbl = new JLabel("Hola! " + Usuario);
		System.out.println(Usuario);
		lbl.setBounds(10,10,130,40);
		js.add(lbl);
		
		lbl = new JLabel("Admin");
		lbl.setBounds(10,30,130,40);
		js.add(lbl);
		
		//Tbla
	
		String[] columnNames = {"Name","Apellido","Usuario","Contrasena","Frase","rol"};
		
	
				
				table = new JTable (aux,columnNames);
				table.setBounds(150, 40, 800, 70);
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(150, 40, 800, 70);
				js.add(scrollPane);
				
					
		
		
	
		JButton boton = new JButton("Regresar");
		boton.setBounds(5,450,150,20);
		js.add(boton);
		boton.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) {js.dispose(); Principal p = new Principal(); }});
		
		lbl = new JLabel("Cambio de nombre");
		lbl.setBounds(190,200,150,40);
		js.add(lbl);
		
		nombre = new JTextField("");
		nombre.setBounds(200,250,130,20);
		js.add(nombre);
		

		lbl = new JLabel("Cambio de usuario");
		lbl.setBounds(190,350,150,40);
		js.add(lbl);
		
		usuario = new JTextField("");
		usuario.setBounds(200,400,130,20);
		js.add(usuario);
		
		lbl = new JLabel("Cambio de Apellido");
		lbl.setBounds(390,200,150,40);
		js.add(lbl);
			
		apellido = new JTextField("");
		apellido.setBounds(400,250,130,20);
		js.add(apellido);
	
		lbl = new JLabel("Cambio de contrasena");
		lbl.setBounds(390,350,150,40);
		js.add(lbl);
				
		contrsena = new JTextField("");
		contrsena.setBounds(400,400,130,20);
		js.add(contrsena);
		
		
		lbl = new JLabel("Cambio de frase");
		lbl.setBounds(600,350,150,40);
		js.add(lbl);
				
		frase = new JTextField("");
		frase.setBounds(600,400,130,20);
		js.add(frase);
		
		boton = new JButton("Editar credenciales");
		boton.setBounds(400,150,200,20);
		js.add(boton);
		boton.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) {
			js.dispose();
		
			ds.actializacionAdmin();
	
			
		}});
		
		
				
	}
	
	//Pantalla recupeara contrasena
	public void Recuperar() {
				JFrame recovery = new JFrame();
				recovery.setTitle("Loginas");
				recovery.setSize(400,400);
				recovery.setLayout(null);
				recovery.setLocationRelativeTo(null);
				
				JLabel lbl = new JLabel("Recuperar Contrasena");
				lbl.setBounds(140,10,130,40);
				recovery.add(lbl);
				
				 lbl = new JLabel("Ingresar usuario");
				lbl.setBounds(140,80,130,40);
				recovery.add(lbl);
				
				usu = new JTextField("");
				usu.setBounds(125,120,150,20);
				recovery.getContentPane().add(usu);
				
				 lbl = new JLabel("Ingresar frase de usuario");
					lbl.setBounds(140,150,130,40);
					recovery.add(lbl);
				
				par = new JTextField("");
				par.setBounds(125,200,150,20);
				recovery.getContentPane().add(par);
				
				
				
				JButton boton = new JButton("Rescuperar contraseņa");
				boton.setBounds(125,250,200,20);
				boton.addActionListener(new ActionListener() 
				{public void actionPerformed(ActionEvent e) { ds.Recuperar(); System.out.println("dfs"); }});
				recovery.add(boton);
				
				
				MouseListener volver = new MouseListener() {

					@Override
					public void mouseClicked(MouseEvent e) { 
						recovery.dispose();
						ingreso login = new ingreso();
					
					}

					@Override
					public void mousePressed(MouseEvent e) {}
					@Override
					public void mouseReleased(MouseEvent e) {}
					@Override
					public void mouseEntered(MouseEvent e) {}
					@Override
					public void mouseExited(MouseEvent e) {}};
				
				
				
				JLabel lb = new JLabel("Regresa al inicio de Sesion");
				lb.setBounds(140,300,160,40);
				recovery.add(lb);
				lb.addMouseListener(volver);
				recovery.setVisible(true);
			}
	
	//Nuevo usuario
	public void USuarioAdmin() {
		
		
		this.setTitle("Nuevo Usuario");
		this.setSize(400,600);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JLabel lbl = new JLabel("Crear nuevo usuario") ;
		lbl.setBounds(10,1,130,40);
		this.add(lbl);
		
		lbl = new JLabel("Nombre: ");
		lbl.setBounds(10,50,130,20);
		this.add(lbl);
		
		name = new JTextField("");
		name.setBounds(100,50,130,20);
		this.add(name);
		
		lbl = new JLabel("Apellido: ");
		lbl.setBounds(10,100,130,20);
		this.add(lbl);
		
		 last = new JTextField("");
		 last.setBounds(100,100,130,20);
		this.add(last);
		
		
		//
		lbl = new JLabel("Usuario: ");
		lbl.setBounds(10,150,130,20);
		this.add(lbl);
		
		user = new JTextField("");
		user.setBounds(100,150,130,20);
		this.add(user);
		
		lbl = new JLabel("Contrasena: ");
		lbl.setBounds(10,200,130,20);
		this.add(lbl);
		
		pass = new JTextField("");
		pass.setBounds(100,200,130,20);
		this.add(pass);
		
		lbl = new JLabel("Frase de recuperacion: ");
		lbl.setBounds(10,250,150,20);
		this.add(lbl);
		
		frase = new JTextField("");
		frase.setBounds(50,300,300,20);
		this.add(frase);
		
		JButton boton = new JButton("Crear nuevo usuario");
		boton.setBounds(10,360,150,20);
		this.add(boton);
		boton.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) { AlmacenarDatos.addAdmib(name.getText(),last.getText(),user.getText(),pass.getText(), frase.getText());
		user.setText(""); pass.setText("" ); last.setText("" ); name.setText("" ); frase.setText(""); }});
	
		 boton = new JButton("Regresar");
		boton.setBounds(10,500,150,20);
		this.add(boton);
		boton.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) {dispose(); Principal p = new Principal();  }});
		
		this.setVisible(true);
		
	}
	
	//Editar usuarios 
	public void Editar() {
		JFrame jk = new JFrame();
		
		jk.setTitle("Editar usuarios");
		jk.setSize(500,700);
		jk.setLayout(null);
		jk.setLocationRelativeTo(null);
		
		
		JLabel lbl = new JLabel("Modificar usuario");
		lbl.setBounds(100,5,180,40);
		jk.add(lbl);
		
		
		//Buscar 
				lbl = new JLabel("Nombre del Usuario a editar: ");
				lbl.setBounds(10,50,180,40);
				jk.add(lbl);
				
				ModUser= new JTextField("");
				ModUser.setBounds(190,60,130,20);
				jk.add(ModUser);
				
				lbl = new JLabel("Usuario: ");
				lbl.setBounds(10,140,100,40);
				jk.add(lbl);
				
				ModNewUser = new JTextField("");
				ModNewUser.setBounds(100,150,130,20);
				jk.add(ModNewUser);
				
				lbl = new JLabel("Nombre: ");
				lbl.setBounds(10,175,100,40);
				jk.add(lbl);
				
				ModNom = new JTextField("");
				ModNom.setBounds(100,185,130,20);
				jk.add(ModNom);
				
				lbl = new JLabel("Apellido: ");
				lbl.setBounds(10,210,100,40);
				jk.add(lbl);
				
				ModApe = new JTextField("");
				ModApe.setBounds(100,220,130,20);
				jk.add(ModApe);
				
		//Botones		
				//JButton boton = new JButton("Buscar");
				//boton.setBounds(10,100,100,20);
				//jk.add(boton);
				//boton.addActionListener(new ActionListener() 
				//{public void actionPerformed(ActionEvent e) {jk.dispose(); Principal p = new Principal();}});
				
				JButton boton = new JButton("Eliminar");
				boton.setBounds(100,100,100,20);
				jk.add(boton);
				boton.addActionListener(new ActionListener() 
				{public void actionPerformed(ActionEvent e) {jk.dispose(); ds.EliminarUsuarioAdmin(); }});
				
				boton = new JButton("Ver");
				boton.setBounds(300,100,100,20);
				jk.add(boton);
				boton.addActionListener(new ActionListener() 
				{public void actionPerformed(ActionEvent e) { /* action */  UsuIndividual(ModUser.getText());  }});
				
				
				boton = new JButton("Modificar");
				boton.setBounds(100,260,100,20);
				jk.add(boton);
				boton.addActionListener(new ActionListener() 
				{public void actionPerformed(ActionEvent e) {jk.dispose(); ds.EditarAdmin(); System.out.println("modificar"); }});
				
				boton = new JButton("Reporte");
				boton.setBounds(300,550,150,20);
				jk.add(boton);
				boton.addActionListener(new ActionListener() 
				{public void actionPerformed(ActionEvent e) { reporte.ReporteUsuarios(); reporte.ReporteJuntar();}});
				
				
		//Tabla
				
		//Tbla(falta carga masciva, agragr y elimnar  apps )
		
		String[] columnNames = {"Name","Apellido","Usuario","Rol"};
		
		
		table = new JTable (AlmacenarDatos.tabla,columnNames);
		table.setBounds(50, 320, 400, 200);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(50, 320, 400, 200);
		jk.add(scrollPane);
		
		jk.setVisible(true) ;

	//Regresa al menu
		boton = new JButton("Regresar");
		boton.setBounds(10,550,150,20);
		jk.add(boton);
		boton.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) {jk.dispose(); Principal p = new Principal();}});
		
		jk.setVisible(true);
		
	}
	
	//Aplicaciones
	public void aplicaciones() {

		JFrame app = new JFrame();
		app.setTitle("Apliaciones");
		app.setSize(1100,1000);
		app.setLayout(null);
		app.setLocationRelativeTo(null);
		
		
	
		
		JLabel lbl = new JLabel("Modificar usuario");
		lbl.setBounds(600,5,180,40);
		app.add(lbl);
		
		
		//Buscar 
				 lbl = new JLabel("ID de la aplicacion");
				lbl.setBounds(460,50,180,40);
				app.add(lbl);
				
				idnormal = new JTextField("");
				idnormal.setBounds(565,100,130,20);
				app.add(idnormal);
				
				JButton boton = new JButton("Buscar");
				boton.setBounds(460,150,150,20);
				app.add(boton);
				boton.addActionListener(new ActionListener() 
				{public void actionPerformed(ActionEvent e) {
					
					ds.MOstrarApp();
					
					;}});
				
				
	//Botones
				
				 boton = new JButton("Modificar");
				boton.setBounds(460,400,150,20);
				app.add(boton);
				boton.addActionListener(new ActionListener() 
				{public void actionPerformed(ActionEvent e) {app.dispose(); ds.ActualizarCargas(); }});
				
				boton = new JButton("Eliminar");
				boton.setBounds(750,150,150,20);
				app.add(boton);
				boton.addActionListener(new ActionListener() 
				{public void actionPerformed(ActionEvent e) {app.dispose(); ds.EliminarCarga(); }});
				
				boton = new JButton("Reporte");
				boton.setBounds(900,890,150,20);
				app.add(boton);
				boton.addActionListener(new ActionListener() 
				{public void actionPerformed(ActionEvent e) {  reporte.ReporteApps(); reporte.ReporteJuntar();     }});
				
	// Agregar 
				
				lbl = new JLabel("Agregar Listado de aplicaciones");
				lbl.setBounds(100,10,200,40);
				app.add(lbl);
				
				lbl = new JLabel("Ingresar ruta de carga masiva");
				lbl.setBounds(10,60,180,40);
				app.add(lbl);
				
				ruta = new JTextField("");
				ruta.setBounds(10,100,350,20);
				app.add(ruta);
				
				boton = new JButton("Ingresar aplicaciones");
				boton.setBounds(10,150,200,20);
				app.add(boton);
				boton.addActionListener(new ActionListener() 
				{public void actionPerformed(ActionEvent e) {app.dispose(); cs.CARGAaplicaciones();}});
	
	//Cambios
				lbl = new JLabel("ID Nuevo:");
				lbl.setBounds(460,200,180,40);
				app.add(lbl);
				
				id = new JTextField("");
				id.setBounds(460,250,130,20);
				app.add(id);
				
				lbl = new JLabel("Titulo de la aplicacion");
				lbl.setBounds(460,300,180,40);
				app.add(lbl);
				
				title = new JTextField("");
				title.setBounds(460,350,130,20);
				app.add(title);
				
				lbl = new JLabel("Descargas de la aplicacion");
				lbl.setBounds(650,200,180,40);
				app.add(lbl);
					
				dowload = new JTextField("");
				dowload.setBounds(650,250,130,20);
				app.add(dowload);
					
					
				lbl = new JLabel("Descripcion de la aplicacion");
				lbl.setBounds(650,300,180,40);
				app.add(lbl);
						
				descripcion = new JTextField("");
				descripcion.setBounds(650,350,200,20);
				app.add(descripcion);	
				
				
				lbl = new JLabel("Precio de la aplicacion");
				lbl.setBounds(880,200,180,40);
				app.add(lbl);
					
				precio = new JTextField("");
				precio.setBounds(880,250,130,20);
				app.add(precio);
				
	//Regresa al menu
		boton = new JButton("Regresar");
		boton.setBounds(10,890,150,20);
		app.add(boton);
		boton.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) {app.dispose(); Principal p = new Principal();}});
		
		
		
		
		
		
		//Tabla
		//Tbla(falta carga masciva, agragr y elimnar  apps )
		
		String[] columnNames = {"ID","Titulo","img","Descargas","Descripcion","Precio"};
		Object[][] data = {
			    {"id_app", "title_app","img_app","Download_app", "Description_app","price_app"},
			   
			};
	if(cs.validez == 0) {
		
		table = new JTable (data,columnNames);
	}else if(cs.validez == 1){
		table = new JTable (cs.APPS,columnNames);
		
	}
System.out.println(cs.validez + "validez");
		table.setBounds(30, 450, 1000, 400);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(30, 450, 1000, 400);
		app.add(scrollPane);
		
		
		app.setVisible(true);
		
		
	}

	//Masiva Usuarios
	public void UsuariosCLientes() {
		JFrame jj = new JFrame();
		
		jj.setTitle("Carga Masiva Usuarios");
		jj.setSize(500,300);
		jj.setLayout(null);
		jj.setLocationRelativeTo(null);
		
		JLabel lbl = new JLabel("Ingresar CLientes");
		lbl.setBounds(100,5,180,40);
		jj.add(lbl);
		
		
		poppp= new JTextField("");
		poppp.setBounds(100,60,330,20);
		jj.add(poppp);
		
		//Regresa al menu
		JButton boton = new JButton("Regresar");
		boton.setBounds(10,200,150,20);
		jj.add(boton);
		boton.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) {jj.dispose(); Principal p = new Principal();}});
		
		boton = new JButton("Ingresar");
		boton.setBounds(190,100,150,20);
		jj.add(boton);
		boton.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) { cs.CargaCleintes();  }});
		
		jj.setVisible(true);
		
		
		
	}

	//Usuario individual
	public void UsuIndividual(String usuario) {
		int num;
		int op;
		String name="",apelido="",usu="",img="";
		
		
		
		for(int i =0;i<30;i++) {
			
			if(usuario.equals(Usuario_Cliente.Cliente[i][0])) {
				
				usu = Usuario_Cliente.Cliente[i][0];
				name = Usuario_Cliente.Cliente[i][1];
				apelido = Usuario_Cliente.Cliente[i][2];
				img = Usuario_Cliente.Cliente[i][5];
			
			}
			
		}
		
		for(int i =0;i<10;i++) {
			
			if(usuario.equals( AlmacenarDatos.Administradores[i][2])) {
				
				usu = AlmacenarDatos.Administradores[i][2];
				name = AlmacenarDatos.Administradores[i][0];
				apelido = AlmacenarDatos.Administradores[i][1];
				img = "pp.jpg";
			}
		}
		
		JFrame jj = new JFrame();
		
		jj.setTitle("Usuario Individual");
		jj.setSize(500,350);
		jj.setLayout(null);
		jj.setLocationRelativeTo(null);
		
		JLabel lbl = new JLabel("Usuario Individual");
		lbl.setBounds(200,5,180,40);
		jj.add(lbl);
		
		
		lbl = new JLabel(usu);
		lbl.setBounds(200,30,180,40);
		jj.add(lbl);
		
		
		lbl = new JLabel(name);
		lbl.setBounds(200,180,180,40);
		jj.add(lbl);
		
		lbl = new JLabel(apelido);
		lbl.setBounds(200,210,180,40);
		jj.add(lbl);
		
	
		
		
		ImageIcon imagen = new ImageIcon(img);
		JLabel etiqueta = new JLabel();
		etiqueta.setBounds(190,70,100,100);
		etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta.getWidth(),etiqueta.getHeight(),Image.SCALE_SMOOTH )));
		jj.add(etiqueta);
		
		
		//Regresa al menu
		JButton boton = new JButton("Regresar");
		boton.setBounds(10,250,150,20);
		jj.add(boton);
		boton.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) {jj.dispose(); Principal p = new Principal();}});
				
		jj.setVisible(true);

	}
	
	
}