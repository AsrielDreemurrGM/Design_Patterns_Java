/**
 * Subject interface in the Observer pattern.
 * 
 * Declares methods for adding, removing, and notifying observers.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.observer;

public interface Subject {

	public void addObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyAllObservers(String title);
}
