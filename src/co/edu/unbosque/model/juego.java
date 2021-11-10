package co.edu.unbosque.model;

import java.io.Serializable;

public class juego implements Serializable{

	String nombre;
    String tipo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public juego(String string, String tipo) {
		
		this.nombre =string ;
		this.tipo = tipo;
		// TODO Auto-generated constructor stub
	}
	
	
}
