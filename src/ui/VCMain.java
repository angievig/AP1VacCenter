package ui;

import java.util.Scanner;
import model.PacientController;

/**
 * Main Class for the Vaccine Center problem
 * @author avillota
 * @version 1.0
 * @since 2024-05-01
 */
public class VCMain {
	
	/**
	 * Object for reading the input
	 */
	private Scanner sc;
	/**
	 * Object representing the association with the controller
	 */
	private PacientController controller;
	
	/**
	 * Constructor Method, initializes the objects (scanner and controller)
	 */
	public VCMain() {
		sc= new Scanner(System.in);
		controller = new PacientController();
	}
	

	/**
	 * Main method starts the application's execution 
	 * @param args
	 */
	public static void main(String[] args) {
		
		VCMain obj= new VCMain();
		System.out.println("Iniciando la aplicación");
		
		int option=0;
		
		do{
			option= obj.showMenu();
			obj.executeOperation(option);
		}while (option!=0);

	}
	
	
	/**
	 * 
	 * @return
	 */
	public int showMenu() {
		int option=0;

		System.out.println(
				"Menú principal, seleccione una opción\n" +
				"(1) Para crear un paciente \n" +
				"(2) Para mostrar la información de todos los pacientes\n" +
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	/**
	 * 
	 * @param operation
	 */
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1: rf1RegistrarPaciente();
			break;
		case 2: rf2MostrarPacientes();
			break;
		default:
			System.out.println("Error, opción no válida");
		}
	}

	public void rf1RegistrarPaciente() {
		System.out.println("Registar un paciente");

	}
	
	public void rf2MostrarPacientes() {
		System.out.println("Mostrando los pacientes");
	}








}
