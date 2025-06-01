/**
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 1 de jun. de 2025
 */

package br.com.eaugusto.dependencyinjection;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.eaugusto.dependencyinjection")
public class Demo implements CommandLineRunner {

	private NotificationSender sender;

	public Demo(NotificationSender sender) {
		this.sender = sender;
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo.class, args);
	}

	@Override
	public void run(String... args) {
		sender.notifyUser("Your order has been shipped", "user123@example.com");
	}
}
