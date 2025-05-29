/**
 * Concrete Factory used when the customer has a company contract.
 * Provides high-grade and luxury car models such as Model S and Audi Q3.
 * Implements the retrieval of cars based on customer grade.
 * 
 * @see Factory
 *
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 27 de mai. de 2025
 */

package br.com.eaugusto.abstractfactory;

public class WithContractFactory extends Factory {

	@Override
	Car retrieveCar(String requestedGrade) {
		switch (requestedGrade) {
		case "A":
			return new ModelSCar(1020, "Eletricity", "Black");
		case "B":
			return new AudiQ3Car(231, "Ethanol", "Orange");
		default:
			System.out.println("The requested grade doesn't exist.");
			return null;
		}
	}
}
