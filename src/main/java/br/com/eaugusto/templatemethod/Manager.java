/**
 * Concrete implementation of a Manager worker.
 * Overrides the work step and wakeUp step with Manager-specific behaviors.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.templatemethod;

public class Manager extends Worker {

	/**
	 * Manager's specific work implementation.
	 */
	@Override
	protected void work() {
		System.out.println("Work as a Manager.");
	}

	/**
	 * Manager wakes up later than other workers.
	 */
	@Override
	protected void wakeUp() {
		System.out.println("Wake up at 8am and leave the bed.");
	}
}
