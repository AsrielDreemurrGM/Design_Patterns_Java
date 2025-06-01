/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.templatemethod;

public class Manager extends Worker {

	@Override
	protected void work() {
		System.out.println("Work as a Manager.");
	}

	@Override
	protected void wakeUp() {
		System.out.println("Wake up at 8am and leave the bed.");
	}
}
