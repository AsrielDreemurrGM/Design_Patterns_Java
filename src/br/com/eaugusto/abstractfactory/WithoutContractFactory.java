/**
 * Concrete Factory used when the customer does not have a company contract.
 * Provides regular-grade car models like Jetta and Corolla.
 * Implements the retrieval of cars based on customer grade.
 * 
 * @see Factory
 *
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 27 de mai. de 2025
 */

package br.com.eaugusto.abstractfactory;

public class WithoutContractFactory extends Factory {

	@Override
	Car retrieveCar(String requestedGrade) {
		switch (requestedGrade) {
		case "A":
			return new JettaCar(231, "Gas", "Blue");
		case "B":
			return new CorollaCar(167, "Gas", "Red");
		default:
			System.out.println("The requested grade doesn't exist.");
			return null;
		}
	}
}
