/**
 * DemoSingletonPropertyThreadSynchronized demonstrates thread-safe
 * singleton behavior using synchronized access.
 * 
 * Even when accessed by two threads with different values,
 * only the first value is preserved — ensuring singleton consistency.
 * 
 * This avoids race conditions and guarantees correct behavior in concurrent environments.
 * 
 * Expected output: both threads should print the same value.
 * 
 * @see SingletonPropertySynchronized
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 25 de mai. de 2025
 */

package br.com.eaugusto.singleton;

public class DemoSingletonPropertyThreadSynchronized {

	public static void main(String[] args) {
		// Two threads attempt to initialize the singleton simultaneously
		Thread t1 = new Thread(new ThreadFoo());
		Thread t2 = new Thread(new ThreadBar());

		t1.start();
		t2.start();
	}

	// First thread: uses one initialization value
	static class ThreadFoo implements Runnable {
		@Override
		public void run() {
			SingletonPropertySynchronized singleton = SingletonPropertySynchronized.getInstance("Hello World - 1");
			System.out.println(singleton.getValue());
		}
	}

	// Second thread: uses a different initialization value
	static class ThreadBar implements Runnable {
		@Override
		public void run() {
			SingletonPropertySynchronized singleton = SingletonPropertySynchronized.getInstance("Hello World - 2");
			System.out.println(singleton.getValue());
		}
	}
}
