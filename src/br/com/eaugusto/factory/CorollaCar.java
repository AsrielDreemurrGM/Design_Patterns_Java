/**
 * Concrete Car implementation representing a Corolla model.
 * Used in customers without a company contract.
 * Inherits behavior from the Car abstract class.
 * 
 * @see Car
 *
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 27 de mai. de 2025
 */

package br.com.eaugusto.factory;

public class CorollaCar extends Car {

	protected CorollaCar(int horsePower, String fuelSource, String color) {
		super(horsePower, fuelSource, color);
	}
}
