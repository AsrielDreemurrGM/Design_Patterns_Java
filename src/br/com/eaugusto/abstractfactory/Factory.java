/**
 * Abstract Factory class that defines the method for creating a car.
 * Subclasses implement the method to provide different car types.
 * This class also includes preparation steps common to all cars.
 * 
 * @see WithContractFactory
 * @see WithoutContractFactory
 *
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 27 de mai. de 2025
 */

package br.com.eaugusto.abstractfactory;

public abstract class Factory {

	public Car create(String requestedGrade) {
		Car car = retrieveCar(requestedGrade);
		car = prepareCar(car);
		return car;
	}

	private Car prepareCar(Car car) {
		car.clean();
		car.mechanicCheck();
		car.fuelCar();
		return car;
	}

	abstract Car retrieveCar(String requestedGrade);
}
