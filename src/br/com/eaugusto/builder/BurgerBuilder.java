/**
 * Abstract builder class that defines the steps to build a Burger.
 * Each concrete builder implements these steps differently.
 * 
 * This class serves as the Builder in the Builder design pattern.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 26 de mai. de 2025
 */

package br.com.eaugusto.builder;

public abstract class BurgerBuilder {

	Burger burger = new Burger();

	abstract void buildBun();

	abstract void buildMeat();

	abstract void buildSalad();

	abstract void buildCheese();

	abstract void buildSauce();

	/**
	 * Returns the fully constructed Burger.
	 * 
	 * @return the configured Burger instance.
	 */
	Burger build() {
		return burger;
	}
}
