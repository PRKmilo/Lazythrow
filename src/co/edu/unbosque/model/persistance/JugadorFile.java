package co.edu.unbosque.model.persistance;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import co.edu.unbosque.model.JuegoDTO;
import co.edu.unbosque.model.JugadorDTO;

import co.edu.unbosque.model.PartidaDTO;

public class JugadorFile {
	private  String ruta="./Data/jugador2.out";
	private String ruta2="./Data/partida.out";
	private String ruta3="./Data/Juego.out";
	private File f; 
	private FileOutputStream fos;     
	private DataOutputStream dos;
	private FileInputStream fis;     
	private DataInputStream dis;
	private JugadorDTO jugador;
	private JugadorDAO jugador2;
	
	
	private ArrayList<PartidaDTO> datos2;
	private JuegoDTO[] datos3;
	
	public int escribirArchivoJugador(ArrayList<JugadorDTO> Staff_jugadores) {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta));
			salida.writeObject(Staff_jugadores);
			salida.close();
		}catch(IOException e) {
			return -1;
		}
		return 0;
	}
	
	public JugadorDAO getJugador2() {
		return jugador2;
	}

	public void setJugador2(JugadorDAO jugador2) {
		this.jugador2 = jugador2;
	}

	public ArrayList<JugadorDTO> leerArchivoEmpleado() {
		ArrayList<JugadorDTO> nomina = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta));
			nomina = (ArrayList<JugadorDTO>)in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return nomina;
	}
	
	
	
	public int escribirpartida(ArrayList<PartidaDTO> partida) {
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta2));
			salida.writeObject(partida);
			salida.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return -1;
		}
		return 0;
	}
	
	
	public ArrayList<PartidaDTO> leerpartida1() {
		ArrayList<PartidaDTO> partida = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta2));
			partida = (ArrayList<PartidaDTO>)in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return partida;
	}
	
	
	public int escribirJuego(ArrayList<JuegoDTO> listaDeJuegos) {
		
		try {
			ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(ruta3));
			salida.writeObject(listaDeJuegos);
			salida.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return -1;
		}
		return 0;
	}
	
	
	public ArrayList<JuegoDTO>  leerJuego() {
		ArrayList<JuegoDTO> juego = null;
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta3));
			juego = (ArrayList<JuegoDTO>)in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			return null;
		}
		return juego;
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

	



	public JuegoDTO[] getDatos3() {
		return datos3;
	}

	public void setDatos3(JuegoDTO[] datos3) {
		this.datos3 = datos3;
	}
	
	
}
