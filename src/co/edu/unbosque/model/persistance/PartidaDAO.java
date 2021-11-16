package co.edu.unbosque.model.persistance;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.paritdaDTO;
import co.edu.unbosque.view.Partida;

public class PartidaDAO {
	private ArrayList<paritdaDTO> par;
	private JugadorFile jua;

	public PartidaDAO() {
		par = new ArrayList<paritdaDTO>();
	jua = new JugadorFile();
	}
	public paritdaDTO buscarpartida(String Jugador) {
	par = jua.leerpartida1();
		for(paritdaDTO juego : par) {
			if(juego.getJugador1().equals(Jugador)) {
				return juego;
			}
			
		}
		return null;	
	}
	public void agregarpartida(paritdaDTO jugador){//Operación C - CRUD
		ArrayList<paritdaDTO> nomina1=new ArrayList<paritdaDTO>();
		if(nomina1!=null) {
			par=nomina1;
		}
		par.add(jugador);
		JOptionPane.showMessageDialog(null,jua.escribirpartida(par));
	}
	public ArrayList<paritdaDTO> getPar() {
		return par;
	}
	public void setPar(ArrayList<paritdaDTO> par) {
		this.par = par;
	}
	public JugadorFile getJua() {
		return jua;
	}
	public void setJua(JugadorFile jua) {
		this.jua = jua;
	}
	
}
