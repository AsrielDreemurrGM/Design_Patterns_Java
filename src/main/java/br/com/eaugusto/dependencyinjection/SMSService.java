/**
 * This is an alternative implementation of IMessageService that simulates sending SMS messages.
 * 
 * You can use this service by commenting out @Service from EmailService and annotating this class
 * with @Service instead.
 * 
 * This demonstrates how Dependency Injection enables easy switching between implementations
 * without changing the business logic.
 * 
 * Uncomment @Service to activate it.
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since 31 de mai. de 2025
 */

package br.com.eaugusto.dependencyinjection;

import org.springframework.stereotype.Service;

//Uncomment this annotation to use SMS instead of Email
//@Service
@SuppressWarnings("unused")
public class SMSService implements IMessageService {

	@Override
	public void sendMessage(String message, String recipient) {
		System.out.println("Sending SMS to " + recipient + ": " + message);
	}
}
