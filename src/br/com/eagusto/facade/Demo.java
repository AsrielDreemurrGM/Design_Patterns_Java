/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 30 de mai. de 2025
 */

package br.com.eagusto.facade;

public class Demo {

	public static void main(String[] args) {
		IApartmentService service = new ApartmentService();
		service.registerApartment(new Apartment("123AB", "Java Street"));
	}
}
