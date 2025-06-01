/**
 * Demonstrates the use of the Facade design pattern.
 * 
 * The Facade pattern provides a simplified interface to a complex subsystem.
 * In this example, the client interacts only with IApartmentService, which hides
 * the internal steps of checking registration and performing it.
 * 
 * The goal is to make the code more readable and easier to use for the client.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 30 de mai. de 2025
 */

package br.com.eaugusto.facade;

public class Demo {

	public static void main(String[] args) {
		// Create the service through its interface
		IApartmentService service = new ApartmentService();

		// Register a new apartment using the simplified interface
		service.registerApartment(new Apartment("123AB", "Java Street"));
	}
}
