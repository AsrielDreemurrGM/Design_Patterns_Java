/**
 * Concrete Observer that represents a TV news outlet.
 * 
 * When notified by the Subject, it prints the news title received.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.observer;

public class TV implements Observer {

	/**
	 * Receives an update from the subject and displays the news.
	 */
	@Override
	public void update(Subject subject) {
		System.out.println("Receiving news through the TV: " + subject.toString());
	}

	@Override
	public String toString() {
		return "TV";
	}
}
