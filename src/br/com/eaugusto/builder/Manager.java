/**
 * Director class that manages the burger construction process.
 * Orchestrates the building steps in a defined order.
 * 
 * This class acts as the Director in the Builder pattern.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 27 de mai. de 2025
 */

package br.com.eaugusto.builder;

public class Manager {

	BurgerBuilder builder;

	/**
	 * Sets the builder used by the manager.
	 * 
	 * @param builder the BurgerBuilder implementation to use.
	 */
	public void setBuilder(BurgerBuilder builder) {
		this.builder = builder;
	}

	/**
	 * Builds the burger by executing all construction steps.
	 * 
	 * @return the fully built Burger.
	 */
	public Burger buildBurger() {
		builder.buildBun();
		builder.buildSauce();
		builder.buildMeat();
		builder.buildSalad();
		builder.buildCheese();

		return builder.build();
	}
}
