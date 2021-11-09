package co.edu.unbosque.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import co.edu.unbosque.model.Binarios;
import co.edu.unbosque.model.persistance.JugadorFile;
import co.edu.unbosque.view.Formulario;
import co.edu.unbosque.view.View;
import co.edu.unbosque.view.view2;

public class controller implements ActionListener{
	private static  Formulario form;
	private Binarios bd;
	private JugadorFile jf;

	//Atributos que vienen de Vista - GUI
	private View gui;
	private view2 gui2;

	public controller() {
		jf=new JugadorFile();
		form=new Formulario();

		//aqui van los constructores tanto de Mundo, como de Vista

		bd = new Binarios();
		//se Modifica contructor de InterfazGUI para que reciba como parámetro la instancia de Controlador
		gui = new View(this);
		gui.setVisible(true); //hacer visible la ventana principal
		b_registrarActionPerformed(null);

	}
	public void asignar_oyentes() {
		form.getJbt().addActionListener(this);
	}

	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		String resultado;
		 
		System.out.println("esta es la accion:");
		System.out.println(evento.getActionCommand());
		
		
		if (evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR)) {
			
			System.out.println("linea 36");
			form.setVisible(true);
			String g=form.getJbt().getActionCommand();
			System.out.println(g);
			System.out.println(evento.getActionCommand()+" este es el comando accion");	
			
		}
		if(evento.getActionCommand().equals(form.getRegistrar())) {
			System.out.println("se espicho este boton");
		}
		if(evento.getActionCommand().equals(gui.getPanelEntrada().JUEGO)) {
			
		}

		if(evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR_REG)) {
			
		}

		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER_REG)) {
			
		}
		
		
	}
	private void b_registrarActionPerformed(ActionEvent e) {
		if(form.getJbt().isSelected()) {
			System.out.println("el boton registrar fue seleccionado");
		}
	}
	

}
