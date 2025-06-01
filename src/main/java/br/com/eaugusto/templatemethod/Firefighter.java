/**
 * Concrete implementation of a Firefighter worker.
 * Overrides the work step with Firefighter-specific behavior.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.templatemethod;

public class Firefighter extends Worker {

	/**
	 * Firefighter's specific work implementation.
	 */
	@Override
	protected void work() {
		System.out.println("Work as a Firefighter.");
	}
}
