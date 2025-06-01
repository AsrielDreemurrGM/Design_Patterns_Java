/**
 * Concrete Observer that represents a newspaper outlet.
 * 
 * When notified by the Subject, it prints the news title received.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.observer;

public class Newspaper implements Observer {

	/**
	 * Receives an update from the subject and displays the news.
	 */
	@Override
	public void update(Subject subject) {
		System.out.println("Receiving news through the Newspaper: " + subject.toString());
	}

	@Override
	public String toString() {
		return "Newspaper";
	}
}
