/**
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

	public void print() {
		System.out.println("Burger is ready! \n" + "Bun: " + bun + " - Meat: " + meat + " - Cheese: " + cheese
				+ " - Salad: " + salad + " - Sauce: " + sauce);
	}
}
