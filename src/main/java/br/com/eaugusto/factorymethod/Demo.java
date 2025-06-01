/**
 * Demonstrates the Factory Method pattern in action.
 * Each specific factory subclass (e.g., CorollaCarFactory, JettaCarFactory)
 * defines how to create a particular type of car by overriding the factory method.
 * The client code uses the factory interface to order a car without needing to know
 * which concrete class is being instantiated.
 * 
 * This promotes a low dependency between components and makes it easy to introduce new car types
 * by simply creating new factory implementations, e.g., a MustangCarFactory.
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
