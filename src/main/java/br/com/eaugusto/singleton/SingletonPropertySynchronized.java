/**
 * SingletonPropertySynchronized is a thread-safe version of the Singleton pattern
 * that ensures only one instance is created even in multithreaded environments.
 * 
 * The getInstance method is marked synchronized to prevent race conditions.
 * 
 * This guarantees that the singleton instance is created safely and only once.
 * 
 * Note: This implementation may have performance drawbacks due to method-level synchronization.
 * 
 * Example:
 * <pre>
 *     SingletonPropertySynchronized s1 = getInstance("Value1");
 *     SingletonPropertySynchronized s2 = getInstance("Value2");
 *     // Both will return the first value assigned.
 * </pre>
 * 
 * @see DemoSingletonPropertyThreadSynchronized for multithreaded demo
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 25 de mai. de 2025
 */

package br.com.eaugusto.singleton;

public class SingletonPropertySynchronized {

	private static SingletonPropertySynchronized singleton;

	private String value;

	/**
	 * Private constructor to prevent external instantiation.
	 * 
	 * @param value The value to assign to the singleton instance
	 */
	private SingletonPropertySynchronized(String value) {
		this.value = value;
	}

	/**
	 * Thread-safe Singleton accessor using method-level synchronization. Ensures
	 * only one instance is created across all threads.
	 * 
	 * @param value The value to assign (used only on first instantiation)
	 * @return The singleton instance
	 */
	public static synchronized SingletonPropertySynchronized getInstance(String value) {
		if (singleton == null) {
			singleton = new SingletonPropertySynchronized(value);
		}
		return singleton;
	}

	/**
	 * Returns the value associated with the singleton instance.
	 * 
	 * @return The stored string value
	 */
	public String getValue() {
		return value;
	}

}
