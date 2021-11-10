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
	
	public String escribir_registroJugador(String nombre,int edad,String genero,int puntaje) {
		String respuesta="Registro de jugador ingresado";
		Jugador staff[]=new Jugador[3];
		staff[0]=creando_jugador(nombre,edad,genero,puntaje);
		staff[1]=creando_jugador(nombre,edad,genero,puntaje);
		staff[2]=creando_jugador(nombre,edad,genero,puntaje);
		
		
		
		try {
			System.out.println("linea 39");
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ruta));
			System.out.println("linea 41");
			for (int i=0;i<staff.length;i++) {
				System.out.println(staff[i]+"es es el objeto num "+i);
			}
			out.writeObject(staff);
			System.out.println("linea 43");
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
	public String escribir_partida(String jugador1,String jugador2,String juego,double puntaje1,double puntaje2) {
		String respuesta="Registro de partida";
		paritda staff2[]=new paritda[3];
		staff2[0]=new paritda("Jorge","camilo","parques",0.0,0.0);
		staff2[1]=new paritda("Esteban","fercho","piquis",0.0,0.0);
		staff2[2]=creando_partida( jugador1, jugador2, juego, puntaje1, puntaje2);
		
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
	public paritda creando_partida(String jugador1,String jugador2,String juego,double puntaje1,double puntaje2) {
		return new paritda(jugador1,jugador2,juego,puntaje1,puntaje2);
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
	
	public String escribirJuego(String tipo,String nombre) {
		String respuesta="Registro del Juego";
		juego staff[]=new juego[3];
		staff[0]=creando_juego(tipo,nombre);
		
		
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
	
	public juego creando_juego(String tipo,String nombre) {
		return new juego( nombre ,tipo);
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
