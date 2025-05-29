/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.factorymethod;

public abstract class CarFactory {

	public abstract Car createCar();

	public Car orderCar() {
		Car car = createCar();
		car.clean();
		car.mechanicCheck();
		car.fuelCar();
		return car;
	}
}
