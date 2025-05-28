/**
 * Concrete Car implementation representing an Audi Q3 model.
 * Typically used for customers with a company contract and grade B request.
 * Inherits shared behavior from the abstract Car class.
 * 
 * @see Car
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 27 de mai. de 2025
 */

package br.com.eaugusto.factory;

public class AudiQ3Car extends Car {

	protected AudiQ3Car(int horsePower, String fuelSource, String color) {
		super(horsePower, fuelSource, color);
	}
}
