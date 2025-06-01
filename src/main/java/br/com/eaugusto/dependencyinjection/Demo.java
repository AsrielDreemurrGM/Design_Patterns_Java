/**
 * This class demonstrates Dependency Injection (DI) using Spring Boot.
 * 
 * Dependency Injection is a design pattern in which a class receives its dependencies
 * from an external source rather than creating them internally. This promotes loose coupling,
 * easier testing, and greater flexibility.
 * 
 * In this example, the Demo class depends on NotificationSender, which in turn depends on
 * a service that implements IMessageService. Spring Boot automatically injects the proper
 * implementation (EmailService) at runtime.
 * 
 * The purpose is to show how you can easily switch service implementations (like using
 * SMSService instead of EmailService) without modifying the dependent classes.
 * 
 * To test this, you can comment out EmailService and annotate SMSService with @Service instead.
 * 
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

	/**
	 * Spring automatically injects NotificationSender via constructor injection.
	 */
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
