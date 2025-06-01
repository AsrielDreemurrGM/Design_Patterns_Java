/**
 * Demonstrates the use of the Observer design pattern.
 * 
 * The Observer pattern defines a one-to-many dependency between objects so that
 * when one object (Subject) changes state, all its dependents (Observers) are
 * notified and updated automatically.
 * 
 * In this example, a Journalist notifies different media outlets (TV and Newspaper)
 * about news updates.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.observer;

public class Demo {

	public static void main(String[] args) {
		// Create the subject (news source)
		Journalist journalist = new Journalist();

		// Attach observers (media channels)
		journalist.addObserver(new TV());
		journalist.addObserver(new Newspaper());

		// Notify all observers with a news headline
		journalist.notifyAllObservers("Java Developer Forgets Semicolon, Loses Hours, Has Mental Breakdown");
	}
}
