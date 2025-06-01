/**
 * Interface representing a high-level service to manage apartment registrations.
 * 
 * This abstraction allows the service to be easily replaced or mocked, and promotes
 * loose coupling between client code and service implementations.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 30 de mai. de 2025
 */

package br.com.eaugusto.facade;

public interface IApartmentService {

	/**
	 * Registers the given apartment.
	 * 
	 * @param apartment The apartment to register.
	 * @return true if the registration succeeded; false if the apartment was
	 *         already registered.
	 */
	public Boolean registerApartment(Apartment apartment);
}
