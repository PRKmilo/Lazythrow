package co.edu.unbosque.model.persistance;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.PartidaDTO;
import co.edu.unbosque.view.Partida;

public class PartidaDAO {
	private ArrayList<PartidaDTO> par;
	private JugadorFile jua;

	public PartidaDAO() {
		par = new ArrayList<PartidaDTO>();
	jua = new JugadorFile();
	}
	public PartidaDTO buscarpartida(String Jugador) {
	par = jua.leerpartida1();
		for(PartidaDTO juego : par) {
			if(juego.getJugador1().equals(Jugador)) {
				return juego;
			}
			
		}
		return null;	
	}
	public void agregarpartida(PartidaDTO jugador){//Operación C - CRUD
		ArrayList<PartidaDTO> nomina1=new ArrayList<PartidaDTO>();
		if(nomina1!=null) {
			par=nomina1;
		}
		par.add(jugador);
		JOptionPane.showMessageDialog(null,jua.escribirpartida(par));
	}
	public ArrayList<PartidaDTO> getPar() {
		return par;
	}
	public void setPar(ArrayList<PartidaDTO> par) {
		this.par = par;
	}
	public JugadorFile getJua() {
		return jua;
	}
	public void setJua(JugadorFile jua) {
		this.jua = jua;
	}
	
}
