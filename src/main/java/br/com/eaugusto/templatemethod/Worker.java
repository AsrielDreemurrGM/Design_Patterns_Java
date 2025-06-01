/**
 * Abstract Worker class defining a template method for daily routines.
 * Subclasses must implement the work() step; others can override optional steps.
 * 
 * The template method runDailyRoutine defines the sequence of steps.
 * This is an example of the Template Method design pattern.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 29 de mai. de 2025
 */

package br.com.eaugusto.templatemethod;

public abstract class Worker {

	/**
	 * Template method defining the steps of a daily routine. Calls concrete and
	 * hook methods in a defined order.
	 */
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
	 * Abstract method to be implemented by subclasses to define work behavior.
	 */
	protected abstract void work();

	/**
	 * Displays the class name representing the profession.
	 */
	private void displayProfession() {
		System.out.println(getClass().getSimpleName());
	}

	/**
	 * Signals the beginning of the daily routine.
	 */
	private void beginDailyRoutine() {
		System.out.println("Beginning daily routine.");
	}

	/**
	 * Hook method for waking up. Can be overridden by subclasses to customize
	 * wake-up time.
	 */
	protected void wakeUp() {
		System.out.println("Wake up around 6am and leave the bed.");
	}

	/**
	 * Simulates having breakfast.
	 */
	private void haveBreakfast() {
		System.out.println("Have breakfast.");
	}

	/**
	 * Simulates going to work.
	 */
	private void goToWork() {
		System.out.println("Go to work.");
	}

	/**
	 * Simulates going home from work.
	 */
	private void goHomeFromWork() {
		System.out.println("Go home after working.");
	}

	/**
	 * Simulates resting at the end of the day.
	 */
	private void rest() {
		System.out.println("Rest and sleep.");
		System.out.println();
	}
}
