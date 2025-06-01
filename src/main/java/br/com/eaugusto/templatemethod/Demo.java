/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.templatemethod;

public class Demo {

	public static void main(String[] args) {
		Worker firefighter = new Firefighter();
		firefighter.runDailyRoutine();

		Worker cop = new Cop();
		cop.runDailyRoutine();

		Worker manager = new Manager();
		manager.runDailyRoutine();
	}
}
