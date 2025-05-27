/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 27 de mai. de 2025
 */

package br.com.eaugusto.builder;

public class Manager {

	BurgerBuilder builder;

	// public Manager(BurgerBuilder builder) {
	// this.builder = builder;
	// }

	public void setBuilder(BurgerBuilder builder) {
		this.builder = builder;
	}

	public Burger buildBurger() {
		builder.buildBun();
		builder.buildSauce();
		builder.buildMeat();
		builder.buildSalad();
		builder.buildCheese();

		return builder.build();
	}
}
