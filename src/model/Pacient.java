package model;

/**
 * Class representing the abstract class Patient
 * Los pacientes tienen un nombre, apellido, edad y  documento de identidad. 
 * @author avillota
 * @version 1.0
 * @since 2024-05-1
 */

public abstract class Pacient{
	public static final double TARIFA_BASICA= 100000;
	//Los pacientes tienen un nombre, apellido, edad y  documento de identidad. 
	private String name;
	private String lName;
	private int age;
	private String id;
	private int cantVacunas;
	
	
	/**
	 * Constructor for the class Patient, this constructor won't be used
	 * because the class is abstract
	 * @param name
	 * @param lName
	 * @param age
	 * @param id
	 * @param numVacunas es la cantidad de vacunas que un paciente se aplicará en la visita
	 */
	public Pacient(String name, String lName, int age, String id, int numVacunas) {	
		this.name = name;
		this.lName = lName;
		this.age = age;
		this.id = id;
		cantVacunas= numVacunas;
	}

	/**
	 * Método que puede llamarse en el toString de cada subclase
	 * y completar con los datos particulares de cada tipo de paciente
	 */
	public String toString() {
		return "Datos del paciente \n name=" + name + "\n lName=" + lName + "\n age=" + age + "\n id=" + id + "\n";
	}
	
	/**
	 * Método abstracto que debe sobreescribirse en cada subclase
	 * Este método retorna el total a pagar por cada cliente 
	 * @return
	 */
	public abstract double calcularPago();
	
	


}
