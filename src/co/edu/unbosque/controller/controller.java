package co.edu.unbosque.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Binarios;
import co.edu.unbosque.view.Formulario;
import co.edu.unbosque.view.View;

public class controller implements ActionListener{
	private Formulario form;
	private Binarios bd;

	//Atributos que vienen de Vista - GUI
	private View gui;

	public controller() {

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
			resultado = bd.getBf().escribirArchivoBinario();
			gui.escribirMensaje(resultado);
		}

		if(evento.getActionCommand().equals(gui.getPanelEntrada().JUEGO)) {
			bd.getBf().leerArchivoBinario();
			gui.mostrarCifras(
					bd.getBf().getREGISTROS(), 
					bd.getBf().getNumeros(), 
					bd.getBf().getValores());
		}

		if(evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR_REG)) {
			gui.escribirMensaje(bd.getBf().escribirRegistro());
		}

		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER_REG)) {
			bd.getBf().leerRegistro();	
			gui.mostrarRegistros(3, 
					bd.getBf().getDatos());
		}
	}

}
