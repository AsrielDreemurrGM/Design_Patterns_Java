/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 26 de mai. de 2025
 */

package br.com.eaugusto.builder;

public class Demo {

	public static void main(String[] args) {

		// Manager manager = new Manager(new CheeseBurgerBuilder());

		Manager manager = new Manager();
		manager.setBuilder(new CheeseBurgerBuilder());

		Burger cheeseBurger = manager.buildBurger();
		cheeseBurger.print();

		// Manager manager2 = new Manager(new VeganBurgerBuilder());
		manager.setBuilder(new VeganBurgerBuilder());

		Burger veganBurger = manager.buildBurger();
		veganBurger.print();
	}
}
