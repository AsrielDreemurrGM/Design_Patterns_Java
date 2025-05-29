/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.observer;

import java.util.ArrayList;
import java.util.List;

public class Journalist implements Subject {

	public List<Observer> observers = new ArrayList<>();

	private String title;

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAllObservers(String title) {
		this.setTitle(title);
		for (Observer observer : this.observers) {
			observer.update(this);
		}
		System.out.println();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "\nJournalist observers: " + observers.toString() + ". \nNews title: " + title + "\n";
	}
}
