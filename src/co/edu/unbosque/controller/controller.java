package co.edu.unbosque.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Binarios;
import co.edu.unbosque.model.persistance.JugadorFile;
import co.edu.unbosque.view.Formulario;
import co.edu.unbosque.view.View;

public class controller implements ActionListener{
	private Formulario form;
	private Binarios bd;
	private JugadorFile jf;

	//Atributos que vienen de Vista - GUI
	private View gui;

	public controller() {
		jf=new JugadorFile();
		form=new Formulario();

		//aqui van los constructores tanto de Mundo, como de Vista

		bd = new Binarios();
		//se Modifica contructor de InterfazGUI para que reciba como parámetro la instancia de Controlador
		gui = new View(this);
		gui.setVisible(true); //hacer visible la ventana principal

	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		String resultado;
		if (evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR)) {
			form=new Formulario();
			form.setVisible(true);
			if(evento.getActionCommand().equals("REGISTRAR")) {
				String nombre=form.getTextField().getText();
			     String edad=form.getTextField_1().getText();
			    
			     String puntaje=form.getTextField_2().getText();
			     String genero=form.getTextField_3().getText();
			     
			    jf.escribir_registroJugador(nombre, 12, genero, 13);
			    System.out.println("se oprimio el boton");
			}	
			
		}

		if(evento.getActionCommand().equals(gui.getPanelEntrada().JUEGO)) {
			
		}

		if(evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR_REG)) {
			
		}

		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER_REG)) {
			
		}
	}

}
