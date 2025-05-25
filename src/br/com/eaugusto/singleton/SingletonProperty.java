/**
 * SingletonProperty is a variant of the Singleton pattern
 * that accepts an initial value when the instance is first created.
 * 
 * The value is only set once — during the first call to getInstance.
 * Any subsequent calls with a different value will be ignored.
 * 
 * This demonstrates that Singleton state persists beyond the first instantiation.
 * 
 * Example usage:
 * <pre>
 *     SingletonProperty s1 = SingletonProperty.getInstance("First");
 *     SingletonProperty s2 = SingletonProperty.getInstance("Second");
 *     // Both s1 and s2 will return "First" from getValue()
 * </pre>
 * 
 * Note: This is not thread-safe.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 25 de mai. de 2025
 */

package br.com.eaugusto.singleton;

public class SingletonProperty {

	// Holds the unique instance of the class
	private static SingletonProperty singleton;

	// Value assigned during first creation
	private String value;

	/**
	 * Private constructor that accepts a value to initialize the instance.
	 * 
	 * @param value The string to associate with the singleton instance
	 */
	private SingletonProperty(String value) {
		this.value = value;
	}

	/**
	 * Returns the single instance of SingletonProperty. If not yet created,
	 * initializes it with the provided value.
	 * 
	 * @param value The value to set (only used on first call)
	 * @return The SingletonProperty instance
	 */
	public static SingletonProperty getInstance(String value) {
		if (singleton == null) {
			singleton = new SingletonProperty(value);
		}
		return singleton;
	}

	/**
	 * Returns the value assigned to this singleton instance.
	 * 
	 * @return The stored value
	 */
	public String getValue() {
		return value;
	}
}
