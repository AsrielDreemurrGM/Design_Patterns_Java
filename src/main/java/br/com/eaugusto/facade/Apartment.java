/**
 * Represents an apartment with a number and an address.
 * 
 * This is a simple model class used by the ApartmentService.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 30 de mai. de 2025
 */

package br.com.eaugusto.facade;

public class Apartment {

	private String number;
	private String address;

	/**
	 * Constructs an Apartment object with the given number and address.
	 * 
	 * @param number  The apartment number.
	 * @param address The apartment address.
	 */
	public Apartment(String number, String address) {
		this.number = number;
		this.address = address;
	}

	/**
	 * Gets the apartment address.
	 * 
	 * @return The address.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the apartment address.
	 * 
	 * @param address The address to set.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the apartment number.
	 * 
	 * @return The apartment number.
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Sets the apartment number.
	 * 
	 * @param code The new apartment number.
	 */
	public void setNumber(String number) {
		this.number = number;
	}
}
