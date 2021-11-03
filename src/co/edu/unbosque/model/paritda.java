package co.edu.unbosque.model;

public class paritda {
   private String jugador1;
   private String jugador2;
   private String tipopartida;
   private Double puntaje1;
   private Double puntaje2;
   
public String getJugador1() {
	return jugador1;
}
public void setJugador1(String jugador1) {
	this.jugador1 = jugador1;
}
public String getJugador2() {
	return jugador2;
}
public void setJugador2(String jugador2) {
	this.jugador2 = jugador2;
}
public String getTipopartida() {
	return tipopartida;
}
public void setTipopartida(String tipopartida) {
	this.tipopartida = tipopartida;
}
public Double getPuntaje1() {
	return puntaje1;
}
public void setPuntaje1(Double puntaje1) {
	this.puntaje1 = puntaje1;
}
public Double getPuntaje2() {
	return puntaje2;
}
public void setPuntaje2(Double puntaje2) {
	this.puntaje2 = puntaje2;
}
@Override
public String toString() {
	return "paritda [jugador1=" + jugador1 + ", jugador2=" + jugador2 + ", tipopartida=" + tipopartida + ", puntaje1="
			+ puntaje1 + ", puntaje2=" + puntaje2 + "]";
}
   
}
