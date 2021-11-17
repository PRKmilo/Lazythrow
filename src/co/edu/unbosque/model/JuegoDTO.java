package co.edu.unbosque.model;
import java.io.Serializable;
public class JuegoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String tipo;
	//Este es el ID
	
	public JuegoDTO(String nombre, String tipo ) {
		this.nombre = nombre;
		this.tipo = tipo;
	
	}
	
	

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return tipo;
	}

	public void setCargo(String cargo) {
		this.tipo = tipo;
	}

	
}
