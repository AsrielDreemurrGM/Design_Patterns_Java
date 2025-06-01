/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.templatemethod;

public abstract class Worker {

	public void runDailyRoutine() {
		displayProfession();
		beginDailyRoutine();
		wakeUp();
		haveBreakfast();
		goToWork();
		work();
		goHomeFromWork();
		rest();
	}

	/**
	 * 
	 */
	protected abstract void work();

	private void displayProfession() {
		System.out.println(getClass().getSimpleName());
	}

	private void beginDailyRoutine() {
		System.out.println("Beginning daily routine.");
	}

	protected void wakeUp() {
		System.out.println("Wake up around 6am and leave the bed.");
	}

	private void haveBreakfast() {
		System.out.println("Have breakfast.");
	}

	private void goToWork() {
		System.out.println("Go to work.");
	}

	private void goHomeFromWork() {
		System.out.println("Go home after working.");
	}

	private void rest() {
		System.out.println("Rest and sleep.");
		System.out.println();
	}
}
