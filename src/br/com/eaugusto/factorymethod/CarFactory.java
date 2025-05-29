/**
 * Abstract Creator: Factory that defines the factory method to create cars.
 * Subclasses will implement the method to specify which car to create.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.factorymethod;

public abstract class CarFactory {

	/**
	 * Factory method. Subclasses decide which concrete car to instantiate.
	 * 
	 * @return a new Car instance
	 */
	public abstract Car createCar();

	/**
	 * A template method that prepares the car after creation. It calls car's
	 * methods for cleaning, mechanic check and fueling.
	 * 
	 * @return the fully prepared car
	 */
	public Car orderCar() {
		Car car = createCar();
		car.clean();
		car.mechanicCheck();
		car.fuelCar();
		return car;
	}
}
