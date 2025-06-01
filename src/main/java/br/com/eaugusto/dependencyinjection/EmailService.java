/**
 * This is an implementation of IMessageService that sends email notifications.
 * 
 * It's annotated with @Service so Spring can detect and manage it as a bean.
 * Spring will inject this implementation automatically wherever IMessageService is required.
 * 
 * You can switch this service with another implementation (like SMSService) without
 * changing any dependent class.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 31 de mai. de 2025
 */

package br.com.eaugusto.dependencyinjection;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements IMessageService {

	@Override
	public void sendMessage(String message, String recipient) {
		System.out.println("Sending E-MAIL to " + recipient + ": " + message);
	}
}
