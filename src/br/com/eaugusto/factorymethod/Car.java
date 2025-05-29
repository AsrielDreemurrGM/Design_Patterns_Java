/**
 * Abstract Product: Represents a generic Car.
 * Defines basic methods every car should have.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.factorymethod;

public abstract class Car {

	protected int horsePower;
	protected String fuelSource;
	protected String color;

	protected Car(int horsePower, String fuelSource, String color) {
		this.horsePower = horsePower;
		this.fuelSource = fuelSource;
		this.color = color;
	}

	/**
	 * Starts the car engine with informations about the car.
	 */
	public void startEngine() {
		System.out.println("Car Model: " + getClass().getSimpleName());
		System.out.println("Starting the " + fuelSource.toLowerCase() + " engine with " + horsePower + " HP.");
	}

	/**
	 * Cleans the car and highlights its color.
	 */
	public void clean() {
		System.out.println("Cleaning the car. The " + color.toLowerCase() + " paint shines!");
	}

	/**
	 * Performs a mechanic check.
	 */
	public void mechanicCheck() {
		System.out.println("Performing mechanic check. Everything looks good!");
	}

	/**
	 * Fuels the car.
	 */
	public void fuelCar() {
		System.out.println("Filling the car with " + fuelSource.toLowerCase() + ".");
	}
}
