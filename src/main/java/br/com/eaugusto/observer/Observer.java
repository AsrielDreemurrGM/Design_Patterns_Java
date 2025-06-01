/**
 * Observer interface in the Observer pattern.
 * 
 * All classes that want to be notified by a subject must implement this interface.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.observer;

public interface Observer {

	/**
	 * Method called when the subject notifies its observers.
	 * 
	 * @param subject The subject that changed.
	 */
	public void update(Subject subject);
}
