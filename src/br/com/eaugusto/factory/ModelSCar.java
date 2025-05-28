/**
 * Concrete Car implementation representing a Model S (Tesla) model.
 * Used for premium customers with a company contract.
 * Inherits functionality from the Car base class.
 * 
 * @see Car
 *
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 27 de mai. de 2025
 */

package br.com.eaugusto.factory;

public class ModelSCar extends Car {

	protected ModelSCar(int horsePower, String fuelSource, String color) {
		super(horsePower, fuelSource, color);
	}
}
