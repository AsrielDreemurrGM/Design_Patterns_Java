/**
 * DemoSingletonPropertyThread demonstrates what happens when two threads
 * try to initialize the same SingletonProperty instance with different values.
 * 
 * This class is intentionally NOT thread-safe, which may lead to both threads
 * creating their own instance before the other thread finishes, which breaks the singleton rule.
 * 
 * Output may vary and is inconsistent depending on thread timing.
 * 
 * This highlights the importance of synchronization in multithreaded environments.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 25 de mai. de 2025
 */

package br.com.eaugusto.singleton;

public class DemoSingletonPropertyThread {

	public static void main(String[] args) {

		// Create two threads trying to access the Singleton simultaneously
		Thread t1 = new Thread(new ThreadFoo());
		Thread t2 = new Thread(new ThreadBar());

		t1.start();
		t2.start();
	}

	// Thread that initializes Singleton with one value
	static class ThreadFoo implements Runnable {
		@Override
		public void run() {
			SingletonProperty singleton = SingletonProperty.getInstance("Hello World - 1");
			System.out.println(singleton.getValue());
		}
	}

	// Thread that initializes Singleton with a different value
	static class ThreadBar implements Runnable {
		@Override
		public void run() {
			SingletonProperty singleton = SingletonProperty.getInstance("Hello World - 2");
			System.out.println(singleton.getValue());
		}
	}
}
