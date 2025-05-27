/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 26 de mai. de 2025
 */

package br.com.eaugusto.builder;

public class VeganBurgerBuilder extends BurgerBuilder {

	@Override
	public void buildBun() {
		burger.setBun("Vegan White Bread");
	}

	@Override
	public void buildMeat() {
		burger.setMeat("Vegan Beef");
	}

	@Override
	public void buildSalad() {
		burger.setSalad("Lettuce And Onions");
	}

	@Override
	public void buildCheese() {
		burger.setCheese("Vegan American Cheese");
	}

	@Override
	public void buildSauce() {
		burger.setCheese("Vegan Secret Sauce");
	}
}
