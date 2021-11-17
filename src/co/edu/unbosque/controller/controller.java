package co.edu.unbosque.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.persistance.JugadorDAO;
import co.edu.unbosque.model.persistance.JugadorFile;
import co.edu.unbosque.view.Formulario;
import co.edu.unbosque.view.Juego;
import co.edu.unbosque.view.Partida;
import co.edu.unbosque.view.View;

public class controller implements ActionListener{
	
	private JugadorFile jf;
	
	//Atributos que vienen de Vista - GUI
	private View gui;
	

	public controller() {
		jf=new JugadorFile();
		
		

		//aqui van los constructores tanto de Mundo, como de Vista

		
		//se Modifica contructor de InterfazGUI para que reciba como parámetro la instancia de Controlador
		gui = new View(this);
		gui.setVisible(true); //hacer visible la ventana principal
		

	}
	public void asignar_oyentes() {
		
		gui.getPanelEntrada().getButEscribir().addActionListener(this);;
		gui.getPanelEntrada().getButLeer().addActionListener(this);
		gui.getPanelEntrada().getButLeerReg().addActionListener(this);
		gui.getPanelEntrada().getButEscribirReg().addActionListener(this);
	}

	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		
		 
		
		
		
		if (evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR)) {
			
			System.out.println("linea 36");
			gui.getForm().setVisible(true);
				
			
			
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().JUEGO)) {
			
			gui.getJuego().setVisible(true);
		}

		if(evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR_REG)) {
			
			gui.mostrarJugadores(jf.leerArchivoEmpleado());
		}

		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER_REG)) {
			gui.getPart().setVisible(true);
		}
		
		
	}
	
	
	
	

}
