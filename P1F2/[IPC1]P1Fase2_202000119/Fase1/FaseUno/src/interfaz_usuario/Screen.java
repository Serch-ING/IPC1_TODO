package interfaz_usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import interfaz_admin.ingreso;

public class Screen {

	

	
	//Clientes
	public  JTextField Usuario;
	public  JTextField Nombre;
	public  JTextField Apellido;
	public  JTextField Contrasena;
	public  JTextField Con_Contrasena;
	public  JTextField Frase;
	public  JTextField img;
	public  JTextField edad;
	public  JTextField sexo;
	//Aux
	public int old;

	
	
	public void NuevoUsuario() {
		
		JFrame js = new JFrame();
		//Freame
		js.setTitle("Crear Usuario");
		js.setSize(600,500);
		js.setLayout(null);
		js.setLocationRelativeTo(null);
		
		//Label 
		JLabel lbl = new JLabel("Crear una cuenta!");
		lbl.setBounds(250,10,200,40);
		js.add(lbl);
		
		//TextFiel
		Nombre = new JTextField("Nombre");
		Nombre.setBounds(40,50,250,30);
		js.add(Nombre);
		
		Apellido = new JTextField("Apellido");
		Apellido.setBounds(300,50,250,30);
		js.add(Apellido);
		
		Usuario = new JTextField("Usuario");
		Usuario.setBounds(40,90,250,30);
		js.add(Usuario);
		
		img = new JTextField("Ruta_magen");
		img.setBounds(300,90,250,30);
		js.add(img);
		
		Contrasena = new JTextField("Contraseña");
		Contrasena.setBounds(40,130,250,30);
		js.add(Contrasena);
		
		Con_Contrasena = new JTextField("Confirmar_Contraseña");
		Con_Contrasena.setBounds(300,130,250,30);
		js.add(Con_Contrasena);
		
		Frase = new JTextField("Frase");
		Frase.setBounds(40,170,500,30);
		js.add(Frase);
		
		edad = new JTextField("Edad");
		edad.setBounds(40,210,250,30);
		js.add(edad);
		
		sexo = new JTextField("Sexo");
		sexo.setBounds(300,210,250,30);
		js.add(sexo);
		
		//Botones
		JButton bt = new JButton("Ya tienes una cuenta? Iniciar sesion");
		bt.setBounds(150,320,250,20);
		js.add(bt);
		bt.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) { js.dispose();  ingreso join = new ingreso(); }});
		
		
		bt = new JButton("Registrar");
		bt.setBounds(230,275,100,20);
		js.add(bt);
		bt.addActionListener(new ActionListener() 
		{public void actionPerformed(ActionEvent e) {
			
			old = Integer.parseInt (edad.getText());
			
			Usuario_Cliente.confir(Usuario.getText(), Nombre.getText(), Apellido.getText(), Contrasena.getText(),Con_Contrasena.getText() , Frase.getText(), img.getText(), edad.getText(), sexo.getText());
			
		}});
		
		
		
		js.setVisible(true);
		
	}
	
	
}
