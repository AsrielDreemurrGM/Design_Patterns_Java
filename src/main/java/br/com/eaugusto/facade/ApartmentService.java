/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 30 de mai. de 2025
 */

package br.com.eaugusto.facade;

public class ApartmentService implements IApartmentService {

	@Override
	public Boolean registerApartment(Apartment apartment) {
		Boolean isAlreadyRegistered = isAlreadyRegistered();
		if (Boolean.TRUE.equals(isAlreadyRegistered)) {
			System.out.println("Failure. Apartment already registered.");
			return false;
		} else {
			registerApartment();
			return true;
		}
	}

	private void registerApartment() {
		System.out.println("Apartment registered.");
	}

	private Boolean isAlreadyRegistered() {
		return false;
	}
}
