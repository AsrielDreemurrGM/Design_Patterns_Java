/**
 * Facade implementation that encapsulates the apartment registration logic.
 * 
 * This class hides internal complexity like checking if the apartment is already
 * registered and performing the actual registration. Clients only interact with
 * the high-level method registerApartment().
 * 
 * It implements the IApartmentService interface to promote abstraction and flexibility.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 30 de mai. de 2025
 */

package br.com.eaugusto.facade;

public class ApartmentService implements IApartmentService {

	/**
	 * Registers an apartment if it hasn't been registered already.
	 * 
	 * @param apartment The apartment to register.
	 * @return true if the registration was successful; false otherwise.
	 */
	@Override
	public Boolean registerApartment(Apartment apartment) {
		Boolean isAlreadyRegistered = isAlreadyRegistered();
		if (Boolean.TRUE.equals(isAlreadyRegistered)) {
			System.out.println("Failure. Apartment already registered.");
			return false;
		} else {
			registerApartment(); // Internally handles the registration process
			return true;
		}
	}

	/**
	 * Simulates the registration of an apartment.
	 */
	private void registerApartment() {
		System.out.println("Apartment registered.");
	}

	/**
	 * Simulates a check to see if the apartment is already registered.
	 * 
	 * @return true if the apartment is already registered; false otherwise.
	 */
	private Boolean isAlreadyRegistered() {
		// For demo purposes, always returns false.
		return false;
	}
}
