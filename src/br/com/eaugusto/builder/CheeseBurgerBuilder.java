/**
 * Concrete builder that creates a Cheese Burger.
 * Implements the steps to set specific ingredients for a cheese burger.
 * 
 * This class is a ConcreteBuilder in the Builder pattern.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 26 de mai. de 2025
 */

package br.com.eaugusto.builder;

public class CheeseBurgerBuilder extends BurgerBuilder {

	@Override
	public void buildBun() {
		burger.setBun("White Bread");
	}

	@Override
	public void buildMeat() {
		burger.setMeat("Beef");
	}

	@Override
	public void buildSalad() {
		burger.setSalad("Lettuce");
	}

	@Override
	public void buildCheese() {
		burger.setCheese("American Cheese");
	}

	@Override
	public void buildSauce() {
		burger.setSauce("Secret Sauce");
	}
}
