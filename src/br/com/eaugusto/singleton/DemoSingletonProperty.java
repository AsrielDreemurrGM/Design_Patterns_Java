/**
 * DemoSingletonProperty demonstrates how the SingletonProperty class
 * retains the initial value passed during its first instantiation.
 * 
 * Even though two calls to getInstance are made with different strings,
 * only the first one is used since the Singleton instance is already created.
 * 
 * Output example:
 * <pre>
 *     Hello World - 1
 *     Hello World - 1
 * </pre>
 * 
 * This confirms that only one instance exists and state is preserved.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 25 de mai. de 2025
 */

package br.com.eaugusto.singleton;

public class DemoSingletonProperty {

	public static void main(String[] args) {

		// First call: initializes the singleton with this value
		SingletonProperty singleton = SingletonProperty.getInstance("Hello World - 1");

		// Second call: returns same instance; ignores this new value
		SingletonProperty singleton2 = SingletonProperty.getInstance("Hello World - 2");

		// Output: both should return "Hello World - 1"
		System.out.println(singleton.getValue());
		System.out.println(singleton2.getValue());
	}
}
