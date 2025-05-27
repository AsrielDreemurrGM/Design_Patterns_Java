/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 26 de mai. de 2025
 */

package br.com.eaugusto.builder;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Burger burger = new Burger();

		burger.setBun("Bun");
		burger.setSauce("Sauce");
		burger.setMeat("Meat");
		burger.setCheese("Cheese");

		burger.print();

	}

}
