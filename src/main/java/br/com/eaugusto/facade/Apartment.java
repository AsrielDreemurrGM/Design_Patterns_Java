/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 30 de mai. de 2025
 */

package br.com.eaugusto.facade;

public class Apartment {

	private String number;
	private String address;

	/**
	 * @param number
	 * @param address
	 */
	public Apartment(String number, String address) {
		this.number = number;
		this.address = address;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return number;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.number = code;
	}
}
