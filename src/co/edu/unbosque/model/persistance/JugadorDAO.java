package co.edu.unbosque.model.persistance;

import java.util.ArrayList;

import co.edu.unbosque.model.JugadorDTO;

public class JugadorDAO {
	private ArrayList<JugadorDTO>Staff_jugadores;
	private JugadorFile Archivo_jugador;
	public JugadorDAO() {
		Staff_jugadores= new ArrayList<JugadorDTO>();
		Archivo_jugador=new JugadorFile();
	}
	
	public void Agregar_jugador(JugadorDTO jugador) {
		ArrayList<JugadorDTO> nomina1=new ArrayList<JugadorDTO>();
		if(nomina1!=null) {
			Staff_jugadores=nomina1;
		}
		Staff_jugadores.add(jugador);
		Archivo_jugador.escribirArchivoJugador(Staff_jugadores);
	}
	public boolean Existe(String id) {
		boolean respuesta=false;
		if(Staff_jugadores==null) {
			respuesta=false;
		}
		else {
			for(int i=0;i<Staff_jugadores.size();i++) {
				if(Staff_jugadores.get(i).getId().equals(id)) {
					respuesta=true;
				}
			}
		}
		return respuesta;
	}
	public ArrayList<JugadorDTO> getNomina() {
		return Staff_jugadores;
	}

	
	

}
