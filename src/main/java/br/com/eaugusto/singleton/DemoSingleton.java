/**
 * DemoSingleton is a simple class to demonstrate the usage of the Singleton class.
 * It retrieves the Singleton instance twice and prints their references to show
 * that both variables point to the same object in memory.
 * 
 * Expected output:
 * Both printed references should be identical, proving the Singleton works.
 * 
 * Example:
 * <pre>
 *     br.com.eaugusto.singleton.Singleton@3b6eb2ec
 *     br.com.eaugusto.singleton.Singleton@3b6eb2ec
 * </pre>
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since May 25, 2025
 */

package br.com.eaugusto.singleton;

public class DemoSingleton {

	public static void main(String[] args) {
		// Retrieve the Singleton instance twice
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();

		// Print both instances to show they are the same
		System.out.println(singleton);
		System.out.println(singleton1);
	}
}
