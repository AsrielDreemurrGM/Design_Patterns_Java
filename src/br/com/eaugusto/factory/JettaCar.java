/**
 * Concrete Car implementation representing a Jetta model.
 * Typically returned by the factory for customers without a company contract.
 * Inherits shared car behaviors from the Car class.
 * 
 * @see Car
 *
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 27 de mai. de 2025
 */

package br.com.eaugusto.factory;

public class JettaCar extends Car {

	protected JettaCar(int horsePower, String fuelSource, String color) {
		super(horsePower, fuelSource, color);
	}
}
