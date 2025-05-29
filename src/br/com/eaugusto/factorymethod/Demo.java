/**
 * Demo class showing how to use the Factory Method pattern to create cars.
 * It creates different car factories and orders cars from them.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.factorymethod;

public class Demo {

	public static void main(String[] args) {
		CarFactory corollaFactory = new CorollaCarFactory();
		Car corolla = corollaFactory.orderCar();
		corolla.startEngine();

		System.out.println();

		CarFactory jettaFactory = new JettaCarFactory();
		Car jetta = jettaFactory.orderCar();
		jetta.startEngine();

		System.out.println();

		CarFactory modelSFactory = new ModelSCarFactory();
		Car modelS = modelSFactory.orderCar();
		modelS.startEngine();
	}
}
