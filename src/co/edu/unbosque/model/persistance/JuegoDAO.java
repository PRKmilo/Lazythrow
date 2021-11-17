package co.edu.unbosque.model.persistance;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import co.edu.unbosque.model.persistance.JugadorFile;
import co.edu.unbosque.model.JuegoDTO;
public class JuegoDAO {
	private ArrayList<JuegoDTO> nomina;
	private JugadorFile archivoEmpleado;
	private JuegoDTO juegoDto;

	public JuegoDAO() {
		juegoDto = new JuegoDTO(null, null);
		nomina = new ArrayList<JuegoDTO>();
		archivoEmpleado = new JugadorFile();

	}
	
	public void agregarJuego(JuegoDTO Juego){//Operación C - CRUD
		
		ArrayList<JuegoDTO> nomina1=new ArrayList<JuegoDTO>();
		if(archivoEmpleado.leerJuego() == null) {
			nomina1=new ArrayList<JuegoDTO>();
		}else {
			 nomina1 = archivoEmpleado.leerJuego();
		}
		nomina = nomina1;
		nomina.add(Juego);
		archivoEmpleado.escribirJuego(nomina);
		System.out.println(archivoEmpleado.escribirJuego(nomina)+ " este el mensaje si se guardo");
	}

	public ArrayList<JuegoDTO> getNomina() {
		return nomina;
	}

	public void setNomina(ArrayList<JuegoDTO> nomina) {
		this.nomina = nomina;
	}
}
