package model;

/**
 * Class  representing the controller for the vaccination center case 
 * @author avillota
 * @version 1.0
 * @since 2024-05-11
 */
public class PacientController {
	
	public final static int MAX_PACIENTS= 600;
	private Pacient[] pacients;
	
	public PacientController() {
		pacients= new Pacient[MAX_PACIENTS];
	}
	
	/**
	 * Este método debe sobrecargarse para crear uno distinto pos
	 * cada tipo de paciente que se va a registrar
	 */
	public void registrarPaciente() {
		//se busca un espacio vacío en el arreglo
		//se crea el objeto usando el costructor de la clase que corresponde de acuerdo el tipo de paciente
	}
	
	
	/**
	 * Se recorre el arreglo de pacientes y se obtiene una cadena con los datos 
	 * @return una cadena con los datos de todos los pacientes
	 */
	public String mostrarPacientes() {
		
		//recorrido
		//por cada objeto en el arreglo:
		// se muestran sus datos llamando a toString
		// se llama el método calcularPrecio y se muestra el precio total
		return "Los datos de los pacientes";
	}
	
	

}
