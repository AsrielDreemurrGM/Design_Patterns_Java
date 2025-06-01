/**
 * Represents a customizable Burger with various ingredients.
 * Acts as the product in the Builder design pattern.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 26 de mai. de 2025
 */

package br.com.eaugusto.builder;

public class Burger {

	private String bun = "No Bun";
	private String meat = "No Meat";
	private String salad = "No Salad";
	private String cheese = "No Cheese";
	private String sauce = "No Sauce";

	// Getters
	public String getBun() {
		return bun;
	}

	public String getMeat() {
		return meat;
	}

	public String getSalad() {
		return salad;
	}

	public String getCheese() {
		return cheese;
	}

	public String getSauce() {
		return sauce;
	}

	// Setters
	public void setBun(String bun) {
		this.bun = bun;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public void setSalad(String salad) {
		this.salad = salad;
	}

	public void setCheese(String cheese) {
		this.cheese = cheese;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	/**
	 * Prints the current configuration of the burger to the console.
	 */
	public void print() {
		System.out.println("Burger is ready! \n" + "Bun: " + bun + "\nMeat: " + meat + "\nCheese: " + cheese
				+ "\nSalad: " + salad + "\nSauce: " + sauce);
	}
}
