package co.edu.unbosque.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Binarios;
import co.edu.unbosque.model.persistance.JugadorFile;
import co.edu.unbosque.view.Formulario;
import co.edu.unbosque.view.Juego;
import co.edu.unbosque.view.Partida;
import co.edu.unbosque.view.View;
import co.edu.unbosque.view.view2;

public class controller implements ActionListener{
	private static  Formulario form;
	private Binarios bd;
	private JugadorFile jf;
	private Juego juego;
	private Partida part;

	//Atributos que vienen de Vista - GUI
	private View gui;
	

	public controller() {
		jf=new JugadorFile();
		form=new Formulario();
		juego=new Juego();
		part=new Partida();
		

		//aqui van los constructores tanto de Mundo, como de Vista

		bd = new Binarios();
		//se Modifica contructor de InterfazGUI para que reciba como parámetro la instancia de Controlador
		gui = new View(this);
		gui.setVisible(true); //hacer visible la ventana principal
		

	}
	public void asignar_oyentes() {
		form.getJbt().addActionListener(this);
		gui.getPanelEntrada().getButEscribir().addActionListener(this);;
		gui.getPanelEntrada().getButLeer().addActionListener(this);
		gui.getPanelEntrada().getButLeerReg().addActionListener(this);
		gui.getPanelEntrada().getButEscribirReg().addActionListener(this);
	}

	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		String resultado;
		 
		System.out.println("esta es la accion:");
		System.out.println(evento.getActionCommand());
		
		
		if (evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR)) {
			
			System.out.println("linea 36");
			form.setVisible(true);
				
			
			
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().JUEGO)) {
			
			juego.setVisible(true);
		}

		if(evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR_REG)) {
			jf.leerRegistro();
			System.out.println(jf.getDatos()+" este es el array de datos");
			gui.mostrarJugadores(3, jf.getDatos());
		}

		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER_REG)) {
			part.setVisible(true);
		}
		
		
	}
	
	
	
	

}
