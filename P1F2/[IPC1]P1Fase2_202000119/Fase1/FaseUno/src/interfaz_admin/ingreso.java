package interfaz_admin;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import interfaz_admin.Principal;
import interfaz_usuario.Screen;
import interfaz_usuario.Usuario_Cliente;
import save_admin.AlmacenarDatos;
import save_admin.datosinteracciones;



public class ingreso extends JFrame {
	static datosinteracciones ds = new datosinteracciones();
 public static int nousuario;
	JTextField username;
	JPasswordField password;
	JButton boton;
	Color fondo = new java.awt.Color(204,166,166);

	Pantallas pan = new Pantallas();
	Screen screen = new Screen();
	
	
	static int op=1;
	public ingreso() {
		
		
		
		//Ventana
		this.setTitle("Login");
		this.setSize(400,400);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		//Label
		JLabel lbl = new JLabel("Usuario :");
		lbl.setBounds(100,10,100,40);
		this.add(lbl);
		lbl = new JLabel("Password :");
		lbl.setBounds(100,60,100,40);
		this.add(lbl);
		JLabel lbrecurperar = new JLabel("Recuperar Contraseña");
		lbrecurperar.setBounds(100,150,130,40);
		this.add(lbrecurperar);
		JLabel lbrecrear = new JLabel("Crear un cuenta");
		lbrecrear.setBounds(100,200,130,40);
		this.add(lbrecrear);
		
		//Maouse lsitener
		MouseListener RecuperarContrasena = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
			
			RecuperarContrsna();}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}};
		
		MouseListener CrearUsuario = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) { 
				System.out.println("crear");
				dispose();
				screen.NuevoUsuario();
				}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}};
		
		
		lbrecurperar.addMouseListener(RecuperarContrasena);
		lbrecrear.addMouseListener(CrearUsuario);
		
		//Textbox
		
		username = new JTextField("");
		username.setBounds(180,23,100,20);
		password = new JPasswordField("");
		password.setBounds(180,73,100,20);
		boton = new JButton("Iniciar Sesion");
		boton.setBounds(125,120,150,20);
		this.add(boton);
		this.add(username);
		this.add(password);
		this.getContentPane().setBackground(fondo);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Salir
		JButton bt = new JButton("Salir");
		bt.setBounds(10,320,100,20);
		this.add(bt);
		bt.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) {System.exit(0); }});
		
		this.setVisible(true);
		
		boton.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) {abrirventana();}});
		
	
		
		}
		
	
	//Abrir la ventana principal
	public void abrirventana() {
		op=0;
		for(int i=0;i<30;i++) {

				if(this.username.getText().equals(Usuario_Cliente.Cliente[i][0])  && this.password.getText().equals(Usuario_Cliente.Cliente[i][3])) {
					this.dispose();
					Pantallas.Contrasena = this.password.getText();
					
					nousuario = i;
					op=1;
					inicio();
					break;
					
				}
			
		if(i<10) {
			if(this.username.getText().equals(AlmacenarDatos.Administradores[i][2])  && this.password.getText().equals(AlmacenarDatos.Administradores[i][3])) {
				this.dispose();
				Pantallas.Contrasena = this.password.getText();
				op=1;
				nousuario = i;
				
				Principal p = new Principal();
				break;
					
		}
		
		
		}

			
		}
			
			if(op==0) {
				
				JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
	
			}
			
			
		
		
			
		
		op=1;
	}
	
	//PANTALLA DE INICO
	public static void inicio() {
		JFrame js= new JFrame ();
		
		//Ventana
		js.setTitle("Inicio");
		js.setSize(400,200);
		js.setLayout(null);
		js.setLayout(null);
		js.setLocationRelativeTo(null);
		
		
		//Botones
		JButton boton = new JButton("Perfil");
		boton.setBounds(30,50,130,20);
		boton.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) { js.dispose(); Perfil();  }});
		js.add(boton);
		
		boton = new JButton("Tienda");
		boton.setBounds(200,50,130,20);
		boton.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) {js.dispose(); 
		
		ventana ven = new ventana();
		ven.setVisible(true);
		
		}});
		js.add(boton);
		
	
		
		//visibel 
		js.setVisible(true);
		
	}
	
	
	
	
	//Actualizacion de usuario
	static JTable table;
	public static  String aux[][] = new String[1][9];

	public static JTextField contrsena;
	public static JTextField nombre;
	public static JTextField apellido;
	
	public static String Usuario;


	
	
	
	//PerfilAdmin
	public static void Perfil() {
		JFrame js = new JFrame();
		String img = "";
		
		Usuario = Usuario_Cliente.Cliente[ingreso.nousuario][0];
	
	for(int i=0; i<30;i++) {
		
		if(Usuario_Cliente.Cliente[i][0] != null) {
		
		if(Usuario.equals(Usuario_Cliente.Cliente[i][0])) {
			
			aux[0][0] =  Usuario_Cliente.Cliente[i][0];
			aux[0][1] =  Usuario_Cliente.Cliente[i][1];
			aux[0][2] =  Usuario_Cliente.Cliente[i][2];
			aux[0][3] =  Usuario_Cliente.Cliente[i][3];
			aux[0][4] =  Usuario_Cliente.Cliente[i][4];
			aux[0][5] =  Usuario_Cliente.Cliente[i][5];
			aux[0][6] =  Usuario_Cliente.Cliente[i][6];
			aux[0][7] =  Usuario_Cliente.Cliente[i][7];
			aux[0][8] =  Usuario_Cliente.Cliente[i][8];
			img =aux[0][5];
			}		
		
		}
	}
	
		
		
		js.setVisible(true);
		js.setTitle("Loginas");
		js.setSize(1100,550);
		js.setLayout(null);
		js.setLocationRelativeTo(null);
		
		JLabel lbl = new JLabel("Hola! " + Usuario);
		System.out.println(Usuario);
		lbl.setBounds(10,10,130,40);
		js.add(lbl);
		
		lbl = new JLabel("Admin");
		lbl.setBounds(10,30,130,40);
		js.add(lbl);
		
		
		
		ImageIcon imagen = new ImageIcon(img);
		JLabel etiqueta = new JLabel();
		etiqueta.setBounds(10,70,100,100);
		etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta.getWidth(),etiqueta.getHeight(),Image.SCALE_SMOOTH )));
		js.add(etiqueta);
		
		//Tbla
	
		String[] columnNames = {"Usuario","Nombre","Apellido","Contrasena","Frase","img","Edad","Sexo","rol"};
		
	
				
				table = new JTable (aux,columnNames);
				table.setBounds(150, 40, 800, 70);
				JScrollPane scrollPane = new JScrollPane(table);
				scrollPane.setBounds(150, 40, 800, 70);
				js.add(scrollPane);
				
					
		
		
	
		JButton boton = new JButton("Regresar");
		boton.setBounds(5,450,150,20);
		js.add(boton);
		boton.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) {js.dispose(); inicio();  }});
		
		lbl = new JLabel("Cambio de nombre");
		lbl.setBounds(190,200,150,40);
		js.add(lbl);
		
		nombre = new JTextField("");
		nombre.setBounds(200,250,130,20);
		js.add(nombre);
		
		
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
		
		
	

		
		boton = new JButton("Editar credenciales");
		boton.setBounds(400,150,200,20);
		js.add(boton);
		boton.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) {
			js.dispose();
		
			ds.actializacionCliente();
	
			
		}});
		
		
				
	}
	
	
	//Recupeara contrasena
	public void RecuperarContrsna() {
		this.dispose();
		
		pan.Recuperar();
		
	}
	
	}