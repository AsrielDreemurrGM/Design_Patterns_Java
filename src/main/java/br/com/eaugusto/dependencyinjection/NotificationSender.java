/**
 * This class is responsible for sending notifications using a service that implements IMessageService.
 * 
 * The dependency is injected by Spring at runtime via the constructor. This makes the class
 * flexible and decoupled from the specific implementation.
 * 
 * For example, switching from EmailService to SMSService requires no changes in this class.
 * 
 * Annotated with @Component so Spring can manage it as a bean.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 1 de jun. de 2025
 */

package br.com.eaugusto.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class NotificationSender {

	private final IMessageService messageService;

	public NotificationSender(IMessageService messageService) {
		this.messageService = messageService;
	}

	public void notifyUser(String message, String recipient) {
		messageService.sendMessage(message, recipient);
	}
}
