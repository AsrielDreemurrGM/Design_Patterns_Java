/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.observer;

public class TV implements Observer {

	@Override
	public void update(Subject subject) {
		System.out.println("Receiving news through the TV: " + subject.toString());
	}

	@Override
	public String toString() {
		return "TV";
	}
}
