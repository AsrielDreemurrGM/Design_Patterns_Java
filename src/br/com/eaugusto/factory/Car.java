/**
 * Abstract representation of a Car.
 * Defines common properties and methods shared by all car types.
 * Concrete car classes extend this to provide specific implementations.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 27 de mai. de 2025
 */

package br.com.eaugusto.factory;

public abstract class Car {

	private int horsePower;
	private String fuelSource;
	private String color;

	protected Car(int horsePower, String fuelSource, String color) {
		this.horsePower = horsePower;
		this.fuelSource = fuelSource;
		this.color = color;
	}

	public void startEngine() {
		System.out.println("Car Name: " + getClass().getSimpleName());
		System.out.println("The " + fuelSource.toLowerCase() + " engine has been started and is ready to utilize its "
				+ horsePower + " horsepowers.");
	}

	public void clean() {
		System.out.println("The car has been cleaned. The " + color.toLowerCase() + " color shines again.");
	}

	public void mechanicCheck() {
		System.out.println("The car has been checked by the mechanics. Everything looks good!");
	}

	public void fuelCar() {
		System.out.println("The car has been filled with " + fuelSource.toLowerCase() + ".");
	}
}
