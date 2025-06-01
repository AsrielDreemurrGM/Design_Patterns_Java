/**
 * Singleton is a class that ensures only one instance of itself can be created.
 * It provides a global point of access to that single instance.
 * <p>
 * This is a classic implementation of the Singleton Design Pattern using lazy initialization.
 * </p>
 * 
 * Usage:
 * <pre>
 *     Singleton instance = Singleton.getInstance();
 * </pre>
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since May 25, 2025
 */

package br.com.eaugusto.singleton;

public final class Singleton {

	// Holds the single instance of the class (lazily initialized)
	private static Singleton singleton;

	/**
	 * Private constructor prevents instantiation from outside the class. Ensures
	 * that no other class can create an instance.
	 */
	private Singleton() {
		// Constructor is intentionally left empty
	}

	/**
	 * Provides access to the single instance of the Singleton class. Creates the
	 * instance only when it's first requested (lazy initialization).
	 * 
	 * @return the unique Singleton instance
	 */
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton(); // Create instance on first call
		}
		return singleton;
	}
}
