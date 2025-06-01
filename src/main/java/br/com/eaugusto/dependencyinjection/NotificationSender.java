/**
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
