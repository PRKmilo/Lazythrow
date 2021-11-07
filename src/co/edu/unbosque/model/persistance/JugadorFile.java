package co.edu.unbosque.model.persistance;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import co.edu.unbosque.model.juego;
import co.edu.unbosque.model.Jugador;
import co.edu.unbosque.model.paritda;

public class JugadorFile {
	private Jugador player1;
	private  String ruta="./Data/jugador.out";
	private String ruta2="./Data/partida.out";
	private String ruta3="./Data/juego.out";
	private File f; 
	private FileOutputStream fos;     
	private DataOutputStream dos;
	private FileInputStream fis;     
	private DataInputStream dis;
	private Jugador[] datos;
	private paritda[] datos2;
	private juego[] datos3;
	
	public String escribir_registro(String nombre,int edad,String genero,int puntaje) {
		String respuesta="Registro de jugador ingresado";
		Jugador staff[]=new Jugador[3];
		staff[0]=creando_jugador(nombre,edad,genero,puntaje);
		
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));
			out.writeObject(staff);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			respuesta = "Error de IO";
		}
		return respuesta;
	}
	
	public void leerRegistro() {
        ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(ruta));
	        datos = (Jugador[])in.readObject();
	        in.close();
	        

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Jugador creando_jugador(String nombre,int edad,String genero,int puntaje) {
		return new Jugador(nombre,edad,genero,puntaje);
	}
	public String escribir_partida() {
		String respuesta="Registro de partida";
		paritda staff2[]=new paritda[3];
		staff2[0]=new paritda("Jorge","camilo","parques",0.0,0.0);
		staff2[1]=new paritda("Esteban","fercho","piquis",0.0,0.0);
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta2));
			out.writeObject(staff2);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			respuesta = "Error de IO";
		}
		return respuesta;
	}
	public void leerpartida() {
        ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(ruta2));
	        datos2 = (paritda[])in.readObject();
	        in.close();
	        

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String escribirJuego() {
		String respuesta="Registro del Juego";
		juego staff[]=new juego[3];
		staff[0]=new juego("tipo juego",0.0);
		staff[1]=new juego("nombre juego",0.0);
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta3));
			out.writeObject(staff);
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			respuesta = "Error de IO";
		}
		return respuesta;
	}
	
	public void leerJuego() {
        ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(ruta3));
			datos3 = (juego[])in.readObject();
	        in.close();
	        

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Jugador getPlayer1() {
		return player1;
	}

	public void setPlayer1(Jugador player1) {
		this.player1 = player1;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public File getF() {
		return f;
	}

	public void setF(File f) {
		this.f = f;
	}

	public FileOutputStream getFos() {
		return fos;
	}

	public void setFos(FileOutputStream fos) {
		this.fos = fos;
	}

	public DataOutputStream getDos() {
		return dos;
	}

	public void setDos(DataOutputStream dos) {
		this.dos = dos;
	}

	public FileInputStream getFis() {
		return fis;
	}

	public void setFis(FileInputStream fis) {
		this.fis = fis;
	}

	public DataInputStream getDis() {
		return dis;
	}

	public void setDis(DataInputStream dis) {
		this.dis = dis;
	}

	public Jugador[] getDatos() {
		return datos;
	}

	public void setDatos(Jugador[] datos) {
		this.datos = datos;
	}
	
	
}
