/**
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

	Burger build() {
		return burger;
	}
}
