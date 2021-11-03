package co.edu.unbosque.model;

import java.io.File;

public class Jugador {
	
	private String nombre;
	private int edad;
	private String genero;
	private int puntaje;
		
		public Jugador(String string, int i, String string2, int j) {
		// TODO Auto-generated constructor stub
			this.nombre= string;
			this.edad =i;
			this.genero=string2;
			this.puntaje=j;
	}
		public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}
	
	

}
