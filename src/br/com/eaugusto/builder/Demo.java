/**
 * Demonstrates the Builder design pattern by constructing
 * different types of burgers using the same process.
 * 
 * Shows how the same construction steps can create different results
 * based on the builder used.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 26 de mai. de 2025
 */

package br.com.eaugusto.builder;

public class Demo {

	public static void main(String[] args) {

		// Creates a manager and assigns a CheeseBurgerBuilder
		Manager manager = new Manager();
		manager.setBuilder(new CheeseBurgerBuilder());

		Burger cheeseBurger = manager.buildBurger();
		cheeseBurger.print();

		// Reuses the same manager with a different builder
		manager.setBuilder(new VeganBurgerBuilder());

		Burger veganBurger = manager.buildBurger();
		veganBurger.print();
	}
}
