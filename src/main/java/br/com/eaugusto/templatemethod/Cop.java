/**
 * Concrete implementation of a Cop worker.
 * Overrides the work step with Cop-specific behavior.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.templatemethod;

public class Cop extends Worker {

	/**
	 * Cop's specific work implementation.
	 */
	@Override
	protected void work() {
		System.out.println("Work as a Cop.");
	}
}
