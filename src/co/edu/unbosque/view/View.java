package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import co.edu.unbosque.controller.controller;
import co.edu.unbosque.model.JugadorDTO;


public class View extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private PanelEntrada panelEntrada; //Se declara un objeto de tipo PanelEntrada
	private PanelResultados panelResultados; //Se declara un objeto de tipo PanelResultados
	private PanelRegistro panelRegistro;
	private Formulario form;
	private Juego juego;
	private Partida part; 
	
	

	public View(controller control) 
	{
		// Definición de los parámetros básicos de la ventana principal
		

		setSize(500,400); //tamaño en ancho y alto en pixeles
		setResizable(false); //Se puede cambiar el tamaño de la ventana?
		setTitle("Título de la Ventana Principal"); //tìtulo de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE);//qué debe hacer si cierra la ventana
		setLocationRelativeTo(null); //coloca la ventana al centro de la pantalla
		//Establece el layout (lienzo) que vamos a utilizar dentro de la ventana principal.
		setLayout( new BorderLayout() );
		//Se agrega al layout en la parte NORTH, el panel de entrada definido
		panelEntrada = new PanelEntrada();
		add(panelEntrada,BorderLayout.NORTH);
		//Se agrega al layout en la parte CENTER, el panel de entrada definido
		panelResultados = new PanelResultados();
		add(panelResultados,BorderLayout.CENTER);
		panelRegistro = new PanelRegistro();
		add(panelRegistro,BorderLayout.SOUTH);
		juego=new Juego();
		part=new Partida();
		setForm(new Formulario());
		

		//se agrega al boton ActionListener del objeto de Controlador - cambio
		
		panelEntrada.getButEscribir().addActionListener(control);
		panelEntrada.getButLeer().addActionListener(control);
		panelEntrada.getButLeerReg().addActionListener(control);
		panelEntrada.getButEscribirReg().addActionListener(control);
	
	}

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	public Partida getPart() {
		return part;
	}

	public void setPart(Partida part) {
		this.part = part;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public PanelEntrada getPanelEntrada() {
		return panelEntrada;
	}

	public void setPanelEntrada(PanelEntrada panelEntrada) {
		this.panelEntrada = panelEntrada;
	}

	public PanelRegistro getPanelRegistro() {
		return panelRegistro;
	}

	public void setPanelRegistro(PanelRegistro panelRegistro) {
		this.panelRegistro = panelRegistro;
	}

	public PanelResultados getPanelResultados() {
		return panelResultados;
	}

	public void setPanelResultados(PanelResultados panelResultados) {
		this.panelResultados = panelResultados;
	}

	public void escribirMensaje(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "archivos binarios", JOptionPane.INFORMATION_MESSAGE);
	}

	public void mostrarJugadores(ArrayList<JugadorDTO> Staff_jugadores) {
		for (int i= 0 ; i<Staff_jugadores.size() ; i++) {
			getPanelResultados().getTxtMonto().append(String.valueOf(Staff_jugadores.get(i).getNombre())+"\n");
			getPanelResultados().getTxtValores().append(String.valueOf(Staff_jugadores.get(i).getPuntaje())+"\n");
		}	
	}	


	public Formulario getForm() {
		return form;
	}

	public void setForm(Formulario form) {
		this.form = form;
	}

}
