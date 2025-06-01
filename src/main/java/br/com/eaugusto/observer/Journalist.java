/**
 * Concrete implementation of the Subject in the Observer pattern.
 * 
 * The Journalist holds a list of observers (media channels) and notifies them
 * whenever a new piece of news is published.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.observer;

import java.util.ArrayList;
import java.util.List;

public class Journalist implements Subject {

	// List of observers interested in the updates
	public final List<Observer> observers = new ArrayList<>();

	// News headline
	private String title;

	/**
	 * Adds an observer to be notified of updates.
	 */
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	/**
	 * Removes an observer from the list.
	 */
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * Notifies all registered observers with the new news title.
	 * 
	 * @param title The headline to notify about.
	 */
	@Override
	public void notifyAllObservers(String title) {
		this.setTitle(title);
		for (Observer observer : this.observers) {
			observer.update(this);
		}
		System.out.println();
	}

	/**
	 * @return The current news headline.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title The new headline to set.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Returns a string representation including all observers and the current
	 * headline.
	 */
	@Override
	public String toString() {
		return "\nJournalist observers: " + observers.toString() + ". \nNews title: " + title + "\n";
	}
}
