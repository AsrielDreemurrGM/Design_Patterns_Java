/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.observer;

public class Demo {

	public static void main(String[] args) {
		Journalist journalist = new Journalist();

		journalist.addObserver(new TV());
		journalist.addObserver(new Newspaper());

		journalist.notifyAllObservers("Java Developer Forgets Semicolon, Loses Hours, Has Mental Breakdown");
	}
}
