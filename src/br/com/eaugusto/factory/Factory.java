/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 27 de mai. de 2025
 */

package br.com.eaugusto.factory;

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
