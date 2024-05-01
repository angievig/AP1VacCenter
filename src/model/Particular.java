package model;

/**
 * Clase que representa el paciente particular
 * Los pacientes particulares tienen un teléfono de contacto y 
 * deben pagar 10% más de la tarifa básica por cada vacuna que reciban.
 * @author avillota
 * @version 1.0
 * @since 2024-05-1
 */
public class Particular extends Pacient {
	
	private String phone;

	public Particular(String name, String lName, int age, String id, int numVacunas, String phone) {
		super(name, lName, age, id, numVacunas);
		this.phone = phone;
	
	}

	/**
	 * Método que calcula el total a pagar de un paciente particular
	 */
	@Override
	public double calcularPago() {
		
		return 0;
	}
	
	
	/**
	 * Método que sobre escribe el toString de Pacient poniendo la información extra 
	 * de la clase que representa al paciente particular
	 */
	public String toString() {
		String cad= "Paciente particular \n";
		cad+= super.toString();
		cad+= "phone = "+ phone + "\n";
		return cad;
	}

}
